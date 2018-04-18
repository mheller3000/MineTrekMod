package net.minetrek.minetrekmod.objects.blocks;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minetrek.minetrekmod.Main;
import net.minetrek.minetrekmod.init.BlockInit;
import net.minetrek.minetrekmod.init.ItemInit;
import net.minetrek.minetrekmod.util.References;
import net.minetrek.minetrekmod.util.interfaces.IHasModel;

/*
 * Class to extend and customize a BlockHorizontal
 * 
 * MDTA: This is what I use to create blocks with a specific front texture, facing towards you when it is placed
 */
public class BlockFacing extends BlockHorizontal implements IHasModel
{
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	
	// Basic constructor variant
	/**
	 * 
	 * @param name  Sets the Unlocalized and Registry name for the BlockFacing Block
	 * 
	 * @param material  Sets the Material type the block should inherit from
	 * 
	 * @param tab  Sets which Creative Tab the block should be grouped into for the Creative Mode Inventory
	 */
	public BlockFacing(String name, Material material, CreativeTabs tab)
	{
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(tab);	
		
		BlockInit.Blocks.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
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
	public BlockFacing(String name, Material material, CreativeTabs tab, float lightLevel, int lightOpacity, SoundType sound)
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
		
	// Full constructor variant
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
	 * @param resistance  Sets the resistance value, as in resistance to explosion
	 * 
	 * @param sound  Sets the type of sounds this block makes
	 * 
	 * @param hardness  Sets the value of how long it takes to break the block
	 */
	public BlockFacing(String name, Material material, CreativeTabs tab, float lightLevel, int lightOpacity, float resistance, SoundType sound, float hardness)
	{
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(tab);	
		
		setLightLevel(lightLevel);
		setLightOpacity(lightOpacity);
		setResistance(resistance);
		setSoundType(sound);
		setHardness(hardness);
		
		BlockInit.Blocks.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand) 
	{
		IBlockState state = super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer, hand);
		return state.withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
		return ((EnumFacing) state.getValue(FACING)).getHorizontalIndex();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta % 4));
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] { FACING });
	}

	/*
	 * This creates an ItemRenderer for an Block derived from a BlockFacings Block and sets an inventory variant 
	 */
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, References.DEFAULT_VARIANT);
		Main.logger.info("AWOOGA Added Item from Block: " + this.getRegistryName().toString());
	}

}
