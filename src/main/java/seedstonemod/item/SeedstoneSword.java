package seedstonemod.item;

import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import seedstonemod.SeedstoneMod;

public class SeedstoneSword extends ItemSword {

    public SeedstoneSword(ResourceLocation rl, ToolMaterial toolMaterial) {
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setRegistryName(rl);
        setUnlocalizedName(rl.getResourcePath());
    }

}