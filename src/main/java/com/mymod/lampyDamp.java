package com.mymod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class lampyDamp extends Block {
	public final Boolean isLit;

	protected lampyDamp(String name, boolean lit)
	{
		super(Material.redstoneLight);
		isLit= lit;
		setBlockName(name);
		setBlockTextureName(mymod.modid + ":" + this.getUnlocalizedName().substring(5));
		if(lit)
		{
			setLightLevel(1.0f);
		}
		else
		{
			setCreativeTab(mymod.Mytab);
			setLightLevel(.5f);
		}

	}
	
	
@Override
public void onBlockAdded(World worldIn, int x, int y, int z)
{
	super.onBlockAdded(worldIn, x, y, z);
	if(!worldIn.isRemote)
	{
		if(this.isLit && !worldIn.isBlockIndirectlyGettingPowered(x, y, z))
		{
			worldIn.scheduleBlockUpdate(x, y, z, this, 4);
		}
		else if(!this.isLit && worldIn.isBlockIndirectlyGettingPowered(x, y, z))
		{
			worldIn.setBlock(x, y, z, mymod.lit_lampydamp, 0 ,2);																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
		}
	}
}

@Override
public void onNeighborBlockChange(World worldIn, int x, int y, int z, Block blockIn)
{
	super.onNeighborBlockChange(worldIn, x,y,z, blockIn);
	if(!worldIn.isRemote)
	{
		if(this.isLit && !worldIn.isBlockIndirectlyGettingPowered(x, y, z))
		{
			worldIn.scheduleBlockUpdate(x, y, z, this, 4);
		}
		else if(!this.isLit && worldIn.isBlockIndirectlyGettingPowered(x, y, z))
		{
			worldIn.setBlock(x, y, z, mymod.lit_lampydamp, 0 ,2);																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
		}
	}
}

@Override
public void updateTick(World worldIn, int x, int y, int z, Random p_149674_5_) {
	super.updateTick(worldIn, x,y,z,p_149674_5_);
	if(!worldIn.isRemote)
	{
		if(this.isLit && !worldIn.isBlockIndirectlyGettingPowered(x, y, z))
		{
			worldIn.setBlock(x, y, z, mymod.unlit_lampydamp, 0, 2);	
		}
	}
	
}


	

}
