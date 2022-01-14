package seedstonemod.block;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

public class SeedstoneBlocks {

	public static final String MOD_ID = "seedstonemod";

    public static Block blockSeedstone;
	public static Block blockCobbleseedstone;

    public static Block stairsCobbleseedstone;
	//slab
	public static BlockSlab cobbleseedstoneSlabsingle;
    public static BlockSlab cobbleseedstoneSlabdouble;
    
    public static void registerBlocks(FMLPreInitializationEvent event){
        
        blockSeedstone = new SeedstoneBlock(Material.ROCK);
		blockCobbleseedstone = new CobbleseedstoneBlock(Material.ROCK);
		stairsCobbleseedstone = new CobbleseedstoneStairs(blockCobbleseedstone);
		cobbleseedstoneSlabsingle = new CobbleseedstoneHalfSlab();
		cobbleseedstoneSlabdouble = new CobbleseedstoneDoubleSlab();

		ItemBlock itemBlockSeedstone = new ItemBlock(blockSeedstone);
        ItemBlock itemBlockCobbleseedstone = new ItemBlock(blockCobbleseedstone);
        ItemBlock itemStairsCobbleseedstone = new ItemBlock(stairsCobbleseedstone);
        ItemBlock itemCobbleseedstoneSlabsingle = new ItemBlock(cobbleseedstoneSlabsingle);

		ResourceLocation blockSeedstoneRL = new ResourceLocation(MOD_ID, "seedstoneblock");
		ResourceLocation blockCobbleseedstoneRL = new ResourceLocation(MOD_ID, "cobbleseedstoneblock");
		ResourceLocation stairsCobbleseedstoneRL = new ResourceLocation(MOD_ID, "cobbleseedstonestairs");
		ResourceLocation cobbleseedstoneSlabsingleRL = new ResourceLocation(MOD_ID, "cobbleseedstonehalfslab");
		ResourceLocation cobbleseedstoneSlabdoubleRL = new ResourceLocation(MOD_ID, "cobbleseedstonedoubleslab");

        // register block
		GameRegistry.register(blockSeedstone, blockSeedstoneRL);
		GameRegistry.register(blockCobbleseedstone, blockCobbleseedstoneRL);
		GameRegistry.register(stairsCobbleseedstone, stairsCobbleseedstoneRL);
        GameRegistry.register(cobbleseedstoneSlabsingle, cobbleseedstoneSlabsingleRL);
		GameRegistry.register(cobbleseedstoneSlabdouble, cobbleseedstoneSlabdoubleRL);

        // register item
        GameRegistry.register(itemBlockSeedstone, blockSeedstoneRL);
		GameRegistry.register(itemBlockCobbleseedstone, blockCobbleseedstoneRL);
		GameRegistry.register(itemStairsCobbleseedstone, stairsCobbleseedstoneRL);
        GameRegistry.register(itemCobbleseedstoneSlabsingle, cobbleseedstoneSlabsingleRL);

		if(event.getSide().isClient()){
			ModelLoader.setCustomModelResourceLocation(itemBlockSeedstone, 0, new ModelResourceLocation(blockSeedstoneRL, "inventory"));
			ModelLoader.setCustomModelResourceLocation(itemBlockCobbleseedstone, 0, new ModelResourceLocation(blockCobbleseedstoneRL, "inventory"));
			ModelLoader.setCustomModelResourceLocation(itemStairsCobbleseedstone, 0, new ModelResourceLocation(stairsCobbleseedstoneRL, "inventory"));
			ModelLoader.setCustomModelResourceLocation(itemCobbleseedstoneSlabsingle, 0, new ModelResourceLocation(cobbleseedstoneSlabsingleRL, "inventory"));
		}
    }
    
}