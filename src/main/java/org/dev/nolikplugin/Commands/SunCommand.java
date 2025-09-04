package org.dev.nolikplugin.Commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SunCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player p)) {
            return false;
        }

        if (command.getName().toLowerCase().equals("sun")) {
            isSunning(p);
        }
        return false;
    }
    private void isSunning(Player p) {
        World world = p.getWorld();
        world.setStorm(false);
        p.sendMessage("[NolikPlugin] " + "Вы установили солнечную погоду!");
    }
}
