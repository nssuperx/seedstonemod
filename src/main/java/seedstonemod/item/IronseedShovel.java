package seedstonemod;

import net.minecraft.item.ItemSpade;

public class IronseedShovel extends ItemSpade{
    public IronseedShovel(ToolMaterial toolMaterial){
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setUnlocalizedName("shovelIronseed");
        setTextureName("seedstonemod:ironseed_shovel");
    }
    
}