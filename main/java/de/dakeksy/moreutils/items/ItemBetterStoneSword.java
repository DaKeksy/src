package de.dakeksy.moreutils.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.dakeksy.moreutils.MoreUtils;
import de.dakeksy.moreutils.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemBetterStoneSword extends ItemSword{

	public ItemBetterStoneSword(int id, EnumToolMaterial enumMaterial) {
		super(id, enumMaterial);
		this.setCreativeTab(MoreUtils.moreUtilsArmorToolsTab);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister ic){
		itemIcon = ic.registerIcon(Reference.MODID + ":" + (this.getUnlocalizedName()).substring(5));
	}

}
