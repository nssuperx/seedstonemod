package seedstonemod.block;

public class CobbleseedstoneDoubleSlab extends CobbleseedstoneSlab {
    private final String blockname = "cobbleseedstonedoubleslab";

    public CobbleseedstoneDoubleSlab() {
        super(true);
        // this.setRegistryName(blockname);
        this.setUnlocalizedName(blockname);
    }

    public final boolean isDouble() {
        return true;
    }
}