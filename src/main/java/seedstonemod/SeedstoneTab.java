package seedstonemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import seedstonemod.block.SeedstoneBlocks;

public class SeedstoneTab extends CreativeTabs {
    public SeedstoneTab(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(SeedstoneBlocks.blockSeedstone);
    }

}
