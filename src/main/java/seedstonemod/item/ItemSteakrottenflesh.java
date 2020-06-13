package seedstonemod.item;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import seedstonemod.SeedstoneMod;

public class ItemSteakrottenflesh extends ItemFood{
    public ItemSteakrottenflesh(){
        // args: int healAmount, float saturationModifier, Boolean isWolfsFavoriteMeat
        super(4, 1.6F, true);
        setPotionEffect(Potion.hunger.id, 30, 0, 0.05F);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setUnlocalizedName("steakRottenFlesh");
        setTextureName("seedstonemod:steakrottenflesh");
    }
    
}