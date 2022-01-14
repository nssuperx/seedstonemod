package seedstonemod.block;

public class CobbleseedstoneHalfSlab extends CobbleseedstoneSlab {
	private final String blockname = "cobbleseedstonehalfslab";

    public CobbleseedstoneHalfSlab(){
        super(false);
        // this.setRegistryName(blockname);
		this.setUnlocalizedName(blockname);
    }

    public final boolean isDouble() {
        return false;
    }
}