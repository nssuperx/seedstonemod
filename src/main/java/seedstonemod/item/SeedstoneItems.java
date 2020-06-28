package seedstonemod.item;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
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
		// new ResourceLocation(MOD_ID, "ironseedingot")
		GameRegistry.register(ironseed, new ResourceLocation(MOD_ID, "ironseedingot"));
		
		// ToolMaterial ArmorMaterial
		SEEDSTONE = EnumHelper.addToolMaterial("SEEDSTONE", 1, 100, 4.0F, 1.0F, 5).setRepairItem(new ItemStack(SeedstoneBlocks.blockCobbleseedstone));
		IRONSEED = EnumHelper.addToolMaterial("IRONSEED", 2, 450, 6.0F, 2.0F, 14).setRepairItem(new ItemStack(SeedstoneItems.ironseed));
		IRONSEEDARMOR = EnumHelper.addArmorMaterial("IRONSEEDARMOR", "ironseedarmor", 28, new int[] { 2, 6, 5, 2 }, 10, null, 0);
		IRONSEEDARMOR.customCraftingMaterial = ironseed;
		
		// SeedstoneTools
		swordSeedstone = new SeedstoneSword(SEEDSTONE);
		shovelSeedstone = new SeedstoneShovel(SEEDSTONE);
		pickaxeSeedstone = new SeedstonePickaxe(SEEDSTONE);
		axeSeedstone = new SeedstoneAxe(SEEDSTONE);
		hoeSeedstone = new SeedstoneHoe(SEEDSTONE);
		GameRegistry.register(swordSeedstone, new ResourceLocation(MOD_ID, "seedstonesword"));
		GameRegistry.register(shovelSeedstone, new ResourceLocation(MOD_ID, "seedstoneshovel"));
		GameRegistry.register(pickaxeSeedstone, new ResourceLocation(MOD_ID, "seedstonepickaxe"));
		GameRegistry.register(axeSeedstone, new ResourceLocation(MOD_ID, "seedstoneaxe"));
		GameRegistry.register(hoeSeedstone, new ResourceLocation(MOD_ID, "seedstonehoe"));

		// IronseedTools
		swordIronseed = new IronseedSword(IRONSEED);
		shovelIronseed = new IronseedShovel(IRONSEED);
		pickaxeIronseed = new IronseedPickaxe(IRONSEED);
		axeIronseed = new IronseedAxe(IRONSEED);
		hoeIronseed = new IronseedHoe(IRONSEED);
		GameRegistry.register(swordIronseed, new ResourceLocation(MOD_ID, "ironseedsword"));
		GameRegistry.register(shovelIronseed, new ResourceLocation(MOD_ID, "ironseedshovel"));
		GameRegistry.register(pickaxeIronseed, new ResourceLocation(MOD_ID, "ironseedpickaxe"));
		GameRegistry.register(axeIronseed, new ResourceLocation(MOD_ID, "ironseedaxe"));
		GameRegistry.register(hoeIronseed, new ResourceLocation(MOD_ID, "ironseedhoe"));

		// IronseedArmor
		helmetIronseed = new ItemIronseedArmor(EntityEquipmentSlot.HEAD);
		chestplateIronseed = new ItemIronseedArmor(EntityEquipmentSlot.CHEST);
		leggingsIronseed = new ItemIronseedArmor(EntityEquipmentSlot.LEGS);
		bootsIronseed = new ItemIronseedArmor(EntityEquipmentSlot.FEET);
		GameRegistry.register(helmetIronseed, new ResourceLocation(MOD_ID, "ironseedhelmet"));
		GameRegistry.register(chestplateIronseed, new ResourceLocation(MOD_ID, "ironseedchestplate"));
		GameRegistry.register(leggingsIronseed, new ResourceLocation(MOD_ID, "ironseedleggings"));
		GameRegistry.register(bootsIronseed, new ResourceLocation(MOD_ID, "ironseedboots"));

		// RottenFlesh
		bigRottenFlesh = new ItemBigrottenflesh();
		steakRottenFlesh = new ItemSteakrottenflesh();
		GameRegistry.register(bigRottenFlesh, new ResourceLocation(MOD_ID, "bigrottenflesh"));
		GameRegistry.register(steakRottenFlesh, new ResourceLocation(MOD_ID, "steakrottenflesh"));

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