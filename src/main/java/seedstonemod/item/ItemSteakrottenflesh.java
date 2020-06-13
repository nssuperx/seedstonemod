package seedstonemod.item;

import net.minecraft.item.ItemFood;
import seedstonemod.SeedstoneMod;

public class ItemSteakrottenflesh extends ItemFood{
    public ItemSteakrottenflesh(int healAmount, float saturationModifier, Boolean isWolfsFavoriteMeat){
        super(healAmount, saturationModifier, isWolfsFavoriteMeat);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setUnlocalizedName("steakRottenFlesh");
        setTextureName("seedstonemod:steakrottenflesh");
    }
    
}