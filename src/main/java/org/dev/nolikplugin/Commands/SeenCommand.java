package org.dev.nolikplugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class SeenCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player)) {
            return false;
        }

        if (args.length == 0) {
            sender.sendMessage("Используй /seen [Имя игрока]");
            return false;
        }
        String name = args[0];
        Player target = Bukkit.getPlayerExact(name);
        if (target == null) {
            sender.sendMessage("Игрок " + target + " не найден или не онлайн.");
            return false;
        }
        long lastPlayed = target.getLastSeen();
        sender.sendMessage(target.getName() + " последний раз заходил: " + new Date(lastPlayed).toString());
        return false;
    }
}
