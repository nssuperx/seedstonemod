package seedstonemod;

import net.minecraft.item.ItemFood;

public class ItemSteakrottenflesh extends ItemFood{
    public ItemSteakrottenflesh(int healAmount, float saturationModifier, Boolean isWolfsFavoriteMeat){
        super(healAmount, saturationModifier, isWolfsFavoriteMeat);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setUnlocalizedName("steakRottenFlesh");
        setTextureName("seedstonemod:steakrottenflesh");
    }
    
}