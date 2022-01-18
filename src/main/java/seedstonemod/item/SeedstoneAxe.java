package seedstonemod.item;

import net.minecraft.item.ItemAxe;
import net.minecraft.util.ResourceLocation;
import seedstonemod.SeedstoneMod;

public class SeedstoneAxe extends ItemAxe {

    public SeedstoneAxe(ResourceLocation rl, ToolMaterial toolMaterial) {
        super(toolMaterial, toolMaterial.getDamageVsEntity(), toolMaterial.getEfficiencyOnProperMaterial());
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setRegistryName(rl);
        setUnlocalizedName(rl.getResourcePath());
    }

}
