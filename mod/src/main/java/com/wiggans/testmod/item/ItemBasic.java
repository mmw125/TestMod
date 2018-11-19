package com.wiggans.testmod.item;

import com.wiggans.testmod.TestMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBasic extends Item {
	public ItemBasic(String unlocalizedName, String registeryName) {
		setUnlocalizedName(TestMod.MODID + "." + unlocalizedName);
		setRegistryName(registeryName);
		setCreativeTab(CreativeTabs.MISC);
	}
}
