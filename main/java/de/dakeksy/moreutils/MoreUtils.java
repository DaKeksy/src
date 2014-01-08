package de.dakeksy.moreutils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import de.dakeksy.moreutils.blocks.Blocks;
import de.dakeksy.moreutils.creativetab.MoreUtilsArmorToolsTab;
import de.dakeksy.moreutils.creativetab.MoreUtilsCoreTab;
import de.dakeksy.moreutils.items.Items;
import de.dakeksy.moreutils.lib.Reference;
import de.dakeksy.moreutils.recipes.Recipes;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class MoreUtils {

	public static EnumToolMaterial betterStoneTools = EnumHelper.addToolMaterial("MoreStoneTool", 3, 256, 9.0F, 3.0F, 10);
	
	public static CreativeTabs moreUtilsCoreTab = new MoreUtilsCoreTab(CreativeTabs.getNextID(), "moreUtilsCoreTab");
	public static CreativeTabs moreUtilsArmorToolsTab = new MoreUtilsArmorToolsTab(CreativeTabs.getNextID(), "moreUtilsArmorToolsTab");
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		Blocks.init();
		Items.init();
		Recipes.init();
	}

}
