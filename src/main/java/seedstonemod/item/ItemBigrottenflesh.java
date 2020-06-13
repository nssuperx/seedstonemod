package seedstonemod.item;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import seedstonemod.SeedstoneMod;

public class ItemBigrottenflesh extends ItemFood{
    public ItemBigrottenflesh(int healAmount, float saturationModifier, Boolean isWolfsFavoriteMeat){
        super(healAmount, saturationModifier, isWolfsFavoriteMeat);
        setPotionEffect(Potion.hunger.id, 30, 0, 0.8F);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setUnlocalizedName("bigRottenFlesh");
        setTextureName("seedstonemod:bigrottenflesh");
    }
    
}