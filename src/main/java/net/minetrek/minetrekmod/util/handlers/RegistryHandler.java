package net.minetrek.minetrekmod.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minetrek.minetrekmod.MineTrekMod;
import net.minetrek.minetrekmod.init.BlockInit;
import net.minetrek.minetrekmod.init.ItemInit;
import net.minetrek.minetrekmod.util.References;
import net.minetrek.minetrekmod.util.interfaces.IHasModel;

/*
 * We subscribe to the Forge EventBus and run code as Blocks and Items are registered by Forge
 */
@EventBusSubscriber
public class RegistryHandler {
	
	/*
	 *  Subscribe to the Event as Items are registered
	 */
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	/*
	 *  Subscribe to the Event as Blocks are registered
	 */
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.Blocks.toArray(new Block[0]));
	}
	
	/*
	 *  Subscribe to the Event as Block and Item Models are registered
	 */
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for (Item item : ItemInit.ITEMS)
		{
			if (item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		for (Block block : BlockInit.Blocks)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	/*
	 *  Code to be done before you Initialize Registration of objects
	 */
	public static void preInitRegistration() {}
	
	/*
	 *  Code to be done while Initializing Registration of objects
	 */
	public static void initRegistration()
	{
		SoundHandler.registerSounds();
	}

	/*
	 *  Code to be done after Initializing Registration of objects
	 */
	public static void postInitRegistration() {}

}
