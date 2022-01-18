package seedstonemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.util.ResourceLocation;
import seedstonemod.SeedstoneMod;

public class CobbleseedstoneStairs extends BlockStairs {

    public CobbleseedstoneStairs(ResourceLocation rl, Block block){
        super(block.getDefaultState());
        this.setRegistryName(rl);
        this.setUnlocalizedName(rl.getResourcePath());
        this.setCreativeTab(SeedstoneMod.tabSeedstone);
        this.setHarvestLevel("pickaxe", 0);
        this.useNeighborBrightness = true;
    }
}
