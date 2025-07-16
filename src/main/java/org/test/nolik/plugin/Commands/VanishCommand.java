package org.test.nolik.plugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 @author: nolikdevelopment
 */

public class VanishCommand implements CommandExecutor {
    // TODO: чтобы можно было выключить
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (cmd.getName().toLowerCase().equals("v")) {
            setInvisible(p);
        }
        return false;
    }
    void setInvisible(Player p) {
        p.setInvisible(true);
    }
}
