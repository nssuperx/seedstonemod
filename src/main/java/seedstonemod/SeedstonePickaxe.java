package seedstonemod;

import net.minecraft.item.ItemPickaxe;

public class SeedstonePickaxe extends ItemPickaxe
{
	public SeedstonePickaxe(ToolMaterial toolMaterial)
	{
		super(toolMaterial);
		setCreativeTab(SeedstoneMod.tabSeedstone);
		setUnlocalizedName("pickaxeSeedstone");
		setTextureName("seedstonemod:seedstone_pickaxe");
	}
}
