package seedstonemod.item;

import net.minecraft.item.ItemSword;
import seedstonemod.SeedstoneMod;

public class IronseedSword extends ItemSword{
	private final String toolname = "ironseedsword";

    public IronseedSword(ToolMaterial toolMaterial){
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        // setRegistryName(toolname);
		setUnlocalizedName(toolname);
    }
}