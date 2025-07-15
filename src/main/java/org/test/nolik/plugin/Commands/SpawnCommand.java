package org.test.nolik.plugin.Commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import org.bukkit.entity.Player;

/**
 @author: nolikdevelopment
 */

public class SpawnCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (cmd.getName().toLowerCase().equals("spawn")) {
         teleportSpawn(p);
        }
        return false;
    }
    void teleportSpawn(Player p) {
        World world = p.getWorld();
        Location location = world.getSpawnLocation();
        p.teleport(location);
    }
}
