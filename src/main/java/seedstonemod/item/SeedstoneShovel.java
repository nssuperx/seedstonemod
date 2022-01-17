package seedstonemod.item;

import net.minecraft.item.ItemSpade;
import seedstonemod.SeedstoneMod;

public class SeedstoneShovel extends ItemSpade {
    private final String toolname = "seedstoneshovel";

    public SeedstoneShovel(ToolMaterial toolMaterial) {
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        // setRegistryName(toolname);
        setUnlocalizedName(toolname);
    }

}