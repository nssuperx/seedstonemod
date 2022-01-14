package seedstonemod.item;

import net.minecraft.item.ItemPickaxe;
import seedstonemod.SeedstoneMod;

public class SeedstonePickaxe extends ItemPickaxe{
	private final String toolname = "seedstonepickaxe";

	public SeedstonePickaxe(ToolMaterial toolMaterial){
		super(toolMaterial);
		setCreativeTab(SeedstoneMod.tabSeedstone);
		// setRegistryName(toolname);
		setUnlocalizedName(toolname);
	}
}
