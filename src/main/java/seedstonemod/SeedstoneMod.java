package seedstonemod;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Metadata;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import seedstonemod.item.SeedstoneItems;
import seedstonemod.block.SeedstoneBlocks;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = SeedstoneMod.MOD_ID, name = SeedstoneMod.MOD_NAME, version = SeedstoneMod.MOD_VERSION, dependencies = SeedstoneMod.MOD_DEPENDENCIES, acceptedMinecraftVersions = SeedstoneMod.MOD_ACCEPTED_MC_VERSIONS)
public class SeedstoneMod {
    public static final String MOD_ID = "seedstoneMod";
    public static final String MOD_NAME = "SeedstoneMod";
    public static final String MOD_VERSION = "1.6.0";
    public static final String MOD_DEPENDENCIES = "required-after:Forge@[1.11.2-13.20.1.2588,)";
    public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.11.2]";



    @Metadata(MOD_ID)
    public static ModMetadata meta;

    public static CreativeTabs tabSeedstone = new SeedstoneTab("Seedstonetab");

    @Mod.EventHandler
    public void construct(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
    protected static void registerItems(RegistryEvent.Register<Item> event) {
        SeedstoneBlocks.registerItems(event);
        SeedstoneItems.registerItems(event);
    }

    @SubscribeEvent
    protected static void registerBlocks(RegistryEvent.Register<Block> event) {
        SeedstoneBlocks.registerBlocks(event);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){
        SeedstoneBlocks.registerModels(event);
        SeedstoneItems.registerModels(event);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModInfo.loadInfo(meta);
    }


    @EventHandler
    public void Init(FMLInitializationEvent event) {

        // SeedstoneRecipes.registerRecipes();

    }

}
