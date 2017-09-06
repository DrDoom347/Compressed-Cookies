package com.doomdwarf347.cc.init;

import com.doomdwarf347.cc.helpers.RegisterHelper;
import com.doomdwarf347.cc.items.ItemCCFood;

import net.minecraft.item.Item;

public class CCItems
{
	public static Item cc = new ItemCCFood(18, 1.0F, true).setRegistryName("cc");
	public static Item cctwo = new ItemCCFood(162, 1.0F, true).setRegistryName("cctwo");
	public static Item ccthree = new ItemCCFood(1458, 2.0F, true).setRegistryName("ccthree");
	public static Item ccfour = new ItemCCFood(13122, 2.0F, true).setRegistryName("ccfour");
	public static Item ccfive = new ItemCCFood(118098, 3.0F, true).setRegistryName("ccfive");
	public static Item ccsix = new ItemCCFood(1062882, 3.0F, true).setRegistryName("ccsix");
	public static Item ccseven = new ItemCCFood(9565938, 4.0F, true).setRegistryName("ccseven");
	public static Item cceight = new ItemCCFood(86093442, 5.0F, true).setRegistryName("cceight");
	
	public static void registerItems()
	{
		RegisterHelper.registerItem(cc);
		RegisterHelper.registerItem(cctwo);
		RegisterHelper.registerItem(ccthree);
		RegisterHelper.registerItem(ccfour);
		RegisterHelper.registerItem(ccfive);
		RegisterHelper.registerItem(ccsix);
		RegisterHelper.registerItem(ccseven);
		RegisterHelper.registerItem(cceight);
	}

	public static void registerItemRenderer()
	{
		RegisterHelper.registerItemRenderer(cc);
		RegisterHelper.registerItemRenderer(cctwo);
		RegisterHelper.registerItemRenderer(ccthree);
		RegisterHelper.registerItemRenderer(ccfour);
		RegisterHelper.registerItemRenderer(ccfive);
		RegisterHelper.registerItemRenderer(ccsix);
		RegisterHelper.registerItemRenderer(ccseven);
		RegisterHelper.registerItemRenderer(cceight);
	}
}
