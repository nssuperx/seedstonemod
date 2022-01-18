package seedstonemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import seedstonemod.SeedstoneMod;

public class CobbleseedstoneBlock extends Block {

    public CobbleseedstoneBlock(ResourceLocation rl) {
        super(Material.ROCK);
        this.setRegistryName(rl);
        this.setUnlocalizedName(rl.getResourcePath());
        this.setCreativeTab(SeedstoneMod.tabSeedstone);
        this.setHardness(2.0F);
        this.setResistance(10.0F);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 0);
        this.setLightLevel(0.0f);
    }
}
