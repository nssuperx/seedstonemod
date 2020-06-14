package seedstonemod.block;

import java.util.List;
import java.util.Random;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import seedstonemod.SeedstoneMod;


public class CobbleseedstoneSlab extends BlockSlab {
	
	public CobbleseedstoneSlab(boolean isDouble) {
		super(Material.rock);
		this.useNeighborBrightness = true;
		this.setStepSound(Block.soundTypeStone);
		this.setResistance(10.0F);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 0);
		
		// this.setBlockName("CobbleseedstoneSlab");
		this.setLightLevel(0.0f);
		// this.setUnlocalizedName("CobbleseedstoneSlab");

		IBlockState blockState = this.blockState.getBaseState();
		blockState = blockState.withProperty(PropertyBool.create("variant"), false);
		
		if(!this.isDouble()){
			this.setCreativeTab(SeedstoneMod.tabSeedstone);
			blockState = blockState.withProperty(HALF, EnumBlockHalf.BOTTOM);
		}
		setDefaultState(blockState);
	}
	
	public Item getItemDropped (int p_149650_1_, Random p_149650_2_, int p_149650_3_){
		return Item.getItemFromBlock(SeedstoneBlocks.CobbleseedstoneSlabsingle);
	}

	protected ItemStack createStactedBlock (int p_149644_1_){
		return new ItemStack(SeedstoneBlocks.CobbleseedstoneSlabsingle, 2, 0);
	}

	public String getUnlocalizedName(int metadata){
		return super.getUnlocalizedName();
	}

	public final Object getVariant(final ItemStack itemStack) {
        return false;
	}
	
	public final IProperty getVariantProperty() {
        return PropertyBool.create("variant");
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
	
	@SideOnly(Side.CLIENT)
	public Item getItem(World world, int x, int y, int z){
		return isBlockSingleSlab(this) ? Item.getItemFromBlock(this) : Item.getItemFromBlock(SeedstoneBlocks.CobbleseedstoneSlabsingle);
	}

	@Override
	public boolean isDouble() {
		return isBlockSingleSlab(this);
	}
}
