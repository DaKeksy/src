/*
 *
 *   Created by DaKeksy
 *   All rights reserved
 *
 */

package de.dakeksy.moreutils;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "", name = "", version = "")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MoreUtils {

    @Mod.EventHandler
    public void load(FMLInitializationEvent event)
    {
        FMLLog.makeLog("MoreUtils loaded");
    }

}
