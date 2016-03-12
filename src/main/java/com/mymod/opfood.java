package com.mymod;

import net.minecraft.item.ItemFood;

public class opfood extends ItemFood {

	public opfood(int hunger, float sat, boolean canFeedWolf,String name) {
		super(hunger, sat, canFeedWolf);
		setUnlocalizedName(name);
		setCreativeTab(mymod.Mytab);
		setTextureName(getUnlocalizedName().substring(5));
		setPotionEffect(11, 1000000, 255, 1);

	}

}
