package seedstonemod.block;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import seedstonemod.SeedstoneMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

public class SeedstoneBlocks {

    public static final String MOD_ID = SeedstoneMod.MOD_ID;

    // public static Block blockSeedstone;
    public static Block blockCobbleseedstone;

    // public static Block stairsCobbleseedstone;
    //slab
    // public static BlockSlab cobbleseedstoneSlabsingle;
    // public static BlockSlab cobbleseedstoneSlabdouble;

    private static final ResourceLocation blockSeedstoneRL = new ResourceLocation(MOD_ID, "seedstoneblock");
    private static final ResourceLocation blockCobbleseedstoneRL = new ResourceLocation(MOD_ID, "cobbleseedstoneblock");
    private static final ResourceLocation stairsCobbleseedstoneRL = new ResourceLocation(MOD_ID, "cobbleseedstonestairs");
    private static final ResourceLocation cobbleseedstoneSlabsingleRL = new ResourceLocation(MOD_ID, "cobbleseedstonehalfslab");
    private static final ResourceLocation cobbleseedstoneSlabdoubleRL = new ResourceLocation(MOD_ID, "cobbleseedstonedoubleslab");

    @ObjectHolder(MOD_ID)
    public static class BLOCKS {
        public static final Block blockSeedstone = null;
        public static final Block blockCobbleseedstone = null;
        public static final Block stairsCobbleseedstone = null;
        //slab
        public static final BlockSlab cobbleseedstoneSlabsingle = null;
        public static final BlockSlab cobbleseedstoneSlabdouble = null;
    }

    @ObjectHolder(MOD_ID)
    public static class ITEMS {
        public static final Item blockSeedstone = null;
        public static final Item blockCobbleseedstone = null;
        public static final Item stairsCobbleseedstone = null;
        public static final Item cobbleseedstoneSlabsingle = null;
    }
    
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        
        blockCobbleseedstone = new CobbleseedstoneBlock(blockCobbleseedstoneRL);

        event.getRegistry().register(new SeedstoneBlock(blockSeedstoneRL));
        event.getRegistry().register(new CobbleseedstoneBlock(blockCobbleseedstoneRL));
        event.getRegistry().register(new CobbleseedstoneStairs(stairsCobbleseedstoneRL, blockCobbleseedstone));
        event.getRegistry().register(new CobbleseedstoneHalfSlab(cobbleseedstoneSlabsingleRL));
        event.getRegistry().register(new CobbleseedstoneDoubleSlab(cobbleseedstoneSlabdoubleRL));
    }

    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(new ItemBlock(BLOCKS.blockSeedstone).setRegistryName(blockSeedstoneRL));
        event.getRegistry().registerAll(new ItemBlock(BLOCKS.blockCobbleseedstone).setRegistryName(blockCobbleseedstoneRL));
        event.getRegistry().registerAll(new ItemBlock(BLOCKS.stairsCobbleseedstone).setRegistryName(blockSeedstoneRL));
        event.getRegistry().registerAll(new ItemBlock(BLOCKS.cobbleseedstoneSlabsingle).setRegistryName(blockSeedstoneRL));
    }

    public static void SetModels(FMLPreInitializationEvent event){
        if(event.getSide().isClient()){
            ModelLoader.setCustomModelResourceLocation(ITEMS.blockSeedstone, 0, new ModelResourceLocation(ITEMS.blockSeedstone.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(ITEMS.blockCobbleseedstone, 0, new ModelResourceLocation(ITEMS.blockCobbleseedstone.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(ITEMS.stairsCobbleseedstone, 0, new ModelResourceLocation(ITEMS.stairsCobbleseedstone.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(ITEMS.cobbleseedstoneSlabsingle, 0, new ModelResourceLocation(ITEMS.cobbleseedstoneSlabsingle.getRegistryName(), "inventory"));
        }
    }
}
