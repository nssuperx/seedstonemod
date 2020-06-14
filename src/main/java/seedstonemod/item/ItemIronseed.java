package seedstonemod.item;

import net.minecraft.item.Item;
import seedstonemod.SeedstoneMod;

public class ItemIronseed extends Item {
    public ItemIronseed(){
        super();
        setCreativeTab(SeedstoneMod.tabSeedstone);
		setUnlocalizedName("ironseed");
		// setTextureName("seedstonemod:ironseed_ingot");
    }
}