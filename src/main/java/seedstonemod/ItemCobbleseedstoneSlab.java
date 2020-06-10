package seedstonemod;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemCobbleseedstoneSlab extends ItemSlab{

	public ItemCobbleseedstoneSlab(Block block) {
		super(block, SeedstoneMod.CobbleseedstoneSlabsingle, SeedstoneMod.CobbleseedstoneSlabdouble, block == SeedstoneMod.CobbleseedstoneSlabdouble);
		this.setUnlocalizedName("cobbleseedstoneslab");
	}

}
