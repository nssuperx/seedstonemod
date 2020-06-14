package seedstonemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import seedstonemod.SeedstoneMod;

public class CobbleseedstoneStairs extends BlockStairs{
    public CobbleseedstoneStairs(Block block){
        super(block.getStateFromMeta(0));
        // setBlockName("stairsCobbleseedstone");
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setHarvestLevel("pickaxe", 0);
    }
    
}