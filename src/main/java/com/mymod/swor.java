package com.mymod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class swor extends ItemSword
{

	public swor(ToolMaterial mat, String name) {
		super(mat);
		setUnlocalizedName(name);
		setTextureName(mymod.modid + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(mymod.Mytab);
		// TODO Auto-generated constructor stub
	}

}
