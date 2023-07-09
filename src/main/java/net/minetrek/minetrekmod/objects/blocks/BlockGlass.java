package net.minetrek.minetrekmod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minetrek.minetrekmod.MineTrekMod;
import net.minetrek.minetrekmod.init.BlockInit;
import net.minetrek.minetrekmod.init.ItemInit;
import net.minetrek.minetrekmod.util.References;
import net.minetrek.minetrekmod.util.interfaces.IHasModel;

/*
 * Class to extend and customize a Block
 */
public class BlockGlass extends Block implements IHasModel {
	public BlockGlass(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		BlockInit.Blocks.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	// Basic constructor variant
		/**
		 * 
		 * @param name  Sets the Unlocalized and Registry name for the BlockBase Block
		 * 
		 * @param material  Sets the Material type the block should inherit from
		 * 
		 * @param tab  Sets which Creative Tab the block should be grouped into for the Creative Mode Inventory
		 */
		public BlockGlass(String name, Material material, CreativeTabs tab)
		{
			super(material);

			setUnlocalizedName(name);
			setRegistryName(name);

			setCreativeTab(tab);

			BlockInit.Blocks.add(this);
			ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
			
			getEnableStats();
		}
		
		// Advanced constructor variant
		/**
		 * 
		 * @param name  Sets the Unlocalized and Registry name for the BlockBase Block
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
		public BlockGlass(String name, Material material, CreativeTabs tab, float lightLevel, int lightOpacity, SoundType sound)
		{
			super(material);
			
			setUnlocalizedName(name);
			setRegistryName(name);
			
			setCreativeTab(tab);	
			
			setLightLevel(lightLevel);
			setLightOpacity(lightOpacity);
			setSoundType(sound);
			
			BlockInit.Blocks.add(this);
			ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		}
		
	@Override
	public void registerModels() {
	MineTrekMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "References.Default_Variant");
	MineTrekMod.logger.info("AWOOGA Added Item from Block: " + this.getRegistryName().toString());
	}
	
	@Override
	public boolean isFullCube (IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube (IBlockState state) {
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}
	
}
