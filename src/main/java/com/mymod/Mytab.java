package com.mymod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Mytab extends CreativeTabs {

	
	public Mytab(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return mymod.pic;
	}

}
