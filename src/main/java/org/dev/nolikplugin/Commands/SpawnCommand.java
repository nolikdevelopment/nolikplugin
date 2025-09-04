package org.dev.nolikplugin.Commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player p)) {
            return false;
        }

        if (command.getName().toLowerCase().equals("spawn")) {
            isTeleportToSpawn(p);
        }
        return false;
    }
    private void isTeleportToSpawn(Player p) {
        World world = p.getWorld();
        Location location = world.getSpawnLocation();
        p.teleport(location);
        p.sendMessage("[NolikPlugin] " + "Вы телепортировались на спавн!");
    }
}
