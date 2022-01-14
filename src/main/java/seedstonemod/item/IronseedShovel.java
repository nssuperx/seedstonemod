package seedstonemod.item;

import net.minecraft.item.ItemSpade;
import seedstonemod.SeedstoneMod;

public class IronseedShovel extends ItemSpade{
	private final String toolname = "ironseedshovel";

    public IronseedShovel(ToolMaterial toolMaterial){
        super(toolMaterial);
        setCreativeTab(SeedstoneMod.tabSeedstone);
        // setRegistryName(toolname);
		setUnlocalizedName(toolname);
    }
    
}