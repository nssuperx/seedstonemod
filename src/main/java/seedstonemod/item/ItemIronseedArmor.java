package seedstonemod.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import seedstonemod.SeedstoneMod;

public class ItemIronseedArmor extends ItemArmor {
	private String armorname;

	public ItemIronseedArmor(int type){
		super(SeedstoneItems.IRONSEEDARMOR, 0 ,type);
		switch(type){
			case 0:
				armorname = "ironseedhelmet";
				break;

			case 1:
				armorname = "ironseedchestplate";
				break;

			case 2:
				armorname = "ironseedleggings";
				break;

			case 3:
				armorname = "ironseedboots";
				break;

		}
		setRegistryName(armorname);
		setUnlocalizedName(armorname);
		setCreativeTab(SeedstoneMod.tabSeedstone);
	}


	public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type){
		if (this.armorType == 2){
			return "seedstonemod:textures/models/armor/ironseedarmor_layer_2.png";
		}
		return "seedstonemod:textures/models/armor/ironseedarmor_layer_1.png";
	}
}
