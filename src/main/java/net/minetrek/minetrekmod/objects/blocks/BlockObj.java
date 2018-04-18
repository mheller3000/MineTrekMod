package net.minetrek.minetrekmod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minetrek.minetrekmod.Main;
import net.minetrek.minetrekmod.init.BlockInit;
import net.minetrek.minetrekmod.init.ItemInit;
import net.minetrek.minetrekmod.util.References;
import net.minetrek.minetrekmod.util.interfaces.IHasModel;

/*
 * Class to extend and customize a BlockFacing to render OBJ models (When I can get it working)
 */
public class BlockObj extends BlockFacing implements IHasModel
{

	public BlockObj(String name, Material material, CreativeTabs tab)
	{
		super(name, material, tab);

		this.useNeighborBrightness = true;
	}
		
	// Advanced constructor variant
		/**
		 * 
		 * @param name  Sets the Unlocalized and Registry name for the BlockFacing Block
		 * 
		 * @param material  Sets the Material type the block should inherit from
		 * 
		 * @param tab  Sets which Creative Tab the block should be grouped into for the Creative Mode Inventory
		 * 
		 * @param lightLevel  Sets the lightLevel emitted by the block - float value between 0-1f (n/16)
		 * 
		 * @param lightOpacity  Sets the lightOpacity value, to prevent light passing through - int value
		 * 
		 * @param sound  Sets the type of sounds this block makes
		 */
		public BlockObj(String name, Material material, CreativeTabs tab, float lightLevel, int lightOpacity, SoundType sound)
		{
			super(name, material, tab);
			
			setLightLevel(lightLevel);
			setLightOpacity(lightOpacity);
			
			this.useNeighborBrightness = true;
		}
	
	public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
    {
        return BlockFaceShape.UNDEFINED;
    }
	
	/**
	 * Determines if the faces of THIS block should cull when placed beside other blocks
	 */
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
    {
		if (net.minecraftforge.common.ForgeModContainer.disableStairSlabCulling)
            return super.doesSideBlockRendering(state, world, pos, face);

        if ( state.isOpaqueCube() )
            return true;
        		
		return false;
    }
	
	/**
	 * Used to determine ambient occlusion and culling when rebuilding chunks for
	 * render
	 */
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

	@Override
	public void registerModels()
	{
		Main.logger.debug("AWOOGA - BlockObj: OBJLoader will now add the domain " + References.MODID + ":");
		OBJLoader.INSTANCE.addDomain(References.MODID);

		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, References.DEFAULT_VARIANT);
		Main.logger.info("AWOOGA Added Item from BlockObj: " + this.getRegistryName().toString());
	}
}
