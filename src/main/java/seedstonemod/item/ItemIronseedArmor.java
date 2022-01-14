package seedstonemod.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import seedstonemod.SeedstoneMod;

public class ItemIronseedArmor extends ItemArmor {
	private String armorname;

	public ItemIronseedArmor(EntityEquipmentSlot type) {
		super(SeedstoneItems.IRONSEEDARMOR, 0, type);
		switch(type){
			case HEAD:
				armorname = "ironseedhelmet";
				break;

			case CHEST:
				armorname = "ironseedchestplate";
				break;

			case LEGS:
				armorname = "ironseedleggings";
				break;

			case FEET:
				armorname = "ironseedboots";
				break;
			default:
				break;

		}
		// setRegistryName(armorname);
		setUnlocalizedName(armorname);
		setCreativeTab(SeedstoneMod.tabSeedstone);
	}


	// public String getArmorTexture(ItemStack itemStack, Entity entity, EntityEquipmentSlot slot, String type){
	// 	if (this.armorType == 2){
	// 		return "seedstonemod:textures/models/armor/ironseedarmor_layer_2.png";
	// 	}
	// 	return "seedstonemod:textures/models/armor/ironseedarmor_layer_1.png";
	// }
}
