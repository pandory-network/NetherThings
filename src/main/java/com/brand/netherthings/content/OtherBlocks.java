package com.brand.netherthings.content;

import com.brand.netherthings.blocks.BaseSpongeBlock;
import com.brand.netherthings.blocks.BaseWetSpongeBlock;
import com.brand.netherthings.blocks.BlockBase;
import com.brand.netherthings.blocks.GlowingMushroom;
import com.brand.netherthings.blocks.GlowingMushroomBlock;
import com.brand.netherthings.blocks.NetherCactusBlock;
import com.brand.netherthings.blocks.SlabBlockBase;
import com.brand.netherthings.blocks.StairsBlockBase;

import net.minecraft.util.DyeColor;

public class OtherBlocks {
	
	  public static NetherCactusBlock NETHER_CACTUS;
	  public static GlowingMushroomBlock GREEN_GLOWING_MUSHROOM_BLOCK;
	  public static GlowingMushroomBlock BLUE_GLOWING_MUSHROOM_BLOCK;
	  public static GlowingMushroomBlock PURPLE_GLOWING_MUSHROOM_BLOCK;
	  public static GlowingMushroom GREEN_GLOWING_MUSHROOM;
	  public static GlowingMushroom BLUE_GLOWING_MUSHROOM;
	  public static GlowingMushroom PURPLE_GLOWING_MUSHROOM;
	  public static BlockBase BASALT;
	  public static BlockBase BASALT_BRICKS;
	  public static BlockBase SMOOTH_BASALT;
	  public static StairsBlockBase BASALT_BRICKS_STAIRS;
	  public static SlabBlockBase BASALT_BRICKS_SLAB;
	  public static BaseSpongeBlock LAVA_SPONGE;
	  public static BaseWetSpongeBlock WET_LAVA_SPONGE;

	public static void init() {
		  
	NETHER_CACTUS = new NetherCactusBlock("nether_cactus", 0.4f, 2.0f);
	GREEN_GLOWING_MUSHROOM_BLOCK = new GlowingMushroomBlock("green_glowing_mushroom_block", 0.2f, 1.0f, DyeColor.LIME);
	BLUE_GLOWING_MUSHROOM_BLOCK = new GlowingMushroomBlock("blue_glowing_mushroom_block", 0.2f, 1.0f, DyeColor.BLUE);
	PURPLE_GLOWING_MUSHROOM_BLOCK = new GlowingMushroomBlock("purple_glowing_mushroom_block", 0.2f, 1.0f, DyeColor.PURPLE);
    GREEN_GLOWING_MUSHROOM = new GlowingMushroom("green_glowing_mushroom", 0.0f, 0.0f);
    BLUE_GLOWING_MUSHROOM = new GlowingMushroom("blue_glowing_mushroom", 0.0f, 0.0f);
    PURPLE_GLOWING_MUSHROOM = new GlowingMushroom("purple_glowing_mushroom", 0.0f, 0.0f);
    BASALT = new BlockBase("basalt", 1.5f, 30.0f);
    BASALT_BRICKS = new BlockBase("basalt_bricks", 1.5f, 30.0f);
    BASALT_BRICKS_STAIRS = new StairsBlockBase(BASALT_BRICKS.getDefaultState(), "basalt_bricks_stairs", 1.5f, 30.0f);
    BASALT_BRICKS_SLAB = new SlabBlockBase("basalt_bricks_slab", 1.5f, 30.0f);
    SMOOTH_BASALT = new BlockBase("smooth_basalt", 1.5f, 30.0f);
    LAVA_SPONGE = new BaseSpongeBlock("lava_sponge", 0.6f, 3.0f);
    WET_LAVA_SPONGE = new BaseWetSpongeBlock("wet_lava_sponge", 0.6f, 3.0f);
	}
}
