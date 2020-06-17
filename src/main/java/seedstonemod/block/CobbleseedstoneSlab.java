package seedstonemod.block;

import java.util.Random;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import seedstonemod.SeedstoneMod;


public class CobbleseedstoneSlab extends BlockSlab {

	private static final PropertyBool VARIANT = PropertyBool.create("variant");
	
	public CobbleseedstoneSlab(boolean isDouble) {
		super(Material.rock);
		// this.setUnlocalizedName("cobbleseedstoneslab");
		this.useNeighborBrightness = true;
		this.setStepSound(Block.soundTypeStone);
		this.setResistance(10.0F);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 0);
		// this.setRegistryName("slabCobbleseedstone");
		
		// this.setBlockName("CobbleseedstoneSlab");
		this.setLightLevel(0.0f);
		// this.setUnlocalizedName("CobbleseedstoneSlab");

		IBlockState blockState = this.blockState.getBaseState();
		blockState = blockState.withProperty(getVariantProperty(), false);
		
		if(!this.isDouble()){
			blockState = blockState.withProperty(HALF, EnumBlockHalf.BOTTOM);
		}
		setDefaultState(blockState);
		this.setCreativeTab(SeedstoneMod.tabSeedstone);

	}
	
	public Item getItemDropped (IBlockState state, Random rand, int fortune){
		return Item.getItemFromBlock(SeedstoneBlocks.CobbleseedstoneSlabsingle);
	}

	public Item getItem(World worldIn, BlockPos pos){
        return Item.getItemFromBlock(SeedstoneBlocks.CobbleseedstoneSlabsingle);
    }

	// protected ItemStack createStactedBlock (int p_149644_1_){
	// 	return new ItemStack(SeedstoneBlocks.CobbleseedstoneSlabsingle, 2, 0);
	// }

	public String getUnlocalizedName(int metadata){
		return super.getUnlocalizedName();
	}

	public IProperty<Boolean> getVariantProperty() {
		return VARIANT;
	}

	public Object getVariant(ItemStack itemStack) {
        return false;
	}
	
	public IBlockState getStateFromMeta(int meta) {
        IBlockState iblockState = this.getDefaultState().withProperty(VARIANT, false);
        if (!this.isDouble()) {
            EnumBlockHalf value = EnumBlockHalf.BOTTOM;
            if ((meta & 8) != 0) {
                value = EnumBlockHalf.TOP;
            }

            iblockState = iblockState.withProperty(HALF, value);
        }

        return iblockState;
	}

	public int getMetaFromState(IBlockState state) {
        if (this.isDouble()) {
           return 0;
        }

        if ((EnumBlockHalf) state.getValue(HALF) == EnumBlockHalf.TOP) {
            return 8;
        } else {
            return 0;
        }
    }
	
	protected final BlockState createBlockState() {
        if (this.isDouble()) {
            return new BlockState(this, new IProperty[] {VARIANT});
        } else {
            return new BlockState(this, new IProperty[] {VARIANT, HALF});
        }
    }

	
	//ignore warning
	// @SuppressWarnings({ "rawtypes", "unchecked" })
	// @Override
	// @SideOnly(Side.CLIENT)
	// public void getSubBlocks(Item item, CreativeTabs tab, List list){
	// 	if(item != Item.getItemFromBlock(SeedstoneBlocks.CobbleseedstoneSlabdouble))
	// 	{
	// 		list.add(new ItemStack(item, 1, 0));
	// 	}
	// }
	
	
	@SideOnly(Side.CLIENT)
	private static boolean isBlockSingleSlab(Block block){
		return block == SeedstoneBlocks.CobbleseedstoneSlabsingle;
	}
	
	// @SideOnly(Side.CLIENT)
	// public Item getItem(World world, int x, int y, int z){
	// 	return isBlockSingleSlab(this) ? Item.getItemFromBlock(this) : Item.getItemFromBlock(SeedstoneBlocks.CobbleseedstoneSlabsingle);
	// }

	@Override
	public boolean isDouble() {
		return isBlockSingleSlab(this);
	}
}
