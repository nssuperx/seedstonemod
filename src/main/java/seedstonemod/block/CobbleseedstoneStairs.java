package seedstonemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import seedstonemod.SeedstoneMod;

public class CobbleseedstoneStairs extends BlockStairs {
    private final String blockname = "cobbleseedstonestairs";

    public CobbleseedstoneStairs(Block block) {
        super(block.getDefaultState());
        // this.setRegistryName(blockname);
        this.setUnlocalizedName(blockname);
        this.setCreativeTab(SeedstoneMod.tabSeedstone);
        this.setHarvestLevel("pickaxe", 0);
        this.useNeighborBrightness = true;
    }

}