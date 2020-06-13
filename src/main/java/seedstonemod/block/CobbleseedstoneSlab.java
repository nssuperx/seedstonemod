package seedstonemod.block;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import seedstonemod.SeedstoneMod;


public class CobbleseedstoneSlab extends BlockSlab {
	
	private IIcon sideIcon;
	
	public CobbleseedstoneSlab(boolean isDouble) {
		super(isDouble, Material.rock);
		this.useNeighborBrightness = true;
		this.setStepSound(Block.soundTypeStone);
		this.setResistance(10.0F);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 0);
		this.setCreativeTab(SeedstoneMod.tabSeedstone);
		this.setBlockName("CobbleseedstoneSlab");
		this.setLightLevel(0.0f);
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		if(this.field_150004_a && (meta & 2) != 0){
			side = 1;
		}
		return side == 1 ? this.sideIcon : (side == 0 ? this.sideIcon : this.blockIcon);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon){
		this.blockIcon = icon.registerIcon("seedstonemod:cobbleseedstone_block");
		this.sideIcon = icon.registerIcon("seedstonemod:cobbleseedstone_block");
	}



	@Override
	public Item getItemDropped (int p_149650_1_, Random p_149650_2_, int p_149650_3_){
		return Item.getItemFromBlock(SeedstoneBlocks.CobbleseedstoneSlabsingle);
	}

	protected ItemStack createStactedBlock (int p_149644_1_){
		return new ItemStack(SeedstoneBlocks.CobbleseedstoneSlabsingle, 2, 0);
	}

	@Override
	public String func_150002_b(int var1){
		return super.getUnlocalizedName();
	}

	
	//ignore warning
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs tab, List list){
		if(item != Item.getItemFromBlock(SeedstoneBlocks.CobbleseedstoneSlabdouble))
		{
			list.add(new ItemStack(item, 1, 0));
		}
	}
	
	
	@SideOnly(Side.CLIENT)
	private static boolean isBlockSingleSlab(Block block){
		return block == SeedstoneBlocks.CobbleseedstoneSlabsingle;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World world, int x, int y, int z){
		return isBlockSingleSlab(this) ? Item.getItemFromBlock(this) : Item.getItemFromBlock(SeedstoneBlocks.CobbleseedstoneSlabsingle);
	}
}
