package com.mymod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class awesomeItem extends Item {
	public awesomeItem(String name)
	{
		super();
		setUnlocalizedName(name);
		setCreativeTab(mymod.Mytab);
		setTextureName(mymod.modid + ":" + getUnlocalizedName().substring(5));
	}

}
