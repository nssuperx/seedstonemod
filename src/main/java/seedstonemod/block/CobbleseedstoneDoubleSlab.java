package seedstonemod.block;

import net.minecraft.util.ResourceLocation;

public class CobbleseedstoneDoubleSlab extends CobbleseedstoneSlab {
    
    public CobbleseedstoneDoubleSlab(ResourceLocation rl) {
        super(true);
        this.setRegistryName(rl);
        this.setUnlocalizedName(rl.getResourcePath());
    }

    public final boolean isDouble() {
        return true;
    }
}