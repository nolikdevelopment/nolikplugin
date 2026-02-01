package org.dev.nolikplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HealthCommand implements CommandExecutor {
    // TODO: /health nickname, hp
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player player = (Player) sender;
        if (args.length != 1) {
            return false;
        }
        try {
            int a = Integer.parseInt(args[0]);
            if (a < 1 || a > 20) {
                return false;
            }
            player.setHealth(a);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
