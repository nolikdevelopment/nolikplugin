package org.dev.nolikplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class MessageCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (args.length == 0) {
            return false;
        }
        if (args[0].equalsIgnoreCase("hello")) {
            sender.sendMessage("Привет, игрок!");
            return true;
        } else if (args[0].equalsIgnoreCase("good")) {
            sender.sendMessage("Пока, игрок!");
            return true;
        }
        return false;
    }
}
