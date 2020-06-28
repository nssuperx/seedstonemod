package seedstonemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import seedstonemod.SeedstoneMod;

public class CobbleseedstoneBlock extends Block {
	private final String blockname = "cobbleseedstoneblock";

	public CobbleseedstoneBlock(Material material){
		super(material);
		this.setRegistryName(blockname);
		this.setUnlocalizedName(blockname);
		this.setCreativeTab(SeedstoneMod.tabSeedstone);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.STONE);
		this.setHarvestLevel("pickaxe", 0);
		this.setLightLevel(0.0f);
	}
}
