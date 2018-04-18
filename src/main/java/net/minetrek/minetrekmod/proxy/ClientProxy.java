package net.minetrek.minetrekmod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minetrek.minetrekmod.Main;
import net.minetrek.minetrekmod.util.References;
import net.minetrek.minetrekmod.util.handlers.RegistryHandler;


/*
 *  Client only Mod Code, extends the Client and Server code
 */
public class ClientProxy extends CommonProxy{
	
	/* 
	 *	Register custom renderers and ModelResourceLocations for Items. 
	 */
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
	/* 
	 *	Register custom renderers and ModelResourceLocations for Items which include variations. 
	 */
	@Override
	public void registerVariantRenderer(Item item, int meta, String filename, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(References.MODID, filename), id));
	}
	
	/*
	 *	Events to run before the Mod Initializes
	 */
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
		
		Main.logger.debug("AWOOGA - ClientProxy: OBJLoader will now add the domain " + References.MODID + ":");
		OBJLoader.INSTANCE.addDomain(References.MODID);
	}
	
	/*
	 *	Events to run during Initialization
	 */
	@Override
	public void init(FMLInitializationEvent event)
	{
		RegistryHandler.initRegistration();
	}
	
	/*
	 *	Events to run after the Mod has Initialized
	 */
	@Override
	public void postInit(FMLPostInitializationEvent event) {}
}
