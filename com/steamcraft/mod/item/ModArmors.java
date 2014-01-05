package com.steamcraft.mod.item;

import net.minecraft.item.Item;

import com.steamcraft.mod.lib.SC_ItemIDs;
import com.steamcraft.mod.lib.SC_Material;

public class ModArmors 
{
	// Steam
	public static Item brassGoggles;
	public static Item aqualung;
	public static Item rollerSkates;
	public static Item legBraces;
	
	// Etherium
	public static Item helmetEtherium;
	public static Item plateEtherium;
	public static Item legsEtherium;
	public static Item bootsEtherium;
	
	// Obsidian
	public static Item helmetObsidian;
	public static Item plateObsidian;
	public static Item legsObsidian;
	public static Item bootsObsidian;
	
	public static void initArmors()
	{
		// 0 = Helm, 1 = Chest, 2 = Leggings, 3 = Boots
		brassGoggles = new ItemSCArmor(SC_ItemIDs.brassGogglesID, SC_Material.STEAM_ARMOR, 0, 0).setUnlocalizedName("brassgoggles");
		aqualung = new ItemSCArmor(SC_ItemIDs.aqualungID, SC_Material.STEAM_ARMOR, 0, 1).setUnlocalizedName("aqualung");
		legBraces = new ItemSCArmor(SC_ItemIDs.legBracesID, SC_Material.STEAM_ARMOR, 0, 2).setUnlocalizedName("pneumaticbraces");
		rollerSkates = new ItemSCArmor(SC_ItemIDs.rollerSkatesID, SC_Material.STEAM_ARMOR, 0, 3).setUnlocalizedName("rollerskates");
		
		helmetEtherium = new ItemSCArmor(SC_ItemIDs.helmetEtheriumID, SC_Material.ETHERIUM_ARMOR, 0, 0).setUnlocalizedName("etheriumhelmet");
		plateEtherium = new ItemSCArmor(SC_ItemIDs.plateEtheriumID, SC_Material.ETHERIUM_ARMOR, 0, 1).setUnlocalizedName("etheriumplate");
		legsEtherium = new ItemSCArmor(SC_ItemIDs.legsEtheriumID, SC_Material.ETHERIUM_ARMOR, 0, 2).setUnlocalizedName("etheriumlegs");
		bootsEtherium = new ItemSCArmor(SC_ItemIDs.bootsEtheriumID, SC_Material.ETHERIUM_ARMOR, 0, 3).setUnlocalizedName("etheriumboots");
		
		helmetObsidian = new ItemSCArmor(SC_ItemIDs.helmetObsidianID, SC_Material.OBSIDIAN_ARMOR, 0, 0).setUnlocalizedName("obsidianhelmet");
		plateObsidian = new ItemSCArmor(SC_ItemIDs.plateObsidianID, SC_Material.OBSIDIAN_ARMOR, 0, 1).setUnlocalizedName("obsidianplate");
		legsObsidian = new ItemSCArmor(SC_ItemIDs.legsObsidianID, SC_Material.OBSIDIAN_ARMOR, 0, 2).setUnlocalizedName("obsidianlegs");
		bootsObsidian = new ItemSCArmor(SC_ItemIDs.bootsObsidianID, SC_Material.OBSIDIAN_ARMOR, 0, 3).setUnlocalizedName("obsidianboots");
	}

	public static void initArmorNames()
	{

	}
}