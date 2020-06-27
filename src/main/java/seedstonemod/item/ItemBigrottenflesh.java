package seedstonemod.item;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import seedstonemod.SeedstoneMod;

public class ItemBigrottenflesh extends ItemFood{
	private final String itemname = "bigrottenflesh";

    public ItemBigrottenflesh(){
        // args: int healAmount, float saturationModifier, Boolean isWolfsFavoriteMeat
        super(8, 1.6F, true);
        setPotionEffect(Potion.hunger.id, 30, 0, 0.9F);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setRegistryName(itemname);
        setUnlocalizedName(itemname);
    }
    
}