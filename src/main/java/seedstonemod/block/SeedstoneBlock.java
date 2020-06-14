package seedstonemod.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import seedstonemod.SeedstoneMod;

public class SeedstoneBlock extends Block {
	public SeedstoneBlock(Material material)
	{
		super(material);
		this.setRegistryName("blockSeedstone");
		this.setUnlocalizedName("blockSeedstone");
		// this.setBlockTextureName("seedstonemod:seedstone_block");
		this.setCreativeTab(SeedstoneMod.tabSeedstone);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 0);
		this.setLightLevel(0.0f);
	}

	public Item getItemDropped(int meta, Random random, int fortune)
	{
		return Item.getItemFromBlock(SeedstoneBlocks.blockCobbleseedstone);
	}

}
