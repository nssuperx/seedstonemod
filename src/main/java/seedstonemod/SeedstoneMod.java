package seedstonemod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Metadata;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import seedstonemod.block.SeedstoneBlocks;
import seedstonemod.item.SeedstoneItems;

@Mod(modid = SeedstoneMod.MOD_ID, version = SeedstoneMod.MOD_VERSION)
public class SeedstoneMod
{
    public static final String MOD_ID = "seedstonemod";
    public static final String MOD_NAME = "SeedstoneMod";
    public static final String MOD_VERSION = "1.6.1";
    public static final String MOD_DEPENDENCIES = "required-after:Forge@[1.12.2-14.23.5.2859,)";
    public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.12.2]";


    @Metadata(MOD_ID)
    public static ModMetadata meta;

    public static CreativeTabs tabSeedstone = new SeedstoneTab("Seedstonetab");

    @Mod.EventHandler
    public void construct(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        SeedstoneBlocks.registerItems(event);
        SeedstoneItems.registerItems(event);
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        SeedstoneBlocks.registerBlocks(event);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event){
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
