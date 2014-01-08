package de.dakeksy.moreutils.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.dakeksy.moreutils.MoreUtils;
import de.dakeksy.moreutils.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemStoneRod extends Item{

	public ItemStoneRod(int id){
		super(id);
		this.setCreativeTab(MoreUtils.moreUtilsCoreTab);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister ic){
		itemIcon = ic.registerIcon(Reference.MODID + ":" + (this.getUnlocalizedName()).substring(5));
	}
	
}
