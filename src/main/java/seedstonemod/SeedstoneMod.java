package seedstonemod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import seedstonemod.item.SeedstoneItems;
import seedstonemod.block.SeedstoneBlocks;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = SeedstoneMod.MODID, name = SeedstoneMod.MODNAME, version = SeedstoneMod.VERSION)
public class SeedstoneMod
{
	public static final String MODID = "seedstoneMod";
	public static final String MODNAME = "SeedstoneMod";
	public static final String VERSION = "1.5.0";

	@Metadata(MODID)
	public static ModMetadata meta;

	public static CreativeTabs tabSeedstone = new SeedstoneTab("Seedstonetab");



	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModInfo.loadInfo(meta);

		SeedstoneItems.registerItems();
		SeedstoneBlocks.registerBlocks();

	}

	@EventHandler
	public void Init(FMLInitializationEvent event )
	{

		SeedstoneRecipes.registerRecipes();

	}


}
