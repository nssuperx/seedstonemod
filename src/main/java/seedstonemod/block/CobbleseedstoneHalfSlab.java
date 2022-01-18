package seedstonemod.block;

import net.minecraft.util.ResourceLocation;

public class CobbleseedstoneHalfSlab extends CobbleseedstoneSlab {

    public CobbleseedstoneHalfSlab(ResourceLocation rl) {
        super(false);
        this.setRegistryName(rl);
        this.setUnlocalizedName(rl.getResourcePath());
    }

    public final boolean isDouble() {
        return false;
    }
}