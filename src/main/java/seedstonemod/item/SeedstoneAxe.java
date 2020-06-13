package seedstonemod.item;

import net.minecraft.item.ItemAxe;
import seedstonemod.SeedstoneMod;

public class SeedstoneAxe extends ItemAxe
{
	public SeedstoneAxe(ToolMaterial toolMaterial)
	{
		super(toolMaterial);
		setCreativeTab(SeedstoneMod.tabSeedstone);
		setUnlocalizedName("axeSeedstone");
		setTextureName("seedstonemod:seedstone_axe");
	}

}
