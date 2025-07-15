package org.test.nolik.untitled.Commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 @author: nolikdevelopment
 */

public class CoordsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
           sender.sendMessage("Это доступно только игрокам!");
           return false;
        }
        Player p = (Player) sender;
        if (command.getName().toLowerCase().equals("coords")) {
            sendCoords(p);
        }
        return false;
    }
    void sendCoords(Player p) {
        Location loc = p.getLocation();
        p.sendMessage("Вы находитесь в мире: " + p.getWorld().getName() + " на координатах X: " + loc.getBlockX() + " Y: " + loc.getBlockY() + " Z: " + loc.getBlockZ());
    }
}
