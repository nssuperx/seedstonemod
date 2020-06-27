package seedstonemod.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import seedstonemod.SeedstoneMod;

public class ItemIronseedArmor extends ItemArmor {

	public ItemIronseedArmor(int type){
		super(SeedstoneItems.IRONSEEDARMOR, 0 ,type);
		switch(type){
			case 0:
				setUnlocalizedName("helmetIronseed");
				// setTextureName("seedstonemod:ironseed_helmet");
				break;

			case 1:
				setUnlocalizedName("chestPlateIronseed");
				// setTextureName("seedstonemod:ironseed_chestplate");
				break;

			case 2:
				setUnlocalizedName("leggingsIronseed");
				// setTextureName("seedstonemod:ironseed_leggings");
				break;

			case 3:
				setUnlocalizedName("bootsIronseed");
				// setTextureName("seedstonemod:ironseed_boots");
				break;

		}
		this.setCreativeTab(SeedstoneMod.tabSeedstone);
	}


	public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type){
		if (this.armorType == 2){
			return "seedstonemod:textures/models/armor/ironseedarmor_layer_2.png";
		}
		return "seedstonemod:textures/models/armor/ironseedarmor_layer_1.png";
	}
}
