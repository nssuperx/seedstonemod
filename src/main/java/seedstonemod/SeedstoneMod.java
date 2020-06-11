package seedstonemod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;


@Mod(modid = SeedstoneMod.MODID, name = SeedstoneMod.MODNAME, version = SeedstoneMod.VERSION)
public class SeedstoneMod
{
	public static final String MODID = "seedstoneMod";
	public static final String MODNAME = "SeedstoneMod";
	public static final String VERSION = "1.5.0";

	@Metadata(MODID)
	public static ModMetadata meta;

	public static CreativeTabs tabSeedstone = new SeedstoneTab("Seedstonetab");

	public static Block blockSeedstone;
	public static Block blockCobbleseedstone;

	public static Block stairsCobbleseedstone;
	//slab
	public static BlockSlab CobbleseedstoneSlabsingle;
	public static BlockSlab CobbleseedstoneSlabdouble;

	public static Item ironseed;

	public static ToolMaterial SEEDSTONE;
	public static ToolMaterial IRONSEED;

	public static ArmorMaterial IRONSEEDARMOR;

	public static Item swordSeedstone;
	public static Item shovelSeedstone;
	public static Item pickaxeSeedstone;
	public static Item axeSeedstone;
	public static Item hoeSeedstone;

	public static Item swordIronseed;
	public static Item shovelIronseed;
	public static Item pickaxeIronseed;
	public static Item axeIronseed;
	public static Item hoeIronseed;

	public static Item helmetironseed;
	public static Item chestPlateironseed;
	public static Item leggingsironseed;
	public static Item bootsironseed;

	public static Item bigRottenFlesh;
	public static Item steakRottenFlesh;



	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModInfo.loadInfo(meta);

		blockSeedstone = new SeedstoneBlock(Material.rock)
				.setBlockName("blockSeedstone")
				.setBlockTextureName("seedstonemod:seedstone_block");
		GameRegistry.registerBlock(blockSeedstone, "blockSeedstone");

		blockCobbleseedstone = new CobbleseedstoneBlock(Material.rock)
				.setBlockName("blockCobbleseedstone")
				.setBlockTextureName("seedstonemod:cobbleseedstone_block");
		GameRegistry.registerBlock(blockCobbleseedstone, "blockCobbleseedstone");



		stairsCobbleseedstone = new BlockStairs(blockCobbleseedstone,0){}
				.setBlockName("stairsCobbleseedstone");
		stairsCobbleseedstone.setCreativeTab(SeedstoneMod.tabSeedstone);
		stairsCobbleseedstone.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(stairsCobbleseedstone, "stairsCobbleseedstone");

		ironseed = new Item()
				.setCreativeTab(SeedstoneMod.tabSeedstone)
				.setUnlocalizedName("ironseed")
				.setTextureName("seedstonemod:ironseed_ingot");
		GameRegistry.registerItem(ironseed, "ironseed");

		SEEDSTONE = EnumHelper.addToolMaterial("SEEDSTONE", 1, 131, 4.0F, 1.0F, 5)
				.setRepairItem(new ItemStack(SeedstoneMod.blockCobbleseedstone));

		swordSeedstone = new ItemSword(SEEDSTONE)
				.setCreativeTab(SeedstoneMod.tabSeedstone)
				.setUnlocalizedName("swordSeedstone")
				.setTextureName("seedstonemod:seedstone_sword");
		GameRegistry.registerItem(swordSeedstone, "swordSeedstone");

		shovelSeedstone = new ItemSpade(SEEDSTONE)
				.setCreativeTab(SeedstoneMod.tabSeedstone)
				.setUnlocalizedName("shovelSeedstone")
				.setTextureName("seedstonemod:seedstone_shovel");
		GameRegistry.registerItem(shovelSeedstone, "shovelSeedstone");

		pickaxeSeedstone = new SeedstonePickaxe(SEEDSTONE)
				.setCreativeTab(SeedstoneMod.tabSeedstone)
				.setUnlocalizedName("pickaxeSeedstone")
				.setTextureName("seedstonemod:seedstone_pickaxe");
		GameRegistry.registerItem(pickaxeSeedstone, "pickaxeSeedstone");

		axeSeedstone = new SeedstoneAxe(SEEDSTONE)
				.setCreativeTab(SeedstoneMod.tabSeedstone)
				.setUnlocalizedName("axeSeedstone")
				.setTextureName("seedstonemod:seedstone_axe");
		GameRegistry.registerItem(axeSeedstone, "axeSeedstone");

		hoeSeedstone = new ItemHoe(SEEDSTONE)
				.setCreativeTab(SeedstoneMod.tabSeedstone)
				.setUnlocalizedName("hoeSeedstone")
				.setTextureName("seedstonemod:seedstone_hoe");
		GameRegistry.registerItem(hoeSeedstone, "hoeSeedstone");



		IRONSEED = EnumHelper.addToolMaterial("IRONSEED", 2, 700, 6.0F, 2.0F, 14)
				.setRepairItem(new ItemStack(SeedstoneMod.ironseed));

		swordIronseed = new ItemSword(IRONSEED)
				.setCreativeTab(SeedstoneMod.tabSeedstone)
				.setUnlocalizedName("swordIronseed")
				.setTextureName("seedstonemod:ironseed_sword");
		GameRegistry.registerItem(swordIronseed, "swordIronseed");

		shovelIronseed = new ItemSpade(IRONSEED)
				.setCreativeTab(SeedstoneMod.tabSeedstone)
				.setUnlocalizedName("shovelIronseed")
				.setTextureName("seedstonemod:ironseed_shovel");
		GameRegistry.registerItem(shovelIronseed, "shovelIronseed");

		pickaxeIronseed = new IronseedPickaxe(IRONSEED)
				.setCreativeTab(SeedstoneMod.tabSeedstone)
				.setUnlocalizedName("pickaxeIronseed")
				.setTextureName("seedstonemod:ironseed_pickaxe");
		GameRegistry.registerItem(pickaxeIronseed, "pickaxeIronseed");

		axeIronseed = new IronseedAxe(IRONSEED)
				.setCreativeTab(SeedstoneMod.tabSeedstone)
				.setUnlocalizedName("axeIronseed")
				.setTextureName("seedstonemod:ironseed_axe");
		GameRegistry.registerItem(axeIronseed, "axeIronseed");

		hoeIronseed = new ItemHoe(IRONSEED)
				.setCreativeTab(SeedstoneMod.tabSeedstone)
				.setUnlocalizedName("hoeIronseed")
				.setTextureName("seedstonemod:ironseed_hoe");
		GameRegistry.registerItem(hoeIronseed, "hoeIronseed");



		IRONSEEDARMOR = EnumHelper.addArmorMaterial("IRONSEEDARMOR", 30, new int[] {2, 6, 5, 2 }, 10 );
		IRONSEEDARMOR.customCraftingMaterial = ironseed;

		helmetironseed = new ItemIronseedArmor(0)
				.setUnlocalizedName("helmetIronseed")
				.setTextureName("seedstonemod:ironseed_helmet");
		GameRegistry.registerItem(helmetironseed, "helmetIronseed");

		chestPlateironseed = new ItemIronseedArmor(1)
				.setUnlocalizedName("chestPlateIronseed")
				.setTextureName("seedstonemod:ironseed_chestplate");
		GameRegistry.registerItem(chestPlateironseed, "chestPlateIronseed");

		leggingsironseed = new ItemIronseedArmor(2)
				.setUnlocalizedName("leggingsIronseed")
				.setTextureName("seedstonemod:ironseed_leggings");
		GameRegistry.registerItem(leggingsironseed, "leggingsIronseed");

		bootsironseed = new ItemIronseedArmor(3)
				.setUnlocalizedName("bootsIronseed")
				.setTextureName("seedstonemod:ironseed_boots");
		GameRegistry.registerItem(bootsironseed, "bootsIronseed");


		bigRottenFlesh = new ItemFood(8, 2.0F, true)
				.setPotionEffect(Potion.hunger.id, 30, 0, 0.8F)
				.setCreativeTab(SeedstoneMod.tabSeedstone)
				.setUnlocalizedName("bigRottenFlesh")
				.setTextureName("seedstonemod:bigrottenflesh");
		GameRegistry.registerItem(bigRottenFlesh, "bigRottenFlesh");

		steakRottenFlesh = new ItemFood(4, 2.0F, true)
				.setCreativeTab(SeedstoneMod.tabSeedstone)
				.setUnlocalizedName("steakRottenFlesh")
				.setTextureName("seedstonemod:steakrottenflesh");
		GameRegistry.registerItem(steakRottenFlesh, "steakRottenFlesh");
		//slab
		CobbleseedstoneSlabsingle = new CobbleseedstoneSlab(false);
		CobbleseedstoneSlabdouble = new CobbleseedstoneSlab(true);

	}

	@EventHandler
	public void Init(FMLInitializationEvent event )
	{
		//slab
		GameRegistry.registerBlock(CobbleseedstoneSlabsingle, ItemCobbleseedstoneSlab.class, "CobbleseedstoneSlabsingle");
		GameRegistry.registerBlock(CobbleseedstoneSlabdouble, ItemCobbleseedstoneSlab.class, "CobbleseedstoneSlabdouble");

		SeedstoneRecipes.registerRecipes();

	}


}
