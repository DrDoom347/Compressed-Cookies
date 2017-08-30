package com.doomdwarf347.cc.init;

import com.doomdwarf347.cc.helpers.RegisterHelper;
import com.doomdwarf347.cc.items.ItemCCFood;

import net.minecraft.item.Item;

public class CCItems
{
	public static Item compressed_cookie = new ItemCCFood(18, 1.0F, true).setRegistryName("compressed_cookie");
	public static Item two_compressed_cookie = new ItemCCFood(162, 1.0F, true).setRegistryName("two_compressed_cookie");
	public static Item three_compressed_cookie = new ItemCCFood(1458, 2.0F, true).setRegistryName("three_compressed_cookie");
	public static Item four_compressed_cookie = new ItemCCFood(13122, 2.0F, true).setRegistryName("four_compressed_cookie");
	public static Item five_compressed_cookie = new ItemCCFood(118098, 3.0F, true).setRegistryName("five_compressed_cookie");
	public static Item six_compressed_cookie = new ItemCCFood(1062882, 3.0F, true).setRegistryName("six_compressed_cookie");
	public static Item seven_compressed_cookie = new ItemCCFood(9565938, 4.0F, true).setRegistryName("seven_compressed_cookie");
	public static Item eight_compressed_cookie = new ItemCCFood(86093442, 5.0F, true).setRegistryName("eight_compressed_cookie");
	
	public static void registerItems()
	{
		RegisterHelper.registerItem(compressed_cookie);
		RegisterHelper.registerItem(two_compressed_cookie);
		RegisterHelper.registerItem(three_compressed_cookie);
		RegisterHelper.registerItem(four_compressed_cookie);
		RegisterHelper.registerItem(five_compressed_cookie);
		RegisterHelper.registerItem(six_compressed_cookie);
		RegisterHelper.registerItem(seven_compressed_cookie);
		RegisterHelper.registerItem(eight_compressed_cookie);
	}

	public static void registerItemRenderer()
	{
		RegisterHelper.registerItemRenderer(compressed_cookie);
		RegisterHelper.registerItemRenderer(two_compressed_cookie);
		RegisterHelper.registerItemRenderer(three_compressed_cookie);
		RegisterHelper.registerItemRenderer(four_compressed_cookie);
		RegisterHelper.registerItemRenderer(five_compressed_cookie);
		RegisterHelper.registerItemRenderer(six_compressed_cookie);
		RegisterHelper.registerItemRenderer(seven_compressed_cookie);
		RegisterHelper.registerItemRenderer(eight_compressed_cookie);
	}
}
