package seedstonemod.item;

import net.minecraft.item.ItemSword;
import seedstonemod.SeedstoneMod;

public class SeedstoneSword extends ItemSword {
    private final String toolname = "seedstonesword";

    public SeedstoneSword(ToolMaterial toolMaterial) {
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        // setRegistryName(toolname);
        setUnlocalizedName(toolname);
    }

}