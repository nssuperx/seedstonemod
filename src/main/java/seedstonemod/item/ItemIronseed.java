package seedstonemod.item;

import net.minecraft.item.Item;
import seedstonemod.SeedstoneMod;

public class ItemIronseed extends Item {
    private final String ingotname = "ironseedingot";

    public ItemIronseed() {
        super();
        setCreativeTab(SeedstoneMod.tabSeedstone);
        // setRegistryName(ingotname);
        setUnlocalizedName(ingotname);
    }
}