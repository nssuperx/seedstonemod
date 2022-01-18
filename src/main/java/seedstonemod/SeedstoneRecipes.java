package seedstonemod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import seedstonemod.item.SeedstoneItems;
import seedstonemod.block.SeedstoneBlocks;

public class SeedstoneRecipes {
    public static void registerRecipes() {
        GameRegistry.addRecipe(new ItemStack(SeedstoneBlocks.BLOCKS.blockCobbleseedstone),
                "xxx",
                "xxx",
                "xxx",
                'x', Items.WHEAT_SEEDS);

        GameRegistry.addRecipe(new ItemStack(Items.WHEAT_SEEDS, 9),
                "x",
                'x', SeedstoneBlocks.BLOCKS.blockCobbleseedstone);

        GameRegistry.addRecipe(new ItemStack(SeedstoneBlocks.BLOCKS.stairsCobbleseedstone, 4),
                "  x",
                " xx",
                "xxx",
                'x', SeedstoneBlocks.BLOCKS.blockCobbleseedstone);

        GameRegistry.addRecipe(new ItemStack(Blocks.GRASS),
                "xxx",
                "yyy",
                'x', SeedstoneBlocks.BLOCKS.blockSeedstone,
                'y', Blocks.DIRT);

        GameRegistry.addSmelting(SeedstoneBlocks.BLOCKS.blockCobbleseedstone, new ItemStack(SeedstoneBlocks.BLOCKS.blockSeedstone),
                0.1F);

        GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ITEMS.ironseed),
                "xxx",
                "xyx",
                "xxx",
                'x', SeedstoneBlocks.BLOCKS.blockSeedstone,
                'y', Items.IRON_INGOT);

        GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ITEMS.swordSeedstone),
                "x",
                "x",
                "y",
                'x', SeedstoneBlocks.BLOCKS.blockCobbleseedstone,
                'y', Items.STICK);

        GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ITEMS.shovelSeedstone), "x", "y", "y", 'x',
                SeedstoneBlocks.BLOCKS.blockCobbleseedstone, 'y', Items.STICK);

        GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ITEMS.pickaxeSeedstone), "xxx", " y ", " y ", 'x',
                SeedstoneBlocks.BLOCKS.blockCobbleseedstone, 'y', Items.STICK);

        GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ITEMS.axeSeedstone), " xx", " yx", " y ", 'x',
                SeedstoneBlocks.BLOCKS.blockCobbleseedstone, 'y', Items.STICK);

        GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ITEMS.hoeSeedstone), " xx", " y ", " y ", 'x',
                SeedstoneBlocks.BLOCKS.blockCobbleseedstone, 'y', Items.STICK);

        GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ITEMS.swordIronseed), "x", "x", "y", 'x', SeedstoneItems.ITEMS.ironseed,
                'y', Items.STICK);

        GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ITEMS.shovelIronseed), "x", "y", "y", 'x',
                SeedstoneItems.ITEMS.ironseed, 'y', Items.STICK);

        GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ITEMS.pickaxeIronseed), "xxx", " y ", " y ", 'x',
                SeedstoneItems.ITEMS.ironseed, 'y', Items.STICK);

        GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ITEMS.axeIronseed), " xx", " yx", " y ", 'x',
                SeedstoneItems.ITEMS.ironseed, 'y', Items.STICK);

        GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ITEMS.hoeIronseed), " xx", " y ", " y ", 'x',
                SeedstoneItems.ITEMS.ironseed, 'y', Items.STICK);

        GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ITEMS.helmetIronseed),
                "xxx",
                "x x",
                'x', SeedstoneItems.ITEMS.ironseed);

        GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ITEMS.chestplateIronseed),
                "x x",
                "xxx",
                "xxx",
                'x', SeedstoneItems.ITEMS.ironseed);

        GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ITEMS.leggingsIronseed),
                "xxx",
                "x x",
                "x x",
                'x', SeedstoneItems.ITEMS.ironseed);

        GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ITEMS.bootsIronseed),
                "x x",
                "x x",
                'x', SeedstoneItems.ITEMS.ironseed);

        GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ITEMS.bigRottenFlesh),
                "xx",
                "xx",
                'x', Items.ROTTEN_FLESH);

        GameRegistry.addSmelting(SeedstoneItems.ITEMS.bigRottenFlesh, new ItemStack(SeedstoneItems.ITEMS.steakRottenFlesh), 0.8F);

        // slab
        GameRegistry.addRecipe(new ItemStack(SeedstoneBlocks.BLOCKS.cobbleseedstoneSlabsingle, 6),
                "xxx",
                'x', SeedstoneBlocks.BLOCKS.blockCobbleseedstone);

    }

}
