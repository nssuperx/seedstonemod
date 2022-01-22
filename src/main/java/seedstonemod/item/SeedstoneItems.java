package seedstonemod.item;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import seedstonemod.SeedstoneMod;
import seedstonemod.block.SeedstoneBlocks;

public class SeedstoneItems {
    private static final String MOD_ID = SeedstoneMod.MOD_ID;

    public static final Item ironseed = new ItemIronseed(new ResourceLocation(MOD_ID, "ironseedingot"));

    public static final ToolMaterial SEEDSTONE = EnumHelper.addToolMaterial("SEEDSTONE", 1, 100, 4.0F, 1.0F, 5).setRepairItem(new ItemStack(SeedstoneBlocks.blockCobbleseedstone));
    public static final ToolMaterial IRONSEED = EnumHelper.addToolMaterial("IRONSEED", 2, 450, 6.0F, 2.0F, 14).setRepairItem(new ItemStack(ironseed));

    public static final ArmorMaterial IRONSEEDARMOR = EnumHelper.addArmorMaterial("IRONSEEDARMOR", "ironseedarmor", 28, new int[] { 2, 6, 5, 2 }, 10, null, 0);

    public static final Item swordSeedstone = new SeedstoneSword(new ResourceLocation(MOD_ID, "seedstonesword"), SEEDSTONE);
    public static final Item shovelSeedstone = new SeedstoneShovel(new ResourceLocation(MOD_ID, "seedstoneshovel"), SEEDSTONE);
    public static final Item pickaxeSeedstone = new SeedstonePickaxe(new ResourceLocation(MOD_ID, "seedstonepickaxe"), SEEDSTONE);
    public static final Item axeSeedstone = new SeedstoneAxe(new ResourceLocation(MOD_ID, "seedstoneaxe"), SEEDSTONE);
    public static final Item hoeSeedstone = new SeedstoneHoe(new ResourceLocation(MOD_ID, "seedstonehoe"), SEEDSTONE);

    public static final Item swordIronseed = new IronseedSword(new ResourceLocation(MOD_ID, "ironseedsword"), IRONSEED);
    public static final Item shovelIronseed = new IronseedShovel(new ResourceLocation(MOD_ID, "ironseedshovel"), IRONSEED);
    public static final Item pickaxeIronseed = new IronseedPickaxe(new ResourceLocation(MOD_ID, "ironseedpickaxe"), IRONSEED);
    public static final Item axeIronseed = new IronseedAxe(new ResourceLocation(MOD_ID, "ironseedaxe"), IRONSEED);
    public static final Item hoeIronseed = new IronseedHoe(new ResourceLocation(MOD_ID, "ironseedhoe"), IRONSEED);

    public static final ItemArmor helmetIronseed = new ItemIronseedArmor(new ResourceLocation(MOD_ID, "ironseedhelmet"), EntityEquipmentSlot.HEAD);
    public static final ItemArmor chestplateIronseed = new ItemIronseedArmor(new ResourceLocation(MOD_ID, "ironseedchestplate"), EntityEquipmentSlot.CHEST);
    public static final ItemArmor leggingsIronseed = new ItemIronseedArmor(new ResourceLocation(MOD_ID, "ironseedleggings"), EntityEquipmentSlot.LEGS);
    public static final ItemArmor bootsIronseed = new ItemIronseedArmor(new ResourceLocation(MOD_ID, "ironseedboots"), EntityEquipmentSlot.FEET);

    public static final Item bigRottenFlesh = new ItemBigrottenflesh(new ResourceLocation(MOD_ID, "bigrottenflesh"));
    public static final Item steakRottenFlesh = new ItemSteakrottenflesh(new ResourceLocation(MOD_ID, "steakrottenflesh"));
    
    public static void registerItems(RegistryEvent.Register<Item> event){
        // Ironseed
        event.getRegistry().register(ironseed);
        
        // ToolMaterial ArmorMaterial
        // ToolMaterial SEEDSTONE = EnumHelper.addToolMaterial("SEEDSTONE", 1, 100, 4.0F, 1.0F, 5).setRepairItem(new ItemStack(SeedstoneBlocks.blockCobbleseedstone));
        // ToolMaterial IRONSEED = EnumHelper.addToolMaterial("IRONSEED", 2, 450, 6.0F, 2.0F, 14).setRepairItem(new ItemStack(ironseed));
        // ArmorMaterial IRONSEEDARMOR = EnumHelper.addArmorMaterial("IRONSEEDARMOR", "ironseedarmor", 28, new int[] { 2, 6, 5, 2 }, 10, null, 0);
        
        // SeedstoneTools
        event.getRegistry().register(swordSeedstone);
        event.getRegistry().register(shovelSeedstone);
        event.getRegistry().register(pickaxeSeedstone);
        event.getRegistry().register(axeSeedstone);
        event.getRegistry().register(hoeSeedstone);

        // IronseedTools
        event.getRegistry().register(swordIronseed);
        event.getRegistry().register(shovelIronseed);
        event.getRegistry().register(pickaxeIronseed);
        event.getRegistry().register(axeIronseed);
        event.getRegistry().register(hoeIronseed);

        // IronseedArmor
        event.getRegistry().register(helmetIronseed);
        event.getRegistry().register(chestplateIronseed);
        event.getRegistry().register(leggingsIronseed);
        event.getRegistry().register(bootsIronseed);

        // RottenFlesh
        event.getRegistry().register(bigRottenFlesh);
        event.getRegistry().register(steakRottenFlesh);

    }
    
    public static void registerModels(ModelRegistryEvent event){
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