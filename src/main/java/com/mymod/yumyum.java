package com.mymod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class yumyum extends ItemFood {

	public yumyum(String name)
	{
		super(2, 0.3F, false);
		setUnlocalizedName(name);
		setCreativeTab(mymod.Mytab);
		setTextureName(mymod.modid  + ":" + getUnlocalizedName().substring(5));
		setPotionEffect(17, 1000000, 255,1);
	}
	
	@Override
	protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if(!par2World.isRemote)
		{
			par3EntityPlayer.addChatComponentMessage(new ChatComponentText("Yum!"));
		}
		super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
	}

}
