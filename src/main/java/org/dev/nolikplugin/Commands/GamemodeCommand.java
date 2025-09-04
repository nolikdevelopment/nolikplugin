package org.dev.nolikplugin.Commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GamemodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if ((!(sender instanceof Player player))) {
            return false;
        }
        if (args.length == 0) {
            sender.sendMessage("Используй /gm [Режим]");
            return false;
        }
        switch (args[0]) {
            case "0" -> {
                player.setGameMode(GameMode.SURVIVAL);
                sender.sendMessage("[NolikPlugin] " + "Вы установили выживание для игрока " + player.getName());
            }
            case "1" -> {
                player.setGameMode(GameMode.CREATIVE);
                sender.sendMessage("[NolikPlugin] " + "Вы установили креатив для игрока " + player.getName());
            }
            case "2" -> {
                player.setGameMode(GameMode.ADVENTURE);
                sender.sendMessage("[NolikPlugin] " + "Вы установили приключения для игрока " + player.getName());
            }
            case "3" -> {
                player.setGameMode(GameMode.SPECTATOR);
                sender.sendMessage("[NolikPlugin] " + "Вы установили спектатора для игрока " + player.getName());
            }
            default -> {
                sender.sendMessage("??");
            }
        }
        return false;
    }
}
