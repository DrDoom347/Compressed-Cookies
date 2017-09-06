package com.doomdwarf347.cc.crafting;

import com.doomdwarf347.cc.init.CCItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes
{
	public static void addShapedRecipe()
	{
		GameRegistry.addShapedRecipe(new ItemStack(CCItems.cc), new Object[] {"AAA", "AAA", "AAA", 'A', Items.COOKIE});
		GameRegistry.addShapedRecipe(new ItemStack(CCItems.cctwo), new Object[] {"AAA", "AAA", "AAA", 'A', CCItems.cc});
		GameRegistry.addShapedRecipe(new ItemStack(CCItems.ccthree), new Object[] {"AAA", "AAA", "AAA", 'A', CCItems.cctwo});
		GameRegistry.addShapedRecipe(new ItemStack(CCItems.ccfour), new Object[] {"AAA", "AAA", "AAA", 'A', CCItems.ccthree});
		GameRegistry.addShapedRecipe(new ItemStack(CCItems.ccfive), new Object[] {"AAA", "AAA", "AAA", 'A', CCItems.ccfour});
		GameRegistry.addShapedRecipe(new ItemStack(CCItems.ccsix), new Object[] {"AAA", "AAA", "AAA", 'A', CCItems.ccfive});
		GameRegistry.addShapedRecipe(new ItemStack(CCItems.ccseven), new Object[] {"AAA", "AAA", "AAA", 'A', CCItems.ccsix});
		GameRegistry.addShapedRecipe(new ItemStack(CCItems.cceight), new Object[] {"AAA", "AAA", "AAA", 'A', CCItems.ccseven});
	}
	
	public static void addShapelessRecipe()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BEDROCK), new ItemStack(Items.BED), new ItemStack(Blocks.COBBLESTONE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.COOKIE,9), new ItemStack(CCItems.cc));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.cc,9), new ItemStack(CCItems.cctwo));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.cctwo,9), new ItemStack(CCItems.ccthree));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.ccthree,9), new ItemStack(CCItems.ccfour));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.ccfour,9), new ItemStack(CCItems.ccfive));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.ccfive,9), new ItemStack(CCItems.ccsix));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.ccsix,9), new ItemStack(CCItems.ccseven));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.ccseven,9), new ItemStack(CCItems.cceight));
	}
}
