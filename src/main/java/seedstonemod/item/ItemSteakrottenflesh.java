package seedstonemod.item;

import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import seedstonemod.SeedstoneMod;

public class ItemSteakrottenflesh extends ItemFood {

    public ItemSteakrottenflesh(ResourceLocation rl) {
        // args: int healAmount, float saturationModifier, Boolean isWolfsFavoriteMeat
        super(4, 1.6F, true);
        setPotionEffect(new PotionEffect(MobEffects.HUNGER, 30, 0), 0.05F);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        setRegistryName(rl);
        setUnlocalizedName(rl.getResourcePath());
    }
}
