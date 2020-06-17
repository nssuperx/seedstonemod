package seedstonemod.block;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import seedstonemod.item.ItemCobbleseedstoneSlab;

public class SeedstoneBlocks {

	public static final String MOD_ID = "seedstonemod";

    public static Block blockSeedstone;
	public static Block blockCobbleseedstone;

    public static Block stairsCobbleseedstone;
	//slab
	public static BlockSlab CobbleseedstoneSlabsingle;
    public static BlockSlab CobbleseedstoneSlabdouble;
    
    public static void registerBlocks(FMLPreInitializationEvent event){
        
        blockSeedstone = new SeedstoneBlock(Material.rock);
		blockCobbleseedstone = new CobbleseedstoneBlock(Material.rock);
		stairsCobbleseedstone = new CobbleseedstoneStairs(blockCobbleseedstone);
		CobbleseedstoneSlabsingle = new CobbleseedstoneSlab(false);
		CobbleseedstoneSlabdouble = new CobbleseedstoneSlab(true);
		
		GameRegistry.registerBlock(blockSeedstone, "seedstoneblock");
		GameRegistry.registerBlock(blockCobbleseedstone, "cobbleseedstoneblock");
		GameRegistry.registerBlock(stairsCobbleseedstone, "cobbleseedstonestairs");
        GameRegistry.registerBlock(CobbleseedstoneSlabsingle, ItemCobbleseedstoneSlab.class, "CobbleseedstoneSlabsingle");
		GameRegistry.registerBlock(CobbleseedstoneSlabdouble, ItemCobbleseedstoneSlab.class, "CobbleseedstoneSlabdouble");

		if(event.getSide().isClient()){
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSeedstone), 0, new ModelResourceLocation(blockSeedstone.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockCobbleseedstone), 0, new ModelResourceLocation(blockCobbleseedstone.getRegistryName(), "inventory"));
		}
    }
    
}