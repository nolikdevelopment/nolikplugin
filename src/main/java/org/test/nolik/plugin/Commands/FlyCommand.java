package org.test.nolik.plugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {

    /**
     @author: nolikdevelopment
     */
    // TODO: чтобы можно было выключить
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (cmd.getName().toLowerCase().equals("fly")) {
            setFlying(p);
        }
        return false;
    }
    void setFlying(Player p) {
        p.setFlySpeed(0.20f);
        p.setAllowFlight(true);
    }
}
