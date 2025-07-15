package org.test.nolik.plugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 @author: nolikdevelopment
 */
public class HealCommand implements CommandExecutor {

    private String nolikplugin = "[NolikPlugin]";
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (cmd.getName().toLowerCase().equals("heal")) {
            healPlayer(p);
            p.sendMessage(nolikplugin + " Вы исцелили себя");
        }
        return false;
    }
    void healPlayer(Player p) {
        p.setHealth(20);
    }
}
