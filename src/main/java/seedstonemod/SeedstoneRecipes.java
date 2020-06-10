package seedstonemod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class SeedstoneRecipes
{
	public static void registerRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.blockCobbleseedstone),
				"xxx",
				"xxx",
				"xxx",
				'x', Items.wheat_seeds);

		GameRegistry.addRecipe(new ItemStack(Items.wheat_seeds,9),
				"x",
				'x', SeedstoneMod.blockCobbleseedstone);

		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.stairsCobbleseedstone,4),
				"  x",
				" xx",
				"xxx",
				'x', SeedstoneMod.blockCobbleseedstone);


		GameRegistry.addRecipe(new ItemStack(Blocks.grass),
				"xxx",
				"yyy",
				'x', SeedstoneMod.blockSeedstone,
				'y', Blocks.dirt);

		GameRegistry.addSmelting(SeedstoneMod.blockCobbleseedstone, new ItemStack(SeedstoneMod.blockSeedstone), 0.1F);

		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.ironseed),
				"xxx",
				"xyx",
				"xxx",
				'x', SeedstoneMod.blockSeedstone,
				'y', Items.iron_ingot);

		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.swordSeedstone),
				"x",
				"x",
				"y",
				'x', SeedstoneMod.blockCobbleseedstone,
				'y', Items.stick);

		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.shovelSeedstone),
				"x",
				"y",
				"y",
				'x', SeedstoneMod.blockCobbleseedstone,
				'y', Items.stick);

		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.pickaxeSeedstone),
				"xxx",
				" y ",
				" y ",
				'x', SeedstoneMod.blockCobbleseedstone,
				'y', Items.stick);

		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.axeSeedstone),
				" xx",
				" yx",
				" y ",
				'x', SeedstoneMod.blockCobbleseedstone,
				'y', Items.stick);

		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.hoeSeedstone),
				" xx",
				" y ",
				" y ",
				'x', SeedstoneMod.blockCobbleseedstone,
				'y', Items.stick);




		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.swordIronseed),
				"x",
				"x",
				"y",
				'x', SeedstoneMod.ironseed,
				'y', Items.stick);

		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.shovelIronseed),
				"x",
				"y",
				"y",
				'x', SeedstoneMod.ironseed,
				'y', Items.stick);

		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.pickaxeIronseed),
				"xxx",
				" y ",
				" y ",
				'x', SeedstoneMod.ironseed,
				'y', Items.stick);

		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.axeIronseed),
				" xx",
				" yx",
				" y ",
				'x', SeedstoneMod.ironseed,
				'y', Items.stick);

		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.hoeIronseed),
				" xx",
				" y ",
				" y ",
				'x', SeedstoneMod.ironseed,
				'y', Items.stick);



		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.helmetironseed),
				"xxx",
				"x x",
				'x', SeedstoneMod.ironseed);

		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.chestPlateironseed),
				"x x",
				"xxx",
				"xxx",
				'x', SeedstoneMod.ironseed);

		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.leggingsironseed),
				"xxx",
				"x x",
				"x x",
				'x', SeedstoneMod.ironseed);

		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.bootsironseed),
				"x x",
				"x x",
				'x', SeedstoneMod.ironseed);

		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.bigRottenFlesh),
				"xx",
				"xx",
				'x', Items.rotten_flesh);

		GameRegistry.addSmelting(SeedstoneMod.bigRottenFlesh, new ItemStack(SeedstoneMod.steakRottenFlesh), 0.8F);


		//slab
		GameRegistry.addRecipe(new ItemStack(SeedstoneMod.CobbleseedstoneSlabsingle,6),
				"xxx",
				'x', SeedstoneMod.blockCobbleseedstone);

	}

}
