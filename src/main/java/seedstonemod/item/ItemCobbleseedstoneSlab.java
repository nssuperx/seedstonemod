package seedstonemod.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;
import seedstonemod.block.SeedstoneBlocks;

public class ItemCobbleseedstoneSlab extends ItemSlab{

	public ItemCobbleseedstoneSlab(Block block) {
		super(block, SeedstoneBlocks.CobbleseedstoneSlabsingle, SeedstoneBlocks.CobbleseedstoneSlabdouble, block == SeedstoneBlocks.CobbleseedstoneSlabdouble);
		this.setUnlocalizedName("cobbleseedstoneslab");
	}

}
