package seedstonemod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class CobbleseedstoneStairs extends BlockStairs{
    public CobbleseedstoneStairs(Block block, int n){
        super(block, n);
        setBlockName("stairsCobbleseedstone");
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setHarvestLevel("pickaxe", 0);
    }
    
}