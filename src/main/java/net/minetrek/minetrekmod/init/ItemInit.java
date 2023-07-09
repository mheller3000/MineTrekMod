package net.minetrek.minetrekmod.init;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDoor;
import net.minetrek.minetrekmod.objects.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minetrek.minetrekmod.MineTrekMod;
import net.minetrek.minetrekmod.objects.blocks.BlockTNGCore;
import net.minetrek.minetrekmod.objects.blocks.BlockTrekDoor;
import net.minetrek.minetrekmod.objects.items.ItemBase;
import net.minetrek.minetrekmod.objects.items.ItemDoorBase;
import net.minetrek.minetrekmod.util.handlers.SoundHandler;

/*
 * List of All Items to be instantiated and then added to the registration list
 */
public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	/*
	 * CREATIVE TAB ICONS
	 */
	public static final Item ITEM_ENT_ICON = new ItemBase("item_ent_icon", null);
	public static final Item ITEM_DSC_ICON = new ItemBase("item_dsc_icon", null);
	public static final Item ITEM_TOS_ICON = new ItemBase("item_tos_icon", null);
	public static final Item ITEM_TOS_MOVIES_ICON = new ItemBase("item_tos_movies_icon", null);
	public static final Item ITEM_TNG_ICON = new ItemBase("item_tng_icon", null);
	public static final Item ITEM_DS9_ICON = new ItemBase("item_ds9_icon", null);
	public static final Item ITEM_VOY_ICON = new ItemBase("item_voy_icon", null);
	public static final Item ITEM_TNG_MOVIES_ICON = new ItemBase("item_tng_movies_icon", null);
	public static final Item ITEM_25TH_ICON = new ItemBase("item_25th_icon", null);
	public static final Item ITEM_26TH_ICON = new ItemBase("item_26th_icon", null);
	public static final Item ITEM_29THTO31ST_ICON = new ItemBase("item_29thto31st_icon", null);
	public static final Item ITEM_32ND_ICON = new ItemBase("item_32nd_icon", null);
	public static final Item ITEM_JJ_ICON = new ItemBase("item_jj_icon", null);
	public static final Item ITEM_HULL_FLATBLOCKSBG_ICON = new ItemBase("item_hull_flatblocksbg_icon", null);
	public static final Item ITEM_LCARS_ICON = new ItemBase("item_lcars_icon", null);
	public static final Item ITEM_MISC_ICON = new ItemBase("item_misc_icon", null);

}
