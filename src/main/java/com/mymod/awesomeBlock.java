package com.mymod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class awesomeBlock extends Block {

	public awesomeBlock(Material mat, String name) {
		super(mat);
		setBlockName(name);
		setBlockTextureName(mymod.modid + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(mymod.Mytab);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Item getItemDropped(int i, Random rand, int j)
	{
		double random = Math.random();
		if(random < 0.5)
		{
			return Item.getItemFromBlock(Blocks.dirt);
		}
		else
		{
			return Items.diamond;
		}
	}

}
