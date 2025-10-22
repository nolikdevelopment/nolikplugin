package org.dev.nolikplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HealthCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player player)) {
            return false;
        }
        if (args.length == 0) {
            sender.sendMessage("[NolikPlugin] " + "Используйте /health 1 - 36");
            return false;
        }
        try {
            int health = Integer.parseInt(args[0]);
            if (health < 1 || health > 20) {
                sender.sendMessage("[NolikPlugin] " + "Используйте /health 1 - 36");
                return false;
            }
            isHeal(player, health);
            sender.sendMessage("[NolikPlugin] " + "Вы успешно установили " + health + " здоровья для " + player.getName());
        } catch (NumberFormatException e) {
           sender.sendMessage("Неверное число");
        }
        return false;
    }
    private void isHeal(Player player, int health) {
        player.setHealth(health);
    }
}
