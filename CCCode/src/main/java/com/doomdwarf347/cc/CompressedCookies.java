package com.doomdwarf347.cc;

import com.doomdwarf347.cc.crafting.Recipes;
import com.doomdwarf347.cc.init.CCItems;
import com.doomdwarf347.cc.proxies.ClientProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class CompressedCookies
{
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static ClientProxy proxy;
	
	@Instance(Reference.MODID)
	public static CompressedCookies instance;
	
	 @Mod.EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {
		 	CCItems.registerItems();
	    	proxy.registerRenderers();
	    }

		@Mod.EventHandler
	    public void init(FMLInitializationEvent event)
	    {
			Recipes.addShapedRecipe();
			Recipes.addShapelessRecipe();
	    }

	    @Mod.EventHandler
	    public void postInit(FMLPostInitializationEvent event)
	    {

	    }
}
