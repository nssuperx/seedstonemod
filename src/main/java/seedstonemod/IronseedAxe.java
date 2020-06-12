package seedstonemod;

import net.minecraft.item.ItemAxe;

public class IronseedAxe extends ItemAxe
{
	public IronseedAxe(ToolMaterial toolMaterial)
	{
		super(toolMaterial);
		setCreativeTab(SeedstoneMod.tabSeedstone);
		setUnlocalizedName("axeIronseed");
		setTextureName("seedstonemod:ironseed_axe");
	}

}
