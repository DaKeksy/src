package de.dakeksy.moreutils.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import de.dakeksy.moreutils.MoreUtils;
import net.minecraft.item.Item;

public class Items {

	public static Item stoneRod;
	public static Item betterStoneAxe;
	public static Item betterStonePickaxe;
	public static Item betterStoneShovel;
	public static Item betterStoneHoe;
	public static Item betterStoneSword;
	
	public static void init(){
		
		stoneRod = new ItemStoneRod(3300).setUnlocalizedName("stoneRod");
		betterStoneAxe = new ItemBetterStoneAxe(3301, MoreUtils.betterStoneTools).setUnlocalizedName("betterStone_axe");
		betterStonePickaxe = new ItemBetterStonePickaxe(3302, MoreUtils.betterStoneTools).setUnlocalizedName("betterStone_pickaxe");
		betterStoneShovel = new ItemBetterStoneShovel(3303, MoreUtils.betterStoneTools).setUnlocalizedName("betterStone_shovel");
		betterStoneHoe = new ItemBetterStoneHoe(3304, MoreUtils.betterStoneTools).setUnlocalizedName("betterStone_hoe");
		betterStoneSword = new ItemBetterStoneSword(3305, MoreUtils.betterStoneTools).setUnlocalizedName("betterStone_sword");
		
		GameRegistry.registerItem(stoneRod, "stoneRod");
		GameRegistry.registerItem(betterStoneAxe, "betterStone_axe");
		GameRegistry.registerItem(betterStonePickaxe, "betterStone_pickaxe");
		GameRegistry.registerItem(betterStoneShovel, "betterStone_shovel");
		GameRegistry.registerItem(betterStoneHoe, "betterStone_hoe");
		GameRegistry.registerItem(betterStoneSword, "betterStone_sword");
		
		LanguageRegistry.addName(stoneRod, "Stone Rod");
		LanguageRegistry.addName(betterStoneAxe, "Better Stone Axe");
		LanguageRegistry.addName(betterStonePickaxe, "Better Stone Pickaxe");
		LanguageRegistry.addName(betterStoneShovel, "Better Stone Shovel");
		LanguageRegistry.addName(betterStoneHoe, "Better Stone Hoe");
		LanguageRegistry.addName(betterStoneSword, "Better Stone Sword");
		
	}
	
}
