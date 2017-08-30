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
		GameRegistry.addShapedRecipe(new ItemStack(CCItems.compressed_cookie), new Object[] {"AAA", "AAA", "AAA", 'A', Items.COOKIE});
		GameRegistry.addShapedRecipe(new ItemStack(CCItems.two_compressed_cookie), new Object[] {"AAA", "AAA", "AAA", 'A', CCItems.compressed_cookie});
		GameRegistry.addShapedRecipe(new ItemStack(CCItems.three_compressed_cookie), new Object[] {"AAA", "AAA", "AAA", 'A', CCItems.two_compressed_cookie});
		GameRegistry.addShapedRecipe(new ItemStack(CCItems.four_compressed_cookie), new Object[] {"AAA", "AAA", "AAA", 'A', CCItems.three_compressed_cookie});
		GameRegistry.addShapedRecipe(new ItemStack(CCItems.five_compressed_cookie), new Object[] {"AAA", "AAA", "AAA", 'A', CCItems.four_compressed_cookie});
		GameRegistry.addShapedRecipe(new ItemStack(CCItems.six_compressed_cookie), new Object[] {"AAA", "AAA", "AAA", 'A', CCItems.five_compressed_cookie});
		GameRegistry.addShapedRecipe(new ItemStack(CCItems.seven_compressed_cookie), new Object[] {"AAA", "AAA", "AAA", 'A', CCItems.six_compressed_cookie});
		GameRegistry.addShapedRecipe(new ItemStack(CCItems.eight_compressed_cookie), new Object[] {"AAA", "AAA", "AAA", 'A', CCItems.seven_compressed_cookie});
	}
	
	public static void addShapelessRecipe()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BEDROCK), new ItemStack(Items.BED), new ItemStack(Blocks.COBBLESTONE));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.COOKIE,9), new ItemStack(CCItems.compressed_cookie));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.compressed_cookie,9), new ItemStack(CCItems.two_compressed_cookie));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.two_compressed_cookie,9), new ItemStack(CCItems.three_compressed_cookie));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.three_compressed_cookie,9), new ItemStack(CCItems.four_compressed_cookie));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.four_compressed_cookie,9), new ItemStack(CCItems.five_compressed_cookie));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.five_compressed_cookie,9), new ItemStack(CCItems.six_compressed_cookie));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.six_compressed_cookie,9), new ItemStack(CCItems.seven_compressed_cookie));
		GameRegistry.addShapelessRecipe(new ItemStack(CCItems.seven_compressed_cookie,9), new ItemStack(CCItems.eight_compressed_cookie));
	}
}
