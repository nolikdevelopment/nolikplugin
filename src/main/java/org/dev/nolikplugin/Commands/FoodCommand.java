package org.dev.nolikplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import org.jetbrains.annotations.NotNull;

public class FoodCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        if (args.length == 2) {
            Player player = (Player) sender;
            String name = args[0];
            String food = args[1];
            try {
                int foodLvl = Integer.parseInt(food);
                Player players = player.getServer().getPlayer(name);
                if (players == null || foodLvl < 1 || foodLvl > 20) {
                player.sendMessage("Возможно вы ошиблись. Игрок оффлайн, Голод < 1 или > 20!");
                return true;
                }
                players.setFoodLevel(foodLvl);
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        }
        return false;
    }
}
