package seedstonemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CobbleseedstoneBlock extends Block {
	public CobbleseedstoneBlock(Material material)
	{
		super(material);
		this.setBlockName("blockCobbleseedstone");
		this.setBlockTextureName("seedstonemod:cobbleseedstone_block");
		this.setCreativeTab(SeedstoneMod.tabSeedstone);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 0);
		this.setLightLevel(0.0f);
	}
}
