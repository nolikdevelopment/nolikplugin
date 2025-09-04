package org.dev.nolikplugin.Commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import org.jetbrains.annotations.NotNull;

public class SeedCommamd implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if ((!(sender instanceof Player player))) {
            return false;
        }


        if (command.getName().toLowerCase().equals("seed")) {
            isSeed(player);
        }
        return false;
    }
    private void isSeed(Player player) {
        World world = player.getWorld();
        long seed = world.getSeed();
        player.sendMessage("Сид мира: " + seed);
    }
}
