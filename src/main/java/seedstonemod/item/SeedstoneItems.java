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
    public static final String MOD_ID = SeedstoneMod.MOD_ID;

    @ObjectHolder(MOD_ID)
    public static class ITEMS {
        public static final Item ironseed = null;

        public static final ToolMaterial SEEDSTONE = null;
        public static final ToolMaterial IRONSEED = null;

        public static final ArmorMaterial IRONSEEDARMOR = null;

        public static final Item swordSeedstone = null;
        public static final Item shovelSeedstone = null;
        public static final Item pickaxeSeedstone = null;
        public static final Item axeSeedstone = null;
        public static final Item hoeSeedstone = null ;

        public static final Item swordIronseed = null;
        public static final Item shovelIronseed = null;
        public static final Item pickaxeIronseed = null;
        public static final Item axeIronseed = null;
        public static final Item hoeIronseed = null;

        public static final ItemArmor helmetIronseed = null;
        public static final ItemArmor chestplateIronseed = null;
        public static final ItemArmor leggingsIronseed = null;
        public static final ItemArmor bootsIronseed = null;

        public static final Item bigRottenFlesh = null;
        public static final Item steakRottenFlesh = null;
    }
    
    public static void registerItems(RegistryEvent.Register<Item> event){
        // Ironseed
        event.getRegistry().register(new ItemIronseed(new ResourceLocation(MOD_ID, "ironseedingot")));
        
        // ToolMaterial ArmorMaterial
        ToolMaterial SEEDSTONE = EnumHelper.addToolMaterial("SEEDSTONE", 1, 100, 4.0F, 1.0F, 5).setRepairItem(new ItemStack(SeedstoneBlocks.blockCobbleseedstone));
        ToolMaterial IRONSEED = EnumHelper.addToolMaterial("IRONSEED", 2, 450, 6.0F, 2.0F, 14).setRepairItem(new ItemStack(ITEMS.ironseed));
        ArmorMaterial IRONSEEDARMOR = EnumHelper.addArmorMaterial("IRONSEEDARMOR", "ironseedarmor", 28, new int[] { 2, 6, 5, 2 }, 10, null, 0);
        
        // SeedstoneTools
        event.getRegistry().register(new SeedstoneSword(new ResourceLocation(MOD_ID, "seedstonesword"), SEEDSTONE));
        event.getRegistry().register(new SeedstoneShovel(new ResourceLocation(MOD_ID, "seedstoneshovel"), SEEDSTONE));
        event.getRegistry().register(new SeedstonePickaxe(new ResourceLocation(MOD_ID, "seedstonepickaxe"), SEEDSTONE));
        event.getRegistry().register(new SeedstoneAxe(new ResourceLocation(MOD_ID, "seedstoneaxe"), SEEDSTONE));
        event.getRegistry().register(new SeedstoneHoe(new ResourceLocation(MOD_ID, "seedstonehoe"), SEEDSTONE));

        // IronseedTools
        event.getRegistry().register(new IronseedSword(new ResourceLocation(MOD_ID, "ironseedsword"), IRONSEED));
        event.getRegistry().register(new IronseedShovel(new ResourceLocation(MOD_ID, "ironseedshovel"), IRONSEED));
        event.getRegistry().register(new IronseedPickaxe(new ResourceLocation(MOD_ID, "ironseedpickaxe"), IRONSEED));
        event.getRegistry().register(new IronseedAxe(new ResourceLocation(MOD_ID, "ironseedaxe"), IRONSEED));
        event.getRegistry().register(new IronseedHoe(new ResourceLocation(MOD_ID, "ironseedhoe"), IRONSEED));

        // IronseedArmor
        event.getRegistry().register(new ItemIronseedArmor(new ResourceLocation(MOD_ID, "ironseedhelmet"), EntityEquipmentSlot.HEAD));
        event.getRegistry().register(new ItemIronseedArmor(new ResourceLocation(MOD_ID, "ironseedchestplate"), EntityEquipmentSlot.CHEST));
        event.getRegistry().register(new ItemIronseedArmor(new ResourceLocation(MOD_ID, "ironseedleggings"), EntityEquipmentSlot.LEGS));
        event.getRegistry().register(new ItemIronseedArmor(new ResourceLocation(MOD_ID, "ironseedboots"), EntityEquipmentSlot.FEET));

        // RottenFlesh
        event.getRegistry().register(new ItemBigrottenflesh(new ResourceLocation(MOD_ID, "bigrottenflesh")));
        event.getRegistry().register(new ItemSteakrottenflesh(new ResourceLocation(MOD_ID, "steakrottenflesh")));

    }
    
    public static void registerModels(ModelRegistryEvent event){
        ModelLoader.setCustomModelResourceLocation(ITEMS.ironseed, 0, new ModelResourceLocation(ITEMS.ironseed.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(ITEMS.swordSeedstone, 0, new ModelResourceLocation(ITEMS.swordSeedstone.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ITEMS.shovelSeedstone, 0, new ModelResourceLocation(ITEMS.shovelSeedstone.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ITEMS.pickaxeSeedstone, 0, new ModelResourceLocation(ITEMS.pickaxeSeedstone.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ITEMS.axeSeedstone, 0, new ModelResourceLocation(ITEMS.axeSeedstone.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ITEMS.hoeSeedstone, 0, new ModelResourceLocation(ITEMS.hoeSeedstone.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(ITEMS.swordIronseed, 0, new ModelResourceLocation(ITEMS.swordIronseed.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ITEMS.shovelIronseed, 0, new ModelResourceLocation(ITEMS.shovelIronseed.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ITEMS.pickaxeIronseed, 0, new ModelResourceLocation(ITEMS.pickaxeIronseed.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ITEMS.axeIronseed, 0, new ModelResourceLocation(ITEMS.axeIronseed.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ITEMS.hoeIronseed, 0, new ModelResourceLocation(ITEMS.hoeIronseed.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(ITEMS.helmetIronseed, 0, new ModelResourceLocation(ITEMS.helmetIronseed.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ITEMS.chestplateIronseed, 0, new ModelResourceLocation(ITEMS.chestplateIronseed.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ITEMS.leggingsIronseed, 0, new ModelResourceLocation(ITEMS.leggingsIronseed.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ITEMS.bootsIronseed, 0, new ModelResourceLocation(ITEMS.bootsIronseed.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(ITEMS.bigRottenFlesh, 0, new ModelResourceLocation(ITEMS.bigRottenFlesh.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ITEMS.steakRottenFlesh, 0, new ModelResourceLocation(ITEMS.steakRottenFlesh.getRegistryName(), "inventory"));
    }
}