package de.dakeksy.moreutils.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import de.dakeksy.moreutils.items.Items;

public class Recipes {

	public static void init() {
		GameRegistry.addRecipe(new ItemStack(Items.stoneRod, 4), new Object[] {
				" X", "X ", 'X', Block.stone });

		GameRegistry.addRecipe(new ItemStack(Items.betterStoneAxe),
				new Object[] { "TT ", "TY ", " Y ", 'T', Block.stone, 'Y',
						Items.stoneRod });

		GameRegistry.addRecipe(new ItemStack(Items.betterStonePickaxe, 1), new Object[] {
				"TTT", " Y ", " Y ", 'T', Block.stone, 'Y', Items.stoneRod });

		GameRegistry.addRecipe(new ItemStack(Items.betterStoneSword, 1), new Object[] {
				" T ", " T ", " Y ", 'T', Block.stone, 'Y', Items.stoneRod });

		GameRegistry.addRecipe(new ItemStack(Items.betterStoneHoe, 1), new Object[] {
				"TT ", " Y ", " Y ", 'T', Block.stone, 'Y', Items.stoneRod });
		GameRegistry.addRecipe(new ItemStack(Items.betterStoneShovel, 1), new Object[] {
				" T ", " Y ", " Y ", 'T', Block.stone, 'Y', Items.stoneRod });

	}
}
