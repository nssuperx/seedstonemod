package seedstonemod.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import seedstonemod.SeedstoneMod;

public class SeedstoneBlock extends Block {

    public SeedstoneBlock(ResourceLocation rl) {
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

    public Item getItemDropped(IBlockState blockState, Random random, int fortune) {
        return Item.getItemFromBlock(SeedstoneBlocks.blockCobbleseedstone);
    }
}
