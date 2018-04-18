package net.minetrek.minetrekmod.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minetrek.minetrekmod.Main;
import net.minetrek.minetrekmod.util.References;
import net.minetrek.minetrekmod.util.interfaces.IHasModel;

public class BlockTrekFabric extends BlockBase implements IHasModel
{

	public BlockTrekFabric(String name, CreativeTabs tab)
	{

		super(name, Material.CLOTH, tab);

		this.setTickRandomly(true);
	}

	/**
	 * Used to determine ambient occlusion and culling when rebuilding chunks for
	 * render
	 */
	public boolean isOpaqueCube(IBlockState state)
	{
		return true;
	}

	public boolean isFullCube(IBlockState state)
	{
		return true;
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, References.DEFAULT_VARIANT);
	}

}
