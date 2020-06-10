package seedstonemod;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemIronseedArmor extends ItemArmor {

	public ItemIronseedArmor(int type){
		super(SeedstoneMod.IRONSEEDARMOR, 0 ,type);
		this.setCreativeTab(SeedstoneMod.tabSeedstone);
	}


	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type){
		if (this.armorType == 2){
			return "seedstonemod:textures/models/armor/ironseed_layer_2.png";
		}
		return "seedstonemod:textures/models/armor/ironseed_layer_1.png";
	}


}
