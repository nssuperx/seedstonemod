package seedstonemod.item;

import net.minecraft.item.ItemSpade;
import seedstonemod.SeedstoneMod;

public class IronseedShovel extends ItemSpade{
    public IronseedShovel(ToolMaterial toolMaterial){
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setUnlocalizedName("shovelIronseed");
        setTextureName("seedstonemod:ironseed_shovel");
    }
    
}