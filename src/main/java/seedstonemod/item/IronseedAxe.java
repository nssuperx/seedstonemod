package seedstonemod.item;

import net.minecraft.item.ItemAxe;
import seedstonemod.SeedstoneMod;

public class IronseedAxe extends ItemAxe
{
	public IronseedAxe(ToolMaterial toolMaterial)
	{
		super(toolMaterial);
		setCreativeTab(SeedstoneMod.tabSeedstone);
		setUnlocalizedName("axeIronseed");
		// setTextureName("seedstonemod:ironseed_axe");
	}

}
