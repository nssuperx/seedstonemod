package seedstonemod.item;

import net.minecraft.item.ItemHoe;
import seedstonemod.SeedstoneMod;

public class SeedstoneHoe extends ItemHoe {
    private final String toolname = "seedstonehoe";

    public SeedstoneHoe(ToolMaterial toolMaterial) {
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        // setRegistryName(toolname);
        setUnlocalizedName(toolname);
    }

}