package seedstonemod.item;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;
import seedstonemod.SeedstoneMod;

public class SeedstonePickaxe extends ItemPickaxe {

    public SeedstonePickaxe(ResourceLocation rl, ToolMaterial toolMaterial) {
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setRegistryName(rl);
        setUnlocalizedName(rl.getResourcePath());
    }
}
