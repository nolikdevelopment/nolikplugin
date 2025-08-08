package org.dev.nolikplugin.Commands;

import org.bukkit.attribute.Attribute;
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
        Player p = (Player) sender;
        if (command.getName().toLowerCase().equals("food")) {
            isFooding(p);
        }
        return false;
    }
    private void isFooding(Player p) {
       p.setFoodLevel(20);
       p.sendMessage("[NolikPlugin] " + "Вы успешно уталили себе голод!");
    }
}
