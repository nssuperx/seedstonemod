package seedstonemod;

import net.minecraft.item.Item;

public class ItemIronseed extends Item {
    public ItemIronseed(){
        super();
        setCreativeTab(SeedstoneMod.tabSeedstone);
		setUnlocalizedName("ironseed");
		setTextureName("seedstonemod:ironseed_ingot");;
    }
}