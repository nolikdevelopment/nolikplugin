package org.test.nolik.plugin.Commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SunCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (cmd.getName().toLowerCase().equals("sun")) {
            setSun(p);
        }
        return false;
    }
    void setSun(Player p) {
        World world = p.getWorld();
        world.setStorm(false);
        p.sendMessage("Вы установили солнечную погоду на сервере!");
    }
}
