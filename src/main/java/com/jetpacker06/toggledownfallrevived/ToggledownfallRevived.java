package com.jetpacker06.toggledownfallrevived;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ToggledownfallRevived.MOD_ID)
public class ToggledownfallRevived {
    public static final String MOD_ID = "toggledownfallrevived";
    private static final Logger LOGGER = LogManager.getLogger();

    public ToggledownfallRevived() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
