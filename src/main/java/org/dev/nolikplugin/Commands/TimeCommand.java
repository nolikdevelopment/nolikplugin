package org.dev.nolikplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player player)) {
            return false;
        }
        if (command.getName().toLowerCase().equals("time")) {
            ZonedDateTime dateTime = ZonedDateTime.now();
            String string = dateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            player.sendMessage("Текущее время: " + string);
        }
        return false;
    }
}
