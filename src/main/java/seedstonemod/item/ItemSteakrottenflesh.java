package seedstonemod.item;

import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;
import seedstonemod.SeedstoneMod;

public class ItemSteakrottenflesh extends ItemFood{
	private final String itemname = "steakrottenflesh";

    public ItemSteakrottenflesh(){
        // args: int healAmount, float saturationModifier, Boolean isWolfsFavoriteMeat
        super(4, 1.6F, true);
        setPotionEffect(new PotionEffect(MobEffects.HUNGER, 30, 0), 0.05F);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setRegistryName(itemname);
        setUnlocalizedName(itemname);
    }
    
}