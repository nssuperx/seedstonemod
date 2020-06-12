package seedstonemod;

import net.minecraft.item.ItemSpade;

public class SeedstoneShovel extends ItemSpade{
    public SeedstoneShovel(ToolMaterial toolMaterial){
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setUnlocalizedName("shovelSeedstone");
        setTextureName("seedstonemod:seedstone_shovel");
    }
    
}