package de.dakeksy.moreutils.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.dakeksy.moreutils.items.Items;
import net.minecraft.creativetab.CreativeTabs;

public class MoreUtilsArmorToolsTab extends CreativeTabs {

	public MoreUtilsArmorToolsTab(int id, String name) {
		super(id, name);
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex(){
		return Items.betterStoneAxe.itemID;
	}
	
	public String getTranslatedTabLabel(){
		return "[More Utils] Armor & Tools";
	}
	
}
