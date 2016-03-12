package com.mymod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class pic extends ItemPickaxe
{

	public pic(ToolMaterial mat, String name) {
		super(mat);
		setUnlocalizedName(name);
		setTextureName(mymod.modid + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(mymod.Mytab);
		// TODO Auto-generated constructor stub
	}

}
