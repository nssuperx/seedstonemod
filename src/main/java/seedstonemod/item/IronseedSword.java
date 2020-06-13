package seedstonemod.item;

import net.minecraft.item.ItemSword;
import seedstonemod.SeedstoneMod;

public class IronseedSword extends ItemSword{
    public IronseedSword(ToolMaterial toolMaterial){
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setUnlocalizedName("swordIronseed");
        setTextureName("seedstonemod:ironseed_sword");
    }
    
}