package seedstonemod;

import net.minecraft.item.ItemSword;

public class SeedstoneSword extends ItemSword{
    public SeedstoneSword(ToolMaterial toolMaterial){
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setUnlocalizedName("swordSeedstone");
        setTextureName("seedstonemod:seedstone_sword");
    }
    
}