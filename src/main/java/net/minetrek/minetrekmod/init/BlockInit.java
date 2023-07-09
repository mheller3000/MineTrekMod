package net.minetrek.minetrekmod.init;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minetrek.minetrekmod.MineTrekMod;
import net.minetrek.minetrekmod.objects.blocks.BlockBase;
import net.minetrek.minetrekmod.objects.blocks.BlockDiagonalLeft;
import net.minetrek.minetrekmod.objects.blocks.BlockFacing;
import net.minetrek.minetrekmod.objects.blocks.BlockObj;
import net.minetrek.minetrekmod.objects.blocks.BlockTNGCore;
import net.minetrek.minetrekmod.objects.blocks.BlockTrekCarpet;
import net.minetrek.minetrekmod.objects.blocks.BlockTrekDoor;
import net.minetrek.minetrekmod.objects.blocks.BlockTrekDoor2;
import net.minetrek.minetrekmod.objects.blocks.BlockTrekFabric;
import net.minetrek.minetrekmod.objects.blocks.BlockGlass;

/*
 * List of All Blocks to be instantiated and then added to the registration list
 */
public class BlockInit {
	public static final List<Block> Blocks = new ArrayList<Block>();
	
	//******************************************************************************************************************************************************//
	///											    ///
	/// *** MTMOD Version 1.0.0-1.1.0e Blocks Inits *** ///
    ///												///
	
	//- B A S E  C O R E  B L O C K S
    //
	/*
	 * 
	 * Blocks should be added in this order: BOTTOM | MIDDLE | TOP
	 * 
	 */
	/*
	 * BASE CORE MAIN BLOCKS
	 */
	public static final Block BLOCK_TNG_CORE_A = new BlockTNGCore("block_tng_core_a", Material.IRON, MineTrekMod.TAB_TNG);
	public static final Block BLOCK_TNG_CORE_B = new BlockTNGCore("block_tng_core_b", Material.IRON, MineTrekMod.TAB_TNG);
	public static final Block BLOCK_TNG_CORE_C = new BlockObj("block_tng_core_c", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/*
	 * CARPET FLAT BLOCKS
	 */
	public static final Block BLOCK_CARPET_TEAL = new BlockTrekCarpet("block_trek_carpet_teal", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_TAN = new BlockTrekCarpet("block_trek_carpet_tan", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_DEEP_RED = new BlockTrekCarpet("block_trek_carpet_deep_red", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_DARK_GREY = new BlockTrekCarpet("block_trek_carpet_dark_grey", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_GREY = new BlockTrekCarpet("block_trek_carpet_grey", MineTrekMod.TAB_MISC);
	//
	/*
	 * CARPET CORNER BLOCKS
	 */
	public static final Block BLOCK_CARPET_CORNER_TEAL = new BlockTrekCarpet("block_trek_carpet_corner_teal", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_CORNER_TAN = new BlockTrekCarpet("block_trek_carpet_corner_tan", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_CORNER_DEEP_RED = new BlockTrekCarpet("block_trek_carpet_corner_deep_red", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_CORNER_DARK_GREY = new BlockTrekCarpet("block_trek_carpet_corner_dark_grey", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_CORNER_GREY = new BlockTrekCarpet("block_trek_carpet_corner_grey", MineTrekMod.TAB_MISC);
	//
	/*
	 * CARPET FULL FABRIC BLOCKS
	 */
	public static final Block BLOCK_FABRIC_TEAL = new BlockTrekFabric("block_fabric_teal", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_FABRIC_TAN = new BlockTrekFabric("block_fabric_tan", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_FABRIC_DEEP_RED = new BlockTrekFabric("block_fabric_deep_red", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_FABRIC_DARK_GREY = new BlockTrekFabric("block_fabric_dark_grey", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_FABRIC_GREY = new BlockTrekFabric("block_fabric_grey", MineTrekMod.TAB_MISC);
	//
	

	//- T N G  E R A  B L O C K S  --  ----V E R S I O N  1----
	//
	/*
	 * TNG ERA DOOR BLOCKS
	 */
	public static final Block DOOR_TNG_ORANGE = new BlockTrekDoor("door_tng_orange", Material.WOOD, MineTrekMod.TAB_TNG);
	public static final Block DOOR_TNG_GREY = new BlockTrekDoor2("door_tng_grey", Material.WOOD, MineTrekMod.TAB_TNG, null);
	/*
	 * TNG ERA FILLER WALL BLOCKS
	 */
	public static final Block BLOCK_TNG_TAN = new BlockBase("block_tng_tan", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_SILVER = new BlockBase("block_tng_silver", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 8, SoundType.METAL);
	public static final Block BLOCK_TNG_PALE = new BlockBase("block_tng_pale", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 8, SoundType.METAL);
	//	
	/*
	 * TNG ERA PALE ROOM
	 * 
	 */
	public static final Block BLOCK_TNG_ROOM_PALE_BTM_FLUSH = new BlockBase("block_tng_room_pale_btm_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_PALE_MIDDLE_FLUSH = new BlockBase("block_tng_room_pale_middle_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_PALE_TOP_FLUSH = new BlockBase("block_tng_room_pale_top_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_ROOM_PALE_BTM_LEFT_BRACE = new BlockFacing("block_tng_room_pale_btm_left_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_PALE_MIDDLE_LEFT_BRACE = new BlockFacing("block_tng_room_pale_middle_left_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_PALE_TOP_LEFT_BRACE = new BlockFacing("block_tng_room_pale_top_left_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_ROOM_PALE_BTM_RIGHT_BRACE = new BlockFacing("block_tng_room_pale_btm_right_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_PALE_MIDDLE_RIGHT_BRACE = new BlockFacing("block_tng_room_pale_middle_right_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_PALE_TOP_RIGHT_BRACE = new BlockFacing("block_tng_room_pale_top_right_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_ROOM_PALE_BTM_SPLIT = new BlockFacing("block_tng_room_pale_btm_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_PALE_MIDDLE_SPLIT = new BlockFacing("block_tng_room_pale_middle_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_PALE_TOP_SPLIT = new BlockFacing("block_tng_room_pale_top_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	// DIAGONAL BLOCKS
	//
	public static final Block BLOCK_TNG_ROOM_PALE_BTM_DIAG_LEFT = new BlockDiagonalLeft("block_tng_room_pale_btm_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_PALE_MIDDLE_DIAG_LEFT = new BlockDiagonalLeft("block_tng_room_pale_middle_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_PALE_TOP_DIAG_LEFT = new BlockDiagonalLeft("block_tng_room_pale_top_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_PALE_BTM_SPLIT_DIAG_LEFT = new BlockDiagonalLeft("block_tng_room_pale_btm_split_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);	
	public static final Block BLOCK_TNG_ROOM_PALE_MIDDLE_SPLIT_DIAG_LEFT = new BlockDiagonalLeft("block_tng_room_pale_middle_split_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);	
	public static final Block BLOCK_TNG_ROOM_PALE_TOP_SPLIT_DIAG_LEFT = new BlockDiagonalLeft("block_tng_room_pale_top_split_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);	
	//
	/*
	 * TNG ERA CORRIDOR ANGLED
	 * 
	 */
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_BTM = new BlockObj("block_tng_corridor_angled_btm", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_MIDDLE = new BlockObj("block_tng_corridor_angled_middle", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_TOP = new BlockObj("block_tng_corridor_angled_top", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_BTM_LEFT = new BlockObj("block_tng_corridor_angled_btm_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_BTM_RIGHT = new BlockObj("block_tng_corridor_angled_btm_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_BTM_SPLIT = new BlockObj("block_tng_corridor_angled_btm_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_MIDDLE_LEFT = new BlockObj("block_tng_corridor_angled_middle_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_MIDDLE_RIGHT = new BlockObj("block_tng_corridor_angled_middle_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_MIDDLE_SPLIT = new BlockObj("block_tng_corridor_angled_middle_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_MIDDLE_ALERT = new BlockObj("block_tng_corridor_angled_middle_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_MIDDLE_LEFT_ALERT = new BlockObj("block_tng_corridor_angled_middle_left_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_MIDDLE_RIGHT_ALERT = new BlockObj("block_tng_corridor_angled_middle_right_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_MIDDLE_SPLIT_ALERT = new BlockObj("block_tng_corridor_angled_middle_split_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_TOP_LEFT = new BlockObj("block_tng_corridor_angled_top_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_TOP_RIGHT = new BlockObj("block_tng_corridor_angled_top_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_TOP_SPLIT = new BlockObj("block_tng_corridor_angled_top_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/*
	 * TNG ERA CARGO CORRIDOR ANGLED
	 * 
	 */
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_CARGO_BTM_LEFT = new BlockObj("block_tng_corridor_angled_cargo_btm_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_CARGO_BTM_RIGHT = new BlockObj("block_tng_corridor_angled_cargo_btm_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_CARGO_BTM_SPLIT = new BlockObj("block_tng_corridor_angled_cargo_btm_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_CARGO_BTM_FLUSH = new BlockObj("block_tng_corridor_angled_cargo_btm_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_CARGO_BTM_LEFT_ALERT = new BlockObj("block_tng_corridor_angled_cargo_btm_left_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_CARGO_BTM_RIGHT_ALERT = new BlockObj("block_tng_corridor_angled_cargo_btm_right_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_CARGO_BTM_SPLIT_ALERT = new BlockObj("block_tng_corridor_angled_cargo_btm_split_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_CARGO_BTM_FLUSH_ALERT = new BlockObj("block_tng_corridor_angled_cargo_btm_flush_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/*
	 * TNG ERA CORRIDOR ANGLED DIAGONAL
	 * 
	 */
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_DIAG_A_BTM = new BlockDiagonalLeft("block_tng_corridor_angled_diag_a_btm", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_DIAG_A_MIDDLE = new BlockDiagonalLeft("block_tng_corridor_angled_diag_a_middle", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_DIAG_A_MIDDLE_ALERT = new BlockDiagonalLeft("block_tng_corridor_angled_diag_a_middle_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_DIAG_A_TOP = new BlockDiagonalLeft("block_tng_corridor_angled_diag_a_top", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_DIAG_A_BTM_SPLIT = new BlockDiagonalLeft("block_tng_corridor_angled_diag_a_btm_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_DIAG_A_MIDDLE_SPLIT = new BlockDiagonalLeft("block_tng_corridor_angled_diag_a_middle_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_DIAG_A_MIDDLE_SPLIT_ALERT = new BlockDiagonalLeft("block_tng_corridor_angled_diag_a_middle_split_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_DIAG_A_TOP_SPLIT = new BlockDiagonalLeft("block_tng_corridor_angled_diag_a_top_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_DIAG_B_BTM = new BlockDiagonalLeft("block_tng_corridor_angled_diag_b_btm", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_DIAG_B_MIDDLE = new BlockDiagonalLeft("block_tng_corridor_angled_diag_b_middle", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_DIAG_B_MIDDLE_ALERT = new BlockDiagonalLeft("block_tng_corridor_angled_diag_b_middle_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_ANGLED_DIAG_B_TOP = new BlockDiagonalLeft("block_tng_corridor_angled_diag_b_top", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/*
	 * TNG ERA CORRIDOR WITH SCREEN
	 * 
	 * Vertical placement - Top, Middle, Bottom | Brace placement - Left, Split,
	 * Right | No brace - Flush
	 * Alert is an animated Red Alert light. Alt0 and Alt1 are flush with LCARS
	 * displays
	 * 
	 */
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_BTM_LEFT_BRACE = new BlockFacing("block_tng_corridor_screen_btm_left_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_MIDDLE_LEFT_BRACE = new BlockFacing("block_tng_corridor_screen_middle_left_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_MIDDLE_LEFT_BRACE_ALERT = new BlockFacing("block_tng_corridor_screen_middle_left_brace_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_TOP_LEFT_BRACE = new BlockFacing("block_tng_corridor_screen_top_left_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_BTM_FLUSH = new BlockFacing("block_tng_corridor_screen_btm_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_MIDDLE_FLUSH = new BlockFacing("block_tng_corridor_screen_middle_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_MIDDLE_FLUSH_ALERT = new BlockFacing("block_tng_corridor_screen_middle_flush_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_MIDDLE_FLUSH_ALT0 = new BlockFacing("block_tng_corridor_screen_middle_flush_alt0", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_MIDDLE_FLUSH_ALT1 = new BlockFacing("block_tng_corridor_screen_middle_flush_alt1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_TOP_FLUSH = new BlockFacing("block_tng_corridor_screen_top_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_BTM_SPLIT = new BlockFacing("block_tng_corridor_screen_btm_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_MIDDLE_SPLIT = new BlockFacing("block_tng_corridor_screen_middle_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_MIDDLE_SPLIT_ALERT = new BlockFacing("block_tng_corridor_screen_middle_split_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_TOP_SPLIT = new BlockFacing("block_tng_corridor_screen_top_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_BTM_RIGHT_BRACE = new BlockFacing("block_tng_corridor_screen_btm_right_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_MIDDLE_RIGHT_BRACE = new BlockFacing("block_tng_corridor_screen_middle_right_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_MIDDLE_RIGHT_BRACE_ALERT = new BlockFacing("block_tng_corridor_screen_middle_right_brace_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_TOP_RIGHT_BRACE = new BlockFacing("block_tng_corridor_screen_top_right_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	// DIAGONAL BLOCKS
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_BTM_DIAG_LEFT = new BlockDiagonalLeft("block_tng_corridor_screen_btm_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_MIDDLE_DIAG_LEFT = new BlockDiagonalLeft("block_tng_corridor_screen_middle_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_MIDDLE_ALERT_DIAG_LEFT = new BlockDiagonalLeft("block_tng_corridor_screen_middle_alert_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_TOP_DIAG_LEFT = new BlockDiagonalLeft("block_tng_corridor_screen_top_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_BTM_SPLIT_DIAG_LEFT = new BlockDiagonalLeft("block_tng_corridor_screen_btm_split_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_MIDDLE_SPLIT_DIAG_LEFT = new BlockDiagonalLeft("block_tng_corridor_screen_middle_split_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_MIDDLE_SPLIT_ALERT_DIAG_LEFT = new BlockDiagonalLeft("block_tng_corridor_screen_middle_split_alert_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_SCREEN_TOP_SPLIT_DIAG_LEFT = new BlockDiagonalLeft("block_tng_corridor_screen_top_split_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);	
	//
	/*
	 * TNG ERA CORRIDOR WITH BULKHEADS
	 * 
	 * Vertical placement - Top, Middle, Bottom | Brace placement - Left, Split,
	 * Right | No brace - Flush
	 * 
	 */
	public static final Block BLOCK_TNG_CORRIDOR_BULK_BTM_LEFT_BRACE = new BlockFacing("block_tng_corridor_bulk_btm_left_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_BULK_MIDDLE_LEFT_BRACE = new BlockFacing("block_tng_corridor_bulk_middle_left_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_BULK_TOP_LEFT_BRACE = new BlockFacing("block_tng_corridor_bulk_top_left_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_BULK_BTM_FLUSH = new BlockFacing("block_tng_corridor_bulk_btm_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_BULK_MIDDLE_FLUSH = new BlockFacing("block_tng_corridor_bulk_middle_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_BULK_TOP_FLUSH = new BlockFacing("block_tng_corridor_bulk_top_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_BULK_BTM_SPLIT = new BlockFacing("block_tng_corridor_bulk_btm_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_BULK_BTM_SPLIT_ALT = new BlockFacing("block_tng_corridor_bulk_btm_split_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_BULK_MIDDLE_SPLIT = new BlockFacing("block_tng_corridor_bulk_middle_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_BULK_MIDDLE_SPLIT_ALT = new BlockFacing("block_tng_corridor_bulk_middle_split_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_BULK_TOP_SPLIT = new BlockFacing("block_tng_corridor_bulk_top_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_BULK_BTM_RIGHT_BRACE = new BlockFacing("block_tng_corridor_bulk_btm_right_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_BULK_BTM_RIGHT_BRACE_ALT = new BlockFacing("block_tng_corridor_bulk_btm_right_brace_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_BULK_MIDDLE_RIGHT_BRACE = new BlockFacing("block_tng_corridor_bulk_middle_right_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_BULK_MIDDLE_RIGHT_BRACE_ALT = new BlockFacing("block_tng_corridor_bulk_middle_right_brace_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_BULK_TOP_RIGHT_BRACE = new BlockFacing("block_tng_corridor_bulk_top_right_brace", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	// DIAGONAL BLOCKS
	public static final Block BLOCK_TNG_CORRIDOR_BULK_BTM_DIAG_LEFT = new BlockDiagonalLeft("block_tng_corridor_bulk_btm_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_BULK_MIDDLE_DIAG_LEFT = new BlockDiagonalLeft("block_tng_corridor_bulk_middle_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_BULK_TOP_DIAG_LEFT = new BlockDiagonalLeft("block_tng_corridor_bulk_top_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_BULK_BTM_SPLIT_DIAG_LEFT = new BlockDiagonalLeft("block_tng_corridor_bulk_btm_split_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_BULK_MIDDLE_SPLIT_DIAG_LEFT = new BlockDiagonalLeft("block_tng_corridor_bulk_middle_split_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_BULK_TOP_SPLIT_DIAG_LEFT = new BlockDiagonalLeft("block_tng_corridor_bulk_top_split_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	//
	/*
	 * TNG ERA CORRIDOR WITH FABRIC BULKHEADS
	 * 
	 * Vertical placement - Top, Middle, Bottom | Brace placement - Left, Right, Split,
	 * Right | No brace - Flush
	 * Alert is an animated Red Alert light.
	 * 
	 */
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_BTM_LEFT = new BlockFacing("block_tng_corridor_fabric_bulk_btm_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_BTM_RIGHT = new BlockFacing("block_tng_corridor_fabric_bulk_btm_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_BTM_FLUSH = new BlockFacing("block_tng_corridor_fabric_bulk_btm_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_BTM_SPLIT = new BlockFacing("block_tng_corridor_fabric_bulk_btm_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_MIDDLE_LEFT = new BlockFacing("block_tng_corridor_fabric_bulk_middle_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_MIDDLE_RIGHT = new BlockFacing("block_tng_corridor_fabric_bulk_middle_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_MIDDLE_FLUSH = new BlockFacing("block_tng_corridor_fabric_bulk_middle_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_MIDDLE_SPLIT = new BlockFacing("block_tng_corridor_fabric_bulk_middle_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_MIDDLE_LEFT_ALERT = new BlockFacing("block_tng_corridor_fabric_bulk_middle_left_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_MIDDLE_RIGHT_ALERT = new BlockFacing("block_tng_corridor_fabric_bulk_middle_right_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_MIDDLE_FLUSH_ALERT = new BlockFacing("block_tng_corridor_fabric_bulk_middle_flush_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_MIDDLE_SPLIT_ALERT = new BlockFacing("block_tng_corridor_fabric_bulk_middle_split_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_TOP_LEFT = new BlockFacing("block_tng_corridor_fabric_bulk_top_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_TOP_RIGHT = new BlockFacing("block_tng_corridor_fabric_bulk_top_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_TOP_FLUSH = new BlockFacing("block_tng_corridor_fabric_bulk_top_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_TOP_SPLIT = new BlockFacing("block_tng_corridor_fabric_bulk_top_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	// DIAGONAL BLOCKS
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_BTM_DIAG = new BlockDiagonalLeft("block_tng_corridor_fabric_bulk_btm_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_MIDDLE_DIAG_ALERT = new BlockDiagonalLeft("block_tng_corridor_fabric_bulk_middle_diag_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_MIDDLE_DIAG = new BlockDiagonalLeft("block_tng_corridor_fabric_bulk_middle_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BULK_TOP_DIAG = new BlockDiagonalLeft("block_tng_corridor_fabric_bulk_top_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	//
	/*
	 * TNG ERA CORRIDOR WITH FABRIC
	 * 
	 * Vertical placement - Top, Middle, Bottom | Window placement - Left, Right, Diagonal
	 * 
	 */
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BTM = new BlockFacing("block_tng_corridor_fabric_btm", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_MIDDLE = new BlockFacing("block_tng_corridor_fabric_middle", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_TOP = new BlockFacing("block_tng_corridor_fabric_top", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BTM_LEFT = new BlockFacing("block_tng_corridor_fabric_btm_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BTM_RIGHT = new BlockFacing("block_tng_corridor_fabric_btm_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BTM_WINDOW = new BlockFacing("block_tng_corridor_fabric_btm_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BTM_LEFT_WINDOW = new BlockFacing("block_tng_corridor_fabric_btm_left_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BTM_RIGHT_WINDOW = new BlockFacing("block_tng_corridor_fabric_btm_right_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_MIDDLE_LEFT = new BlockFacing("block_tng_corridor_fabric_middle_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_MIDDLE_RIGHT = new BlockFacing("block_tng_corridor_fabric_middle_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_MIDDLE_WINDOW = new BlockFacing("block_tng_corridor_fabric_middle_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_MIDDLE_LEFT_WINDOW = new BlockFacing("block_tng_corridor_fabric_middle_left_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_MIDDLE_RIGHT_WINDOW = new BlockFacing("block_tng_corridor_fabric_middle_right_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_TOP_LEFT = new BlockFacing("block_tng_corridor_fabric_top_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_TOP_RIGHT = new BlockFacing("block_tng_corridor_fabric_top_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_TOP_WINDOW = new BlockFacing("block_tng_corridor_fabric_top_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_TOP_LEFT_WINDOW = new BlockFacing("block_tng_corridor_fabric_top_left_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_TOP_RIGHT_WINDOW = new BlockFacing("block_tng_corridor_fabric_top_right_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	// DIAGONAL BLOCKS
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_BTM_WINDOW_DIAG = new BlockDiagonalLeft("block_tng_corridor_fabric_btm_window_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_MIDDLE_WINDOW_DIAG = new BlockDiagonalLeft("block_tng_corridor_fabric_middle_window_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_TOP_WINDOW_DIAG = new BlockDiagonalLeft("block_tng_corridor_fabric_top_window_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	//
	/*
	 * TNG ERA CORRIDOR WITH FABRIC AND BULGED SCREENS
	 * 
	 * Vertical placement - Top, Middle, Bottom | Brace Placement - Left, Right
	 * Screen placement - Left, Right, Flush, Bulged
	 * 
	 */
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_BTM_LEFT = new BlockFacing("block_tng_corridor_fabric_screen_btm_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_BTM_RIGHT = new BlockFacing("block_tng_corridor_fabric_screen_btm_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_BTM_FLUSH = new BlockFacing("block_tng_corridor_fabric_screen_btm_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_MIDDLE_LEFT = new BlockFacing("block_tng_corridor_fabric_screen_middle_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_MIDDLE_RIGHT = new BlockFacing("block_tng_corridor_fabric_screen_middle_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_MIDDLE_FLUSH = new BlockFacing("block_tng_corridor_fabric_screen_middle_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_TOP_LEFT = new BlockFacing("block_tng_corridor_fabric_screen_top_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_TOP_RIGHT = new BlockFacing("block_tng_corridor_fabric_screen_top_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_TOP_FLUSH = new BlockFacing("block_tng_corridor_fabric_screen_top_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	//
	/*
	 * TNG ERA CORRIDOR WITH FABRIC AND FLAT SCREENS
	 * 
	 * Vertical placement - Top, Middle, Bottom | Brace Placement - Left, Right
	 * Screen placement - Left, Right, Flush, Flat
	 * 
	 */
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_FLAT_BTM_LEFT = new BlockFacing("block_tng_corridor_fabric_screen_flat_btm_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_FLAT_BTM_RIGHT = new BlockFacing("block_tng_corridor_fabric_screen_flat_btm_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_FLAT_BTM_FLUSH = new BlockFacing("block_tng_corridor_fabric_screen_flat_btm_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_FLAT_MIDDLE_LEFT = new BlockFacing("block_tng_corridor_fabric_screen_flat_middle_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_FLAT_MIDDLE_RIGHT = new BlockFacing("block_tng_corridor_fabric_screen_flat_middle_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_FLAT_MIDDLE_FLUSH = new BlockFacing("block_tng_corridor_fabric_screen_flat_middle_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_FLAT_TOP_LEFT = new BlockFacing("block_tng_corridor_fabric_screen_flat_top_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_FLAT_TOP_RIGHT = new BlockFacing("block_tng_corridor_fabric_screen_flat_top_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_FABRIC_SCREEN_FLAT_TOP_FLUSH = new BlockFacing("block_tng_corridor_fabric_screen_flat_top_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/*
	 * TNG ERA CORRIDOR WITH PATTERN WALLS
	 * 
	 * Vertical placement - Top, Middle, Bottom | Window placement - Left, Right, Diagonal
	 * 
	 */
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_BTM = new BlockFacing("block_tng_corridor_pattern_btm", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_MIDDLE = new BlockFacing("block_tng_corridor_pattern_middle", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_TOP = new BlockFacing("block_tng_corridor_pattern_top", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_BTM_LEFT = new BlockFacing("block_tng_corridor_pattern_btm_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_BTM_RIGHT = new BlockFacing("block_tng_corridor_pattern_btm_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_BTM_WINDOW = new BlockFacing("block_tng_corridor_pattern_btm_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_BTM_LEFT_WINDOW = new BlockFacing("block_tng_corridor_pattern_btm_left_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_BTM_RIGHT_WINDOW = new BlockFacing("block_tng_corridor_pattern_btm_right_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_MIDDLE_LEFT = new BlockFacing("block_tng_corridor_pattern_middle_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_MIDDLE_RIGHT = new BlockFacing("block_tng_corridor_pattern_middle_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_MIDDLE_WINDOW = new BlockFacing("block_tng_corridor_pattern_middle_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_MIDDLE_LEFT_WINDOW = new BlockFacing("block_tng_corridor_pattern_middle_left_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_MIDDLE_RIGHT_WINDOW = new BlockFacing("block_tng_corridor_pattern_middle_right_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_TOP_LEFT = new BlockFacing("block_tng_corridor_pattern_top_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_TOP_RIGHT = new BlockFacing("block_tng_corridor_pattern_top_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_TOP_WINDOW = new BlockFacing("block_tng_corridor_pattern_top_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_TOP_LEFT_WINDOW = new BlockFacing("block_tng_corridor_pattern_top_left_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_TOP_RIGHT_WINDOW = new BlockFacing("block_tng_corridor_pattern_top_right_window", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	// DIAGONAL BLOCKS
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_BTM_WINDOW_DIAG = new BlockDiagonalLeft("block_tng_corridor_pattern_btm_window_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_MIDDLE_WINDOW_DIAG = new BlockDiagonalLeft("block_tng_corridor_pattern_middle_window_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_PATTERN_TOP_WINDOW_DIAG = new BlockDiagonalLeft("block_tng_corridor_pattern_top_window_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	//
	/*
	 * TNG ERA CORRIDOR WITH VERTICAL PADDING
	 * 
	 * Vertical placement - Top, Middle, Bottom | Window placement - Left, Right, Diagonal
	 * Right | No brace - Flush
	 * 
	 */
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_BTM_LEFT = new BlockFacing("block_tng_corridor_vert_padded_btm_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_BTM_RIGHT = new BlockFacing("block_tng_corridor_vert_padded_btm_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_MIDDLE_LEFT = new BlockFacing("block_tng_corridor_vert_padded_middle_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_MIDDLE_RIGHT = new BlockFacing("block_tng_corridor_vert_padded_middle_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_TOP_LEFT = new BlockFacing("block_tng_corridor_vert_padded_top_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_TOP_RIGHT = new BlockFacing("block_tng_corridor_vert_padded_top_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_BRACE_BTM_LEFT = new BlockFacing("block_tng_corridor_vert_padded_brace_btm_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_BRACE_BTM_RIGHT = new BlockFacing("block_tng_corridor_vert_padded_brace_btm_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_BRACE_MIDDLE_LEFT = new BlockFacing("block_tng_corridor_vert_padded_brace_middle_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_BRACE_MIDDLE_RIGHT = new BlockFacing("block_tng_corridor_vert_padded_brace_middle_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_BRACE_TOP_LEFT = new BlockFacing("block_tng_corridor_vert_padded_brace_top_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_BRACE_TOP_RIGHT = new BlockFacing("block_tng_corridor_vert_padded_brace_top_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_BTM_FLUSH = new BlockFacing("block_tng_corridor_vert_padded_btm_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_MIDDLE_FLUSH = new BlockFacing("block_tng_corridor_vert_padded_middle_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_TOP_FLUSH = new BlockFacing("block_tng_corridor_vert_padded_top_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	// DIAGONAL BLOCKS
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_BTM_DIAG = new BlockDiagonalLeft("block_tng_corridor_vert_padded_btm_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_MIDDLE_DIAG = new BlockDiagonalLeft("block_tng_corridor_vert_padded_middle_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_VERT_PADDED_TOP_DIAG = new BlockDiagonalLeft("block_tng_corridor_vert_padded_top_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/*
	 * TNG ERA CORRIDOR DOORWAYS
	 * [_][_][_]
	 * Placement is in this pattern: [_] [_]
	 * [_] [_]
	 */
	public static final Block BLOCK_TNG_DOORWAY_TAN_BTM_LEFT = new BlockFacing("block_tng_doorway_tan_btm_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_DOORWAY_TAN_BTM_LEFT_JT = new BlockFacing("block_tng_doorway_tan_btm_left_jt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_DOORWAY_TAN_MIDDLE_LEFT = new BlockFacing("block_tng_doorway_tan_middle_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_DOORWAY_TAN_MIDDLE_LEFT_LIFT = new BlockFacing("block_tng_doorway_tan_middle_left_lift", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_DOORWAY_TAN_MIDDLE_LEFT_JT = new BlockFacing("block_tng_doorway_tan_middle_left_jt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_DOORWAY_TAN_TOP_LEFT = new BlockFacing("block_tng_doorway_tan_top_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_DOORWAY_TAN_TOP_MIDDLE = new BlockFacing("block_tng_doorway_tan_top_middle", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_DOORWAY_TAN_BTM_RIGHT = new BlockFacing("block_tng_doorway_tan_btm_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_DOORWAY_TAN_MIDDLE_RIGHT = new BlockFacing("block_tng_doorway_tan_middle_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_DOORWAY_TAN_TOP_RIGHT = new BlockFacing("block_tng_doorway_tan_top_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
    //	
	/*
	 * TNG ERA TECH TYPE ROOMS -- SHUTTLE BAYS & CARGO BAYS
	 * 
	 */
	public static final Block BLOCK_TNG_ROOM_TECH_BTM_FLUSH_ALT = new BlockFacing("block_tng_room_tech_btm_flush_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_TECH_BTM_FLUSH = new BlockFacing("block_tng_room_tech_btm_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_TECH_BTM_SPLIT = new BlockFacing("block_tng_room_tech_btm_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_ROOM_TECH_MIDDLE_FLUSH = new BlockFacing("block_tng_room_tech_middle_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_TECH_MIDDLE_SPLIT = new BlockFacing("block_tng_room_tech_middle_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_ROOM_TECH_TOP_FLUSH_ALT = new BlockFacing("block_tng_room_tech_top_flush_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_TECH_TOP_FLUSH = new BlockFacing("block_tng_room_tech_top_flush", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_TECH_TOP_SPLIT_ALT = new BlockFacing("block_tng_room_tech_top_split_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_TECH_TOP_SPLIT = new BlockFacing("block_tng_room_tech_top_split", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/*
	* TNG ERA LOUNGE TYPE ROOMS -- TEN-FORWARD TYPE LOUNGES, GENERIC LOUNGES, OTHER COMMUNAL SPACES
	* 
	*/
	public static final Block BLOCK_TNG_ROOM_LOUNGE_BTM = new BlockFacing("block_tng_room_lounge_btm", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_LOUNGE_MIDDLE = new BlockFacing("block_tng_room_lounge_middle", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_ROOM_LOUNGE_TOP = new BlockFacing("block_tng_room_lounge_top", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	//
	/*
	* TNG ERA LOUNGE TYPE ROOMS -- TEN-FORWARD TYPE LOUNGES, GENERIC LOUNGES, OTHER COMMUNAL SPACES
	* 
	*/
	public static final Block BLOCK_TNG_CORRIDOR_TAN_LIGHT_BTM_DIAG = new BlockDiagonalLeft("block_tng_corridor_tan_light_btm_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_TAN_LIGHT_MIDDLE_DIAG = new BlockDiagonalLeft("block_tng_corridor_tan_light_middle_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_CORRIDOR_TAN_LIGHT_TOP_DIAG = new BlockDiagonalLeft("block_tng_corridor_tan_light_top_diag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	//	
	/*
	 * TNG ERA BRIDGE CONSOLES ENTERPRISE-D
	 * 
	 */
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_BTM = new BlockObj("block_tng_bridge_console_btm", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_MIDDLE = new BlockObj("block_tng_bridge_console_middle", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_TOP = new BlockObj("block_tng_bridge_console_top", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_TOP_ALERT = new BlockObj("block_tng_bridge_console_top_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_BTM_LEFT = new BlockObj("block_tng_bridge_console_btm_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_MIDDLE_LEFT = new BlockObj("block_tng_bridge_console_middle_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_TOP_LEFT = new BlockObj("block_tng_bridge_console_top_left", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_TOP_LEFT_ALERT = new BlockObj("block_tng_bridge_console_top_left_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_BTM_LEFT_END = new BlockObj("block_tng_bridge_console_btm_left_end", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_MIDDLE_LEFT_END = new BlockObj("block_tng_bridge_console_middle_left_end", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_TOP_LEFT_END = new BlockObj("block_tng_bridge_console_top_left_end", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_TOP_LEFT_END_ALERT = new BlockObj("block_tng_bridge_console_top_left_end_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_BTM_RIGHT = new BlockObj("block_tng_bridge_console_btm_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_MIDDLE_RIGHT = new BlockObj("block_tng_bridge_console_middle_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_TOP_RIGHT = new BlockObj("block_tng_bridge_console_top_right", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_TOP_RIGHT_ALERT = new BlockObj("block_tng_bridge_console_top_right_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_BTM_RIGHT_END = new BlockObj("block_tng_bridge_console_btm_right_end", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_MIDDLE_RIGHT_END = new BlockObj("block_tng_bridge_console_middle_right_end", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_TOP_RIGHT_END = new BlockObj("block_tng_bridge_console_top_right_end", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TNG_BRIDGE_CONSOLE_TOP_RIGHT_END_ALERT = new BlockObj("block_tng_bridge_console_top_right_end_alert", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
//
	
	
	
	
	//- T M P -- M O V I E S  E R A  B L O C K S  --  ----V E R S I O N  1----
    //
	/*
	 *  TMP--MOVIES ERA FILLER WALL BLOCKS
	 */
	public static final Block BLOCK_TMP_WALL_BLUE = new BlockBase("block_tmp_wall_blue", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_WALL_DARK_BLUE = new BlockBase("block_tmp_wall_dark_blue", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_WALL_LIGHT_BROWN = new BlockBase("block_tmp_wall_light_brown", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_WALL_BROWN = new BlockBase("block_tmp_wall_brown", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_WALL_DARK_BROWN = new BlockBase("block_tmp_wall_dark_brown", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_WALL_DARK = new BlockBase("block_tmp_wall_dark", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_WALL_MEDIUM = new BlockBase("block_tmp_wall_medium", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_WALL_LIGHT = new BlockBase("block_tmp_wall_light", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//	
	/*
	 * TMP--MOVIES ERA CORRIDOR ANGLED BROWN
	 * 
	 */
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BROWN_BTM_FLUSH = new BlockObj("block_tmp_corridor_angled_brown_btm_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BROWN_BTM_LEFT = new BlockObj("block_tmp_corridor_angled_brown_btm_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BROWN_BTM_RIGHT = new BlockObj("block_tmp_corridor_angled_brown_btm_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BROWN_BTM_SPLIT = new BlockObj("block_tmp_corridor_angled_brown_btm_split", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BROWN_MIDDLE_FLUSH = new BlockObj("block_tmp_corridor_angled_brown_middle_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BROWN_MIDDLE_LEFT = new BlockObj("block_tmp_corridor_angled_brown_middle_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BROWN_MIDDLE_RIGHT = new BlockObj("block_tmp_corridor_angled_brown_middle_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BROWN_MIDDLE_SPLIT = new BlockObj("block_tmp_corridor_angled_brown_middle_split", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BROWN_TOP_FLUSH = new BlockObj("block_tmp_corridor_angled_brown_top_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BROWN_TOP_LEFT = new BlockObj("block_tmp_corridor_angled_brown_top_left", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BROWN_TOP_RIGHT = new BlockObj("block_tmp_corridor_angled_brown_top_right", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BROWN_TOP_SPLIT = new BlockObj("block_tmp_corridor_angled_brown_top_split", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	//
	/*
	 * TMP--MOVIES ERA CORRIDOR ANGLED BLUE
	 * 
	 */
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BLUE_BTM_FLUSH = new BlockObj("block_tmp_corridor_angled_blue_btm_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BLUE_BTM_LEFT = new BlockObj("block_tmp_corridor_angled_blue_btm_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BLUE_BTM_RIGHT = new BlockObj("block_tmp_corridor_angled_blue_btm_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BLUE_BTM_SPLIT = new BlockObj("block_tmp_corridor_angled_blue_btm_split", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BLUE_MIDDLE_FLUSH = new BlockObj("block_tmp_corridor_angled_blue_middle_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BLUE_MIDDLE_LEFT = new BlockObj("block_tmp_corridor_angled_blue_middle_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BLUE_MIDDLE_RIGHT = new BlockObj("block_tmp_corridor_angled_blue_middle_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BLUE_MIDDLE_SPLIT = new BlockObj("block_tmp_corridor_angled_blue_middle_split", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BLUE_TOP_FLUSH = new BlockObj("block_tmp_corridor_angled_blue_top_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BLUE_TOP_LEFT = new BlockObj("block_tmp_corridor_angled_blue_top_left", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BLUE_TOP_RIGHT = new BlockObj("block_tmp_corridor_angled_blue_top_right", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BLUE_TOP_SPLIT = new BlockObj("block_tmp_corridor_angled_blue_top_split", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	//
	/*
	 * TMP--MOVIES ERA CORRIDOR ANGLED YELLOW
	 * 
	 */
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_YELLOW_BTM_FLUSH = new BlockObj("block_tmp_corridor_angled_yellow_btm_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_YELLOW_BTM_LEFT = new BlockObj("block_tmp_corridor_angled_yellow_btm_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_YELLOW_BTM_RIGHT = new BlockObj("block_tmp_corridor_angled_yellow_btm_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_YELLOW_BTM_SPLIT = new BlockObj("block_tmp_corridor_angled_yellow_btm_split", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_YELLOW_MIDDLE_FLUSH = new BlockObj("block_tmp_corridor_angled_yellow_middle_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_YELLOW_MIDDLE_LEFT = new BlockObj("block_tmp_corridor_angled_yellow_middle_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_YELLOW_MIDDLE_RIGHT = new BlockObj("block_tmp_corridor_angled_yellow_middle_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_YELLOW_MIDDLE_SPLIT = new BlockObj("block_tmp_corridor_angled_yellow_middle_split", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_YELLOW_TOP_FLUSH = new BlockObj("block_tmp_corridor_angled_yellow_top_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_YELLOW_TOP_LEFT = new BlockObj("block_tmp_corridor_angled_yellow_top_left", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_YELLOW_TOP_RIGHT = new BlockObj("block_tmp_corridor_angled_yellow_top_right", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_YELLOW_TOP_SPLIT = new BlockObj("block_tmp_corridor_angled_yellow_top_split", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	//
	/*
	 * TMP--MOVIES ERA CORRIDOR ANGLED GREY
	 * 
	 */
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_GREY_BTM_FLUSH = new BlockObj("block_tmp_corridor_angled_grey_btm_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_GREY_BTM_LEFT = new BlockObj("block_tmp_corridor_angled_grey_btm_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_GREY_BTM_RIGHT = new BlockObj("block_tmp_corridor_angled_grey_btm_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_GREY_BTM_SPLIT = new BlockObj("block_tmp_corridor_angled_grey_btm_split", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_GREY_MIDDLE_FLUSH = new BlockObj("block_tmp_corridor_angled_grey_middle_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_GREY_MIDDLE_LEFT = new BlockObj("block_tmp_corridor_angled_grey_middle_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_GREY_MIDDLE_RIGHT = new BlockObj("block_tmp_corridor_angled_grey_middle_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_GREY_MIDDLE_SPLIT = new BlockObj("block_tmp_corridor_angled_grey_middle_split", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_GREY_TOP_FLUSH = new BlockObj("block_tmp_corridor_angled_grey_top_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_GREY_TOP_LEFT = new BlockObj("block_tmp_corridor_angled_grey_top_left", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_GREY_TOP_RIGHT = new BlockObj("block_tmp_corridor_angled_grey_top_right", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_GREY_TOP_SPLIT = new BlockObj("block_tmp_corridor_angled_grey_top_split", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	//
	/*
	 * TMP--MOVIES ERA CORRIDOR ANGLED RED
	 * 
	 */
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_RED_BTM_FLUSH = new BlockObj("block_tmp_corridor_angled_red_btm_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_RED_BTM_LEFT = new BlockObj("block_tmp_corridor_angled_red_btm_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_RED_BTM_RIGHT = new BlockObj("block_tmp_corridor_angled_red_btm_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_RED_BTM_SPLIT = new BlockObj("block_tmp_corridor_angled_red_btm_split", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_RED_MIDDLE_FLUSH = new BlockObj("block_tmp_corridor_angled_red_middle_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_RED_MIDDLE_LEFT = new BlockObj("block_tmp_corridor_angled_red_middle_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_RED_MIDDLE_RIGHT = new BlockObj("block_tmp_corridor_angled_red_middle_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_RED_MIDDLE_SPLIT = new BlockObj("block_tmp_corridor_angled_red_middle_split", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_RED_TOP_FLUSH = new BlockObj("block_tmp_corridor_angled_red_top_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_RED_TOP_LEFT = new BlockObj("block_tmp_corridor_angled_red_top_left", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_RED_TOP_RIGHT = new BlockObj("block_tmp_corridor_angled_red_top_right", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_RED_TOP_SPLIT = new BlockObj("block_tmp_corridor_angled_red_top_split", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	//
	/*
	 * TMP--MOVIES ERA CORRIDOR ANGLED WHITE
	 * 
	 */
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_WHITE_BTM_FLUSH = new BlockObj("block_tmp_corridor_angled_white_btm_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_WHITE_BTM_LEFT = new BlockObj("block_tmp_corridor_angled_white_btm_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_WHITE_BTM_RIGHT = new BlockObj("block_tmp_corridor_angled_white_btm_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_WHITE_BTM_SPLIT = new BlockObj("block_tmp_corridor_angled_white_btm_split", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_WHITE_MIDDLE_FLUSH = new BlockObj("block_tmp_corridor_angled_white_middle_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_WHITE_MIDDLE_LEFT = new BlockObj("block_tmp_corridor_angled_white_middle_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_WHITE_MIDDLE_RIGHT = new BlockObj("block_tmp_corridor_angled_white_middle_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_WHITE_MIDDLE_SPLIT = new BlockObj("block_tmp_corridor_angled_white_middle_split", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_WHITE_TOP_FLUSH = new BlockObj("block_tmp_corridor_angled_white_top_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_WHITE_TOP_LEFT = new BlockObj("block_tmp_corridor_angled_white_top_left", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_WHITE_TOP_RIGHT = new BlockObj("block_tmp_corridor_angled_white_top_right", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_WHITE_TOP_SPLIT = new BlockObj("block_tmp_corridor_angled_white_top_split", Material.IRON, MineTrekMod.TAB_MOVIES, 0.4f, 0, SoundType.METAL);
	//
	/*
	 * TMP--MOVIES ERA CORRIDOR ANGLED
	 * 
	 */
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BTM_FLUSH = new BlockObj("block_tmp_corridor_angled_btm_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_MIDDLE_FLUSH = new BlockObj("block_tmp_corridor_angled_middle_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_TOP_FLUSH = new BlockObj("block_tmp_corridor_angled_top_flush", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BTM_LEFT = new BlockObj("block_tmp_corridor_angled_btm_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BTM_RIGHT = new BlockObj("block_tmp_corridor_angled_btm_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_BTM_SPLIT = new BlockObj("block_tmp_corridor_angled_btm_split", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_MIDDLE_LEFT = new BlockObj("block_tmp_corridor_angled_middle_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_MIDDLE_RIGHT = new BlockObj("block_tmp_corridor_angled_middle_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_MIDDLE_SPLIT = new BlockObj("block_tmp_corridor_angled_middle_split", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_MIDDLE_FLUSH_ALERT = new BlockObj("block_tmp_corridor_angled_middle_flush_alert", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_MIDDLE_LEFT_ALERT = new BlockObj("block_tmp_corridor_angled_middle_left_alert", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_MIDDLE_RIGHT_ALERT = new BlockObj("block_tmp_corridor_angled_middle_right_alert", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_MIDDLE_SPLIT_ALERT = new BlockObj("block_tmp_corridor_angled_middle_split_alert", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_TOP_LEFT = new BlockObj("block_tmp_corridor_angled_top_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_TOP_RIGHT = new BlockObj("block_tmp_corridor_angled_top_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_CORRIDOR_ANGLED_TOP_SPLIT = new BlockObj("block_tmp_corridor_angled_top_split", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	//
	/*
	 *  TMP--MOVIES ERA BRIDGE STATION BLOCKS
	 * 
	 */
	public static final Block BLOCK_TMP_BRIDGE_STATION_1_BTM_LEFT = new BlockObj("block_tmp_bridge_station_1_btm_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_BRIDGE_STATION_1_BTM_LEFT_ALT = new BlockObj("block_tmp_bridge_station_1_btm_left_alt", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_BRIDGE_STATION_1_MIDDLE_LEFT = new BlockObj("block_tmp_bridge_station_1_middle_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_BRIDGE_STATION_1_TOP_LEFT = new BlockObj("block_tmp_bridge_station_1_top_left", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_BRIDGE_STATION_1_TOP_LEFT_ALERT = new BlockObj("block_tmp_bridge_station_1_top_left_alert", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_BRIDGE_STATION_1_BTM_CENTRE = new BlockObj("block_tmp_bridge_station_1_btm_centre", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_BRIDGE_STATION_1_BTM_CENTRE_ALT = new BlockObj("block_tmp_bridge_station_1_btm_centre_alt", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_BRIDGE_STATION_1_MIDDLE_CENTRE = new BlockObj("block_tmp_bridge_station_1_middle_centre", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_BRIDGE_STATION_1_TOP_CENTRE = new BlockObj("block_tmp_bridge_station_1_top_centre", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_BRIDGE_STATION_1_TOP_CENTRE_ALERT = new BlockObj("block_tmp_bridge_station_1_top_centre_alert", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	public static final Block BLOCK_TMP_BRIDGE_STATION_1_BTM_RIGHT = new BlockObj("block_tmp_bridge_station_1_btm_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_BRIDGE_STATION_1_BTM_RIGHT_ALT = new BlockObj("block_tmp_bridge_station_1_btm_right_alt", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_BRIDGE_STATION_1_MIDDLE_RIGHT = new BlockObj("block_tmp_bridge_station_1_middle_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_BRIDGE_STATION_1_TOP_RIGHT = new BlockObj("block_tmp_bridge_station_1_top_right", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block BLOCK_TMP_BRIDGE_STATION_1_TOP_RIGHT_ALERT = new BlockObj("block_tmp_bridge_station_1_top_right_alert", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//******************************************************************************************************************************************************//

	
	
	
	
	
	
	//******************************************************************************************************************************************************//
	///										   ///
	/// *** MTMOD Version 2.0.0 Blocks Inits *** ///
    ///		 								   ///
	
	//
	/*
	 * NEW 2.0.0 CARPET COLOR DESIGNS BLOCKS
	 */
	public static final Block BLOCK_CARPET_BLACK = new BlockTrekCarpet("block_trek_carpet_black", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_BLUE = new BlockTrekCarpet("block_trek_carpet_blue", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_BRIGHT_GREEN = new BlockTrekCarpet("block_trek_carpet_bright_green", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_CYAN = new BlockTrekCarpet("block_trek_carpet_cyan", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_DARK_BLUE = new BlockTrekCarpet("block_trek_carpet_dark_blue", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_DARK_CYAN = new BlockTrekCarpet("block_trek_carpet_dark_cyan", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_DARK_GREEN = new BlockTrekCarpet("block_trek_carpet_dark_green", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_DARK_LIGHT_GRAY = new BlockTrekCarpet("block_trek_carpet_dark_light_gray", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_DARK_PURPLE = new BlockTrekCarpet("block_trek_carpet_dark_purple", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_DARK_RED = new BlockTrekCarpet("block_trek_carpet_dark_red", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_DARK_TEAL = new BlockTrekCarpet("block_trek_carpet_dark_teal", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_DULL_BLUE = new BlockTrekCarpet("block_trek_carpet_dull_blue", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_DULL_ORANGE = new BlockTrekCarpet("block_trek_carpet_dull_orange", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_DULL_YELLOW = new BlockTrekCarpet("block_trek_carpet_dull_yellow", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_GREEN = new BlockTrekCarpet("block_trek_carpet_green", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_LIGHT_BLUE = new BlockTrekCarpet("block_trek_carpet_light_blue", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_LIGHT_GRAY = new BlockTrekCarpet("block_trek_carpet_light_gray", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_LIGHT_TEAL = new BlockTrekCarpet("block_trek_carpet_light_teal", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_MIDDLE_BLUE = new BlockTrekCarpet("block_trek_carpet_middle_blue", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_MIDDLE_GRAY = new BlockTrekCarpet("block_trek_carpet_middle_gray", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_ORANGE = new BlockTrekCarpet("block_trek_carpet_orange", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_PURPLE = new BlockTrekCarpet("block_trek_carpet_purple", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_REGAL_PURPLE = new BlockTrekCarpet("block_trek_carpet_regal_purple", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_SEA_GREEN = new BlockTrekCarpet("block_trek_carpet_sea_green", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_VIBRANT_RED = new BlockTrekCarpet("block_trek_carpet_vibrant_red", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_WHITE = new BlockTrekCarpet("block_trek_carpet_white", MineTrekMod.TAB_MISC);
	public static final Block BLOCK_CARPET_YELLOW = new BlockTrekCarpet("block_trek_carpet_yellow", MineTrekMod.TAB_MISC);
    //
	//
	/*
	 * NEW 2.0.0 FLOORING COLOR DESIGNS BLOCKS
	 */
	public static final Block FLOORING_ALT_GRATING_DARK = new BlockGlass("flooring_alt_grating_dark", Material.GLASS, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.GLASS);
	public static final Block FLOORING_ALT_GRATING = new BlockGlass("flooring_alt_grating", Material.GLASS, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.GLASS);
	
	public static final Block FLOORING_BLACK_BULLET = new BlockBase("flooring_black_bullet", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_BUTTON_FLOOR_BLACK = new BlockBase("flooring_button_floor_black", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_BUTTON_FLOOR_BLUE = new BlockBase("flooring_button_floor_blue", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_BUTTON_FLOOR_BRONZE = new BlockBase("flooring_button_floor_bronze", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_BUTTON_FLOOR_DARK_GRAY = new BlockBase("flooring_button_floor_dark_gray", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_BUTTON_FLOOR_GRAY = new BlockBase("flooring_button_floor_gray", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_BUTTON_FLOOR_GREEN = new BlockBase("flooring_button_floor_green", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_BUTTON_FLOOR_LIGHT_GRAY = new BlockBase("flooring_button_floor_light_gray", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_BUTTON_FLOOR_LIGHT_WHITE = new BlockBase("flooring_button_floor_light_white", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_BUTTON_FLOOR_RED = new BlockBase("flooring_button_floor_red", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	
	public static final Block FLOORING_GRILL_1 = new BlockGlass("flooring_grill_1", Material.GLASS, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.GLASS);
	public static final Block FLOORING_GRILL_2 = new BlockGlass("flooring_grill_2", Material.GLASS, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.GLASS);
	public static final Block FLOORING_GRILL_3 = new BlockGlass("flooring_grill_3", Material.GLASS, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.GLASS);
	
	public static final Block FLOORING_METAL_FLOOR_1_GRAY = new BlockBase("flooring_metal_floor_1_gray", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_METAL_FLOOR_1 = new BlockBase("flooring_metal_floor_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_METAL_FLOOR_2_GRAY = new BlockBase("flooring_metal_floor_2_gray", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_METAL_FLOOR_2 = new BlockBase("flooring_metal_floor_2", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_METAL_FLOOR_3 = new BlockBase("flooring_metal_floor_3", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_METAL_FLOOR_4 = new BlockFacing("flooring_metal_floor_4", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_METAL_FLOOR_5 = new BlockFacing("flooring_metal_floor_5", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_METAL_FLOOR_6_BLUE = new BlockFacing("flooring_metal_floor_6_blue", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_METAL_FLOOR_6_GRAY = new BlockFacing("flooring_metal_floor_6_gray", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	
	public static final Block FLOORING_METAL_GRATING_BLACK = new BlockGlass("flooring_metal_grating_black", Material.GLASS, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.GLASS);
	public static final Block FLOORING_METAL_GRATING_BLUE = new BlockGlass("flooring_metal_grating_blue", Material.GLASS, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.GLASS);
	public static final Block FLOORING_METAL_GRATING_DARK_BLUE = new BlockGlass("flooring_metal_grating_dark_blue", Material.GLASS, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.GLASS);
	public static final Block FLOORING_METAL_GRATING_GRAY = new BlockGlass("flooring_metal_grating_gray", Material.GLASS, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.GLASS);
	public static final Block FLOORING_METAL_GRATING_HEX_BLACK = new BlockGlass("flooring_metal_grating_hex_black", Material.GLASS, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.GLASS);
	public static final Block FLOORING_METAL_GRATING_HEX_GRAY = new BlockGlass("flooring_metal_grating_hex_gray", Material.GLASS, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.GLASS);
	public static final Block FLOORING_METAL_GRATING_HEX_LIGHT_GRAY = new BlockGlass("flooring_metal_grating_hex_light_gray", Material.GLASS, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.GLASS);
	public static final Block FLOORING_METAL_GRATING_PALE_BLUE = new BlockGlass("flooring_metal_grating_pale_blue", Material.GLASS, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.GLASS);
	public static final Block FLOORING_METAL_GRATING_RED = new BlockGlass("flooring_metal_grating_red", Material.GLASS, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.GLASS);
	public static final Block FLOORING_METAL_GRATING_YELLOW = new BlockGlass("flooring_metal_grating_yellow", Material.GLASS, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.GLASS);
	
	public static final Block FLOORING_WOODEN_FLOOR = new BlockFacing("flooring_wooden_floor", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_BLACK = new BlockBase("flooring_carpet_black", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_BLUE = new BlockBase("flooring_carpet_blue", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_BRIGHT_GREEN = new BlockBase("flooring_carpet_bright_green", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_CYAN = new BlockBase("flooring_carpet_cyan", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_DARK_BLUE = new BlockBase("flooring_carpet_dark_blue", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_DARK_CYAN = new BlockBase("flooring_carpet_dark_cyan", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_DARK_GREEN = new BlockBase("flooring_carpet_dark_green", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_DARK_LIGHT_GRAY = new BlockBase("flooring_carpet_dark_light_gray", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_DARK_PURPLE = new BlockBase("flooring_carpet_dark_purple", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_DARK_RED = new BlockBase("flooring_carpet_dark_red", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_DARK_TEAL = new BlockBase("flooring_carpet_dark_teal", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_DULL_BLUE = new BlockBase("flooring_carpet_dull_blue", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_DULL_ORANGE = new BlockBase("flooring_carpet_dull_orange", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_DULL_YELLOW = new BlockBase("flooring_carpet_dull_yellow", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_GREEN = new BlockBase("flooring_carpet_green", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_LIGHT_BLUE = new BlockBase("flooring_carpet_light_blue", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_LIGHT_GRAY = new BlockBase("flooring_carpet_light_gray", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_LIGHT_TEAL = new BlockBase("flooring_carpet_light_teal", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_MIDDLE_BLUE = new BlockBase("flooring_carpet_middle_blue", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_MIDDLE_GRAY = new BlockBase("flooring_carpet_middle_gray", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_ORANGE = new BlockBase("flooring_carpet_orange", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_PURPLE = new BlockBase("flooring_carpet_purple", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_REGAL_PURPLE = new BlockBase("flooring_carpet_regal_purple", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_SEA_GREEN = new BlockBase("flooring_carpet_sea_green", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_VIBRANT_RED = new BlockBase("flooring_carpet_vibrant_red", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_WHITE = new BlockBase("flooring_carpet_white", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block FLOORING_CARPET_YELLOW = new BlockBase("flooring_carpet_yellow", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	//
    //
	/*
	 * NEW 2.0.0 HULL BLOCKS AND FLAT COLORED BLOCKS
	 */
	public static final Block HULL_FLATBLOCKSBG_AETHER_ORANGE_1 = new BlockBase("hull_flatblocksbg_aether_orange_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_ORANGE_2 = new BlockBase("hull_flatblocksbg_aether_orange_2", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_ORANGE_3 = new BlockBase("hull_flatblocksbg_aether_orange_3", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_ORANGE_4 = new BlockBase("hull_flatblocksbg_aether_orange_4", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_ORANGE_5 = new BlockBase("hull_flatblocksbg_aether_orange_5", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_ORANGE_6 = new BlockBase("hull_flatblocksbg_aether_orange_6", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_ORANGE_7 = new BlockBase("hull_flatblocksbg_aether_orange_7", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_ORANGE_8 = new BlockBase("hull_flatblocksbg_aether_orange_8", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_ORANGE_9 = new BlockBase("hull_flatblocksbg_aether_orange_9", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_ORANGE_10 = new BlockBase("hull_flatblocksbg_aether_orange_10", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_ORANGE_11 = new BlockBase("hull_flatblocksbg_aether_orange_11", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_ORANGE_12 = new BlockBase("hull_flatblocksbg_aether_orange_12", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_RED_1 = new BlockBase("hull_flatblocksbg_aether_red_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_RED_2 = new BlockBase("hull_flatblocksbg_aether_red_2", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_RED_3 = new BlockBase("hull_flatblocksbg_aether_red_3", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_RED_4 = new BlockBase("hull_flatblocksbg_aether_red_4", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_RED_5 = new BlockBase("hull_flatblocksbg_aether_red_5", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_RED_6 = new BlockBase("hull_flatblocksbg_aether_red_6", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_RED_7 = new BlockBase("hull_flatblocksbg_aether_red_7", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_RED_8 = new BlockBase("hull_flatblocksbg_aether_red_8", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_RED_9 = new BlockBase("hull_flatblocksbg_aether_red_9", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_RED_10 = new BlockBase("hull_flatblocksbg_aether_red_10", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AETHER_RED_11 = new BlockBase("hull_flatblocksbg_aether_red_11", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AMBY_BLUE_1 = new BlockBase("hull_flatblocksbg_amby_blue_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AMBY_BLUE_2 = new BlockBase("hull_flatblocksbg_amby_blue_2", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AMBY_BLUE_3 = new BlockBase("hull_flatblocksbg_amby_blue_3", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AMBY_BLUE_4 = new BlockBase("hull_flatblocksbg_amby_blue_4", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AMBY_BLUE_5 = new BlockBase("hull_flatblocksbg_amby_blue_5", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AMBY_BLUE_6 = new BlockBase("hull_flatblocksbg_amby_blue_6", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AMBY_BLUE_7 = new BlockBase("hull_flatblocksbg_amby_blue_7", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_AMBY_BLUE_8 = new BlockBase("hull_flatblocksbg_amby_blue_8", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_BLACK_1 = new BlockBase("hull_flatblocksbg_black_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_BROWN_1 = new BlockBase("hull_flatblocksbg_brown_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_CONNIE_BLUE_1 = new BlockBase("hull_flatblocksbg_connie_blue_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_CONNIE_BLUE_2 = new BlockBase("hull_flatblocksbg_connie_blue_2", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_CONNIE_BLUE_3 = new BlockBase("hull_flatblocksbg_connie_blue_3", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_CONNIE_BLUE_4 = new BlockBase("hull_flatblocksbg_connie_blue_4", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_CONNIE_BLUE_5 = new BlockBase("hull_flatblocksbg_connie_blue_5", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_CONNIE_BLUE_6 = new BlockBase("hull_flatblocksbg_connie_blue_6", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_CONNIE_BLUE_7 = new BlockBase("hull_flatblocksbg_connie_blue_7", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_CONNIE_BLUE_8 = new BlockBase("hull_flatblocksbg_connie_blue_8", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_CONNIE_BLUE_9 = new BlockBase("hull_flatblocksbg_connie_blue_9", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_DARK_CREAM_1 = new BlockBase("hull_flatblocksbg_dark_cream_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_DARK_YELLOW_1 = new BlockBase("hull_flatblocksbg_dark_yellow_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_DISCO_BRONZE_1 = new BlockBase("hull_flatblocksbg_disco_bronze_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_DISCO_BRONZE_2 = new BlockBase("hull_flatblocksbg_disco_bronze_2", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_DISCO_BRONZE_3 = new BlockBase("hull_flatblocksbg_disco_bronze_3", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_DISCO_BRONZE_4 = new BlockBase("hull_flatblocksbg_disco_bronze_4", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_DISCO_BRONZE_5 = new BlockBase("hull_flatblocksbg_disco_bronze_5", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_DISCO_BRONZE_6 = new BlockBase("hull_flatblocksbg_disco_bronze_6", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_DISCO_BRONZE_7 = new BlockBase("hull_flatblocksbg_disco_bronze_7", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_DISCO_BRONZE_8 = new BlockBase("hull_flatblocksbg_disco_bronze_8", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_DULL_PURPLE_1 = new BlockBase("hull_flatblocksbg_dull_purple_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_DULL_TEAL_1 = new BlockBase("hull_flatblocksbg_dull_teal_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_1 = new BlockBase("hull_flatblocksbg_gray_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_2 = new BlockBase("hull_flatblocksbg_gray_2", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_3 = new BlockBase("hull_flatblocksbg_gray_3", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_4 = new BlockBase("hull_flatblocksbg_gray_4", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_5 = new BlockBase("hull_flatblocksbg_gray_5", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_6 = new BlockBase("hull_flatblocksbg_gray_6", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_7 = new BlockBase("hull_flatblocksbg_gray_7", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_8 = new BlockBase("hull_flatblocksbg_gray_8", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_9 = new BlockBase("hull_flatblocksbg_gray_9", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_10 = new BlockBase("hull_flatblocksbg_gray_10", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_11 = new BlockBase("hull_flatblocksbg_gray_11", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_12 = new BlockBase("hull_flatblocksbg_gray_12", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_13 = new BlockBase("hull_flatblocksbg_gray_13", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_14 = new BlockBase("hull_flatblocksbg_gray_14", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_15 = new BlockBase("hull_flatblocksbg_gray_15", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_16 = new BlockBase("hull_flatblocksbg_gray_16", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_17 = new BlockBase("hull_flatblocksbg_gray_17", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_18 = new BlockBase("hull_flatblocksbg_gray_18", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_19 = new BlockBase("hull_flatblocksbg_gray_19", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_20 = new BlockBase("hull_flatblocksbg_gray_20", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_21 = new BlockBase("hull_flatblocksbg_gray_21", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_22 = new BlockBase("hull_flatblocksbg_gray_22", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_GRAY_23 = new BlockBase("hull_flatblocksbg_gray_23", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_LIME_1 = new BlockBase("hull_flatblocksbg_lime_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_NAVAL_BLUE_1 = new BlockBase("hull_flatblocksbg_naval_blue_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_NAVAL_BLUE_2 = new BlockBase("hull_flatblocksbg_naval_blue_2", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_NAVAL_BLUE_3 = new BlockBase("hull_flatblocksbg_naval_blue_3", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_NAVAL_BLUE_4 = new BlockBase("hull_flatblocksbg_naval_blue_4", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_NAVAL_BLUE_5 = new BlockBase("hull_flatblocksbg_naval_blue_5", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_RED_1 = new BlockBase("hull_flatblocksbg_red_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_TOS_ACCENTS_1 = new BlockBase("hull_flatblocksbg_tos_accents_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_TOS_HULL_1 = new BlockBase("hull_flatblocksbg_tos_hull_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
	public static final Block HULL_FLATBLOCKSBG_WHITE_1 = new BlockBase("hull_flatblocksbg_white_1", Material.IRON, MineTrekMod.TAB_HULL_FLATBLOCKSBG, 1.0f, 0, SoundType.METAL);
    //	
	//
	/*
	 * NEW 2.0.0 LCARS BLOCKS
	 */
	/* LCARS SCREENS */
	public static final Block LCARS_SCREENS_LCARS_1 = new BlockBase("lcars_screens_lcars_1", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_2 = new BlockBase("lcars_screens_lcars_2", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_3 = new BlockBase("lcars_screens_lcars_3", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_4 = new BlockBase("lcars_screens_lcars_4", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_5 = new BlockBase("lcars_screens_lcars_5", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_6 = new BlockBase("lcars_screens_lcars_6", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_7 = new BlockBase("lcars_screens_lcars_7", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_8 = new BlockBase("lcars_screens_lcars_8", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_9 = new BlockBase("lcars_screens_lcars_9", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_10 = new BlockBase("lcars_screens_lcars_10", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_11 = new BlockBase("lcars_screens_lcars_11", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_12 = new BlockBase("lcars_screens_lcars_12", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_13 = new BlockBase("lcars_screens_lcars_13", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_14 = new BlockBase("lcars_screens_lcars_14", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_15 = new BlockBase("lcars_screens_lcars_15", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_16 = new BlockBase("lcars_screens_lcars_16", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_17 = new BlockBase("lcars_screens_lcars_17", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_18 = new BlockBase("lcars_screens_lcars_18", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_19 = new BlockBase("lcars_screens_lcars_19", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_20 = new BlockBase("lcars_screens_lcars_20", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_21 = new BlockBase("lcars_screens_lcars_21", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_22 = new BlockBase("lcars_screens_lcars_22", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_23 = new BlockBase("lcars_screens_lcars_23", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_24 = new BlockBase("lcars_screens_lcars_24", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_25 = new BlockBase("lcars_screens_lcars_25", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_26 = new BlockBase("lcars_screens_lcars_26", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_27 = new BlockBase("lcars_screens_lcars_27", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_28 = new BlockBase("lcars_screens_lcars_28", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_29 = new BlockBase("lcars_screens_lcars_29", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_30 = new BlockBase("lcars_screens_lcars_30", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_31 = new BlockBase("lcars_screens_lcars_31", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_32 = new BlockBase("lcars_screens_lcars_32", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_33 = new BlockBase("lcars_screens_lcars_33", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_34 = new BlockBase("lcars_screens_lcars_34", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_35 = new BlockBase("lcars_screens_lcars_35", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_36 = new BlockBase("lcars_screens_lcars_36", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_37 = new BlockBase("lcars_screens_lcars_37", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_38 = new BlockBase("lcars_screens_lcars_38", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_39 = new BlockBase("lcars_screens_lcars_39", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_40 = new BlockBase("lcars_screens_lcars_40", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_41 = new BlockBase("lcars_screens_lcars_41", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_42 = new BlockBase("lcars_screens_lcars_42", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_43 = new BlockBase("lcars_screens_lcars_43", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_44 = new BlockBase("lcars_screens_lcars_44", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_45 = new BlockBase("lcars_screens_lcars_45", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_46 = new BlockBase("lcars_screens_lcars_46", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_47 = new BlockBase("lcars_screens_lcars_47", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_48 = new BlockBase("lcars_screens_lcars_48", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_49 = new BlockBase("lcars_screens_lcars_49", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_50 = new BlockBase("lcars_screens_lcars_50", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_51 = new BlockBase("lcars_screens_lcars_51", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_52 = new BlockBase("lcars_screens_lcars_52", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_53 = new BlockBase("lcars_screens_lcars_53", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_54 = new BlockBase("lcars_screens_lcars_54", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_55 = new BlockBase("lcars_screens_lcars_55", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_56 = new BlockBase("lcars_screens_lcars_56", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_57 = new BlockBase("lcars_screens_lcars_57", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_58 = new BlockBase("lcars_screens_lcars_58", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_59 = new BlockBase("lcars_screens_lcars_59", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_60 = new BlockBase("lcars_screens_lcars_60", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_61 = new BlockBase("lcars_screens_lcars_61", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_62 = new BlockBase("lcars_screens_lcars_62", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_63 = new BlockBase("lcars_screens_lcars_63", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_64 = new BlockBase("lcars_screens_lcars_64", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_65 = new BlockBase("lcars_screens_lcars_65", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_66 = new BlockBase("lcars_screens_lcars_66", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_67 = new BlockBase("lcars_screens_lcars_67", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_68 = new BlockBase("lcars_screens_lcars_68", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_69 = new BlockBase("lcars_screens_lcars_69", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_70 = new BlockBase("lcars_screens_lcars_70", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_71 = new BlockBase("lcars_screens_lcars_71", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_72 = new BlockBase("lcars_screens_lcars_72", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_73 = new BlockBase("lcars_screens_lcars_73", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_74 = new BlockBase("lcars_screens_lcars_74", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_75 = new BlockBase("lcars_screens_lcars_75", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_76 = new BlockBase("lcars_screens_lcars_76", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_77 = new BlockBase("lcars_screens_lcars_77", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_78 = new BlockBase("lcars_screens_lcars_78", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_79 = new BlockBase("lcars_screens_lcars_79", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_80 = new BlockBase("lcars_screens_lcars_80", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_81 = new BlockBase("lcars_screens_lcars_81", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_82 = new BlockBase("lcars_screens_lcars_82", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_83 = new BlockBase("lcars_screens_lcars_83", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_84 = new BlockBase("lcars_screens_lcars_84", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_85 = new BlockBase("lcars_screens_lcars_85", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_86 = new BlockBase("lcars_screens_lcars_86", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_87 = new BlockBase("lcars_screens_lcars_87", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_88 = new BlockBase("lcars_screens_lcars_88", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_89 = new BlockBase("lcars_screens_lcars_89", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_90 = new BlockBase("lcars_screens_lcars_90", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_91 = new BlockBase("lcars_screens_lcars_91", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_92 = new BlockBase("lcars_screens_lcars_92", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_93 = new BlockBase("lcars_screens_lcars_93", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_94 = new BlockBase("lcars_screens_lcars_94", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_95 = new BlockBase("lcars_screens_lcars_95", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_96 = new BlockBase("lcars_screens_lcars_96", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_97 = new BlockBase("lcars_screens_lcars_97", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_98 = new BlockBase("lcars_screens_lcars_98", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_99 = new BlockBase("lcars_screens_lcars_99", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_100 = new BlockBase("lcars_screens_lcars_100", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_101 = new BlockBase("lcars_screens_lcars_101", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_102 = new BlockBase("lcars_screens_lcars_102", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_103 = new BlockBase("lcars_screens_lcars_103", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_104 = new BlockBase("lcars_screens_lcars_104", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_105 = new BlockBase("lcars_screens_lcars_105", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_106 = new BlockBase("lcars_screens_lcars_106", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_107 = new BlockBase("lcars_screens_lcars_107", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_108 = new BlockBase("lcars_screens_lcars_108", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_109 = new BlockBase("lcars_screens_lcars_109", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_110 = new BlockBase("lcars_screens_lcars_110", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_111 = new BlockBase("lcars_screens_lcars_111", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_112 = new BlockBase("lcars_screens_lcars_112", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_113 = new BlockBase("lcars_screens_lcars_113", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_114 = new BlockBase("lcars_screens_lcars_114", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_115 = new BlockBase("lcars_screens_lcars_115", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_116 = new BlockBase("lcars_screens_lcars_116", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_117 = new BlockBase("lcars_screens_lcars_117", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_118 = new BlockBase("lcars_screens_lcars_118", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_119 = new BlockBase("lcars_screens_lcars_119", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_120 = new BlockBase("lcars_screens_lcars_120", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_121 = new BlockBase("lcars_screens_lcars_121", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_122 = new BlockBase("lcars_screens_lcars_122", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_123 = new BlockBase("lcars_screens_lcars_123", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_124 = new BlockBase("lcars_screens_lcars_124", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_125 = new BlockBase("lcars_screens_lcars_125", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_126 = new BlockBase("lcars_screens_lcars_126", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_127 = new BlockBase("lcars_screens_lcars_127", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_128 = new BlockBase("lcars_screens_lcars_128", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_129 = new BlockBase("lcars_screens_lcars_129", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_130 = new BlockBase("lcars_screens_lcars_130", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_131 = new BlockBase("lcars_screens_lcars_131", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_132 = new BlockBase("lcars_screens_lcars_132", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_133 = new BlockBase("lcars_screens_lcars_133", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_134 = new BlockBase("lcars_screens_lcars_134", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_135 = new BlockBase("lcars_screens_lcars_135", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_136 = new BlockBase("lcars_screens_lcars_136", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_137 = new BlockBase("lcars_screens_lcars_137", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_138 = new BlockBase("lcars_screens_lcars_138", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_139 = new BlockBase("lcars_screens_lcars_139", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_140 = new BlockBase("lcars_screens_lcars_140", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_141 = new BlockBase("lcars_screens_lcars_141", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_142 = new BlockBase("lcars_screens_lcars_142", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_143 = new BlockBase("lcars_screens_lcars_143", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_144 = new BlockBase("lcars_screens_lcars_144", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_145 = new BlockBase("lcars_screens_lcars_145", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_146 = new BlockBase("lcars_screens_lcars_146", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_147 = new BlockBase("lcars_screens_lcars_147", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_148 = new BlockBase("lcars_screens_lcars_148", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_149 = new BlockBase("lcars_screens_lcars_149", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_150 = new BlockBase("lcars_screens_lcars_150", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_151 = new BlockBase("lcars_screens_lcars_151", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_152 = new BlockBase("lcars_screens_lcars_152", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_153 = new BlockBase("lcars_screens_lcars_153", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_154 = new BlockBase("lcars_screens_lcars_154", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_155 = new BlockBase("lcars_screens_lcars_155", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_156 = new BlockBase("lcars_screens_lcars_156", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_157 = new BlockBase("lcars_screens_lcars_157", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_158 = new BlockBase("lcars_screens_lcars_158", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_159 = new BlockBase("lcars_screens_lcars_159", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_160 = new BlockBase("lcars_screens_lcars_160", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_161 = new BlockBase("lcars_screens_lcars_161", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_162 = new BlockBase("lcars_screens_lcars_162", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_163 = new BlockBase("lcars_screens_lcars_163", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_164 = new BlockBase("lcars_screens_lcars_164", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_165 = new BlockBase("lcars_screens_lcars_165", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_166 = new BlockBase("lcars_screens_lcars_166", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_167 = new BlockBase("lcars_screens_lcars_167", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_168 = new BlockBase("lcars_screens_lcars_168", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_169 = new BlockBase("lcars_screens_lcars_169", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_170 = new BlockBase("lcars_screens_lcars_170", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_171 = new BlockBase("lcars_screens_lcars_171", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_172 = new BlockBase("lcars_screens_lcars_172", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_173 = new BlockBase("lcars_screens_lcars_173", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_174 = new BlockBase("lcars_screens_lcars_174", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_175 = new BlockBase("lcars_screens_lcars_175", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_176 = new BlockBase("lcars_screens_lcars_176", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_177 = new BlockBase("lcars_screens_lcars_177", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_178 = new BlockBase("lcars_screens_lcars_178", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_179 = new BlockBase("lcars_screens_lcars_179", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_180 = new BlockBase("lcars_screens_lcars_180", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_181 = new BlockBase("lcars_screens_lcars_181", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_182 = new BlockBase("lcars_screens_lcars_182", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_183 = new BlockBase("lcars_screens_lcars_183", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_184 = new BlockBase("lcars_screens_lcars_184", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_185 = new BlockBase("lcars_screens_lcars_185", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_186 = new BlockBase("lcars_screens_lcars_186", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_187 = new BlockBase("lcars_screens_lcars_187", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_188 = new BlockBase("lcars_screens_lcars_188", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_189 = new BlockBase("lcars_screens_lcars_189", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_190 = new BlockBase("lcars_screens_lcars_190", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_191 = new BlockBase("lcars_screens_lcars_191", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_192 = new BlockBase("lcars_screens_lcars_192", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_193 = new BlockBase("lcars_screens_lcars_193", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_194 = new BlockBase("lcars_screens_lcars_194", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_SCREENS_LCARS_195 = new BlockBase("lcars_screens_lcars_195", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);

	public static final Block LCARS_SCREENS_LCARS_HOLO_1 = new BlockGlass("lcars_screens_lcars_holo_1", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	public static final Block LCARS_SCREENS_LCARS_HOLO_2 = new BlockGlass("lcars_screens_lcars_holo_2", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	public static final Block LCARS_SCREENS_LCARS_HOLO_3 = new BlockGlass("lcars_screens_lcars_holo_3", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	public static final Block LCARS_SCREENS_LCARS_HOLO_4 = new BlockGlass("lcars_screens_lcars_holo_4", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	public static final Block LCARS_SCREENS_LCARS_HOLO_5 = new BlockGlass("lcars_screens_lcars_holo_5", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	public static final Block LCARS_SCREENS_LCARS_HOLO_6 = new BlockGlass("lcars_screens_lcars_holo_6", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	public static final Block LCARS_SCREENS_LCARS_HOLO_7 = new BlockGlass("lcars_screens_lcars_holo_7", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	public static final Block LCARS_SCREENS_LCARS_HOLO_8 = new BlockGlass("lcars_screens_lcars_holo_8", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	public static final Block LCARS_SCREENS_LCARS_HOLO_9 = new BlockGlass("lcars_screens_lcars_holo_9", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	public static final Block LCARS_SCREENS_LCARS_HOLO_10 = new BlockGlass("lcars_screens_lcars_holo_10", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	public static final Block LCARS_SCREENS_LCARS_HOLO_11 = new BlockGlass("lcars_screens_lcars_holo_11", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	public static final Block LCARS_SCREENS_LCARS_HOLO_12 = new BlockGlass("lcars_screens_lcars_holo_12", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	public static final Block LCARS_SCREENS_LCARS_HOLO_13 = new BlockGlass("lcars_screens_lcars_holo_13", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	public static final Block LCARS_SCREENS_LCARS_HOLO_14 = new BlockGlass("lcars_screens_lcars_holo_14", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	public static final Block LCARS_SCREENS_LCARS_HOLO_15 = new BlockGlass("lcars_screens_lcars_holo_15", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	public static final Block LCARS_SCREENS_LCARS_HOLO_16 = new BlockGlass("lcars_screens_lcars_holo_16", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	public static final Block LCARS_SCREENS_LCARS_HOLO_17 = new BlockGlass("lcars_screens_lcars_holo_17", Material.GLASS, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.GLASS);
	//
	/* LCARS ENTERPRISE CONSOLES - MUFFINS */
	public static final Block LCARS_ENT_CONSOLES_MUFFINS_ENT_CONSOLES_1 = new BlockBase("lcars_ent_consoles_muffins_ent_console_1", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_ENT_CONSOLES_MUFFINS_ENT_CONSOLES_2 = new BlockBase("lcars_ent_consoles_muffins_ent_console_2", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_ENT_CONSOLES_MUFFINS_ENT_CONSOLES_3 = new BlockBase("lcars_ent_consoles_muffins_ent_console_3", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_ENT_CONSOLES_MUFFINS_ENT_CONSOLES_4 = new BlockBase("lcars_ent_consoles_muffins_ent_console_4", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_ENT_CONSOLES_MUFFINS_ENT_CONSOLES_5 = new BlockBase("lcars_ent_consoles_muffins_ent_console_5", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_ENT_CONSOLES_MUFFINS_ENT_CONSOLES_6 = new BlockBase("lcars_ent_consoles_muffins_ent_console_6", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_ENT_CONSOLES_MUFFINS_ENT_CONSOLES_7 = new BlockBase("lcars_ent_consoles_muffins_ent_console_7", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_ENT_CONSOLES_MUFFINS_ENT_CONSOLES_8 = new BlockBase("lcars_ent_consoles_muffins_ent_console_8", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_ENT_CONSOLES_MUFFINS_ENT_CONSOLES_9 = new BlockBase("lcars_ent_consoles_muffins_ent_console_9", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_ENT_CONSOLES_MUFFINS_ENT_CONSOLES_10 = new BlockBase("lcars_ent_consoles_muffins_ent_console_10", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_ENT_CONSOLES_MUFFINS_ENT_CONSOLES_11 = new BlockBase("lcars_ent_consoles_muffins_ent_console_11", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_ENT_CONSOLES_MUFFINS_ENT_CONSOLES_12 = new BlockBase("lcars_ent_consoles_muffins_ent_console_12", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_ENT_CONSOLES_MUFFINS_ENT_CONSOLES_13 = new BlockBase("lcars_ent_consoles_muffins_ent_console_13", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_ENT_CONSOLES_MUFFINS_ENT_CONSOLES_14 = new BlockBase("lcars_ent_consoles_muffins_ent_console_14", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_ENT_CONSOLES_MUFFINS_ENT_CONSOLES_15 = new BlockBase("lcars_ent_consoles_muffins_ent_console_15", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_ENT_CONSOLES_MUFFINS_ENT_CONSOLES_16 = new BlockBase("lcars_ent_consoles_muffins_ent_console_16", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	//
	/* LCARS TMP CONSOLES - MUFFINS */
	public static final Block LCARS_TMP_CONSOLES_MUFFINS_TMP_CONSOLE_1 = new BlockBase("lcars_tmp_consoles_muffins_tmp_console_1", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TMP_CONSOLES_MUFFINS_TMP_CONSOLE_2 = new BlockBase("lcars_tmp_consoles_muffins_tmp_console_2", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TMP_CONSOLES_MUFFINS_TMP_CONSOLE_3 = new BlockBase("lcars_tmp_consoles_muffins_tmp_console_3", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TMP_CONSOLES_MUFFINS_TMP_CONSOLE_4 = new BlockBase("lcars_tmp_consoles_muffins_tmp_console_4", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TMP_CONSOLES_MUFFINS_TMP_CONSOLE_5 = new BlockBase("lcars_tmp_consoles_muffins_tmp_console_5", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TMP_CONSOLES_MUFFINS_TMP_CONSOLE_6 = new BlockBase("lcars_tmp_consoles_muffins_tmp_console_6", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TMP_CONSOLES_MUFFINS_TMP_CONSOLE_7 = new BlockBase("lcars_tmp_consoles_muffins_tmp_console_7", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TMP_CONSOLES_MUFFINS_TMP_CONSOLE_8 = new BlockBase("lcars_tmp_consoles_muffins_tmp_console_8", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	//
	/* LCARS TNG CONSOLES - MUFFINS */
	public static final Block LCARS_TNG_CONSOLES_MUFFINS_TNG_CONSOLE_1 = new BlockBase("lcars_tng_consoles_muffins_tng_console_1", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TNG_CONSOLES_MUFFINS_TNG_CONSOLE_2 = new BlockBase("lcars_tng_consoles_muffins_tng_console_2", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TNG_CONSOLES_MUFFINS_TNG_CONSOLE_3 = new BlockBase("lcars_tng_consoles_muffins_tng_console_3", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TNG_CONSOLES_MUFFINS_TNG_CONSOLE_4 = new BlockBase("lcars_tng_consoles_muffins_tng_console_4", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TNG_CONSOLES_MUFFINS_TNG_CONSOLE_5 = new BlockBase("lcars_tng_consoles_muffins_tng_console_5", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TNG_CONSOLES_MUFFINS_TNG_CONSOLE_6 = new BlockBase("lcars_tng_consoles_muffins_tng_console_6", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TNG_CONSOLES_MUFFINS_TNG_CONSOLE_7 = new BlockBase("lcars_tng_consoles_muffins_tng_console_7", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TNG_CONSOLES_MUFFINS_TNG_CONSOLE_8 = new BlockBase("lcars_tng_consoles_muffins_tng_console_8", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TNG_CONSOLES_MUFFINS_TNG_CONSOLE_9 = new BlockBase("lcars_tng_consoles_muffins_tng_console_9", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TNG_CONSOLES_MUFFINS_TNG_CONSOLE_10 = new BlockBase("lcars_tng_consoles_muffins_tng_console_10", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TNG_CONSOLES_MUFFINS_TNG_CONSOLE_11 = new BlockBase("lcars_tng_consoles_muffins_tng_console_11", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TNG_CONSOLES_MUFFINS_TNG_CONSOLE_12 = new BlockBase("lcars_tng_consoles_muffins_tng_console_12", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TNG_CONSOLES_MUFFINS_TNG_CONSOLE_13 = new BlockBase("lcars_tng_consoles_muffins_tng_console_13", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_TNG_CONSOLES_MUFFINS_TNG_CONSOLE_14 = new BlockBase("lcars_tng_consoles_muffins_tng_console_14", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	//
	/* LCARS MORE LCARS CONSOLES - MUFFINS */
	public static final Block LCARS_MORE_LCARS_CONSOLES_MUFFINS_CONSOLE_1 = new BlockBase("lcars_more_lcars_consoles_muffins_console_1", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_MORE_LCARS_CONSOLES_MUFFINS_CONSOLE_2 = new BlockBase("lcars_more_lcars_consoles_muffins_console_2", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_MORE_LCARS_CONSOLES_MUFFINS_CONSOLE_3 = new BlockBase("lcars_more_lcars_consoles_muffins_console_3", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_MORE_LCARS_CONSOLES_MUFFINS_CONSOLE_4 = new BlockBase("lcars_more_lcars_consoles_muffins_console_4", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_MORE_LCARS_CONSOLES_MUFFINS_CONSOLE_5 = new BlockBase("lcars_more_lcars_consoles_muffins_console_5", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_MORE_LCARS_CONSOLES_MUFFINS_CONSOLE_6 = new BlockBase("lcars_more_lcars_consoles_muffins_console_6", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_MORE_LCARS_CONSOLES_MUFFINS_CONSOLE_7 = new BlockBase("lcars_more_lcars_consoles_muffins_console_7", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_MORE_LCARS_CONSOLES_MUFFINS_CONSOLE_8 = new BlockBase("lcars_more_lcars_consoles_muffins_console_8", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_MORE_LCARS_CONSOLES_MUFFINS_CONSOLE_9 = new BlockBase("lcars_more_lcars_consoles_muffins_console_9", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_MORE_LCARS_CONSOLES_MUFFINS_CONSOLE_10 = new BlockBase("lcars_more_lcars_consoles_muffins_console_10", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_MORE_LCARS_CONSOLES_MUFFINS_CONSOLE_11 = new BlockBase("lcars_more_lcars_consoles_muffins_console_11", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_MORE_LCARS_CONSOLES_MUFFINS_CONSOLE_12 = new BlockBase("lcars_more_lcars_consoles_muffins_console_12", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_MORE_LCARS_CONSOLES_MUFFINS_CONSOLE_13 = new BlockBase("lcars_more_lcars_consoles_muffins_console_13", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_MORE_LCARS_CONSOLES_MUFFINS_CONSOLE_14 = new BlockBase("lcars_more_lcars_consoles_muffins_console_14", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	public static final Block LCARS_MORE_LCARS_CONSOLES_MUFFINS_CONSOLE_15 = new BlockBase("lcars_more_lcars_consoles_muffins_console_15", Material.IRON, MineTrekMod.TAB_LCARS, 1.0f, 0, SoundType.METAL);
	//
	//
	/*
	 * NEW 2.0.0 ROOM BLOCKS
	 */
	/* ROOM BLOCKS - CARGO */
	public static final Block ROOM_BLOCKS_CARGO_DOOR_1 = new BlockBase("room_blocks_cargo_door_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
    //
    /* ROOM BLOCKS - COMPUTER */
	public static final Block ROOM_BLOCKS_COMPUTER_CORE_BACKPANEL_1 = new BlockBase("room_blocks_computer_core_backpanel_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_COMPUTER_CORE_WALL_1 = new BlockBase("room_blocks_computer_core_wall_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_COMPUTER_CORE_WALL_2 = new BlockBase("room_blocks_computer_core_wall_2", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_COMPUTER_ISOLINEAR_BOARD_1 = new BlockBase("room_blocks_computer_isolinear_board_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
    //
    /* ROOM BLOCKS - JT MACHINERY */
	public static final Block ROOM_BLOCKS_JT_MACHINERY_METAL_CIRCLES_1 = new BlockBase("room_blocks_jt_machinery_metal_circles_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_JT_MACHINERY_METAL_RECTANGLES_1 = new BlockBase("room_blocks_jt_machinery_metal_rectangles_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_JT_MACHINERY_METAL_WALL_1 = new BlockBase("room_blocks_jt_machinery_metal_wall_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_JT_MACHINERY_METAL_WALL_2 = new BlockBase("room_blocks_jt_machinery_metal_wall_2", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_JT_MACHINERY_METAL_WALL_PANEL_1 = new BlockBase("room_blocks_jt_machinery_metal_wall_panel_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_JT_MACHINERY_SYSTEMS_WALL_LEFT_1 = new BlockBase("room_blocks_jt_machinery_systems_wall_left_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_JT_MACHINERY_SYSTEMS_WALL_RIGHT_1 = new BlockBase("room_blocks_jt_machinery_systems_wall_right_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_JT_MACHINERY_VENT_1 = new BlockBase("room_blocks_jt_machinery_vent_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	//
    /* ROOM BLOCKS - KITCHEN */
	public static final Block ROOM_BLOCKS_KITCHEN_CABINET_1 = new BlockBase("room_blocks_kitchen_cabinet_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_KITCHEN_CABINET_2 = new BlockBase("room_blocks_kitchen_cabinet_2", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_KITCHEN_CABINET_3 = new BlockBase("room_blocks_kitchen_cabinet_3", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_KITCHEN_CABINET_TOP_1 = new BlockBase("room_blocks_kitchen_cabinet_top_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_KITCHEN_FRIDGE_LOWER_1 = new BlockBase("room_blocks_kitchen_fridge_lower_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_KITCHEN_FRIDGE_UPPER_1 = new BlockBase("room_blocks_kitchen_fridge_upper_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_KITCHEN_MICROWAVE_1 = new BlockBase("room_blocks_kitchen_microwave_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_KITCHEN_OVEN_FRONT_1 = new BlockBase("room_blocks_kitchen_oven_front_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_KITCHEN_OVEN_TOP_1 = new BlockFacing("room_blocks_kitchen_oven_top_1", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	//
    /* ROOM BLOCKS - LOUNGE */
	public static final Block ROOM_BLOCKS_LOUNGE_MIDDLE_BASE = new BlockBase("room_blocks_lounge_middle_base", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
    public static final Block ROOM_BLOCKS_LOUNGE_MIDDLE_LIGHT_BLUE = new BlockBase("room_blocks_lounge_middle_light_blue", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_LOUNGE_MIDDLE_LIGHT_GREEN = new BlockBase("room_blocks_lounge_middle_light_green", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_LOUNGE_MIDDLE_LIGHT_ORANGE = new BlockBase("room_blocks_lounge_middle_light_orange", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_LOUNGE_MIDDLE_LIGHT_PURPLE = new BlockBase("room_blocks_lounge_middle_light_purple", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_LOUNGE_MIDDLE_LIGHT_RED = new BlockBase("room_blocks_lounge_middle_light_red", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_LOUNGE_MIDDLE_LIGHT_YELLOW = new BlockBase("room_blocks_lounge_middle_light_yellow", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	//
    /* ROOM BLOCKS - MOSAIC */
	public static final Block ROOM_BLOCKS_MOSAICS_BLUE = new BlockBase("room_blocks_mosaics_blue", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_MOSAICS_GRAY = new BlockBase("room_blocks_mosaics_gray", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_MOSAICS_PINK = new BlockBase("room_blocks_mosaics_pink", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_MOSAICS_SEA_GREEN = new BlockBase("room_blocks_mosaics_sea_green", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_MOSAICS_SEA_PURPLE = new BlockBase("room_blocks_mosaics_sea_purple", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	//
    /* ROOM BLOCKS - PATTERNS */
	public static final Block ROOM_BLOCKS_PATTERNS_MIDDLE_BASE = new BlockBase("room_blocks_patterns_middle_base", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_PATTERNS_MIDDLE_BLUE = new BlockBase("room_blocks_patterns_middle_blue", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_PATTERNS_MIDDLE_CYAN = new BlockBase("room_blocks_patterns_middle_cyan", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_PATTERNS_MIDDLE_DARK_BLUE = new BlockBase("room_blocks_patterns_middle_dark_blue", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_PATTERNS_MIDDLE_DEEP_RED = new BlockBase("room_blocks_patterns_middle_deep_red", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_PATTERNS_MIDDLE_GREEN = new BlockBase("room_blocks_patterns_middle_green", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_PATTERNS_MIDDLE_ORANGE = new BlockBase("room_blocks_patterns_middle_orange", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_PATTERNS_MIDDLE_PURPLE = new BlockBase("room_blocks_patterns_middle_purple", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_PATTERNS_MIDDLE_RED = new BlockBase("room_blocks_patterns_middle_red", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_PATTERNS_MIDDLE_YELLOW = new BlockBase("room_blocks_patterns_middle_yellow", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	//
    /* ROOM BLOCKS - QUARTERS - CREAM */
	public static final Block ROOM_BLOCKS_QUARTERS_CREAM_FABRIC_BASE = new BlockBase("room_blocks_quarters_cream_fabric_base", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_CREAM_FABRIC_PANEL_DOUBLE = new BlockBase("room_blocks_quarters_cream_fabric_panel_double", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_CREAM_FABRIC_PANEL_HORIZONTAL = new BlockBase("room_blocks_quarters_cream_fabric_panel_horizontal", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_CREAM_FABRIC_PANEL = new BlockBase("room_blocks_quarters_cream_fabric_panel", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_CREAM_FABRIC_PLATE_DEFIANT = new BlockBase("room_blocks_quarters_cream_fabric_plate_defiant", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_CREAM_FABRIC_PLATE = new BlockBase("room_blocks_quarters_cream_fabric_plate", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_CREAM_FLAT_BASE = new BlockBase("room_blocks_quarters_cream_flat_base", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_CREAM_FLAT_PANEL_DOUBLE = new BlockBase("room_blocks_quarters_cream_flat_panel_double", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_CREAM_FLAT_PANEL_HORIZONTAL = new BlockBase("room_blocks_quarters_cream_flat_panel_horizontal", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_CREAM_FLAT_PANEL = new BlockBase("room_blocks_quarters_cream_flat_panel", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_CREAM_FLAT_PLATE_DEFIANT = new BlockBase("room_blocks_quarters_cream_flat_plate_defiant", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_CREAM_FLAT_PLATE = new BlockBase("room_blocks_quarters_cream_flat_plate", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	//
    /* ROOM BLOCKS - QUARTERS - GRAY */
	public static final Block ROOM_BLOCKS_QUARTERS_GRAY_FABRIC_BASE = new BlockBase("room_blocks_quarters_gray_fabric_base", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_GRAY_FABRIC_PANEL_DOUBLE = new BlockBase("room_blocks_quarters_gray_fabric_panel_double", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_GRAY_FABRIC_PANEL_HORIZONTAL = new BlockBase("room_blocks_quarters_gray_fabric_panel_horizontal", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_GRAY_FABRIC_PANEL = new BlockBase("room_blocks_quarters_gray_fabric_panel", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_GRAY_FABRIC_PLATE_DEFIANT = new BlockBase("room_blocks_quarters_gray_fabric_plate_defiant", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_GRAY_FABRIC_PLATE = new BlockBase("room_blocks_quarters_gray_fabric_plate", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_GRAY_FLAT_BASE = new BlockBase("room_blocks_quarters_gray_flat_base", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_GRAY_FLAT_PANEL_DOUBLE = new BlockBase("room_blocks_quarters_gray_flat_panel_double", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_GRAY_FLAT_PANEL_HORIZONTAL = new BlockBase("room_blocks_quarters_gray_flat_panel_horizontal", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_GRAY_FLAT_PANEL = new BlockBase("room_blocks_quarters_gray_flat_panel", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_GRAY_FLAT_PLATE_DEFIANT = new BlockBase("room_blocks_quarters_gray_flat_plate_defiant", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_GRAY_FLAT_PLATE = new BlockBase("room_blocks_quarters_gray_flat_plate", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	//
    /* ROOM BLOCKS - QUARTERS - PALE GRAY */
	public static final Block ROOM_BLOCKS_QUARTERS_PALE_GRAY_FABRIC_BASE = new BlockBase("room_blocks_quarters_pale_gray_fabric_base", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_PALE_GRAY_FABRIC_PANEL_DOUBLE = new BlockBase("room_blocks_quarters_pale_gray_fabric_panel_double", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_PALE_GRAY_FABRIC_PANEL_HORIZONTAL = new BlockBase("room_blocks_quarters_pale_gray_fabric_panel_horizontal", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_PALE_GRAY_FABRIC_PANEL = new BlockBase("room_blocks_quarters_pale_gray_fabric_panel", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_PALE_GRAY_FABRIC_PLATE_DEFIANT = new BlockBase("room_blocks_quarters_pale_gray_fabric_plate_defiant", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_PALE_GRAY_FABRIC_PLATE = new BlockBase("room_blocks_quarters_pale_gray_fabric_plate", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_PALE_GRAY_FLAT_BASE = new BlockBase("room_blocks_quarters_pale_gray_flat_base", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_PALE_GRAY_FLAT_PANEL_DOUBLE = new BlockBase("room_blocks_quarters_pale_gray_flat_panel_double", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_PALE_GRAY_FLAT_PANEL_HORIZONTAL = new BlockBase("room_blocks_quarters_pale_gray_flat_panel_horizontal", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_PALE_GRAY_FLAT_PANEL = new BlockBase("room_blocks_quarters_pale_gray_flat_panel", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_PALE_GRAY_FLAT_PLATE_DEFIANT = new BlockBase("room_blocks_quarters_pale_gray_flat_plate_defiant", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_QUARTERS_PALE_GRAY_FLAT_PLATE = new BlockBase("room_blocks_quarters_pale_gray_flat_plate", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	//
    /* ROOM BLOCKS - SICKBAY */
	public static final Block ROOM_BLOCKS_SICKBAY_MIDDLE_BASE = new BlockBase("room_blocks_sickbay_middle_base", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_SICKBAY_MIDDLE_CREAM = new BlockBase("room_blocks_sickbay_middle_cream", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_SICKBAY_MIDDLE_GRAY = new BlockBase("room_blocks_sickbay_middle_gray", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_SICKBAY_SIDE_BASE = new BlockBase("room_blocks_sickbay_side_base", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_SICKBAY_SIDE_CREAM = new BlockBase("room_blocks_sickbay_side_cream", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	public static final Block ROOM_BLOCKS_SICKBAY_SIDE_GRAY = new BlockBase("room_blocks_sickbay_side_gray", Material.IRON, MineTrekMod.TAB_MISC, 1.0f, 0, SoundType.METAL);
	//
	//
	/*
	 * NEW 2.0.0 TOS BLOCKS
	 */
	/* TOS BASE BLOCKS */
	public static final Block TOS_BASE_HULL_1 = new BlockBase("tos_base_hull_1", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_CONSOLE_1 = new BlockFacing("tos_console_1", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_CONSOLE_2 = new BlockFacing("tos_console_2", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_HULL_LINES_1 = new BlockBase("tos_hull_lines_1", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_PAINTING_1 = new BlockBase("tos_painting_1", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_STATUS_DISPLAY_1 = new BlockBase("tos_status_display_1", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_TRANSPORTER_CONSOLE_LEFT = new BlockFacing("tos_transporter_console_left", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_TRANSPORTER_CONSOLE_RIGHT = new BlockFacing("tos_transporter_console_right", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_TRANSPORTER_FLOOR = new BlockBase("tos_transporter_floor", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
    //
    /* TOS CORRIDOR INTERCOM - MUFFINS */
	public static final Block TOS_CORRIDOR_INTERCOM_MUFFINS_DOWN = new BlockBase("tos_corridor_intercom_muffins_down", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_CORRIDOR_INTERCOM_MUFFINS_EAST = new BlockBase("tos_corridor_intercom_muffins_east", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_CORRIDOR_INTERCOM_MUFFINS_NORTH = new BlockBase("tos_corridor_intercom_muffins_north", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_CORRIDOR_INTERCOM_MUFFINS_SOUTH = new BlockBase("tos_corridor_intercom_muffins_south", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_CORRIDOR_INTERCOM_MUFFINS_UP = new BlockBase("tos_corridor_intercom_muffins_up", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_CORRIDOR_INTERCOM_MUFFINS_WEST = new BlockBase("tos_corridor_intercom_muffins_west", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	//
    /* TOS CORRIDOR PLAIN - MUFFINS */
	public static final Block TOS_CORRIDOR_PLAIN_MUFFINS_DOWN = new BlockBase("tos_corridor_plain_muffins_down", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_CORRIDOR_PLAIN_MUFFINS_EAST = new BlockBase("tos_corridor_plain_muffins_east", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_CORRIDOR_PLAIN_MUFFINS_NORTH = new BlockBase("tos_corridor_plain_muffins_north", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_CORRIDOR_PLAIN_MUFFINS_SOUTH = new BlockBase("tos_corridor_plain_muffins_south", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_CORRIDOR_PLAIN_MUFFINS_UP = new BlockBase("tos_corridor_plain_muffins_up", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_CORRIDOR_PLAIN_MUFFINS_WEST = new BlockBase("tos_corridor_plain_muffins_west", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
    //
    /* TOS TRANSPORTER PAD - MUFFINS */
	public static final Block TOS_TRANSPORTER_PAD_MUFFINS_DOWN = new BlockBase("tos_transporter_pad_muffins_down", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_TRANSPORTER_PAD_MUFFINS_EAST = new BlockBase("tos_transporter_pad_muffins_east", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_TRANSPORTER_PAD_MUFFINS_NORTH = new BlockBase("tos_transporter_pad_muffins_north", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_TRANSPORTER_PAD_MUFFINS_SOUTH = new BlockBase("tos_transporter_pad_muffins_south", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_TRANSPORTER_PAD_MUFFINS_UP = new BlockBase("tos_transporter_pad_muffins_up", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_TRANSPORTER_PAD_MUFFINS_WEST = new BlockBase("tos_transporter_pad_muffins_west", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
    //
    /* TOS WALL 2 - MUFFINS */
	public static final Block TOS_WALL_2_MUFFINS_DOWN = new BlockBase("tos_wall_2_muffins_down", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_WALL_2_MUFFINS_EAST = new BlockBase("tos_wall_2_muffins_east", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_WALL_2_MUFFINS_NORTH = new BlockBase("tos_wall_2_muffins_north", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_WALL_2_MUFFINS_SOUTH = new BlockBase("tos_wall_2_muffins_south", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_WALL_2_MUFFINS_UP = new BlockBase("tos_wall_2_muffins_up", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_WALL_2_MUFFINS_WEST = new BlockBase("tos_wall_2_muffins_west", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
    //
    /* TOS WALL 3 - MUFFINS */
	public static final Block TOS_WALL_3_MUFFINS_DOWN = new BlockBase("tos_wall_3_muffins_down", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_WALL_3_MUFFINS_EAST = new BlockBase("tos_wall_3_muffins_east", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_WALL_3_MUFFINS_NORTH = new BlockBase("tos_wall_3_muffins_north", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_WALL_3_MUFFINS_SOUTH = new BlockBase("tos_wall_3_muffins_south", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_WALL_3_MUFFINS_UP = new BlockBase("tos_wall_3_muffins_up", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
	public static final Block TOS_WALL_3_MUFFINS_WEST = new BlockBase("tos_wall_3_muffins_west", Material.IRON, MineTrekMod.TAB_TOS, 1.0f, 0, SoundType.METAL);
    //
	//
	/*
	 * NEW 2.0.0 VOYAGER BLOCKS
	 */
	/* VOYAGER BASE BLOCKS */
	public static final Block VOY_CORRIDOR_BOTTOM_1 = new BlockBase("voy_corridor_bottom_1", Material.IRON, MineTrekMod.TAB_VOY, 1.0f, 0, SoundType.METAL);
	public static final Block VOY_CORRIDOR_BOTTOM_INTERSECTION_1 = new BlockBase("voy_corridor_bottom_intersection_1", Material.IRON, MineTrekMod.TAB_VOY, 1.0f, 0, SoundType.METAL);
	public static final Block VOY_CORRIDOR_MIDDLE_1 = new BlockBase("voy_corridor_middle_1", Material.IRON, MineTrekMod.TAB_VOY, 1.0f, 0, SoundType.METAL);
	public static final Block VOY_CORRIDOR_MIDDLE_INTERSECTION_1 = new BlockBase("voy_corridor_middle_intersection_1", Material.IRON, MineTrekMod.TAB_VOY, 1.0f, 0, SoundType.METAL);
	public static final Block VOY_CORRIDOR_MIDDLE_INTERSECTION_SCREEN_1 = new BlockBase("voy_corridor_middle_intersection_screen_1", Material.IRON, MineTrekMod.TAB_VOY, 1.0f, 0, SoundType.METAL);
	public static final Block VOY_CORRIDOR_MIDDLE_WITH_SPLIT_1 = new BlockBase("voy_corridor_middle_with_split_1", Material.IRON, MineTrekMod.TAB_VOY, 1.0f, 0, SoundType.METAL);
	public static final Block VOY_CORRIDOR_TOP_1 = new BlockBase("voy_corridor_top_1", Material.IRON, MineTrekMod.TAB_VOY, 1.0f, 0, SoundType.METAL);
    //
    /* VOYAGER JEFFERIES TUBE BLOCKS */
	public static final Block VOY_JT_LOWER_1 = new BlockBase("voy_jt_lower_1", Material.IRON, MineTrekMod.TAB_VOY, 1.0f, 0, SoundType.METAL);
	public static final Block VOY_JT_UPPER_1 = new BlockBase("voy_jt_upper_1", Material.IRON, MineTrekMod.TAB_VOY, 1.0f, 0, SoundType.METAL);
    //
	//
	/*
	 * NEW 2.0.0 TNG MOVIES BLOCKS
	 */
	/* TNG MOVIES JEFFERIES TUBE BLOCKS */
	public static final Block TNG_MOVIES_JT_BLOCKS_ENTE_JT_TRUNK_1 = new BlockBase("tng_movies_jt_blocks_ente_jt_trunk_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_ENTE_JT_TRUNK_2 = new BlockBase("tng_movies_jt_blocks_ente_jt_trunk_2", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_ENTE_JT_TRUNK_3 = new BlockBase("tng_movies_jt_blocks_ente_jt_trunk_3", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_JT_TUBE_1 = new BlockBase("tng_movies_jt_blocks_sov_jt_tube_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_JT_TUBE_EDGE_1 = new BlockBase("tng_movies_jt_blocks_sov_jt_tube_edge_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_JT_TUBE_EDGE_GOLD_TAG_1 = new BlockBase("tng_movies_jt_blocks_sov_jt_tube_edge_gold_tag_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_JT_TUBE_EDGE_RED_TAG_1 = new BlockBase("tng_movies_jt_blocks_sov_jt_tube_edge_red_tag_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_JT_TUBE_GOLD_TAG_1 = new BlockBase("tng_movies_jt_blocks_sov_jt_tube_gold_tag_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_JT_TUBE_RED_TAG_1 = new BlockBase("tng_movies_jt_blocks_sov_jt_tube_red_tag_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_LOWER_JT_CORRIDOR_1_BEIGE_ALT = new BlockBase("tng_movies_jt_blocks_sov_lower_jt_corridor_1_beige_alt", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_LOWER_JT_CORRIDOR_1_BEIGE = new BlockBase("tng_movies_jt_blocks_sov_lower_jt_corridor_1_beige", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_LOWER_JT_CORRIDOR_1_GRAY_ALT = new BlockBase("tng_movies_jt_blocks_sov_lower_jt_corridor_1_gray_alt", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_LOWER_JT_CORRIDOR_1_GRAY = new BlockBase("tng_movies_jt_blocks_sov_lower_jt_corridor_1_gray", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_LOWER_JT_CORRIDOR_2_BEIGE = new BlockBase("tng_movies_jt_blocks_sov_lower_jt_corridor_2_beige", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_LOWER_JT_CORRIDOR_2_GRAY = new BlockBase("tng_movies_jt_blocks_sov_lower_jt_corridor_2_gray", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_LOWER_JT_CORRIDOR_3_BEIGE_ALT = new BlockBase("tng_movies_jt_blocks_sov_lower_jt_corridor_3_beige_alt", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_LOWER_JT_CORRIDOR_3_BEIGE = new BlockBase("tng_movies_jt_blocks_sov_lower_jt_corridor_3_beige", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_LOWER_JT_CORRIDOR_3_GRAY_ALT = new BlockBase("tng_movies_jt_blocks_sov_lower_jt_corridor_3_gray_alt", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_LOWER_JT_CORRIDOR_3_GRAY = new BlockBase("tng_movies_jt_blocks_sov_lower_jt_corridor_3_gray", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_UPPER_JT_CORRIDOR_1_BEIGE = new BlockBase("tng_movies_jt_blocks_sov_upper_jt_corridor_1_beige", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_UPPER_JT_CORRIDOR_1_GRAY = new BlockBase("tng_movies_jt_blocks_sov_upper_jt_corridor_1_gray", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_UPPER_JT_CORRIDOR_2_BEIGE = new BlockBase("tng_movies_jt_blocks_sov_upper_jt_corridor_2_beige", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_UPPER_JT_CORRIDOR_2_GRAY = new BlockBase("tng_movies_jt_blocks_sov_upper_jt_corridor_2_gray", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_UPPER_JT_CORRIDOR_3_BEIGE_ALT = new BlockBase("tng_movies_jt_blocks_sov_upper_jt_corridor_3_beige_alt", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_UPPER_JT_CORRIDOR_3_BEIGE = new BlockBase("tng_movies_jt_blocks_sov_upper_jt_corridor_3_beige", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_UPPER_JT_CORRIDOR_3_GRAY_ALT = new BlockBase("tng_movies_jt_blocks_sov_upper_jt_corridor_3_gray_alt", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_JT_BLOCKS_SOV_UPPER_JT_CORRIDOR_3_GRAY = new BlockBase("tng_movies_jt_blocks_sov_upper_jt_corridor_3_gray", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
    //	
    /* TNG MOVIES SOVEREIGN CORRIDOR BLOCKS */
	public static final Block TNG_MOVIES_SOV_BASE_1 = new BlockBase("tng_movies_sov_base_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_BEIGE_BASE_1 = new BlockBase("tng_movies_sov_beige_base_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_BEIGE_LIGHT_1 = new BlockBase("tng_movies_sov_beige_light_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_BEIGE_LIGHT_LEFT_1 = new BlockBase("tng_movies_sov_beige_light_left_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_BEIGE_LIGHT_RIGHT_1 = new BlockBase("tng_movies_sov_beige_light_right_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_BEIGE_PLATE_1 = new BlockBase("tng_movies_sov_beige_plate_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_GRAY_BASE_1 = new BlockBase("tng_movies_sov_gray_base_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_GRAY_LIGHT_1 = new BlockBase("tng_movies_sov_gray_light_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_GRAY_LIGHT_LEFT_1 = new BlockBase("tng_movies_sov_gray_light_left_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_GRAY_LIGHT_RIGHT_1 = new BlockBase("tng_movies_sov_gray_light_right_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_GRAY_PLATE_1 = new BlockBase("tng_movies_sov_gray_plate_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_FLAT_CORRIDOR_LEFT_1 = new BlockBase("tng_movies_sov_lower_flat_corridor_left_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_FLAT_CORRIDOR_LEFT_ROSS_1 = new BlockBase("tng_movies_sov_lower_flat_corridor_left_ross_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_FLAT_CORRIDOR_LEFT_ROSS_2 = new BlockBase("tng_movies_sov_lower_flat_corridor_left_ross_2", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_FLAT_CORRIDOR_LEFT_ROSS_3 = new BlockBase("tng_movies_sov_lower_flat_corridor_left_ross_3", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_FLAT_CORRIDOR_LEFT_ROSS_4 = new BlockBase("tng_movies_sov_lower_flat_corridor_left_ross_4", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_FLAT_CORRIDOR_MIDDLE_1 = new BlockBase("tng_movies_sov_lower_flat_corridor_middle_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_FLAT_CORRIDOR_MIDDLE_ROSS_1 = new BlockBase("tng_movies_sov_lower_flat_corridor_middle_ross_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_FLAT_CORRIDOR_MIDDLE_ROSS_2 = new BlockBase("tng_movies_sov_lower_flat_corridor_middle_ross_2", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_FLAT_CORRIDOR_MIDDLE_ROSS_3 = new BlockBase("tng_movies_sov_lower_flat_corridor_middle_ross_3", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_FLAT_CORRIDOR_MIDDLE_ROSS_4 = new BlockBase("tng_movies_sov_lower_flat_corridor_middle_ross_4", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_FLAT_CORRIDOR_RIGHT_1 = new BlockBase("tng_movies_sov_lower_flat_corridor_right_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_FLAT_CORRIDOR_RIGHT_ROSS_1 = new BlockBase("tng_movies_sov_lower_flat_corridor_right_ross_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_FLAT_CORRIDOR_RIGHT_ROSS_2 = new BlockBase("tng_movies_sov_lower_flat_corridor_right_ross_2", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_FLAT_CORRIDOR_RIGHT_ROSS_3 = new BlockBase("tng_movies_sov_lower_flat_corridor_right_ross_3", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_FLAT_CORRIDOR_RIGHT_ROSS_4 = new BlockBase("tng_movies_sov_lower_flat_corridor_right_ross_4", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_INNER_CORRIDOR_CENTER_1 = new BlockBase("tng_movies_sov_lower_inner_corridor_center_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_INNER_CORRIDOR_LEFT_1 = new BlockBase("tng_movies_sov_lower_inner_corridor_left_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_INNER_CORRIDOR_RIGHT_1 = new BlockBase("tng_movies_sov_lower_inner_corridor_right_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_OUTER_CORRIDOR_CENTER_1 = new BlockBase("tng_movies_sov_lower_outer_corridor_center_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_OUTER_CORRIDOR_JT_LEFT_1 = new BlockBase("tng_movies_sov_lower_outer_corridor_jt_left_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_OUTER_CORRIDOR_JT_RIGHT_1 = new BlockBase("tng_movies_sov_lower_outer_corridor_jt_right_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_OUTER_CORRIDOR_LEFT_1 = new BlockBase("tng_movies_sov_lower_outer_corridor_left_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_LOWER_OUTER_CORRIDOR_RIGHT_1 = new BlockBase("tng_movies_sov_lower_outer_corridor_right_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_UPPER_FLAT_CORRIDOR_CONSOLE_ROSS_1 = new BlockBase("tng_movies_sov_upper_flat_corridor_console_ross_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_UPPER_FLAT_CORRIDOR_CONSOLE_ROSS_2 = new BlockBase("tng_movies_sov_upper_flat_corridor_console_ross_2", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_UPPER_FLAT_CORRIDOR_CONSOLE_ROSS_3 = new BlockBase("tng_movies_sov_upper_flat_corridor_console_ross_3", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_UPPER_FLAT_CORRIDOR_CONSOLE_ROSS_4 = new BlockBase("tng_movies_sov_upper_flat_corridor_console_ross_4", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_UPPER_FLAT_CORRIDOR_LEFT_1 = new BlockBase("tng_movies_sov_upper_flat_corridor_left_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_UPPER_FLAT_CORRIDOR_MIDDLE_1 = new BlockBase("tng_movies_sov_upper_flat_corridor_middle_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_UPPER_FLAT_CORRIDOR_RIGHT_1 = new BlockBase("tng_movies_sov_upper_flat_corridor_right_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_UPPER_FLAT_CORRIDOR_ROSS_1 = new BlockBase("tng_movies_sov_upper_flat_corridor_ross_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_UPPER_FLAT_CORRIDOR_ROSS_2 = new BlockBase("tng_movies_sov_upper_flat_corridor_ross_2", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_UPPER_FLAT_CORRIDOR_ROSS_3 = new BlockBase("tng_movies_sov_upper_flat_corridor_ross_3", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_UPPER_FLAT_CORRIDOR_ROSS_4 = new BlockBase("tng_movies_sov_upper_flat_corridor_ross_4", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_UPPER_INNER_CORRIDOR_1 = new BlockBase("tng_movies_sov_upper_inner_corridor_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_UPPER_INNER_CORRIDOR_SCREEN_1 = new BlockBase("tng_movies_sov_upper_inner_corridor_screen_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_UPPER_OUTER_CORRIDOR_1 = new BlockBase("tng_movies_sov_upper_outer_corridor_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_UPPER_OUTER_CORRIDOR_JT_LEFT_1 = new BlockBase("tng_movies_sov_upper_outer_corridor_jt_left_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_MOVIES_SOV_UPPER_OUTER_CORRIDOR_JT_RIGHT_1 = new BlockBase("tng_movies_sov_upper_outer_corridor_jt_right_1", Material.IRON, MineTrekMod.TAB_TNG_MOVIES, 1.0f, 0, SoundType.METAL);
    //	
	//
	/*
	 * NEW 2.0.0 TMP BLOCKS
	 */
	/* TMP CORRIDOR - CUSHIONED BLOCKS */
	public static final Block TMP_CUSHIONED_BLUE_1 = new BlockBase("tmp_cushioned_blue_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_BLUE_2 = new BlockBase("tmp_cushioned_blue_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_BLUE_3 = new BlockBase("tmp_cushioned_blue_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_BLUE_4 = new BlockBase("tmp_cushioned_blue_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_BLUE_5 = new BlockBase("tmp_cushioned_blue_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_BROWN_1 = new BlockBase("tmp_cushioned_brown_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_BROWN_2 = new BlockBase("tmp_cushioned_brown_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_BROWN_3 = new BlockBase("tmp_cushioned_brown_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_BROWN_4 = new BlockBase("tmp_cushioned_brown_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_BROWN_5 = new BlockBase("tmp_cushioned_brown_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_GRAY_1 = new BlockBase("tmp_cushioned_gray_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_GRAY_2 = new BlockBase("tmp_cushioned_gray_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_GRAY_3 = new BlockBase("tmp_cushioned_gray_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_GRAY_4 = new BlockBase("tmp_cushioned_gray_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_GRAY_5 = new BlockBase("tmp_cushioned_gray_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_LIGHT_BLUE_1 = new BlockBase("tmp_cushioned_light_blue_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_LIGHT_BLUE_2 = new BlockBase("tmp_cushioned_light_blue_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_LIGHT_BLUE_3 = new BlockBase("tmp_cushioned_light_blue_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_LIGHT_BLUE_4 = new BlockBase("tmp_cushioned_light_blue_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_LIGHT_BLUE_5 = new BlockBase("tmp_cushioned_light_blue_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_LIGHT_BLUE_6 = new BlockBase("tmp_cushioned_light_blue_6", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_LIGHT_BLUE_7 = new BlockBase("tmp_cushioned_light_blue_7", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_LIGHT_BLUE_8 = new BlockBase("tmp_cushioned_light_blue_8", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_MID_BLUE_1 = new BlockBase("tmp_cushioned_mid_blue_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_MID_BLUE_2 = new BlockBase("tmp_cushioned_mid_blue_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_MID_BLUE_3 = new BlockBase("tmp_cushioned_mid_blue_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_MID_BLUE_4 = new BlockBase("tmp_cushioned_mid_blue_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_MID_BLUE_5 = new BlockBase("tmp_cushioned_mid_blue_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_MID_BLUE_6 = new BlockBase("tmp_cushioned_mid_blue_6", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_MID_BLUE_7 = new BlockBase("tmp_cushioned_mid_blue_7", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_MID_BLUE_8 = new BlockBase("tmp_cushioned_mid_blue_8", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_ORANGE_1 = new BlockBase("tmp_cushioned_orange_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_ORANGE_2 = new BlockBase("tmp_cushioned_orange_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_ORANGE_3 = new BlockBase("tmp_cushioned_orange_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_ORANGE_4 = new BlockBase("tmp_cushioned_orange_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_ORANGE_5 = new BlockBase("tmp_cushioned_orange_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_RED_1 = new BlockBase("tmp_cushioned_red_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_RED_2 = new BlockBase("tmp_cushioned_red_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_RED_3 = new BlockBase("tmp_cushioned_red_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_RED_4 = new BlockBase("tmp_cushioned_red_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_RED_5 = new BlockBase("tmp_cushioned_red_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_WHITE_1 = new BlockBase("tmp_cushioned_white_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_WHITE_2 = new BlockBase("tmp_cushioned_white_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_WHITE_3 = new BlockBase("tmp_cushioned_white_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_WHITE_4 = new BlockBase("tmp_cushioned_white_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_WHITE_5 = new BlockBase("tmp_cushioned_white_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_YELLOW_1 = new BlockBase("tmp_cushioned_yellow_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_YELLOW_2 = new BlockBase("tmp_cushioned_yellow_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_YELLOW_3 = new BlockBase("tmp_cushioned_yellow_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_YELLOW_4 = new BlockBase("tmp_cushioned_yellow_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_CUSHIONED_YELLOW_5 = new BlockBase("tmp_cushioned_yellow_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
    /* TMP CORRIDOR - FLAT MATTE BLOCKS */
	public static final Block TMP_FLAT_MATTE_BLUE_1 = new BlockBase("tmp_flat_matte_blue_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_BLUE_2 = new BlockBase("tmp_flat_matte_blue_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_BLUE_3 = new BlockBase("tmp_flat_matte_blue_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_BLUE_4 = new BlockBase("tmp_flat_matte_blue_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_BLUE_5 = new BlockBase("tmp_flat_matte_blue_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_BROWN_1 = new BlockBase("tmp_flat_matte_brown_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_BROWN_2 = new BlockBase("tmp_flat_matte_brown_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_BROWN_3 = new BlockBase("tmp_flat_matte_brown_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_BROWN_4 = new BlockBase("tmp_flat_matte_brown_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_BROWN_5 = new BlockBase("tmp_flat_matte_brown_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_GRAY_1 = new BlockBase("tmp_flat_matte_gray_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_GRAY_2 = new BlockBase("tmp_flat_matte_gray_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_GRAY_3 = new BlockBase("tmp_flat_matte_gray_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_GRAY_4 = new BlockBase("tmp_flat_matte_gray_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_GRAY_5 = new BlockBase("tmp_flat_matte_gray_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_LIGHT_BLUE_1 = new BlockBase("tmp_flat_matte_light_blue_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_LIGHT_BLUE_2 = new BlockBase("tmp_flat_matte_light_blue_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_LIGHT_BLUE_3 = new BlockBase("tmp_flat_matte_light_blue_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_LIGHT_BLUE_4 = new BlockBase("tmp_flat_matte_light_blue_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_LIGHT_BLUE_5 = new BlockBase("tmp_flat_matte_light_blue_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_LIGHT_BLUE_6 = new BlockBase("tmp_flat_matte_light_blue_6", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_LIGHT_BLUE_7 = new BlockBase("tmp_flat_matte_light_blue_7", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_LIGHT_BLUE_8 = new BlockBase("tmp_flat_matte_light_blue_8", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_MID_BLUE_1 = new BlockBase("tmp_flat_matte_mid_blue_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_MID_BLUE_2 = new BlockBase("tmp_flat_matte_mid_blue_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_MID_BLUE_3 = new BlockBase("tmp_flat_matte_mid_blue_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_MID_BLUE_4 = new BlockBase("tmp_flat_matte_mid_blue_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_MID_BLUE_5 = new BlockBase("tmp_flat_matte_mid_blue_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_MID_BLUE_6 = new BlockBase("tmp_flat_matte_mid_blue_6", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_MID_BLUE_7 = new BlockBase("tmp_flat_matte_mid_blue_7", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_MID_BLUE_8 = new BlockBase("tmp_flat_matte_mid_blue_8", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_ORANGE_1 = new BlockBase("tmp_flat_matte_orange_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_ORANGE_2 = new BlockBase("tmp_flat_matte_orange_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_ORANGE_3 = new BlockBase("tmp_flat_matte_orange_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_ORANGE_4 = new BlockBase("tmp_flat_matte_orange_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_ORANGE_5 = new BlockBase("tmp_flat_matte_orange_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_RED_1 = new BlockBase("tmp_flat_matte_red_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_RED_2 = new BlockBase("tmp_flat_matte_red_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_RED_3 = new BlockBase("tmp_flat_matte_red_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_RED_4 = new BlockBase("tmp_flat_matte_red_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_RED_5 = new BlockBase("tmp_flat_matte_red_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_WHITE_1 = new BlockBase("tmp_flat_matte_white_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_WHITE_2 = new BlockBase("tmp_flat_matte_white_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_WHITE_3 = new BlockBase("tmp_flat_matte_white_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_WHITE_4 = new BlockBase("tmp_flat_matte_white_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_WHITE_5 = new BlockBase("tmp_flat_matte_white_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_YELLOW_1 = new BlockBase("tmp_flat_matte_yellow_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_YELLOW_2 = new BlockBase("tmp_flat_matte_yellow_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_YELLOW_3 = new BlockBase("tmp_flat_matte_yellow_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_YELLOW_4 = new BlockBase("tmp_flat_matte_yellow_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_FLAT_MATTE_YELLOW_5 = new BlockBase("tmp_flat_matte_yellow_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
    /* TMP JEFFERIES TUBE BLOCKS */
	public static final Block TMP_JT_LOWER_LEFT_1 = new BlockBase("tmp_jt_lower_left_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_JT_LOWER_MID_1 = new BlockBase("tmp_jt_lower_mid_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_JT_LOWER_RIGHT_1 = new BlockBase("tmp_jt_lower_right_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_JT_UPPER_LEFT_SCREEN_1 = new BlockBase("tmp_jt_upper_left_screen_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_JT_UPPER_LEFT_VENT = new BlockBase("tmp_jt_upper_left_vent_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_JT_UPPER_MID_1 = new BlockBase("tmp_jt_upper_mid_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_JT_UPPER_RIGHT_SCREEN_1 = new BlockBase("tmp_jt_upper_right_screen_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_JT_UPPER_RIGHT_VENT_1 = new BlockBase("tmp_jt_upper_right_vent_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
    /* TMP CORRIDOR - METAL BLOCKS */
	public static final Block TMP_METAL_METAL_1 = new BlockBase("tmp_metal_metal_1", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_METAL_METAL_2 = new BlockBase("tmp_metal_metal_2", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_METAL_METAL_3 = new BlockBase("tmp_metal_metal_3", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_METAL_METAL_4 = new BlockBase("tmp_metal_metal_4", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_METAL_METAL_5 = new BlockBase("tmp_metal_metal_5", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_METAL_METAL_6 = new BlockBase("tmp_metal_metal_6", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_METAL_METAL_7 = new BlockBase("tmp_metal_metal_7", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_METAL_METAL_8 = new BlockBase("tmp_metal_metal_8", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_METAL_METAL_9 = new BlockBase("tmp_metal_metal_9", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_METAL_METAL_10 = new BlockBase("tmp_metal_metal_10", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	public static final Block TMP_METAL_METAL_11 = new BlockBase("tmp_metal_metal_11", Material.IRON, MineTrekMod.TAB_MOVIES, 1.0f, 0, SoundType.METAL);
	//
	//
	/*
	 * NEW 2.0.0 TNG BLOCKS
	 */
	//
	//*//* TNG CORRIDOR - CUSHIONED BLOCKS *//*//
	//
	/* TNG CUSHIONED - BLUE */
	public static final Block TNG_CUSHIONED_BLUE_BASE_LOWER = new BlockBase("tng_cushioned_blue_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_BASE = new BlockBase("tng_cushioned_blue_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_cushioned_blue_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_cushioned_blue_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_LOWER_ANGLED_WALL = new BlockBase("tng_cushioned_blue_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_cushioned_blue_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_blue_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_cushioned_blue_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_blue_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_LOWER_FLAT_WALL = new BlockBase("tng_cushioned_blue_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_PANEL_LOWER = new BlockBase("tng_cushioned_blue_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_PANEL = new BlockBase("tng_cushioned_blue_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_cushioned_blue_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_UPPER_ANGLED_WALL = new BlockBase("tng_cushioned_blue_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_cushioned_blue_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_cushioned_blue_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_cushioned_blue_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_cushioned_blue_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_UPPER_FLAT_WALL_ALT = new BlockBase("tng_cushioned_blue_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_cushioned_blue_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_blue_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_cushioned_blue_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_cushioned_blue_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_blue_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BLUE_UPPER_FLAT_WALL_ = new BlockBase("tng_cushioned_blue_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
    /* TNG CUSHIONED - BROWN */
	public static final Block TNG_CUSHIONED_BROWN_BASE_LOWER = new BlockBase("tng_cushioned_brown_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_BASE = new BlockBase("tng_cushioned_brown_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_cushioned_brown_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_cushioned_brown_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_LOWER_ANGLED_WALL = new BlockBase("tng_cushioned_brown_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_cushioned_brown_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_brown_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_cushioned_brown_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_brown_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_LOWER_FLAT_WALL = new BlockBase("tng_cushioned_brown_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_PANEL_LOWER = new BlockBase("tng_cushioned_brown_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_PANEL = new BlockBase("tng_cushioned_brown_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_cushioned_brown_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_UPPER_ANGLED_WALL = new BlockBase("tng_cushioned_brown_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_cushioned_brown_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_cushioned_brown_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_cushioned_brown_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_cushioned_brown_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_UPPER_FLAT_WALL_ALT = new BlockBase("tng_cushioned_brown_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_cushioned_brown_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_brown_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_cushioned_brown_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_cushioned_brown_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_brown_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_BROWN_UPPER_FLAT_WALL_ = new BlockBase("tng_cushioned_brown_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG CUSHIONED - CYAN */
	public static final Block TNG_CUSHIONED_CYAN_BASE_LOWER = new BlockBase("tng_cushioned_cyan_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_BASE = new BlockBase("tng_cushioned_cyan_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_cushioned_cyan_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_cushioned_cyan_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_LOWER_ANGLED_WALL = new BlockBase("tng_cushioned_cyan_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_cushioned_cyan_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_cyan_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_cushioned_cyan_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_cyan_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_LOWER_FLAT_WALL = new BlockBase("tng_cushioned_cyan_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_PANEL_LOWER = new BlockBase("tng_cushioned_cyan_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_PANEL = new BlockBase("tng_cushioned_cyan_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_cushioned_cyan_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_UPPER_ANGLED_WALL = new BlockBase("tng_cushioned_cyan_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_cushioned_cyan_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_cushioned_cyan_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_cushioned_cyan_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_cushioned_cyan_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_UPPER_FLAT_WALL_ALT = new BlockBase("tng_cushioned_cyan_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_cushioned_cyan_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_cyan_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_cushioned_cyan_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_cushioned_cyan_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_cyan_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_CYAN_UPPER_FLAT_WALL_ = new BlockBase("tng_cushioned_cyan_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG CUSHIONED - DARK GRAY */
	public static final Block TNG_CUSHIONED_DARK_GRAY_BASE_LOWER = new BlockBase("tng_cushioned_dark_gray_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_BASE = new BlockBase("tng_cushioned_dark_gray_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_cushioned_dark_gray_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_cushioned_dark_gray_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_LOWER_ANGLED_WALL = new BlockBase("tng_cushioned_dark_gray_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_cushioned_dark_gray_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_dark_gray_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_cushioned_dark_gray_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_dark_gray_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_LOWER_FLAT_WALL = new BlockBase("tng_cushioned_dark_gray_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_PANEL_LOWER = new BlockBase("tng_cushioned_dark_gray_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_PANEL = new BlockBase("tng_cushioned_dark_gray_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_cushioned_dark_gray_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_UPPER_ANGLED_WALL = new BlockBase("tng_cushioned_dark_gray_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_cushioned_dark_gray_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_cushioned_dark_gray_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_cushioned_dark_gray_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_cushioned_dark_gray_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_UPPER_FLAT_WALL_ALT = new BlockBase("tng_cushioned_dark_gray_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_cushioned_dark_gray_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_dark_gray_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_cushioned_dark_gray_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_cushioned_dark_gray_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_dark_gray_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_DARK_GRAY_UPPER_FLAT_WALL_ = new BlockBase("tng_cushioned_dark_gray_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
    /* TNG CUSHIONED - GRAY */
	public static final Block TNG_CUSHIONED_GRAY_BASE_LOWER = new BlockBase("tng_cushioned_gray_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE = new BlockBase("tng_cushioned_gray_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_cushioned_gray_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_cushioned_gray_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_LOWER_ANGLED_WALL = new BlockBase("tng_cushioned_gray_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_cushioned_gray_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_gray_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_cushioned_gray_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_gray_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_LOWER_FLAT_WALL = new BlockBase("tng_cushioned_gray_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_PANEL_LOWER = new BlockBase("tng_cushioned_gray_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_PANEL = new BlockBase("tng_cushioned_gray_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_cushioned_gray_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_UPPER_ANGLED_WALL = new BlockBase("tng_cushioned_gray_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_cushioned_gray_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_cushioned_gray_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_cushioned_gray_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_cushioned_gray_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_UPPER_FLAT_WALL_ALT = new BlockBase("tng_cushioned_gray_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_cushioned_gray_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_gray_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_cushioned_gray_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_cushioned_gray_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_gray_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_UPPER_FLAT_WALL_ = new BlockBase("tng_cushioned_gray_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG CUSHIONED - GRAY BASE */
	public static final Block TNG_CUSHIONED_GRAY_BASE_BASE_LOWER = new BlockBase("tng_cushioned_gray_base_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_BASE = new BlockBase("tng_cushioned_gray_base_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_cushioned_gray_base_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_cushioned_gray_base_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_LOWER_ANGLED_WALL = new BlockBase("tng_cushioned_gray_base_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_cushioned_gray_base_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_gray_base_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_cushioned_gray_base_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_gray_base_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_LOWER_FLAT_WALL = new BlockBase("tng_cushioned_gray_base_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_PANEL_LOWER = new BlockBase("tng_cushioned_gray_base_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_PANEL = new BlockBase("tng_cushioned_gray_base_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_cushioned_gray_base_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_UPPER_ANGLED_WALL = new BlockBase("tng_cushioned_gray_base_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_cushioned_gray_base_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_cushioned_gray_base_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_cushioned_gray_base_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_UPPER_FLAT_WALL_ALT = new BlockBase("tng_cushioned_gray_base_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_gray_base_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_gray_base_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GRAY_BASE_UPPER_FLAT_WALL_ = new BlockBase("tng_cushioned_gray_base_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG CUSHIONED - GREEN */
	public static final Block TNG_CUSHIONED_GREEN_BASE_LOWER = new BlockBase("tng_cushioned_green_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_BASE = new BlockBase("tng_cushioned_green_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_cushioned_green_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_cushioned_green_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_LOWER_ANGLED_WALL = new BlockBase("tng_cushioned_green_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_cushioned_green_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_green_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_cushioned_green_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_green_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_LOWER_FLAT_WALL = new BlockBase("tng_cushioned_green_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_PANEL_LOWER = new BlockBase("tng_cushioned_green_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_PANEL = new BlockBase("tng_cushioned_green_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_cushioned_green_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_UPPER_ANGLED_WALL = new BlockBase("tng_cushioned_green_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_cushioned_green_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_cushioned_green_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_cushioned_green_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_cushioned_green_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_UPPER_FLAT_WALL_ALT = new BlockBase("tng_cushioned_green_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_cushioned_green_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_green_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_cushioned_green_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_cushioned_green_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_green_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_GREEN_UPPER_FLAT_WALL_ = new BlockBase("tng_cushioned_green_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG CUSHIONED - LIGHT BLUE */
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_BASE_LOWER = new BlockBase("tng_cushioned_light_blue_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_BASE = new BlockBase("tng_cushioned_light_blue_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_cushioned_light_blue_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_cushioned_light_blue_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_LOWER_ANGLED_WALL = new BlockBase("tng_cushioned_light_blue_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_cushioned_light_blue_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_light_blue_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_cushioned_light_blue_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_light_blue_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_LOWER_FLAT_WALL = new BlockBase("tng_cushioned_light_blue_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_PANEL_LOWER = new BlockBase("tng_cushioned_light_blue_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_PANEL = new BlockBase("tng_cushioned_light_blue_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_cushioned_light_blue_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_UPPER_ANGLED_WALL = new BlockBase("tng_cushioned_light_blue_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_cushioned_light_blue_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_cushioned_light_blue_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_cushioned_light_blue_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_cushioned_light_blue_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_UPPER_FLAT_WALL_ALT = new BlockBase("tng_cushioned_light_blue_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_cushioned_light_blue_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_light_blue_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_cushioned_light_blue_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_cushioned_light_blue_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_light_blue_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_BLUE_UPPER_FLAT_WALL_ = new BlockBase("tng_cushioned_light_blue_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG CUSHIONED - LIGHT GRAY */
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_BASE_LOWER = new BlockBase("tng_cushioned_light_gray_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_BASE = new BlockBase("tng_cushioned_light_gray_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_cushioned_light_gray_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_cushioned_light_gray_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_LOWER_ANGLED_WALL = new BlockBase("tng_cushioned_light_gray_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_cushioned_light_gray_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_light_gray_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_cushioned_light_gray_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_light_gray_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_LOWER_FLAT_WALL = new BlockBase("tng_cushioned_light_gray_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_PANEL_LOWER = new BlockBase("tng_cushioned_light_gray_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_PANEL = new BlockBase("tng_cushioned_light_gray_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_cushioned_light_gray_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_UPPER_ANGLED_WALL = new BlockBase("tng_cushioned_light_gray_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_cushioned_light_gray_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_cushioned_light_gray_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_cushioned_light_gray_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_cushioned_light_gray_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_UPPER_FLAT_WALL_ALT = new BlockBase("tng_cushioned_light_gray_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_cushioned_light_gray_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_light_gray_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_cushioned_light_gray_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_cushioned_light_gray_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_light_gray_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_LIGHT_GRAY_UPPER_FLAT_WALL_ = new BlockBase("tng_cushioned_light_gray_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG CUSHIONED - ORANGE */
	public static final Block TNG_CUSHIONED_ORANGE_BASE_LOWER = new BlockBase("tng_cushioned_orange_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_BASE = new BlockBase("tng_cushioned_orange_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_cushioned_orange_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_cushioned_orange_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_LOWER_ANGLED_WALL = new BlockBase("tng_cushioned_orange_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_cushioned_orange_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_orange_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_cushioned_orange_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_orange_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_LOWER_FLAT_WALL = new BlockBase("tng_cushioned_orange_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_PANEL_LOWER = new BlockBase("tng_cushioned_orange_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_PANEL = new BlockBase("tng_cushioned_orange_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_cushioned_orange_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_UPPER_ANGLED_WALL = new BlockBase("tng_cushioned_orange_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_cushioned_orange_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_cushioned_orange_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_cushioned_orange_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_cushioned_orange_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_UPPER_FLAT_WALL_ALT = new BlockBase("tng_cushioned_orange_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_cushioned_orange_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_orange_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_cushioned_orange_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_cushioned_orange_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_orange_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_ORANGE_UPPER_FLAT_WALL_ = new BlockBase("tng_cushioned_orange_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG CUSHIONED - PLUM */
	public static final Block TNG_CUSHIONED_PLUM_BASE_LOWER = new BlockBase("tng_cushioned_plum_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_BASE = new BlockBase("tng_cushioned_plum_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_cushioned_plum_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_cushioned_plum_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_LOWER_ANGLED_WALL = new BlockBase("tng_cushioned_plum_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_cushioned_plum_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_plum_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_cushioned_plum_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_plum_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_LOWER_FLAT_WALL = new BlockBase("tng_cushioned_plum_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_PANEL_LOWER = new BlockBase("tng_cushioned_plum_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_PANEL = new BlockBase("tng_cushioned_plum_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_cushioned_plum_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_UPPER_ANGLED_WALL = new BlockBase("tng_cushioned_plum_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_cushioned_plum_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_cushioned_plum_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_cushioned_plum_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_cushioned_plum_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_UPPER_FLAT_WALL_ALT = new BlockBase("tng_cushioned_plum_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_cushioned_plum_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_plum_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_cushioned_plum_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_cushioned_plum_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_plum_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PLUM_UPPER_FLAT_WALL_ = new BlockBase("tng_cushioned_plum_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG CUSHIONED - PURPLE */
	public static final Block TNG_CUSHIONED_PURPLE_BASE_LOWER = new BlockBase("tng_cushioned_purple_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_BASE = new BlockBase("tng_cushioned_purple_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_cushioned_purple_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_cushioned_purple_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_LOWER_ANGLED_WALL = new BlockBase("tng_cushioned_purple_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_cushioned_purple_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_purple_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_cushioned_purple_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_purple_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_LOWER_FLAT_WALL = new BlockBase("tng_cushioned_purple_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_PANEL_LOWER = new BlockBase("tng_cushioned_purple_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_PANEL = new BlockBase("tng_cushioned_purple_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_cushioned_purple_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_UPPER_ANGLED_WALL = new BlockBase("tng_cushioned_purple_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_cushioned_purple_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_cushioned_purple_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_cushioned_purple_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_cushioned_purple_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_UPPER_FLAT_WALL_ALT = new BlockBase("tng_cushioned_purple_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_cushioned_purple_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_purple_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_cushioned_purple_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_cushioned_purple_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_purple_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_PURPLE_UPPER_FLAT_WALL_ = new BlockBase("tng_cushioned_purple_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG CUSHIONED - RED */
	public static final Block TNG_CUSHIONED_RED_BASE_LOWER = new BlockBase("tng_cushioned_red_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_BASE = new BlockBase("tng_cushioned_red_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_cushioned_red_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_cushioned_red_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_LOWER_ANGLED_WALL = new BlockBase("tng_cushioned_red_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_cushioned_red_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_red_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_cushioned_red_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_red_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_LOWER_FLAT_WALL = new BlockBase("tng_cushioned_red_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_PANEL_LOWER = new BlockBase("tng_cushioned_red_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_PANEL = new BlockBase("tng_cushioned_red_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_cushioned_red_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_UPPER_ANGLED_WALL = new BlockBase("tng_cushioned_red_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_cushioned_red_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_cushioned_red_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_cushioned_red_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_cushioned_red_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_UPPER_FLAT_WALL_ALT = new BlockBase("tng_cushioned_red_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_cushioned_red_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_red_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_cushioned_red_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_cushioned_red_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_red_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_RED_UPPER_FLAT_WALL_ = new BlockBase("tng_cushioned_red_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG CUSHIONED - VIOLET */
	public static final Block TNG_CUSHIONED_VIOLET_BASE_LOWER = new BlockBase("tng_cushioned_violet_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_BASE = new BlockBase("tng_cushioned_violet_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_cushioned_violet_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_cushioned_violet_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_LOWER_ANGLED_WALL = new BlockBase("tng_cushioned_violet_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_cushioned_violet_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_violet_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_cushioned_violet_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_violet_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_LOWER_FLAT_WALL = new BlockBase("tng_cushioned_violet_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_PANEL_LOWER = new BlockBase("tng_cushioned_violet_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_PANEL = new BlockBase("tng_cushioned_violet_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_cushioned_violet_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_UPPER_ANGLED_WALL = new BlockBase("tng_cushioned_violet_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_cushioned_violet_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_cushioned_violet_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_cushioned_violet_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_cushioned_violet_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_UPPER_FLAT_WALL_ALT = new BlockBase("tng_cushioned_violet_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_cushioned_violet_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_violet_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_cushioned_violet_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_cushioned_violet_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_violet_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_VIOLET_UPPER_FLAT_WALL_ = new BlockBase("tng_cushioned_violet_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG CUSHIONED - WHITE */
	public static final Block TNG_CUSHIONED_WHITE_BASE_LOWER = new BlockBase("tng_cushioned_white_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_BASE = new BlockBase("tng_cushioned_white_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_cushioned_white_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_cushioned_white_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_LOWER_ANGLED_WALL = new BlockBase("tng_cushioned_white_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_cushioned_white_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_white_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_cushioned_white_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_white_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_LOWER_FLAT_WALL = new BlockBase("tng_cushioned_white_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_PANEL_LOWER = new BlockBase("tng_cushioned_white_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_PANEL = new BlockBase("tng_cushioned_white_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_cushioned_white_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_UPPER_ANGLED_WALL = new BlockBase("tng_cushioned_white_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_cushioned_white_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_cushioned_white_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_cushioned_white_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_cushioned_white_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_UPPER_FLAT_WALL_ALT = new BlockBase("tng_cushioned_white_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_cushioned_white_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_white_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_cushioned_white_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_cushioned_white_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_white_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_WHITE_UPPER_FLAT_WALL_ = new BlockBase("tng_cushioned_white_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG CUSHIONED - YELLOW */
	public static final Block TNG_CUSHIONED_YELLOW_BASE_LOWER = new BlockBase("tng_cushioned_yellow_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_BASE = new BlockBase("tng_cushioned_yellow_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_cushioned_yellow_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_cushioned_yellow_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_LOWER_ANGLED_WALL = new BlockBase("tng_cushioned_yellow_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_cushioned_yellow_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_yellow_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_cushioned_yellow_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_yellow_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_LOWER_FLAT_WALL = new BlockBase("tng_cushioned_yellow_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_PANEL_LOWER = new BlockBase("tng_cushioned_yellow_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_PANEL = new BlockBase("tng_cushioned_yellow_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_cushioned_yellow_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_UPPER_ANGLED_WALL = new BlockBase("tng_cushioned_yellow_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_cushioned_yellow_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_cushioned_yellow_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_cushioned_yellow_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_cushioned_yellow_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_UPPER_FLAT_WALL_ALT = new BlockBase("tng_cushioned_yellow_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_cushioned_yellow_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_cushioned_yellow_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_cushioned_yellow_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_cushioned_yellow_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_cushioned_yellow_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_CUSHIONED_YELLOW_UPPER_FLAT_WALL_ = new BlockBase("tng_cushioned_yellow_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	//
	//*//* TNG CORRIDOR - FLAT MATTE BLOCKS *//*//
	//
	/* TNG FLAT MATTE - BLUE */
	public static final Block TNG_FLAT_MATTE_BLUE_BASE_LOWER = new BlockBase("tng_flat_matte_blue_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_BASE = new BlockBase("tng_flat_matte_blue_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_blue_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_blue_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_ANGLED_WALL_RAILING_ALT_RED_TAG = new BlockBase("tng_flat_matte_blue_lower_angled_wall_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_flat_matte_blue_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_flat_matte_blue_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_ANGLED_WALL_RAILING_RED_TAG = new BlockBase("tng_flat_matte_blue_lower_angled_wall_railing_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_flat_matte_blue_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_blue_lower_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_ANGLED_WALL = new BlockBase("tng_flat_matte_blue_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_flat_matte_blue_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_blue_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_blue_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_blue_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_RED_TAG = new BlockBase("tng_flat_matte_blue_lower_flat_wall_console_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT = new BlockBase("tng_flat_matte_blue_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_blue_lower_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_blue_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_blue_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_FLAT_WALL_RED_TAG = new BlockBase("tng_flat_matte_blue_lower_flat_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_LOWER_FLAT_WALL = new BlockBase("tng_flat_matte_blue_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_PANEL_LOWER = new BlockBase("tng_flat_matte_blue_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_PANEL = new BlockBase("tng_flat_matte_blue_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_blue_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_blue_upper_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_flat_matte_blue_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_ANGLED_WALL_SCREEN_RED_TAG = new BlockBase("tng_flat_matte_blue_upper_angled_wall_screen_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_flat_matte_blue_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_ANGLED_WALL = new BlockBase("tng_flat_matte_blue_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALERT_BAR_PANEL_RED_TAG = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alert_bar_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_LOWER = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alert_bar_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_UPPER = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alert_bar_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALT_2_RED_TAG = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alt_2_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALT_PANEL_RED_TAG = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alt_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALT_RED_TAG_LOWER = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alt_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALT_RED_TAG_UPPER = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alt_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_ALT = new BlockBase("tng_flat_matte_blue_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_flat_matte_blue_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_flat_matte_blue_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_CONSOLE_ALT_3_RED_TAG = new BlockBase("tng_flat_matte_blue_upper_flat_wall_console_alt_3_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_blue_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_blue_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_blue_upper_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_flat_matte_blue_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_flat_matte_blue_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_blue_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_blue_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_blue_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_RED_TAG_LOWER = new BlockBase("tng_flat_matte_blue_upper_flat_wall_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL_RED_TAG_UPPER = new BlockBase("tng_flat_matte_blue_upper_flat_wall_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BLUE_UPPER_FLAT_WALL = new BlockBase("tng_flat_matte_blue_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG FLAT MATTE - BROWN */
	public static final Block TNG_FLAT_MATTE_BROWN_BASE_LOWER = new BlockBase("tng_flat_matte_brown_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_BASE = new BlockBase("tng_flat_matte_brown_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_brown_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_brown_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_ANGLED_WALL_RAILING_ALT_RED_TAG = new BlockBase("tng_flat_matte_brown_lower_angled_wall_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_flat_matte_brown_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_flat_matte_brown_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_ANGLED_WALL_RAILING_RED_TAG = new BlockBase("tng_flat_matte_brown_lower_angled_wall_railing_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_flat_matte_brown_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_brown_lower_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_ANGLED_WALL = new BlockBase("tng_flat_matte_brown_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_flat_matte_brown_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_brown_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_brown_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_brown_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_RED_TAG = new BlockBase("tng_flat_matte_brown_lower_flat_wall_console_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_FLAT_WALL_CONSOLE_RALING_ALT = new BlockBase("tng_flat_matte_brown_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_brown_lower_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_brown_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_brown_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_FLAT_WALL_RED_TAG = new BlockBase("tng_flat_matte_brown_lower_flat_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_LOWER_FLAT_WALL = new BlockBase("tng_flat_matte_brown_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_PANEL_LOWER = new BlockBase("tng_flat_matte_brown_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_PANEL = new BlockBase("tng_flat_matte_brown_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_brown_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_brown_upper_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_flat_matte_brown_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_ANGLED_WALL_SCREEN_RED_TAG = new BlockBase("tng_flat_matte_brown_upper_angled_wall_screen_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_flat_matte_brown_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_ANGLED_WALL = new BlockBase("tng_flat_matte_brown_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALERT_BAR_PANEL_RED_TAG = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alert_bar_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_LOWER = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alert_bar_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_UPPER = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alert_bar_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALT_2_RED_TAG = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alt_2_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALT_PANEL_RED_TAG = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alt_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALT_RED_TAG_LOWER = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alt_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALT_RED_TAG_UPPER = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alt_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_ALT = new BlockBase("tng_flat_matte_brown_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_flat_matte_brown_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_flat_matte_brown_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_CONSOLE_ALT_3_RED_TAG = new BlockBase("tng_flat_matte_brown_upper_flat_wall_console_alt_3_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_brown_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_brown_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_brown_upper_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_flat_matte_brown_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_flat_matte_brown_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_brown_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_brown_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_brown_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_RED_TAG_LOWER = new BlockBase("tng_flat_matte_brown_upper_flat_wall_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL_RED_TAG_UPPER = new BlockBase("tng_flat_matte_brown_upper_flat_wall_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_BROWN_UPPER_FLAT_WALL = new BlockBase("tng_flat_matte_brown_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG FLAT MATTE - CYAN */
	public static final Block TNG_FLAT_MATTE_CYAN_BASE_LOWER = new BlockBase("tng_flat_matte_cyan_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_BASE = new BlockBase("tng_flat_matte_cyan_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_cyan_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_cyan_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_ANGLED_WALL_RAILING_ALT_RED_TAG = new BlockBase("tng_flat_matte_cyan_lower_angled_wall_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_flat_matte_cyan_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_flat_matte_cyan_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_ANGLED_WALL_RAILING_RED_TAG = new BlockBase("tng_flat_matte_cyan_lower_angled_wall_railing_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_flat_matte_cyan_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_cyan_lower_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_ANGLED_WALL = new BlockBase("tng_flat_matte_cyan_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_flat_matte_cyan_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_cyan_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_cyan_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_cyan_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_RED_TAG = new BlockBase("tng_flat_matte_cyan_lower_flat_wall_console_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_FLAT_WALL_CONSOLE_RALING_ALT = new BlockBase("tng_flat_matte_cyan_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_cyan_lower_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_cyan_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_cyan_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_FLAT_WALL_RED_TAG = new BlockBase("tng_flat_matte_cyan_lower_flat_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_LOWER_FLAT_WALL = new BlockBase("tng_flat_matte_cyan_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_PANEL_LOWER = new BlockBase("tng_flat_matte_cyan_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_PANEL = new BlockBase("tng_flat_matte_cyan_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_cyan_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_cyan_upper_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_flat_matte_cyan_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_ANGLED_WALL_SCREEN_RED_TAG = new BlockBase("tng_flat_matte_cyan_upper_angled_wall_screen_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_flat_matte_cyan_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_ANGLED_WALL = new BlockBase("tng_flat_matte_cyan_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALERT_BAR_PANEL_RED_TAG = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alert_bar_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_LOWER = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alert_bar_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_UPPER = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alert_bar_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALT_2_RED_TAG = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alt_2_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALT_PANEL_RED_TAG = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alt_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALT_RED_TAG_LOWER = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alt_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALT_RED_TAG_UPPER = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alt_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_ALT = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_CONSOLE_ALT_3_RED_TAG = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_console_alt_3_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_RED_TAG_LOWER = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL_RED_TAG_UPPER = new BlockBase("tng_flat_matte_cyan_upper_flat_wall_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_CYAN_UPPER_FLAT_WALL = new BlockBase("tng_flat_matte_cyan_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG FLAT MATTE - DARK GRAY */
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_BASE_LOWER = new BlockBase("tng_flat_matte_dark_gray_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_BASE = new BlockBase("tng_flat_matte_dark_gray_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_dark_gray_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_dark_gray_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_ANGLED_WALL_RAILING_ALT_RED_TAG = new BlockBase("tng_flat_matte_dark_gray_lower_angled_wall_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_flat_matte_dark_gray_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_flat_matte_dark_gray_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_ANGLED_WALL_RAILING_RED_TAG = new BlockBase("tng_flat_matte_dark_gray_lower_angled_wall_railing_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_flat_matte_dark_gray_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_dark_gray_lower_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_ANGLED_WALL = new BlockBase("tng_flat_matte_dark_gray_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_flat_matte_dark_gray_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_dark_gray_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_dark_gray_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_dark_gray_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_RED_TAG = new BlockBase("tng_flat_matte_dark_gray_lower_flat_wall_console_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_FLAT_WALL_CONSOLE_RALING_ALT = new BlockBase("tng_flat_matte_dark_gray_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_dark_gray_lower_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_dark_gray_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_dark_gray_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_FLAT_WALL_RED_TAG = new BlockBase("tng_flat_matte_dark_gray_lower_flat_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_LOWER_FLAT_WALL = new BlockBase("tng_flat_matte_dark_gray_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_PANEL_LOWER = new BlockBase("tng_flat_matte_dark_gray_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_PANEL = new BlockBase("tng_flat_matte_dark_gray_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_dark_gray_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_dark_gray_upper_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_flat_matte_dark_gray_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_ANGLED_WALL_SCREEN_RED_TAG = new BlockBase("tng_flat_matte_dark_gray_upper_angled_wall_screen_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_flat_matte_dark_gray_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_ANGLED_WALL = new BlockBase("tng_flat_matte_dark_gray_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALERT_BAR_PANEL_RED_TAG = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alert_bar_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_LOWER = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alert_bar_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_UPPER = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alert_bar_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALT_2_RED_TAG = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alt_2_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALT_PANEL_RED_TAG = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alt_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALT_RED_TAG_LOWER = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alt_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALT_RED_TAG_UPPER = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alt_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_ALT = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_CONSOLE_ALT_3_RED_TAG = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_console_alt_3_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_RED_TAG_LOWER = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL_RED_TAG_UPPER = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_DARK_GRAY_UPPER_FLAT_WALL = new BlockBase("tng_flat_matte_dark_gray_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG FLAT MATTE - GRAY */
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER = new BlockBase("tng_flat_matte_gray_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE = new BlockBase("tng_flat_matte_gray_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_gray_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_gray_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_ANGLED_WALL_RAILING_ALT_RED_TAG = new BlockBase("tng_flat_matte_gray_lower_angled_wall_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_flat_matte_gray_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_flat_matte_gray_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_ANGLED_WALL_RAILING_RED_TAG = new BlockBase("tng_flat_matte_gray_lower_angled_wall_railing_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_flat_matte_gray_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_gray_lower_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_ANGLED_WALL = new BlockBase("tng_flat_matte_gray_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_flat_matte_gray_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_gray_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_gray_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_gray_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_RED_TAG = new BlockBase("tng_flat_matte_gray_lower_flat_wall_console_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_FLAT_WALL_CONSOLE_RALING_ALT = new BlockBase("tng_flat_matte_gray_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_gray_lower_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_gray_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_gray_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_FLAT_WALL_RED_TAG = new BlockBase("tng_flat_matte_gray_lower_flat_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_LOWER_FLAT_WALL = new BlockBase("tng_flat_matte_gray_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_PANEL_LOWER = new BlockBase("tng_flat_matte_gray_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_PANEL = new BlockBase("tng_flat_matte_gray_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_gray_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_gray_upper_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_flat_matte_gray_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_ANGLED_WALL_SCREEN_RED_TAG = new BlockBase("tng_flat_matte_gray_upper_angled_wall_screen_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_flat_matte_gray_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_ANGLED_WALL = new BlockBase("tng_flat_matte_gray_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALERT_BAR_PANEL_RED_TAG = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alert_bar_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_LOWER = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alert_bar_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_UPPER = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alert_bar_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALT_2_RED_TAG = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alt_2_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALT_PANEL_RED_TAG = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alt_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALT_RED_TAG_LOWER = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alt_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALT_RED_TAG_UPPER = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alt_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_ALT = new BlockBase("tng_flat_matte_gray_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_flat_matte_gray_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_flat_matte_gray_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_CONSOLE_ALT_3_RED_TAG = new BlockBase("tng_flat_matte_gray_upper_flat_wall_console_alt_3_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_gray_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_gray_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_gray_upper_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_flat_matte_gray_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_flat_matte_gray_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_gray_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_gray_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_gray_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_RED_TAG_LOWER = new BlockBase("tng_flat_matte_gray_upper_flat_wall_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL_RED_TAG_UPPER = new BlockBase("tng_flat_matte_gray_upper_flat_wall_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_UPPER_FLAT_WALL = new BlockBase("tng_flat_matte_gray_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG FLAT MATTE - GRAY BASE */
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_BASE_LOWER = new BlockBase("tng_flat_matte_gray_base_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_BASE = new BlockBase("tng_flat_matte_gray_base_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_gray_base_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_gray_base_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_ANGLED_WALL_RAILING_ALT_RED_TAG = new BlockBase("tng_flat_matte_gray_base_lower_angled_wall_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_flat_matte_gray_base_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_flat_matte_gray_base_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_ANGLED_WALL_RAILING_RED_TAG = new BlockBase("tng_flat_matte_gray_base_lower_angled_wall_railing_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_flat_matte_gray_base_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_gray_base_lower_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_ANGLED_WALL = new BlockBase("tng_flat_matte_gray_base_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_flat_matte_gray_base_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_gray_base_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_gray_base_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_gray_base_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_RED_TAG = new BlockBase("tng_flat_matte_gray_base_lower_flat_wall_console_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT = new BlockBase("tng_flat_matte_gray_base_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_gray_base_lower_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_gray_base_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_gray_base_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_FLAT_WALL_RED_TAG = new BlockBase("tng_flat_matte_gray_base_lower_flat_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_LOWER_FLAT_WALL = new BlockBase("tng_flat_matte_gray_base_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_PANEL_LOWER = new BlockBase("tng_flat_matte_gray_base_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_PANEL = new BlockBase("tng_flat_matte_gray_base_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_gray_base_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_gray_base_upper_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_flat_matte_gray_base_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_ANGLED_WALL_SCREEN_RED_TAG = new BlockBase("tng_flat_matte_gray_base_upper_angled_wall_screen_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_flat_matte_gray_base_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_ANGLED_WALL = new BlockBase("tng_flat_matte_gray_base_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALERT_BAR_PANEL_RED_TAG = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alert_bar_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_LOWER = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alert_bar_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_UPPER = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alert_bar_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALT_2_RED_TAG = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alt_2_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALT_PANEL_RED_TAG = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alt_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALT_RED_TAG_LOWER = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alt_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALT_RED_TAG_UPPER = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alt_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_ALT = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_CONSOLE_ALT_3_RED_TAG = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_console_alt_3_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_RED_TAG_LOWER = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL_RED_TAG_UPPER = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GRAY_BASE_UPPER_FLAT_WALL = new BlockBase("tng_flat_matte_gray_base_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG FLAT MATTE - GREEN */
	public static final Block TNG_FLAT_MATTE_GREEN_BASE_LOWER = new BlockBase("tng_flat_matte_green_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_BASE = new BlockBase("tng_flat_matte_green_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_green_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_green_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_ANGLED_WALL_RAILING_ALT_RED_TAG = new BlockBase("tng_flat_matte_green_lower_angled_wall_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_flat_matte_green_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_flat_matte_green_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_ANGLED_WALL_RAILING_RED_TAG = new BlockBase("tng_flat_matte_green_lower_angled_wall_railing_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_flat_matte_green_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_green_lower_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_ANGLED_WALL = new BlockBase("tng_flat_matte_green_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_flat_matte_green_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_green_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_green_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_green_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_RED_TAG = new BlockBase("tng_flat_matte_green_lower_flat_wall_console_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_FLAT_WALL_CONSOLE_RALING_ALT = new BlockBase("tng_flat_matte_green_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_green_lower_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_green_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_green_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_FLAT_WALL_RED_TAG = new BlockBase("tng_flat_matte_green_lower_flat_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_LOWER_FLAT_WALL = new BlockBase("tng_flat_matte_green_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_PANEL_LOWER = new BlockBase("tng_flat_matte_green_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_PANEL = new BlockBase("tng_flat_matte_green_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_green_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_green_upper_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_flat_matte_green_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_ANGLED_WALL_SCREEN_RED_TAG = new BlockBase("tng_flat_matte_green_upper_angled_wall_screen_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_flat_matte_green_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_ANGLED_WALL = new BlockBase("tng_flat_matte_green_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_green_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_green_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_green_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALERT_BAR_PANEL_RED_TAG = new BlockBase("tng_flat_matte_green_upper_flat_wall_alert_bar_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_flat_matte_green_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_LOWER = new BlockBase("tng_flat_matte_green_upper_flat_wall_alert_bar_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_UPPER = new BlockBase("tng_flat_matte_green_upper_flat_wall_alert_bar_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_flat_matte_green_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_flat_matte_green_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALT_2_RED_TAG = new BlockBase("tng_flat_matte_green_upper_flat_wall_alt_2_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_flat_matte_green_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_green_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_green_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_green_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALT_PANEL_RED_TAG = new BlockBase("tng_flat_matte_green_upper_flat_wall_alt_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_flat_matte_green_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALT_RED_TAG_LOWER = new BlockBase("tng_flat_matte_green_upper_flat_wall_alt_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALT_RED_TAG_UPPER = new BlockBase("tng_flat_matte_green_upper_flat_wall_alt_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_ALT = new BlockBase("tng_flat_matte_green_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_flat_matte_green_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_flat_matte_green_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_CONSOLE_ALT_3_RED_TAG = new BlockBase("tng_flat_matte_green_upper_flat_wall_console_alt_3_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_green_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_green_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_green_upper_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_flat_matte_green_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_flat_matte_green_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_green_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_green_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_green_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_RED_TAG_LOWER = new BlockBase("tng_flat_matte_green_upper_flat_wall_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL_RED_TAG_UPPER = new BlockBase("tng_flat_matte_green_upper_flat_wall_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_GREEN_UPPER_FLAT_WALL = new BlockBase("tng_flat_matte_green_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG FLAT MATTE - LIGHT BLUE */
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_BASE_LOWER = new BlockBase("tng_flat_matte_light_blue_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_BASE = new BlockBase("tng_flat_matte_light_blue_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_light_blue_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_light_blue_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_ANGLED_WALL_RAILING_ALT_RED_TAG = new BlockBase("tng_flat_matte_light_blue_lower_angled_wall_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_flat_matte_light_blue_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_flat_matte_light_blue_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_ANGLED_WALL_RAILING_RED_TAG = new BlockBase("tng_flat_matte_light_blue_lower_angled_wall_railing_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_flat_matte_light_blue_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_light_blue_lower_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_ANGLED_WALL = new BlockBase("tng_flat_matte_light_blue_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_flat_matte_light_blue_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_light_blue_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_light_blue_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_light_blue_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_RED_TAG = new BlockBase("tng_flat_matte_light_blue_lower_flat_wall_console_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT = new BlockBase("tng_flat_matte_light_blue_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_light_blue_lower_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_light_blue_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_light_blue_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_FLAT_WALL_RED_TAG = new BlockBase("tng_flat_matte_light_blue_lower_flat_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_LOWER_FLAT_WALL = new BlockBase("tng_flat_matte_light_blue_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_PANEL_LOWER = new BlockBase("tng_flat_matte_light_blue_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_PANEL = new BlockBase("tng_flat_matte_light_blue_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_light_blue_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_light_blue_upper_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_flat_matte_light_blue_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_ANGLED_WALL_SCREEN_RED_TAG = new BlockBase("tng_flat_matte_light_blue_upper_angled_wall_screen_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_flat_matte_light_blue_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_ANGLED_WALL = new BlockBase("tng_flat_matte_light_blue_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALERT_BAR_PANEL_RED_TAG = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alert_bar_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_LOWER = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alert_bar_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_UPPER = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alert_bar_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALT_2_RED_TAG = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alt_2_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALT_PANEL_RED_TAG = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alt_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALT_RED_TAG_LOWER = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alt_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALT_RED_TAG_UPPER = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alt_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_ALT = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_CONSOLE_ALT_3_RED_TAG = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_console_alt_3_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_RED_TAG_LOWER = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL_RED_TAG_UPPER = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_BLUE_UPPER_FLAT_WALL = new BlockBase("tng_flat_matte_light_blue_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG FLAT MATTE - LIGHT GRAY */
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_BASE_LOWER = new BlockBase("tng_flat_matte_light_gray_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_BASE = new BlockBase("tng_flat_matte_light_gray_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_light_gray_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_light_gray_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_ANGLED_WALL_RAILING_ALT_RED_TAG = new BlockBase("tng_flat_matte_light_gray_lower_angled_wall_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_flat_matte_light_gray_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_flat_matte_light_gray_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_ANGLED_WALL_RAILING_RED_TAG = new BlockBase("tng_flat_matte_light_gray_lower_angled_wall_railing_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_flat_matte_light_gray_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_light_gray_lower_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_ANGLED_WALL = new BlockBase("tng_flat_matte_light_gray_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_flat_matte_light_gray_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_light_gray_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_light_gray_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_light_gray_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_RED_TAG = new BlockBase("tng_flat_matte_light_gray_lower_flat_wall_console_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_FLAT_WALL_CONSOLE_RALING_ALT = new BlockBase("tng_flat_matte_light_gray_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_light_gray_lower_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_light_gray_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_light_gray_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_FLAT_WALL_RED_TAG = new BlockBase("tng_flat_matte_light_gray_lower_flat_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_LOWER_FLAT_WALL = new BlockBase("tng_flat_matte_light_gray_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_PANEL_LOWER = new BlockBase("tng_flat_matte_light_gray_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_PANEL = new BlockBase("tng_flat_matte_light_gray_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_light_gray_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_light_gray_upper_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_flat_matte_light_gray_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_ANGLED_WALL_SCREEN_RED_TAG = new BlockBase("tng_flat_matte_light_gray_upper_angled_wall_screen_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_flat_matte_light_gray_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_ANGLED_WALL = new BlockBase("tng_flat_matte_light_gray_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALERT_BAR_PANEL_RED_TAG = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alert_bar_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_LOWER = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alert_bar_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_UPPER = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alert_bar_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALT_2_RED_TAG = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alt_2_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALT_PANEL_RED_TAG = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alt_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALT_RED_TAG_LOWER = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alt_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALT_RED_TAG_UPPER = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alt_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_ALT = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_CONSOLE_ALT_3_RED_TAG = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_console_alt_3_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_RED_TAG_LOWER = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL_RED_TAG_UPPER = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_LIGHT_GRAY_UPPER_FLAT_WALL = new BlockBase("tng_flat_matte_light_gray_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG FLAT MATTE - ORANGE */
	public static final Block TNG_FLAT_MATTE_ORANGE_BASE_LOWER = new BlockBase("tng_flat_matte_orange_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_BASE = new BlockBase("tng_flat_matte_orange_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_ANGLED_WALL_BLUE_TAG = new BlockBase("tng_flat_matte_orange_lower_angled_wall_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_orange_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_ANGLED_WALL_RAILING_ALT_BLUE_TAG = new BlockBase("tng_flat_matte_orange_lower_angled_wall_railing_alt_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_orange_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_flat_matte_orange_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_ANGLED_WALL_RAILING_BLUE_TAG = new BlockBase("tng_flat_matte_orange_lower_angled_wall_railing_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_flat_matte_orange_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_flat_matte_orange_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_ANGLED_WALL = new BlockBase("tng_flat_matte_orange_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_FLAT_WALL_BLUE_TAG = new BlockBase("tng_flat_matte_orange_lower_flat_wall_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_flat_matte_orange_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_orange_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_FLAT_WALL_CONSOLE_BLUE_TAG = new BlockBase("tng_flat_matte_orange_lower_flat_wall_console_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_orange_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_BLUE_TAG = new BlockBase("tng_flat_matte_orange_lower_flat_wall_console_railing_alt_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_orange_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT = new BlockBase("tng_flat_matte_orange_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_orange_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_orange_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_LOWER_FLAT_WALL = new BlockBase("tng_flat_matte_orange_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_PANEL_LOWER = new BlockBase("tng_flat_matte_orange_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_PANEL = new BlockBase("tng_flat_matte_orange_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_ANGLED_WALL_BLUE_TAG = new BlockBase("tng_flat_matte_orange_upper_angled_wall_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_orange_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_ANGLED_WALL_SCREEN_BLUE_TAG = new BlockBase("tng_flat_matte_orange_upper_angled_wall_screen_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_flat_matte_orange_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_flat_matte_orange_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_ANGLED_WALL = new BlockBase("tng_flat_matte_orange_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALERT_BAR_BLUE_TAG_LOWER = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alert_bar_blue_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALERT_BAR_BLUE_TAG_UPPER = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alert_bar_blue_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALERT_BAR_PANEL_BLUE_TAG = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alert_bar_panel_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALT_2_BLUE_TAG = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alt_2_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALT_BLUE_TAG_LOWER = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alt_blue_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALT_BLUE_TAG_UPPER = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alt_blue_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALT_PANEL_BLUE_TAG = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alt_panel_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_ALT = new BlockBase("tng_flat_matte_orange_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_BLUE_TAG_LOWER = new BlockBase("tng_flat_matte_orange_upper_flat_wall_blue_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_BLUE_TAG_UPPER = new BlockBase("tng_flat_matte_orange_upper_flat_wall_blue_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_flat_matte_orange_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_CONSOLE_ALT_3_BLUE_TAG = new BlockBase("tng_flat_matte_orange_upper_flat_wall_console_alt_3_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_flat_matte_orange_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_orange_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_CONSOLE_BLUE_TAG = new BlockBase("tng_flat_matte_orange_upper_flat_wall_console_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_orange_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_flat_matte_orange_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_flat_matte_orange_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_orange_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_orange_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_orange_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_ORANGE_UPPER_FLAT_WALL = new BlockBase("tng_flat_matte_orange_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG FLAT MATTE - PLUM */
	public static final Block TNG_FLAT_MATTE_PLUM_BASE_LOWER = new BlockBase("tng_flat_matte_plum_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_BASE = new BlockBase("tng_flat_matte_plum_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_plum_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_plum_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_ANGLED_WALL_RAILING_ALT_RED_TAG = new BlockBase("tng_flat_matte_plum_lower_angled_wall_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_flat_matte_plum_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_flat_matte_plum_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_ANGLED_WALL_RAILING_RED_TAG = new BlockBase("tng_flat_matte_plum_lower_angled_wall_railing_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_flat_matte_plum_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_plum_lower_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_ANGLED_WALL = new BlockBase("tng_flat_matte_plum_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_flat_matte_plum_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_plum_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_plum_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_plum_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_RED_TAG = new BlockBase("tng_flat_matte_plum_lower_flat_wall_console_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_FLAT_WALL_CONSOLE_RALING_ALT = new BlockBase("tng_flat_matte_plum_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_plum_lower_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_plum_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_plum_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_FLAT_WALL_RED_TAG = new BlockBase("tng_flat_matte_plum_lower_flat_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_LOWER_FLAT_WALL = new BlockBase("tng_flat_matte_plum_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_PANEL_LOWER = new BlockBase("tng_flat_matte_plum_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_PANEL = new BlockBase("tng_flat_matte_plum_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_plum_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_plum_upper_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_flat_matte_plum_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_ANGLED_WALL_SCREEN_RED_TAG = new BlockBase("tng_flat_matte_plum_upper_angled_wall_screen_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_flat_matte_plum_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_ANGLED_WALL = new BlockBase("tng_flat_matte_plum_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALERT_BAR_PANEL_RED_TAG = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alert_bar_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_LOWER = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alert_bar_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_UPPER = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alert_bar_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALT_2_RED_TAG = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alt_2_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALT_PANEL_RED_TAG = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alt_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALT_RED_TAG_LOWER = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alt_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALT_RED_TAG_UPPER = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alt_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_ALT = new BlockBase("tng_flat_matte_plum_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_flat_matte_plum_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_flat_matte_plum_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_CONSOLE_ALT_3_RED_TAG = new BlockBase("tng_flat_matte_plum_upper_flat_wall_console_alt_3_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_plum_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_plum_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_plum_upper_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_flat_matte_plum_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_flat_matte_plum_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_plum_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_plum_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_plum_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_RED_TAG_LOWER = new BlockBase("tng_flat_matte_plum_upper_flat_wall_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL_RED_TAG_UPPER = new BlockBase("tng_flat_matte_plum_upper_flat_wall_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PLUM_UPPER_FLAT_WALL = new BlockBase("tng_flat_matte_plum_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG FLAT MATTE - PURPLE */
	public static final Block TNG_FLAT_MATTE_PURPLE_BASE_LOWER = new BlockBase("tng_flat_matte_purple_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_BASE = new BlockBase("tng_flat_matte_purple_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_purple_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_purple_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_ANGLED_WALL_RAILING_ALT_RED_TAG = new BlockBase("tng_flat_matte_purple_lower_angled_wall_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_flat_matte_purple_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_flat_matte_purple_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_ANGLED_WALL_RAILING_RED_TAG = new BlockBase("tng_flat_matte_purple_lower_angled_wall_railing_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_flat_matte_purple_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_purple_lower_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_ANGLED_WALL = new BlockBase("tng_flat_matte_purple_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_flat_matte_purple_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_purple_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_purple_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_purple_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_RED_TAG = new BlockBase("tng_flat_matte_purple_lower_flat_wall_console_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT = new BlockBase("tng_flat_matte_purple_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_purple_lower_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_purple_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_purple_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_FLAT_WALL_RED_TAG = new BlockBase("tng_flat_matte_purple_lower_flat_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_LOWER_FLAT_WALL = new BlockBase("tng_flat_matte_purple_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_PANEL_LOWER = new BlockBase("tng_flat_matte_purple_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_PANEL = new BlockBase("tng_flat_matte_purple_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_purple_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_purple_upper_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_flat_matte_purple_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_ANGLED_WALL_SCREEN_RED_TAG = new BlockBase("tng_flat_matte_purple_upper_angled_wall_screen_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_flat_matte_purple_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_ANGLED_WALL = new BlockBase("tng_flat_matte_purple_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALERT_BAR_PANEL_RED_TAG = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alert_bar_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_LOWER = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alert_bar_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_UPPER = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alert_bar_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALT_2_RED_TAG = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alt_2_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALT_PANEL_RED_TAG = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alt_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALT_RED_TAG_LOWER = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alt_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALT_RED_TAG_UPPER = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alt_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_ALT = new BlockBase("tng_flat_matte_purple_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_flat_matte_purple_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_flat_matte_purple_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_CONSOLE_ALT_3_RED_TAG = new BlockBase("tng_flat_matte_purple_upper_flat_wall_console_alt_3_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_purple_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_purple_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_purple_upper_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_flat_matte_purple_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_flat_matte_purple_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_purple_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_purple_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_purple_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_RED_TAG_LOWER = new BlockBase("tng_flat_matte_purple_upper_flat_wall_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL_RED_TAG_UPPER = new BlockBase("tng_flat_matte_purple_upper_flat_wall_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_PURPLE_UPPER_FLAT_WALL = new BlockBase("tng_flat_matte_purple_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG FLAT MATTE - RED */
	public static final Block TNG_FLAT_MATTE_RED_BASE_LOWER = new BlockBase("tng_flat_matte_red_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_BASE = new BlockBase("tng_flat_matte_red_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_ANGLED_WALL_BLUE_TAG = new BlockBase("tng_flat_matte_red_lower_angled_wall_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_red_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_ANGLED_WALL_RAILING_ALT_BLUE_TAG = new BlockBase("tng_flat_matte_red_lower_angled_wall_railing_alt_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_red_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_flat_matte_red_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_ANGLED_WALL_RAILING_BLUE_TAG = new BlockBase("tng_flat_matte_red_lower_angled_wall_railing_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_flat_matte_red_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_flat_matte_red_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_ANGLED_WALL = new BlockBase("tng_flat_matte_red_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_FLAT_WALL_BLUE_TAG = new BlockBase("tng_flat_matte_red_lower_flat_wall_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_flat_matte_red_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_red_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_FLAT_WALL_CONSOLE_BLUE_TAG = new BlockBase("tng_flat_matte_red_lower_flat_wall_console_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_red_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_BLUE_TAG = new BlockBase("tng_flat_matte_red_lower_flat_wall_console_railing_alt_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_red_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_FLAT_WALL_CONSOLE_RALING_ALT = new BlockBase("tng_flat_matte_red_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_red_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_red_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_LOWER_FLAT_WALL = new BlockBase("tng_flat_matte_red_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_PANEL_LOWER = new BlockBase("tng_flat_matte_red_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_PANEL = new BlockBase("tng_flat_matte_red_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_ANGLED_WALL_BLUE_TAG = new BlockBase("tng_flat_matte_red_upper_angled_wall_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_red_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_ANGLED_WALL_SCREEN_BLUE_TAG = new BlockBase("tng_flat_matte_red_upper_angled_wall_screen_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_flat_matte_red_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_flat_matte_red_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_ANGLED_WALL = new BlockBase("tng_flat_matte_red_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALERT_BAR_BLUE_TAG_LOWER = new BlockBase("tng_flat_matte_red_upper_flat_wall_alert_bar_blue_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALERT_BAR_BLUE_TAG_UPPER = new BlockBase("tng_flat_matte_red_upper_flat_wall_alert_bar_blue_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_red_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_red_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALERT_BAR_PANEL_BLUE_TAG = new BlockBase("tng_flat_matte_red_upper_flat_wall_alert_bar_panel_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_red_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_flat_matte_red_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_flat_matte_red_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALT_2_BLUE_TAG = new BlockBase("tng_flat_matte_red_upper_flat_wall_alt_2_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_flat_matte_red_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_flat_matte_red_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALT_BLUE_TAG_LOWER = new BlockBase("tng_flat_matte_red_upper_flat_wall_alt_blue_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALT_BLUE_TAG_UPPER = new BlockBase("tng_flat_matte_red_upper_flat_wall_alt_blue_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_red_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_red_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALT_PANEL_BLUE_TAG = new BlockBase("tng_flat_matte_red_upper_flat_wall_alt_panel_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_red_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_flat_matte_red_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_ALT = new BlockBase("tng_flat_matte_red_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_BLUE_TAG_LOWER = new BlockBase("tng_flat_matte_red_upper_flat_wall_blue_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_BLUE_TAG_UPPER = new BlockBase("tng_flat_matte_red_upper_flat_wall_blue_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_flat_matte_red_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_CONSOLE_ALT_3_BLUE_TAG = new BlockBase("tng_flat_matte_red_upper_flat_wall_console_alt_3_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_flat_matte_red_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_red_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_CONSOLE_BLUE_TAG = new BlockBase("tng_flat_matte_red_upper_flat_wall_console_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_red_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_flat_matte_red_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_flat_matte_red_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_red_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_red_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_red_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_RED_UPPER_FLAT_WALL = new BlockBase("tng_flat_matte_red_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG FLAT MATTE - VIOLET */
	public static final Block TNG_FLAT_MATTE_VIOLET_BASE_LOWER = new BlockBase("tng_flat_matte_violet_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_BASE = new BlockBase("tng_flat_matte_violet_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_violet_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_violet_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_ANGLED_WALL_RAILING_ALT_RED_TAG = new BlockBase("tng_flat_matte_violet_lower_angled_wall_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_flat_matte_violet_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_flat_matte_violet_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_ANGLED_WALL_RAILING_RED_TAG = new BlockBase("tng_flat_matte_violet_lower_angled_wall_railing_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_flat_matte_violet_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_violet_lower_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_ANGLED_WALL = new BlockBase("tng_flat_matte_violet_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_flat_matte_violet_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_violet_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_violet_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_violet_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_RED_TAG = new BlockBase("tng_flat_matte_violet_lower_flat_wall_console_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_FLAT_WALL_CONSOLE_RALING_ALT = new BlockBase("tng_flat_matte_violet_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_violet_lower_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_violet_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_violet_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_FLAT_WALL_RED_TAG = new BlockBase("tng_flat_matte_violet_lower_flat_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_LOWER_FLAT_WALL = new BlockBase("tng_flat_matte_violet_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_PANEL_LOWER = new BlockBase("tng_flat_matte_violet_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_PANEL = new BlockBase("tng_flat_matte_violet_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_violet_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_violet_upper_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_flat_matte_violet_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_ANGLED_WALL_SCREEN_RED_TAG = new BlockBase("tng_flat_matte_violet_upper_angled_wall_screen_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_flat_matte_violet_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_ANGLED_WALL = new BlockBase("tng_flat_matte_violet_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALERT_BAR_PANEL_RED_TAG = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alert_bar_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_LOWER = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alert_bar_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_UPPER = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alert_bar_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALT_2_RED_TAG = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alt_2_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALT_PANEL_RED_TAG = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alt_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALT_RED_TAG_LOWER = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alt_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALT_RED_TAG_UPPER = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alt_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_ALT = new BlockBase("tng_flat_matte_violet_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_flat_matte_violet_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_flat_matte_violet_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_CONSOLE_ALT_3_RED_TAG = new BlockBase("tng_flat_matte_violet_upper_flat_wall_console_alt_3_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_violet_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_violet_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_violet_upper_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_flat_matte_violet_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_flat_matte_violet_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_violet_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_violet_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_violet_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_RED_TAG_LOWER = new BlockBase("tng_flat_matte_violet_upper_flat_wall_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL_RED_TAG_UPPER = new BlockBase("tng_flat_matte_violet_upper_flat_wall_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_VIOLET_UPPER_FLAT_WALL = new BlockBase("tng_flat_matte_violet_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG FLAT MATTE - WHITE */
	public static final Block TNG_FLAT_MATTE_WHITE_BASE_LOWER = new BlockBase("tng_flat_matte_white_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_BASE = new BlockBase("tng_flat_matte_white_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_white_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_white_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_ANGLED_WALL_RAILING_ALT_RED_TAG = new BlockBase("tng_flat_matte_white_lower_angled_wall_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_flat_matte_white_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_flat_matte_white_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_ANGLED_WALL_RAILING_RED_TAG = new BlockBase("tng_flat_matte_white_lower_angled_wall_railing_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_flat_matte_white_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_white_lower_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_ANGLED_WALL = new BlockBase("tng_flat_matte_white_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_flat_matte_white_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_white_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_white_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_white_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_RED_TAG = new BlockBase("tng_flat_matte_white_lower_flat_wall_console_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_FLAT_WALL_CONSOLE_RALING_ALT = new BlockBase("tng_flat_matte_white_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_white_lower_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_white_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_white_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_FLAT_WALL_RED_TAG = new BlockBase("tng_flat_matte_white_lower_flat_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_LOWER_FLAT_WALL = new BlockBase("tng_flat_matte_white_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_PANEL_LOWER = new BlockBase("tng_flat_matte_white_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_PANEL = new BlockBase("tng_flat_matte_white_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_white_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_white_upper_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_flat_matte_white_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_ANGLED_WALL_SCREEN_RED_TAG = new BlockBase("tng_flat_matte_white_upper_angled_wall_screen_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_flat_matte_white_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_ANGLED_WALL = new BlockBase("tng_flat_matte_white_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_white_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_white_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_white_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALERT_BAR_PANEL_RED_TAG = new BlockBase("tng_flat_matte_white_upper_flat_wall_alert_bar_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_flat_matte_white_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_LOWER = new BlockBase("tng_flat_matte_white_upper_flat_wall_alert_bar_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_UPPER = new BlockBase("tng_flat_matte_white_upper_flat_wall_alert_bar_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_flat_matte_white_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_flat_matte_white_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALT_2_RED_TAG = new BlockBase("tng_flat_matte_white_upper_flat_wall_alt_2_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_flat_matte_white_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_white_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_white_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_white_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALT_PANEL_RED_TAG = new BlockBase("tng_flat_matte_white_upper_flat_wall_alt_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_flat_matte_white_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALT_RED_TAG_LOWER = new BlockBase("tng_flat_matte_white_upper_flat_wall_alt_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALT_RED_TAG_UPPER = new BlockBase("tng_flat_matte_white_upper_flat_wall_alt_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_ALT = new BlockBase("tng_flat_matte_white_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_flat_matte_white_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_flat_matte_white_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_CONSOLE_ALT_3_RED_TAG = new BlockBase("tng_flat_matte_white_upper_flat_wall_console_alt_3_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_white_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_white_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_white_upper_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_flat_matte_white_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_flat_matte_white_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_white_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_white_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_white_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_RED_TAG_LOWER = new BlockBase("tng_flat_matte_white_upper_flat_wall_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL_RED_TAG_UPPER = new BlockBase("tng_flat_matte_white_upper_flat_wall_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_WHITE_UPPER_FLAT_WALL = new BlockBase("tng_flat_matte_white_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	/* TNG FLAT MATTE - YELLOW */
	public static final Block TNG_FLAT_MATTE_YELLOW_BASE_LOWER = new BlockBase("tng_flat_matte_yellow_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_BASE = new BlockBase("tng_flat_matte_yellow_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_yellow_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_yellow_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_ANGLED_WALL_RAILING_ALT_RED_TAG = new BlockBase("tng_flat_matte_yellow_lower_angled_wall_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_flat_matte_yellow_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_flat_matte_yellow_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_ANGLED_WALL_RAILING_RED_TAG = new BlockBase("tng_flat_matte_yellow_lower_angled_wall_railing_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_flat_matte_yellow_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_yellow_lower_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_ANGLED_WALL = new BlockBase("tng_flat_matte_yellow_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_flat_matte_yellow_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_yellow_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_yellow_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_GOLD_TAG = new BlockBase("tng_flat_matte_yellow_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_FLAT_WALL_CONSOLE_RALING_ALT_RED_TAG = new BlockBase("tng_flat_matte_yellow_lower_flat_wall_console_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_FLAT_WALL_CONSOLE_RALING_ALT = new BlockBase("tng_flat_matte_yellow_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_yellow_lower_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_yellow_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_yellow_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_FLAT_WALL_RED_TAG = new BlockBase("tng_flat_matte_yellow_lower_flat_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_LOWER_FLAT_WALL = new BlockBase("tng_flat_matte_yellow_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_PANEL_LOWER = new BlockBase("tng_flat_matte_yellow_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_PANEL = new BlockBase("tng_flat_matte_yellow_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_flat_matte_yellow_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_ANGLED_WALL_RED_TAG = new BlockBase("tng_flat_matte_yellow_upper_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_flat_matte_yellow_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_ANGLED_WALL_SCREEN_RED_TAG = new BlockBase("tng_flat_matte_yellow_upper_angled_wall_screen_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_flat_matte_yellow_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_ANGLED_WALL = new BlockBase("tng_flat_matte_yellow_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALERT_BAR_PANEL_RED_TAG = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alert_bar_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_LOWER = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alert_bar_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_UPPER = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alert_bar_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALT_2_RED_TAG = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alt_2_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALT_PANEL_RED_TAG = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alt_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALT_RED_TAG_LOWER = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alt_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALT_RED_TAG_UPPER = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alt_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_ALT = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_CONSOLE_ALT_3_RED_TAG = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_console_alt_3_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_RED_TAG_LOWER = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL_RED_TAG_UPPER = new BlockBase("tng_flat_matte_yellow_upper_flat_wall_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_FLAT_MATTE_YELLOW_UPPER_FLAT_WALL = new BlockBase("tng_flat_matte_yellow_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	//
	//*//* TNG CORRIDOR - METAL LIGHT BLOCKS *//*//
	//
	/* TNG METAL - LIGHT */
	public static final Block TNG_METAL_METAL_LIGHT_BASE_LOWER = new BlockBase("tng_metal_metal_light_base_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_BASE = new BlockBase("tng_metal_metal_light_base", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_ANGLED_WALL_BLUE_TAG = new BlockBase("tng_metal_metal_light_lower_angled_wall_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_metal_metal_light_lower_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_ANGLED_WALL_RAILING_ALT_BLUE_TAG = new BlockBase("tng_metal_metal_light_lower_angled_wall_railing_alt_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_ANGLED_WALL_RAILING_ALT_GOLD_TAG = new BlockBase("tng_metal_metal_light_lower_angled_wall_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_ANGLED_WALL_RAILING_ALT_RED_TAG = new BlockBase("tng_metal_metal_light_lower_angled_wall_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_ANGLED_WALL_RAILING_ALT = new BlockBase("tng_metal_metal_light_lower_angled_wall_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_ANGLED_WALLRAILING_BLUE_TAG = new BlockBase("tng_metal_metal_light_lower_angled_wall_railing_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_ANGLED_WALL_RAILING_GOLD_TAG = new BlockBase("tng_metal_metal_light_lower_angled_wall_railing_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_ANGLED_WALL_RAILING_RED_TAG = new BlockBase("tng_metal_metal_light_lower_angled_wall_railing_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_ANGLED_WALL_RAILING = new BlockBase("tng_metal_metal_light_lower_angled_wall_railing", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_ANGLED_WALL_RED_TAG = new BlockBase("tng_metal_metal_light_lower_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_ANGLED_WALL = new BlockBase("tng_metal_metal_light_lower_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_FLAT_WALL_BLUE_TAG = new BlockBase("tng_metal_metal_light_lower_flat_wall_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_FLAT_WALL_CONSOLE_ALT_2 = new BlockBase("tng_metal_metal_light_lower_flat_wall_console_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_metal_metal_light_lower_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_FLAT_WALL_CONSOLE_BLUE_TAG = new BlockBase("tng_metal_metal_light_lower_flat_wall_console_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_metal_metal_light_lower_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT_BLUE_TAG = new BlockBase("tng_metal_metal_light_lower_flat_wall_console_railing_alt_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT_GOLD_TAG = new BlockBase("tng_metal_metal_light_lower_flat_wall_console_railing_alt_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT_RED_TAG = new BlockBase("tng_metal_metal_light_lower_flat_wall_console_railing_alt_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_FLAT_WALL_CONSOLE_RAILING_ALT = new BlockBase("tng_metal_metal_light_lower_flat_wall_console_railing_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_metal_metal_light_lower_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_FLAT_WALL_CONSOLE = new BlockBase("tng_metal_metal_light_lower_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_FLAT_WALL_GOLD_TAG = new BlockBase("tng_metal_metal_light_lower_flat_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_FLAT_WALL_RED_TAG = new BlockBase("tng_metal_metal_light_lower_flat_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_LOWER_FLAT_WALL = new BlockBase("tng_metal_metal_light_lower_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_PANEL_LOWER = new BlockBase("tng_metal_metal_light_panel_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_PANEL = new BlockBase("tng_metal_metal_light_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_ANGLED_WALL_BLUE_TAG = new BlockBase("tng_metal_metal_light_upper_angled_wall_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_ANGLED_WALL_GOLD_TAG = new BlockBase("tng_metal_metal_light_upper_angled_wall_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_ANGLED_WALL_RED_TAG = new BlockBase("tng_metal_metal_light_upper_angled_wall_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_ANGLED_WALL_SCREEN_BLUE_TAG = new BlockBase("tng_metal_metal_light_upper_angled_wall_screen_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_ANGLED_WALL_SCREEN_GOLD_TAG = new BlockBase("tng_metal_metal_light_upper_angled_wall_screen_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_ANGLED_WALL_SCREEN_RED_TAG = new BlockBase("tng_metal_metal_light_upper_angled_wall_screen_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_ANGLED_WALL_SCREEN = new BlockBase("tng_metal_metal_light_upper_angled_wall_screen", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_ANGLED_WALL = new BlockBase("tng_metal_metal_light_upper_angled_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALERT_BAR_BLUE_TAG_LOWER = new BlockBase("tng_metal_metal_light_upper_flat_wall_alert_bar_blue_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALERT_BAR_BLUE_TAG_UPPER = new BlockBase("tng_metal_metal_light_upper_flat_wall_alert_bar_blue_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_LOWER = new BlockBase("tng_metal_metal_light_upper_flat_wall_alert_bar_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALERT_BAR_GOLD_TAG_UPPER = new BlockBase("tng_metal_metal_light_upper_flat_wall_alert_bar_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALERT_BAR_PANEL_BLUE_TAG = new BlockBase("tng_metal_metal_light_upper_flat_wall_alert_bar_panel_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALERT_BAR_PANEL_GOLD_TAG = new BlockBase("tng_metal_metal_light_upper_flat_wall_alert_bar_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALERT_BAR_PANEL_RED_TAG = new BlockBase("tng_metal_metal_light_upper_flat_wall_alert_bar_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALERT_BAR_PANEL = new BlockBase("tng_metal_metal_light_upper_flat_wall_alert_bar_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_LOWER = new BlockBase("tng_metal_metal_light_upper_flat_wall_alert_bar_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALERT_BAR_RED_TAG_UPPER = new BlockBase("tng_metal_metal_light_upper_flat_wall_alert_bar_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALERT_BAR = new BlockBase("tng_metal_metal_light_upper_flat_wall_alert_bar", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALT_2_BLUE_TAG = new BlockBase("tng_metal_metal_light_upper_flat_wall_alt_2_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALT_2_GOLD_TAG = new BlockBase("tng_metal_metal_light_upper_flat_wall_alt_2_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALT_2_RED_TAG = new BlockBase("tng_metal_metal_light_upper_flat_wall_alt_2_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALT_2 = new BlockBase("tng_metal_metal_light_upper_flat_wall_alt_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALT_BLUE_TAG_LOWER = new BlockBase("tng_metal_metal_light_upper_flat_wall_alt_blue_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALT_BLUE_TAG_UPPER = new BlockBase("tng_metal_metal_light_upper_flat_wall_alt_blue_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALT_GOLD_TAG_LOWER = new BlockBase("tng_metal_metal_light_upper_flat_wall_alt_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALT_GOLD_TAG_UPPER = new BlockBase("tng_metal_metal_light_upper_flat_wall_alt_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALT_PANEL_BLUE_TAG = new BlockBase("tng_metal_metal_light_upper_flat_wall_alt_panel_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALT_PANEL_GOLD_TAG = new BlockBase("tng_metal_metal_light_upper_flat_wall_alt_panel_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALT_PANEL_RED_TAG = new BlockBase("tng_metal_metal_light_upper_flat_wall_alt_panel_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALT_PANEL = new BlockBase("tng_metal_metal_light_upper_flat_wall_alt_panel", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALT_RED_TAG_LOWER = new BlockBase("tng_metal_metal_light_upper_flat_wall_alt_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALT_RED_TAG_UPPER = new BlockBase("tng_metal_metal_light_upper_flat_wall_alt_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_ALT = new BlockBase("tng_metal_metal_light_upper_flat_wall_alt", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_BLUE_TAG_LOWER = new BlockBase("tng_metal_metal_light_upper_flat_wall_blue_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_BLUE_TAG_UPPER = new BlockBase("tng_metal_metal_light_upper_flat_wall_blue_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_CONSOLE_AETHER = new BlockBase("tng_metal_metal_light_upper_flat_wall_console_aether", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_CONSOLE_ALT_3_BLUE_TAG = new BlockBase("tng_metal_metal_light_upper_flat_wall_console_alt_3_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_CONSOLE_ALT_3_GOLD_TAG = new BlockBase("tng_metal_metal_light_upper_flat_wall_console_alt_3_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_CONSOLE_ALT_3_RED_TAG = new BlockBase("tng_metal_metal_light_upper_flat_wall_console_alt_3_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_CONSOLE_ALT_3 = new BlockBase("tng_metal_metal_light_upper_flat_wall_console_alt_3", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_CONSOLE_BLUE_TAG = new BlockBase("tng_metal_metal_light_upper_flat_wall_console_blue_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_CONSOLE_GOLD_TAG = new BlockBase("tng_metal_metal_light_upper_flat_wall_console_gold_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_CONSOLE_RED_TAG = new BlockBase("tng_metal_metal_light_upper_flat_wall_console_red_tag", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_CONSOLE_TNG_1 = new BlockBase("tng_metal_metal_light_upper_flat_wall_console_tng_1", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_CONSOLE_TNG_2 = new BlockBase("tng_metal_metal_light_upper_flat_wall_console_tng_2", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_CONSOLE = new BlockBase("tng_metal_metal_light_upper_flat_wall_console", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_GOLD_TAG_LOWER = new BlockBase("tng_metal_metal_light_upper_flat_wall_gold_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_GOLD_TAG_UPPER = new BlockBase("tng_metal_metal_light_upper_flat_wall_gold_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_RED_TAG_LOWER = new BlockBase("tng_metal_metal_light_upper_flat_wall_red_tag_lower", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL_RED_TAG_UPPER = new BlockBase("tng_metal_metal_light_upper_flat_wall_red_tag_upper", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	public static final Block TNG_METAL_METAL_LIGHT_UPPER_FLAT_WALL = new BlockBase("tng_metal_metal_light_upper_flat_wall", Material.IRON, MineTrekMod.TAB_TNG, 1.0f, 0, SoundType.METAL);
	//
	//
	//******************************************************************************************************************************************************//

	
	

	
	
	
	//******************************************************************************************************************************************************//
	///										   ///
	/// *** MTMOD Version 2.1.0 Blocks Inits *** ///
    ///		 								   ///
		
	//
	/*
	 * NEW 2.1.0 BLOCK NAME HERE
	 */
	
	//
	//
	/*
	 * NEW 2.1.0 BLOCK NAME HERE
	 */

	//
	//
}
