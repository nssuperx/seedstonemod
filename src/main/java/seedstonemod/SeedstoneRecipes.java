package seedstonemod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import seedstonemod.item.SeedstoneItems;
import seedstonemod.block.SeedstoneBlocks;

public class SeedstoneRecipes
{
	public static void registerRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(SeedstoneBlocks.blockCobbleseedstone),
				"xxx",
				"xxx",
				"xxx",
				'x', Items.wheat_seeds);

		GameRegistry.addRecipe(new ItemStack(Items.wheat_seeds,9),
				"x",
				'x', SeedstoneBlocks.blockCobbleseedstone);

		GameRegistry.addRecipe(new ItemStack(SeedstoneBlocks.stairsCobbleseedstone,4),
				"  x",
				" xx",
				"xxx",
				'x', SeedstoneBlocks.blockCobbleseedstone);


		GameRegistry.addRecipe(new ItemStack(Blocks.grass),
				"xxx",
				"yyy",
				'x', SeedstoneBlocks.blockSeedstone,
				'y', Blocks.dirt);

		GameRegistry.addSmelting(SeedstoneBlocks.blockCobbleseedstone, new ItemStack(SeedstoneBlocks.blockSeedstone), 0.1F);

		GameRegistry.addRecipe(new ItemStack(SeedstoneItems.ironseed),
				"xxx",
				"xyx",
				"xxx",
				'x', SeedstoneBlocks.blockSeedstone,
				'y', Items.iron_ingot);

		GameRegistry.addRecipe(new ItemStack(SeedstoneItems.swordSeedstone),
				"x",
				"x",
				"y",
				'x', SeedstoneBlocks.blockCobbleseedstone,
				'y', Items.stick);

		GameRegistry.addRecipe(new ItemStack(SeedstoneItems.shovelSeedstone),
				"x",
				"y",
				"y",
				'x', SeedstoneBlocks.blockCobbleseedstone,
				'y', Items.stick);

		GameRegistry.addRecipe(new ItemStack(SeedstoneItems.pickaxeSeedstone),
				"xxx",
				" y ",
				" y ",
				'x', SeedstoneBlocks.blockCobbleseedstone,
				'y', Items.stick);

		GameRegistry.addRecipe(new ItemStack(SeedstoneItems.axeSeedstone),
				" xx",
				" yx",
				" y ",
				'x', SeedstoneBlocks.blockCobbleseedstone,
				'y', Items.stick);

		GameRegistry.addRecipe(new ItemStack(SeedstoneItems.hoeSeedstone),
				" xx",
				" y ",
				" y ",
				'x', SeedstoneBlocks.blockCobbleseedstone,
				'y', Items.stick);




		GameRegistry.addRecipe(new ItemStack(SeedstoneItems.swordIronseed),
				"x",
				"x",
				"y",
				'x', SeedstoneItems.ironseed,
				'y', Items.stick);

		GameRegistry.addRecipe(new ItemStack(SeedstoneItems.shovelIronseed),
				"x",
				"y",
				"y",
				'x', SeedstoneItems.ironseed,
				'y', Items.stick);

		GameRegistry.addRecipe(new ItemStack(SeedstoneItems.pickaxeIronseed),
				"xxx",
				" y ",
				" y ",
				'x', SeedstoneItems.ironseed,
				'y', Items.stick);

		GameRegistry.addRecipe(new ItemStack(SeedstoneItems.axeIronseed),
				" xx",
				" yx",
				" y ",
				'x', SeedstoneItems.ironseed,
				'y', Items.stick);

		GameRegistry.addRecipe(new ItemStack(SeedstoneItems.hoeIronseed),
				" xx",
				" y ",
				" y ",
				'x', SeedstoneItems.ironseed,
				'y', Items.stick);



		GameRegistry.addRecipe(new ItemStack(SeedstoneItems.helmetironseed),
				"xxx",
				"x x",
				'x', SeedstoneItems.ironseed);

		GameRegistry.addRecipe(new ItemStack(SeedstoneItems.chestPlateironseed),
				"x x",
				"xxx",
				"xxx",
				'x', SeedstoneItems.ironseed);

		GameRegistry.addRecipe(new ItemStack(SeedstoneItems.leggingsironseed),
				"xxx",
				"x x",
				"x x",
				'x', SeedstoneItems.ironseed);

		GameRegistry.addRecipe(new ItemStack(SeedstoneItems.bootsironseed),
				"x x",
				"x x",
				'x', SeedstoneItems.ironseed);

		GameRegistry.addRecipe(new ItemStack(SeedstoneItems.bigRottenFlesh),
				"xx",
				"xx",
				'x', Items.rotten_flesh);

		GameRegistry.addSmelting(SeedstoneItems.bigRottenFlesh, new ItemStack(SeedstoneItems.steakRottenFlesh), 0.8F);


		//slab
		GameRegistry.addRecipe(new ItemStack(SeedstoneBlocks.cobbleseedstoneSlabsingle,6),
				"xxx",
				'x', SeedstoneBlocks.blockCobbleseedstone);

	}

}
