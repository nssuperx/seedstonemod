package seedstonemod.item;

import net.minecraft.item.ItemSpade;
import seedstonemod.SeedstoneMod;

public class SeedstoneShovel extends ItemSpade{
    public SeedstoneShovel(ToolMaterial toolMaterial){
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setUnlocalizedName("shovelSeedstone");
        // setTextureName("seedstonemod:seedstone_shovel");
    }
    
}