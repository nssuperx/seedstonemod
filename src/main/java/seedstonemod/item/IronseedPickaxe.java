package seedstonemod.item;

import net.minecraft.item.ItemPickaxe;
import seedstonemod.SeedstoneMod;

public class IronseedPickaxe extends ItemPickaxe{
	private final String toolname = "ironseedpickaxe";

	public IronseedPickaxe(ToolMaterial toolMaterial){
		super(toolMaterial);
		setCreativeTab(SeedstoneMod.tabSeedstone);
		setRegistryName(toolname);
		setUnlocalizedName(toolname);
	}
}
