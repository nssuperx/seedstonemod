package seedstonemod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class SeedstoneBlock extends Block {
	public SeedstoneBlock(Material material)
	{
		super(material);
		this.setCreativeTab(SeedstoneMod.tabSeedstone);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 0);
		this.setLightLevel(0.0f);
	}

	@Override
	public Item getItemDropped(int meta, Random random, int fortune)
	{
		return Item.getItemFromBlock(SeedstoneMod.blockCobbleseedstone);
	}

}
