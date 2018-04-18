package net.minetrek.minetrekmod.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minetrek.minetrekmod.util.handlers.RegistryHandler;
import net.minetrek.minetrekmod.util.handlers.SoundHandler;

/*
 * Server and Client Mod code
 */
public class CommonProxy {
	
	/* 
	 *	Register custom renderers and ModelResourceLocations for Items. 
	 */
	public void registerItemRenderer(Item item, int meta, String id) {}
	
	/* 
	 *	Register custom renderers and ModelResourceLocations for Items which include variations. 
	 */
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {}	
	
	/*
	 *	Events to run before the Mod Initializes
	 */
	public void preInit(FMLPreInitializationEvent event) {}

	/*
	 *	Events to run during Initialization
	 */
	public void init(FMLInitializationEvent event) {}

	/*
	 *	Events to run after the Mod has Initialized
	 */
	public void postInit(FMLPostInitializationEvent event) {}
}
