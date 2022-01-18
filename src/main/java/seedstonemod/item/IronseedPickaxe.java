package seedstonemod.item;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;
import seedstonemod.SeedstoneMod;

public class IronseedPickaxe extends ItemPickaxe {

    public IronseedPickaxe(ResourceLocation rl,ToolMaterial toolMaterial) {
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setRegistryName(rl);
        setUnlocalizedName(rl.getResourcePath());
    }
}
