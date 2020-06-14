package seedstonemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Metadata;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import seedstonemod.item.SeedstoneItems;
import seedstonemod.block.SeedstoneBlocks;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = SeedstoneMod.MOD_ID, name = SeedstoneMod.MOD_NAME, version = SeedstoneMod.VERSION)
public class SeedstoneMod
{
	public static final String MOD_ID = "seedstoneMod";
	public static final String MOD_NAME = "SeedstoneMod";
	public static final String VERSION = "1.5.0";
	public static final String MOD_DEPENDENCIES = "required-after:Forge@[1.8.9-11.15.1.1722,)";
	public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.8,1.8.9]";

	@Metadata(MOD_ID)
	public static ModMetadata meta;

	public static CreativeTabs tabSeedstone = new SeedstoneTab("Seedstonetab");



	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModInfo.loadInfo(meta);

		SeedstoneItems.registerItems(event);
		SeedstoneBlocks.registerBlocks(event);

	}

	@EventHandler
	public void Init(FMLInitializationEvent event )
	{

		SeedstoneRecipes.registerRecipes();

	}


}
