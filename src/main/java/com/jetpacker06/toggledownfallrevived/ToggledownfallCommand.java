package com.jetpacker06.toggledownfallrevived;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.commands.WeatherCommand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.Level;

public class ToggledownfallCommand {
    public ToggledownfallCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("toggledownfall").executes(

                (command) -> {
                    ServerLevel pLevel = command.getSource().getLevel();
                    ServerPlayer pPlayer = (ServerPlayer) command.getSource().getPlayerOrException();
                    if (pLevel.getLevelData().isRaining()) {
                        WeatherCommand.setClear(pPlayer.createCommandSourceStack().withLevel(pLevel), 6000);
                    } else {
                        WeatherCommand.setRain(pPlayer.createCommandSourceStack().withLevel(pLevel), 6000);
                    }
                    return 1;
                }
        ));
    }

}