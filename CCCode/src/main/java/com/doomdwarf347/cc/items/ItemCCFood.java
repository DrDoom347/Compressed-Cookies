package com.doomdwarf347.cc.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemCCFood extends ItemFood
{
	public ItemCCFood(int healAmount, float saturationModifier, boolean wolvesFavorite) {
		super(healAmount, saturationModifier, wolvesFavorite);
		this.setCreativeTab(CreativeTabs.FOOD);
	}
}
