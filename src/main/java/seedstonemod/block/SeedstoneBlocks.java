package seedstonemod.block;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import seedstonemod.SeedstoneMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

public class SeedstoneBlocks {

    private static final String MOD_ID = SeedstoneMod.MOD_ID;
    
    private static final ResourceLocation blockSeedstoneRL = new ResourceLocation(MOD_ID, "seedstoneblock");
    private static final ResourceLocation blockCobbleseedstoneRL = new ResourceLocation(MOD_ID, "cobbleseedstoneblock");
    private static final ResourceLocation stairsCobbleseedstoneRL = new ResourceLocation(MOD_ID, "cobbleseedstonestairs");
    private static final ResourceLocation cobbleseedstoneSlabsingleRL = new ResourceLocation(MOD_ID, "cobbleseedstonehalfslab");
    private static final ResourceLocation cobbleseedstoneSlabdoubleRL = new ResourceLocation(MOD_ID, "cobbleseedstonedoubleslab");
    
    public static final Block blockSeedstone = new SeedstoneBlock(blockSeedstoneRL);
    public static final Block blockCobbleseedstone = new CobbleseedstoneBlock(blockCobbleseedstoneRL);
    public static final Block stairsCobbleseedstone = new CobbleseedstoneStairs(stairsCobbleseedstoneRL, blockCobbleseedstone);
    public static final BlockSlab cobbleseedstoneSlabsingle = new CobbleseedstoneHalfSlab(cobbleseedstoneSlabsingleRL);
    public static final BlockSlab cobbleseedstoneSlabdouble = new CobbleseedstoneDoubleSlab(cobbleseedstoneSlabdoubleRL);
    
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new SeedstoneBlock(blockSeedstoneRL));
        event.getRegistry().register(new CobbleseedstoneBlock(blockCobbleseedstoneRL));
        event.getRegistry().register(new CobbleseedstoneStairs(stairsCobbleseedstoneRL, blockCobbleseedstone));
        event.getRegistry().register(new CobbleseedstoneHalfSlab(cobbleseedstoneSlabsingleRL));
        event.getRegistry().register(new CobbleseedstoneDoubleSlab(cobbleseedstoneSlabdoubleRL));
    }

    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().register(new ItemBlock(blockSeedstone).setRegistryName(blockSeedstoneRL));
        event.getRegistry().register(new ItemBlock(blockCobbleseedstone).setRegistryName(blockCobbleseedstoneRL));
        event.getRegistry().register(new ItemBlock(stairsCobbleseedstone).setRegistryName(blockSeedstoneRL));
        event.getRegistry().register(new ItemBlock(cobbleseedstoneSlabsingle).setRegistryName(blockSeedstoneRL));
    }

    public static void registerModels(ModelRegistryEvent event){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSeedstone), 0, new ModelResourceLocation(blockSeedstone.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockCobbleseedstone), 0, new ModelResourceLocation(blockCobbleseedstone.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(stairsCobbleseedstone), 0, new ModelResourceLocation(stairsCobbleseedstone.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(cobbleseedstoneSlabsingle), 0, new ModelResourceLocation(cobbleseedstoneSlabsingle.getRegistryName(), "inventory"));
    }
}
