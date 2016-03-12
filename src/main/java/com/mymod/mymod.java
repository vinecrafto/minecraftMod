package com.mymod;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = mymod.modid, version = mymod.version)
public class mymod {
	
	public static final String modid = "mymod";
	public static final String version = "1.0";
	
	
	/**
	 * DECLARATION SECTION 
	 * *********************************************************** */ 
	public static Item awesomeItem;
	
	public static Block awesomeBlock; 
	public static Block unlit_lampydamp;
	public static Block lit_lampydamp;

	//mitrals
	public static ToolMaterial awesomeMat = EnumHelper.addToolMaterial("awesome", 3, 1000000, 15, 1000000, 700);
	public static Item pic;
	public static Item swor;
	public static CreativeTabs Mytab = new Mytab("tab");
	public static Item opfood;

	/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */	
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
		
	/**
	* INITIALIZATION SECTION 
	* *********************************************************** */ 
		
	//items
	awesomeItem = new awesomeItem("awesome_item");
	GameRegistry.registerItem(awesomeItem, awesomeItem.getUnlocalizedName().substring(5));
	 
	swor = new swor(awesomeMat, "swor");
	GameRegistry.registerItem(swor, swor.getUnlocalizedName().substring(5));
	
	pic = new pic(awesomeMat, "pic");
	GameRegistry.registerItem(pic, pic.getUnlocalizedName().substring(5));
	
	opfood = new opfood(20, 1, false, "opfood");
	GameRegistry.registerItem(opfood, opfood.getUnlocalizedName().substring(5));

	
	//blocks
	awesomeBlock = new awesomeBlock(Material.cloth, "awesome_block");
	GameRegistry.registerBlock(awesomeBlock, awesomeBlock.getUnlocalizedName().substring(5));
	
	unlit_lampydamp = new lampyDamp("unlit_lampydamp", false);
	GameRegistry.registerBlock(unlit_lampydamp, unlit_lampydamp.getUnlocalizedName().substring(5));
	
	lit_lampydamp = new lampyDamp("lit_lampydamp", true);
	GameRegistry.registerBlock(lit_lampydamp, lit_lampydamp.getUnlocalizedName().substring(5));
	
		
		
	}
	
	/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */
	
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
	/**
	* RECIPES SECTION 
	* *********************************************** ************ */
	GameRegistry.addRecipe(new ItemStack(awesomeItem,16), new Object[]{
		
		"NNN",
		"NRN",
		"NNN",
		'N', Items.netherbrick,
		'R', Item.getItemFromBlock(Blocks.red_flower)
		
		});
	
	GameRegistry.addRecipe(new ItemStack(Item.getItemFromBlock(awesomeBlock),1), new Object[]{
		"SSS",
		"SSS",
		"SSS",
		'S', awesomeItem
		});

	}
	/* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ */
	
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
	
	
	}