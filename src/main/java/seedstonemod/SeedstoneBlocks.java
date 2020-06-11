package seedstonemod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;

public class SeedstoneBlocks {

    public static Block blockSeedstone;
	public static Block blockCobbleseedstone;

    public static Block stairsCobbleseedstone;
	//slab
	public static BlockSlab CobbleseedstoneSlabsingle;
    public static BlockSlab CobbleseedstoneSlabdouble;
    
    public static void registerBlocks(){
        
        blockSeedstone = new SeedstoneBlock(Material.rock)
				.setBlockName("blockSeedstone")
				.setBlockTextureName("seedstonemod:seedstone_block");
		GameRegistry.registerBlock(blockSeedstone, "blockSeedstone");

		blockCobbleseedstone = new CobbleseedstoneBlock(Material.rock)
				.setBlockName("blockCobbleseedstone")
				.setBlockTextureName("seedstonemod:cobbleseedstone_block");
		GameRegistry.registerBlock(blockCobbleseedstone, "blockCobbleseedstone");



		stairsCobbleseedstone = new BlockStairs(blockCobbleseedstone,0){}
				.setBlockName("stairsCobbleseedstone");
		stairsCobbleseedstone.setCreativeTab(SeedstoneMod.tabSeedstone);
		stairsCobbleseedstone.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(stairsCobbleseedstone, "stairsCobbleseedstone");

		//slab
		CobbleseedstoneSlabsingle = new CobbleseedstoneSlab(false);
        CobbleseedstoneSlabdouble = new CobbleseedstoneSlab(true);
        
		GameRegistry.registerBlock(CobbleseedstoneSlabsingle, ItemCobbleseedstoneSlab.class, "CobbleseedstoneSlabsingle");
		GameRegistry.registerBlock(CobbleseedstoneSlabdouble, ItemCobbleseedstoneSlab.class, "CobbleseedstoneSlabdouble");
    }
    
}