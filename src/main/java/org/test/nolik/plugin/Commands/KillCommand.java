package org.test.nolik.plugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 @author: nolikdevelopment
 */

public class KillCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (cmd.getName().toLowerCase().equals("kill")) {
            playerKill(p);
        }
        return false;
    }
    void playerKill(Player p) {
        p.setHealth(0);
    }
}
