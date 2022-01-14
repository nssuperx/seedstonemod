package seedstonemod.item;

import net.minecraft.item.ItemHoe;
import seedstonemod.SeedstoneMod;

public class IronseedHoe extends ItemHoe{
	private final String toolname = "ironseedhoe";

    public IronseedHoe(ToolMaterial toolMaterial){
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        // setRegistryName(toolname);
		setUnlocalizedName(toolname);
    }
}