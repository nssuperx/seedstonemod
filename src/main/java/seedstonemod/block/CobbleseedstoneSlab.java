package seedstonemod.block;

import java.util.Random;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import seedstonemod.SeedstoneMod;


public class CobbleseedstoneSlab extends BlockSlab {

	private static final PropertyBool VARIANT = PropertyBool.create("variant");
	
	public CobbleseedstoneSlab(boolean isDouble) {
		super(Material.ROCK);
		this.useNeighborBrightness = true;
		this.setSoundType(SoundType.STONE);
		this.setResistance(10.0F);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 0);
		
		// this.setBlockName("CobbleseedstoneSlab");
		this.setLightLevel(0.0f);
		// this.setUnlocalizedName("CobbleseedstoneSlab");

		IBlockState blockState = this.blockState.getBaseState();
		blockState = blockState.withProperty(getVariantProperty(), false);
		
		if(!this.isDouble()){
			blockState = blockState.withProperty(HALF, EnumBlockHalf.BOTTOM);
			this.setCreativeTab(SeedstoneMod.tabSeedstone);
		}
		setDefaultState(blockState);

	}
	
	public Item getItemDropped (IBlockState state, Random rand, int fortune){
		return Item.getItemFromBlock(SeedstoneBlocks.cobbleseedstoneSlabsingle);
	}

	public Item getItem(World worldIn, BlockPos pos){
        return Item.getItemFromBlock(SeedstoneBlocks.cobbleseedstoneSlabsingle);
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
	
	protected final BlockStateContainer createBlockState() {
        if (this.isDouble()) {
            return new BlockStateContainer(this, new IProperty[] {VARIANT});
        } else {
            return new BlockStateContainer(this, new IProperty[] {VARIANT, HALF});
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
		return block == SeedstoneBlocks.cobbleseedstoneSlabsingle;
	}
	
	// @SideOnly(Side.CLIENT)
	// public Item getItem(World world, int x, int y, int z){
	// 	return isBlockSingleSlab(this) ? Item.getItemFromBlock(this) : Item.getItemFromBlock(SeedstoneBlocks.CobbleseedstoneSlabsingle);
	// }

	@Override
	public boolean isDouble() {
		return !isBlockSingleSlab(this);
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return null;
	}
}
