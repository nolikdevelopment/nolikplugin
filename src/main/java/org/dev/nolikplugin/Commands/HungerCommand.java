package org.dev.nolikplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HungerCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("[NolikPlugin] Команда может быть выполнена только игроком.");
            return false;
        }
        if (args.length == 0) {
            sender.sendMessage("[NolikPlugin] Используйте /hunger 1 - 20");
            return false;
        }
        try {
            int hunger = Integer.parseInt(args[0]);
            if (hunger < 1 || hunger > 20) {
                sender.sendMessage("[NolikPlugin] Используйте /hunger 1 - 20");
                return false;
            }
            setHunger(player, hunger);
            sender.sendMessage("[NolikPlugin] Голод установлен на " + hunger);
        } catch (NumberFormatException e) {
            sender.sendMessage("[NolikPlugin] Неверное число!");
        }
        return false;
    }

    private void setHunger(Player player, int hunger) {
        player.setFoodLevel(hunger);
    }
}