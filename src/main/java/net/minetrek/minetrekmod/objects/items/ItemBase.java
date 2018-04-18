package net.minetrek.minetrekmod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minetrek.minetrekmod.Main;
import net.minetrek.minetrekmod.init.ItemInit;
import net.minetrek.minetrekmod.init.BlockInit;
import net.minetrek.minetrekmod.util.interfaces.IHasModel;
import net.minecraft.block.material.Material;
import net.minetrek.minetrekmod.util.References;

/*
 * Class to extend and customize an Item
 */
public class ItemBase extends Item implements IHasModel{

	/**
	 * @param  name String to be used as the registryName and unlocalizedName for an Item created from this class.
	 */
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	
	/**
	 * @param  name String to be used as the registryName and unlocalizedName for an Item created from this class.
	 * @param  tab Sets which CTab or CreativeTab a Door should be grouped into.
	 */
	public ItemBase(String name, CreativeTabs tab)
	{
		super();

		setUnlocalizedName(name);
		setRegistryName(name);

		setCreativeTab(tab);

		ItemInit.ITEMS.add(this);
	}

	/*
	 * This creates an ItemRenderer for an Item's Model and sets an inventory variant 
	 */
	@Override
	public void registerModels() {
	Main.proxy.registerItemRenderer(this, 0, "References.Default_Variant");
	}
}
