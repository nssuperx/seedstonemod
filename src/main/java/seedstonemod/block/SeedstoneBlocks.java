package seedstonemod.block;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
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
		
		GameRegistry.register(blockSeedstone, new ResourceLocation(MOD_ID, "seedstoneblock"));
		GameRegistry.register(blockCobbleseedstone, new ResourceLocation(MOD_ID, "cobbleseedstoneblock"));
		GameRegistry.register(stairsCobbleseedstone, new ResourceLocation(MOD_ID, "cobbleseedstonestairs"));
        GameRegistry.register(cobbleseedstoneSlabsingle, new ResourceLocation(MOD_ID, "cobbleseedstonehalfslab"));
		GameRegistry.register(cobbleseedstoneSlabdouble, new ResourceLocation(MOD_ID, "cobbleseedstonedoubleslab"));

		if(event.getSide().isClient()){
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSeedstone), 0, new ModelResourceLocation(blockSeedstone.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockCobbleseedstone), 0, new ModelResourceLocation(blockCobbleseedstone.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(stairsCobbleseedstone), 0, new ModelResourceLocation(stairsCobbleseedstone.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(cobbleseedstoneSlabsingle), 0, new ModelResourceLocation(cobbleseedstoneSlabsingle.getRegistryName(), "inventory"));
		}
    }
    
}