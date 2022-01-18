package seedstonemod.item;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import seedstonemod.SeedstoneMod;

public class ItemIronseed extends Item {

    public ItemIronseed(ResourceLocation rl) {
        super();
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setRegistryName(rl);
        setUnlocalizedName(rl.getResourcePath());
    }
}