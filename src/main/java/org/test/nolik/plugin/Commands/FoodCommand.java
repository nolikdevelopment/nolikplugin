package org.test.nolik.plugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 @author: nolikdevelopment
 */

public class FoodCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(commandSender instanceof Player)) {
            return false;
        }
        Player p = (Player) commandSender;
        if (command.getName().toLowerCase().equals("food")) {
            setFood(p);
        }
        return false;
    }
    void setFood(Player p) {
        p.setFoodLevel(20);
    }
}
