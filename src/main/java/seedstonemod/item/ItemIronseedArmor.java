package seedstonemod.item;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import seedstonemod.SeedstoneMod;

public class ItemIronseedArmor extends ItemArmor {

    public ItemIronseedArmor(ResourceLocation rl, EntityEquipmentSlot type) {
        super(SeedstoneItems.IRONSEEDARMOR, 0, type);
        setRegistryName(rl);
        setUnlocalizedName(rl.getResourcePath());
        setCreativeTab(SeedstoneMod.tabSeedstone);
    }

    public String getArmorTexture(ItemStack itemStack, Entity entity, EntityEquipmentSlot slot, String type) {
        if (slot.getSlotIndex() == EntityEquipmentSlot.LEGS.getSlotIndex()) {
            return "seedstonemod:textures/models/armor/ironseedarmor_layer_2.png";
        }
        return "seedstonemod:textures/models/armor/ironseedarmor_layer_1.png";
    }
}
