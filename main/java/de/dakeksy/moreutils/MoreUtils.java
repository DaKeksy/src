package de.dakeksy.moreutils;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import de.dakeksy.moreutils.lib.Reference;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class MoreUtils {

	@EventHandler
	public void load(FMLInitializationEvent event) {

	}

}
