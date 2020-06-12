package seedstonemod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

public class SeedstoneBlocks {

    public static Block blockSeedstone;
	public static Block blockCobbleseedstone;

    public static Block stairsCobbleseedstone;
	//slab
	public static BlockSlab CobbleseedstoneSlabsingle;
    public static BlockSlab CobbleseedstoneSlabdouble;
    
    public static void registerBlocks(){
        
        blockSeedstone = new SeedstoneBlock(Material.rock);
		blockCobbleseedstone = new CobbleseedstoneBlock(Material.rock);
		stairsCobbleseedstone = new CobbleseedstoneStairs(blockCobbleseedstone, 0);
		CobbleseedstoneSlabsingle = new CobbleseedstoneSlab(false);
		CobbleseedstoneSlabdouble = new CobbleseedstoneSlab(true);
		
		GameRegistry.registerBlock(blockSeedstone, "blockSeedstone");
		GameRegistry.registerBlock(blockCobbleseedstone, "blockCobbleseedstone");
		GameRegistry.registerBlock(stairsCobbleseedstone, "stairsCobbleseedstone");
        GameRegistry.registerBlock(CobbleseedstoneSlabsingle, ItemCobbleseedstoneSlab.class, "CobbleseedstoneSlabsingle");
		GameRegistry.registerBlock(CobbleseedstoneSlabdouble, ItemCobbleseedstoneSlab.class, "CobbleseedstoneSlabdouble");
    }
    
}