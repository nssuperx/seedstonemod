package seedstonemod.item;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import seedstonemod.block.SeedstoneBlocks;

public class SeedstoneItems {

	public static final String MOD_ID = "seedstoneMod";

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
	
    public static void registerItems(FMLPreInitializationEvent event){
		// Ironseed
		ironseed = new ItemIronseed();
		GameRegistry.registerItem(ironseed, "ironseed");
		
		// ToolMaterial ArmorMaterial
		SEEDSTONE = EnumHelper.addToolMaterial("SEEDSTONE", 1, 100, 4.0F, 1.0F, 5).setRepairItem(new ItemStack(SeedstoneBlocks.blockCobbleseedstone));
		IRONSEED = EnumHelper.addToolMaterial("IRONSEED", 2, 450, 6.0F, 2.0F, 14).setRepairItem(new ItemStack(SeedstoneItems.ironseed));
		IRONSEEDARMOR = EnumHelper.addArmorMaterial("IRONSEEDARMOR", null, 28, new int[] { 2, 6, 5, 2 }, 10);
		IRONSEEDARMOR.customCraftingMaterial = ironseed;
		
		// SeedstoneTools
		swordSeedstone = new SeedstoneSword(SEEDSTONE);
		shovelSeedstone = new SeedstoneShovel(SEEDSTONE);
		pickaxeSeedstone = new SeedstonePickaxe(SEEDSTONE);
		axeSeedstone = new SeedstoneAxe(SEEDSTONE);
		hoeSeedstone = new SeedstoneHoe(SEEDSTONE);
		GameRegistry.registerItem(swordSeedstone, "swordSeedstone");
		GameRegistry.registerItem(shovelSeedstone, "shovelSeedstone");
		GameRegistry.registerItem(pickaxeSeedstone, "pickaxeSeedstone");
		GameRegistry.registerItem(axeSeedstone, "axeSeedstone");
		GameRegistry.registerItem(hoeSeedstone, "hoeSeedstone");

		// IronseedTools
		swordIronseed = new IronseedSword(IRONSEED);
		shovelIronseed = new IronseedShovel(IRONSEED);
		pickaxeIronseed = new IronseedPickaxe(IRONSEED);
		axeIronseed = new IronseedAxe(IRONSEED);
		hoeIronseed = new IronseedHoe(IRONSEED);
		GameRegistry.registerItem(swordIronseed, "swordIronseed");
		GameRegistry.registerItem(shovelIronseed, "shovelIronseed");
		GameRegistry.registerItem(pickaxeIronseed, "pickaxeIronseed");
		GameRegistry.registerItem(axeIronseed, "axeIronseed");
		GameRegistry.registerItem(hoeIronseed, "hoeIronseed");

		// IronseedArmor
		helmetironseed = new ItemIronseedArmor(0);
		chestPlateironseed = new ItemIronseedArmor(1);
		leggingsironseed = new ItemIronseedArmor(2);
		bootsironseed = new ItemIronseedArmor(3);
		GameRegistry.registerItem(helmetironseed, "helmetIronseed");
		GameRegistry.registerItem(chestPlateironseed, "chestPlateIronseed");
		GameRegistry.registerItem(leggingsironseed, "leggingsIronseed");
		GameRegistry.registerItem(bootsironseed, "bootsIronseed");

		// RottenFlesh
		bigRottenFlesh = new ItemBigrottenflesh();
		steakRottenFlesh = new ItemSteakrottenflesh();
		GameRegistry.registerItem(bigRottenFlesh, "bigRottenFlesh");
		GameRegistry.registerItem(steakRottenFlesh, "steakRottenFlesh");

		if (event.getSide().isClient()) {
			ModelLoader.setCustomModelResourceLocation(ironseed, 0, new ModelResourceLocation(MOD_ID + ":" + "ironseedingot", "inventory"));

			ModelLoader.setCustomModelResourceLocation(swordSeedstone, 0, new ModelResourceLocation(MOD_ID + ":" + "seedstoneaxe", "inventory"));
            ModelLoader.setCustomModelResourceLocation(shovelSeedstone, 0, new ModelResourceLocation(MOD_ID + ":" + "seedstoneshovel", "inventory"));
            ModelLoader.setCustomModelResourceLocation(pickaxeSeedstone, 0, new ModelResourceLocation(MOD_ID + ":" + "seedstonepickaxe", "inventory"));
            ModelLoader.setCustomModelResourceLocation(axeSeedstone, 0, new ModelResourceLocation(MOD_ID + ":" + "seedstoneaxe", "inventory"));
			ModelLoader.setCustomModelResourceLocation(hoeSeedstone, 0, new ModelResourceLocation(MOD_ID + ":" + "seedstonehoe", "inventory"));

            ModelLoader.setCustomModelResourceLocation(swordIronseed, 0, new ModelResourceLocation(MOD_ID + ":" + "ironseedaxe", "inventory"));
            ModelLoader.setCustomModelResourceLocation(shovelIronseed, 0, new ModelResourceLocation(MOD_ID + ":" + "ironseedshovel", "inventory"));
            ModelLoader.setCustomModelResourceLocation(pickaxeIronseed, 0, new ModelResourceLocation(MOD_ID + ":" + "ironseedpickaxe", "inventory"));
            ModelLoader.setCustomModelResourceLocation(axeIronseed, 0, new ModelResourceLocation(MOD_ID + ":" + "ironseedaxe", "inventory"));
			ModelLoader.setCustomModelResourceLocation(hoeIronseed, 0, new ModelResourceLocation(MOD_ID + ":" + "ironseedhoe", "inventory"));
			
			// ModelLoader.setCustomModelResourceLocation(helmetironseed, 0, new ModelResourceLocation(MOD_ID + ":" + "ironseedhoe", "inventory"));
			// ModelLoader.setCustomModelResourceLocation(chestPlateironseed, 0, new ModelResourceLocation(MOD_ID + ":" + "ironseedhoe", "inventory"));
			// ModelLoader.setCustomModelResourceLocation(leggingsironseed, 0, new ModelResourceLocation(MOD_ID + ":" + "ironseedhoe", "inventory"));
			// ModelLoader.setCustomModelResourceLocation(bootsironseed, 0, new ModelResourceLocation(MOD_ID + ":" + "ironseedhoe", "inventory"));

            ModelLoader.setCustomModelResourceLocation(bigRottenFlesh, 0, new ModelResourceLocation(MOD_ID + ":" + "bigrottenflesh", "inventory"));
            ModelLoader.setCustomModelResourceLocation(steakRottenFlesh, 0, new ModelResourceLocation(MOD_ID + ":" + "steakrottenflesh", "inventory"));
        }

    }
    
}