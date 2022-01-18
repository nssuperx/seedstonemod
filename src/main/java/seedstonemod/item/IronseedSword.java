package seedstonemod.item;

import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import seedstonemod.SeedstoneMod;

public class IronseedSword extends ItemSword {

    public IronseedSword(ResourceLocation rl, ToolMaterial toolMaterial) {
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setRegistryName(rl);
        setUnlocalizedName(rl.getResourcePath());
    }
}