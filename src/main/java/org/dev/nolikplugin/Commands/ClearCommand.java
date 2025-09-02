package org.dev.nolikplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ClearCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if ((!(sender instanceof Player))) {
            return false;
        }
        Player player = (Player) sender;
        if (command.getName().toLowerCase().equals("clear")) {
            isCleaning(player);
        }
        return false;
    }
    private void isCleaning(Player player) {
        player.getInventory().clear();
        player.sendMessage("[NolikPlugin] " + "Инвентарь пустой!");
    }
}
