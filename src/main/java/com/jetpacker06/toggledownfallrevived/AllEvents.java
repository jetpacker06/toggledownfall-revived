package com.jetpacker06.toggledownfallrevived;

import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = ToggledownfallRevived.MOD_ID)
public class AllEvents {
    @SubscribeEvent
    public static void registerCommand(RegisterCommandsEvent event) {
        new ToggledownfallCommand(event.getDispatcher());
    }
}
