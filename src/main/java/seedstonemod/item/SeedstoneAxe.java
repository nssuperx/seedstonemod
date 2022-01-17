package seedstonemod.item;

import net.minecraft.item.ItemAxe;
import seedstonemod.SeedstoneMod;

public class SeedstoneAxe extends ItemAxe {
    private final String toolname = "seedstoneaxe";

    public SeedstoneAxe(ToolMaterial toolMaterial) {
        super(toolMaterial, toolMaterial.getDamageVsEntity(), toolMaterial.getEfficiencyOnProperMaterial());
        setCreativeTab(SeedstoneMod.tabSeedstone);
        // setRegistryName(toolname);
        setUnlocalizedName(toolname);
    }

}
