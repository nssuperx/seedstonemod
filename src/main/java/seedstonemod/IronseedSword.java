package seedstonemod;

import net.minecraft.item.ItemSword;

public class IronseedSword extends ItemSword{
    public IronseedSword(ToolMaterial toolMaterial){
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setUnlocalizedName("swordIronseed");
        setTextureName("seedstonemod:ironseed_sword");
    }
    
}