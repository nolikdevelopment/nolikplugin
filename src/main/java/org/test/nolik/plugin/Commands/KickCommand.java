package org.test.nolik.plugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 @author: nolikdevelopment
 */

public class KickCommand implements CommandExecutor {
    // TODO: чтобы можно кикнуть игрока
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (cmd.getName().toLowerCase().equals("kick")) {
            kickPlayer(p);
        }
        return false;
    }
    void kickPlayer(Player p) {
       p.kick();
    }
}
