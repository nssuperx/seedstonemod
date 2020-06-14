package seedstonemod.item;

import net.minecraft.item.ItemHoe;
import seedstonemod.SeedstoneMod;

public class IronseedHoe extends ItemHoe{
    public IronseedHoe(ToolMaterial toolMaterial){
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setUnlocalizedName("hoeIronseed");
        // setTextureName("seedstonemod:ironseed_hoe");
    }
}