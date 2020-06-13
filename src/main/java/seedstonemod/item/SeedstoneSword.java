package seedstonemod.item;

import net.minecraft.item.ItemSword;
import seedstonemod.SeedstoneMod;

public class SeedstoneSword extends ItemSword{
    public SeedstoneSword(ToolMaterial toolMaterial){
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setUnlocalizedName("swordSeedstone");
        setTextureName("seedstonemod:seedstone_sword");
    }
    
}