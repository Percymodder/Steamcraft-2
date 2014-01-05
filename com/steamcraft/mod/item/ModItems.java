package com.steamcraft.mod.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.src.ModLoader;

import com.steamcraft.mod.block.ModBlocks;
import com.steamcraft.mod.lib.SC_ItemIDs;
import com.steamcraft.mod.lib.SC_Material;

public class ModItems 
{
	public static Item etherium;
	public static Item chemicSalt;
	public static Item bornite;
	public static Item obsidianSlate;
	public static Item ingotBrass;
	public static Item ingotCastIron;
	public static Item lightBulb;
	public static Item phosphorus;
	public static Item uraniumOre;
	public static Item uraniumPellet;
	public static Item reactorCore;
	public static Item teaSeed;
	public static Item teaLeaves;
	public static Item coldKettle;
	public static Item hotKettle;
	public static Item emptyTeacup;
	public static Item fullTeacup;
	public static Item emptyKettle;
	
	public static void initItems()
	{
		etherium = new ItemSC(SC_ItemIDs.etheriumID).setUnlocalizedName("etherium");
		chemicSalt = new ItemSC(SC_ItemIDs.chemicSaltID).setUnlocalizedName("sulphur");
		//bornite = new ItemSC(SC_ItemIDs.borniteID).setUnlocalizedName("sulphur");
		obsidianSlate = new ItemSC(SC_ItemIDs.obsidianSlateID).setUnlocalizedName("obsidianslate");
		ingotBrass = new ItemSC(SC_ItemIDs.ingotBrassID).setUnlocalizedName("ingotbrass");
		ingotCastIron = new ItemSC(SC_ItemIDs.ingotCastIronID).setUnlocalizedName("ingotcastiron");
		lightBulb = new ItemSC(SC_ItemIDs.lightBulbID).setUnlocalizedName("lightbulb");
		phosphorus = new ItemSC(SC_ItemIDs.phosphorusID).setUnlocalizedName("phosphorus");
		uraniumOre = new ItemSC(SC_ItemIDs.uraniumStoneID).setUnlocalizedName("uraniumstone");
		uraniumPellet = new ItemSC(SC_ItemIDs.uraniumID).setUnlocalizedName("uraniumpellet");
		reactorCore = new ItemSC(SC_ItemIDs.reactorCoreID).setUnlocalizedName("reactorcore");
		//teaSeed = new ItemSeeds(SC_ItemIDs.teaSeedID, ModBlocks.teaPlant.blockID, 0).setUnlocalizedName("teaseed"); 
		teaLeaves = new ItemSC(SC_ItemIDs.teaLeavesID).setUnlocalizedName("tealeaves");
		//coldKettle = new ItemKettle(SC_ItemIDs.coldKettleID, 300).setUnlocalizedName("kettle");
		//hotKettle = new ItemKettle(SC_ItemIDs.hotKettleID, 300).setUnlocalizedName("kettle");
		//emptyKettle = new ItemKettle(SC_ItemIDs.emptyKettleID, 300).setUnlocalizedName("kettle");
		//fullTeacup = new ItemTeacup(SC_ItemIDs.fullTeacupID, 4, 0.6F, false).setUnlocalizedName("teacupfull");
		//emptyTeacup = new ItemTeacup(SC_ItemIDs.emptyTeacupID, 0, 0.0F, false).setUnlocalizedName("teacupempty");
		
		initNames();
		ModTools.initTools();
		ModArmors.initArmors();
		ModGuns.initGuns();
	}
	
	public static void initNames()
	{
		
	}
}