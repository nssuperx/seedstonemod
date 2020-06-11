package seedstonemod;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemCobbleseedstoneSlab extends ItemSlab{

	public ItemCobbleseedstoneSlab(Block block) {
		super(block, SeedstoneBlocks.CobbleseedstoneSlabsingle, SeedstoneBlocks.CobbleseedstoneSlabdouble, block == SeedstoneBlocks.CobbleseedstoneSlabdouble);
		this.setUnlocalizedName("cobbleseedstoneslab");
	}

}
