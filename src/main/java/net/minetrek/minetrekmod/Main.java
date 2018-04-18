package net.minetrek.minetrekmod;

import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minetrek.minetrekmod.proxy.CommonProxy;
import net.minetrek.minetrekmod.util.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minetrek.minetrekmod.init.ItemInit;
import net.minetrek.minetrekmod.objects.tabs.CTab;

/*
 * Lets Forge know that this is a Mod.
 * 
 * You provide it with the Mod's ID, Name, Versions
 */
@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class Main {
	
	/*
	 * This creates the Mod instance by telling Forge it should run the Main class.
	 */
	@Instance
	public static Main instance;
	
	/*
	 * We set up proxies to separate code that works for server and client code.
	 * We use a common class for most things and separate client only code like
	 * rendering into an extended class.
	 */
	@SidedProxy(clientSide = References.CLIENTPROXY, serverSide = References.COMMONPROXY)
	public static CommonProxy proxy;
	
	// Create instances of our Creative Tabs
	public static final CreativeTabs TAB_ENT = new CTab("tab_ent", ItemInit.ITEM_ENT_ICON, "entbg.png", false);
	public static final CreativeTabs TAB_DSC = new CTab("tab_dsc", ItemInit.ITEM_DSC_ICON, "dscbg.png", false);
	public static final CreativeTabs TAB_TOS = new CTab("tab_tos", ItemInit.ITEM_TOS_ICON, "tosbg.png", false);
	public static final CreativeTabs TAB_MOVIES = new CTab("tab_movie", ItemInit.ITEM_TOS_MOVIES_ICON, "moviesbg.png", false);
	public static final CreativeTabs TAB_TNG = new CTab("tab_tng", ItemInit.ITEM_TNG_ICON, "tngbg.png", true);
	public static final CreativeTabs TAB_DS9 = new CTab("tab_ds9", ItemInit.ITEM_DS9_ICON, "ds9bg.png", false);
	public static final CreativeTabs TAB_VOY = new CTab("tab_voy", ItemInit.ITEM_VOY_ICON, "voybg.png", false);
	public static final CreativeTabs TAB_TNG_MOVIES = new CTab("tab_tngmovie", ItemInit.ITEM_TNG_MOVIES_ICON, "tngmoviebg.png", false);
	public static final CreativeTabs TAB_25TH_CENTURY = new CTab("tab_25th", ItemInit.ITEM_25TH_ICON, "25thbg.png", false);
	public static final CreativeTabs TAB_26TH_CENTURY = new CTab("tab_26th", ItemInit.ITEM_26TH_ICON, "26thbg.png", false);
	public static final CreativeTabs TAB_29TH_TO_31ST_CENTURY = new CTab("tab_29thto31st", ItemInit.ITEM_29THTO31ST_ICON, "29thto31stbg.png", false);
	public static final CreativeTabs TAB_JJ = new CTab("tab_jj", ItemInit.ITEM_JJ_ICON, "jjbg.png", false);
	public static final CreativeTabs TAB_MISC = new CTab("tab_misc", ItemInit.ITEM_MISC_ICON, "miscbg.png", false);
	/**/
		
	/*
	 * Creates a Logger for the project, and names it logger.
	 * 
	 * You call to it with Main.logger to send output to the console.
	 */
	public static Logger logger;
	
	/*
	 * Pre Init is the place to let the game know about all the blocks, items, etc
	 * that your Mod provides.
	 * 
	 * Registering blocks and items to the GameRegistry
	 * Registering tile entities
	 * Registering entities
	 * Assigning ore dictionary names
	 */
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
	}
	
	/*
	 * Init is where to accomplish any game related tasks that rely upon the items
	 * and blocks set up in preInit.
	 * 
	 * Registering world generators
	 * Registering recipes
	 * Registering event handlers
	 * Sending IMC messages
	 */
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	/*
	 * Post Init is where your Mod usually does things which rely upon or are relied
	 * upon by other Mods.
	 * 
	 * Mod compatibility, or anything which depends on other Mods’ init phases being
	 * finished.
	 */
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
