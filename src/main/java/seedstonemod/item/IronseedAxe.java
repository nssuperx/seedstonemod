package seedstonemod.item;

import net.minecraft.item.ItemAxe;
import seedstonemod.SeedstoneMod;

public class IronseedAxe extends ItemAxe{
	private final String toolname = "ironseedaxe";

	public IronseedAxe(ToolMaterial toolMaterial){
		super(toolMaterial);
		setCreativeTab(SeedstoneMod.tabSeedstone);
		setRegistryName(toolname);
		setUnlocalizedName(toolname);
	}

}
