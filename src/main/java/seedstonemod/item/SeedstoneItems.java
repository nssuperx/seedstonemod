package seedstonemod.item;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import seedstonemod.block.SeedstoneBlocks;

public class SeedstoneItems {

	public static final String MOD_ID = "seedstonemod";

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

	public static ItemArmor helmetIronseed;
	public static ItemArmor chestplateIronseed;
	public static ItemArmor leggingsIronseed;
	public static ItemArmor bootsIronseed;

	public static Item bigRottenFlesh;
    public static Item steakRottenFlesh;
	
    public static void registerItems(FMLPreInitializationEvent event){
		// Ironseed
		ironseed = new ItemIronseed();
		GameRegistry.registerItem(ironseed, "ironseedingot");
		
		// ToolMaterial ArmorMaterial
		SEEDSTONE = EnumHelper.addToolMaterial("SEEDSTONE", 1, 100, 4.0F, 1.0F, 5).setRepairItem(new ItemStack(SeedstoneBlocks.blockCobbleseedstone));
		IRONSEED = EnumHelper.addToolMaterial("IRONSEED", 2, 450, 6.0F, 2.0F, 14).setRepairItem(new ItemStack(SeedstoneItems.ironseed));
		IRONSEEDARMOR = EnumHelper.addArmorMaterial("IRONSEEDARMOR", "ironseedarmor", 28, new int[] { 2, 6, 5, 2 }, 10);
		IRONSEEDARMOR.customCraftingMaterial = ironseed;
		
		// SeedstoneTools
		swordSeedstone = new SeedstoneSword(SEEDSTONE);
		shovelSeedstone = new SeedstoneShovel(SEEDSTONE);
		pickaxeSeedstone = new SeedstonePickaxe(SEEDSTONE);
		axeSeedstone = new SeedstoneAxe(SEEDSTONE);
		hoeSeedstone = new SeedstoneHoe(SEEDSTONE);
		GameRegistry.registerItem(swordSeedstone, "seedstonesword");
		GameRegistry.registerItem(shovelSeedstone, "seedstoneshovel");
		GameRegistry.registerItem(pickaxeSeedstone, "seedstonepickaxe");
		GameRegistry.registerItem(axeSeedstone, "seedstoneaxe");
		GameRegistry.registerItem(hoeSeedstone, "seedstonehoe");

		// IronseedTools
		swordIronseed = new IronseedSword(IRONSEED);
		shovelIronseed = new IronseedShovel(IRONSEED);
		pickaxeIronseed = new IronseedPickaxe(IRONSEED);
		axeIronseed = new IronseedAxe(IRONSEED);
		hoeIronseed = new IronseedHoe(IRONSEED);
		GameRegistry.registerItem(swordIronseed, "ironseedsword");
		GameRegistry.registerItem(shovelIronseed, "ironseedshovel");
		GameRegistry.registerItem(pickaxeIronseed, "ironseedpickaxe");
		GameRegistry.registerItem(axeIronseed, "ironseedaxe");
		GameRegistry.registerItem(hoeIronseed, "ironseedhoe");

		// IronseedArmor
		helmetIronseed = new ItemIronseedArmor(0);
		chestplateIronseed = new ItemIronseedArmor(1);
		leggingsIronseed = new ItemIronseedArmor(2);
		bootsIronseed = new ItemIronseedArmor(3);
		GameRegistry.registerItem(helmetIronseed, "ironseedhelmet");
		GameRegistry.registerItem(chestplateIronseed, "ironseedchestplate");
		GameRegistry.registerItem(leggingsIronseed, "ironseedleggings");
		GameRegistry.registerItem(bootsIronseed, "ironseedboots");

		// RottenFlesh
		bigRottenFlesh = new ItemBigrottenflesh();
		steakRottenFlesh = new ItemSteakrottenflesh();
		GameRegistry.registerItem(bigRottenFlesh, "bigrottenflesh");
		GameRegistry.registerItem(steakRottenFlesh, "steakrottenflesh");

		if (event.getSide().isClient()) {
			ModelLoader.setCustomModelResourceLocation(ironseed, 0, new ModelResourceLocation(ironseed.getRegistryName(), "inventory"));

			ModelLoader.setCustomModelResourceLocation(swordSeedstone, 0, new ModelResourceLocation(swordSeedstone.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(shovelSeedstone, 0, new ModelResourceLocation(shovelSeedstone.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(pickaxeSeedstone, 0, new ModelResourceLocation(pickaxeSeedstone.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(axeSeedstone, 0, new ModelResourceLocation(axeSeedstone.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(hoeSeedstone, 0, new ModelResourceLocation(hoeSeedstone.getRegistryName(), "inventory"));

            ModelLoader.setCustomModelResourceLocation(swordIronseed, 0, new ModelResourceLocation(swordIronseed.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(shovelIronseed, 0, new ModelResourceLocation(shovelIronseed.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(pickaxeIronseed, 0, new ModelResourceLocation(pickaxeIronseed.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(axeIronseed, 0, new ModelResourceLocation(axeIronseed.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(hoeIronseed, 0, new ModelResourceLocation(hoeIronseed.getRegistryName(), "inventory"));
		
			ModelLoader.setCustomModelResourceLocation(helmetIronseed, 0, new ModelResourceLocation(helmetIronseed.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(chestplateIronseed, 0, new ModelResourceLocation(chestplateIronseed.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(leggingsIronseed, 0, new ModelResourceLocation(leggingsIronseed.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(bootsIronseed, 0, new ModelResourceLocation(bootsIronseed.getRegistryName(), "inventory"));

            ModelLoader.setCustomModelResourceLocation(bigRottenFlesh, 0, new ModelResourceLocation(bigRottenFlesh.getRegistryName(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(steakRottenFlesh, 0, new ModelResourceLocation(steakRottenFlesh.getRegistryName(), "inventory"));
        }

    }
    
}