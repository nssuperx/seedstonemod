package seedstonemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import seedstonemod.block.SeedstoneBlocks;

public class SeedstoneTab extends CreativeTabs {
    public SeedstoneTab(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(SeedstoneBlocks.BLOCKS.blockSeedstone);
    }

}
