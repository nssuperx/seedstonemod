package seedstonemod.item;

import net.minecraft.item.ItemPickaxe;
import seedstonemod.SeedstoneMod;

public class IronseedPickaxe extends ItemPickaxe
{
	public IronseedPickaxe(ToolMaterial toolMaterial)
	{
		super(toolMaterial);
		setCreativeTab(SeedstoneMod.tabSeedstone);
		setUnlocalizedName("pickaxeIronseed");
		// setTextureName("seedstonemod:ironseed_pickaxe");
	}
}
