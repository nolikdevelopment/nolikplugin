package org.test.nolik.plugin.Commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 @author: nolikdevelopment
 */

public class BackCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (cmd.getName().toLowerCase().equals("back")) {
             backDead(p);
        }
        return false;
    }
    void backDead(Player p) {
        Location loc = p.getLastDeathLocation();
        p.teleport(loc);
    }
}
