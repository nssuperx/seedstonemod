package seedstonemod.item;

import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;
import seedstonemod.SeedstoneMod;

public class SeedstoneShovel extends ItemSpade {

    public SeedstoneShovel(ResourceLocation rl, ToolMaterial toolMaterial) {
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setRegistryName(rl);
        setUnlocalizedName(rl.getResourcePath());
    }

}