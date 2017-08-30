package com.doomdwarf347.cc.proxies;

import com.doomdwarf347.cc.init.CCItems;

public class ClientProxy extends CommonProxy
{
	public void registerRenderers()
	{
		CCItems.registerItemRenderer();
	}
}
