package seedstonemod.item;

import net.minecraft.item.ItemHoe;
import seedstonemod.SeedstoneMod;

public class SeedstoneHoe extends ItemHoe{
    public SeedstoneHoe(ToolMaterial toolMaterial){
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setUnlocalizedName("hoeSeedstone");
        // setTextureName("seedstonemod:seedstone_hoe");
    }
    
}