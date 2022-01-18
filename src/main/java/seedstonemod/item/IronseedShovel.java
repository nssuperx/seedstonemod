package seedstonemod.item;

import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;
import seedstonemod.SeedstoneMod;

public class IronseedShovel extends ItemSpade {

    public IronseedShovel(ResourceLocation rl,ToolMaterial toolMaterial) {
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setRegistryName(rl);
        setUnlocalizedName(rl.getResourcePath());
    }

}