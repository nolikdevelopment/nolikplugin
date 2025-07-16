package org.test.nolik.plugin.Commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NightCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (cmd.getName().toLowerCase().equals("night")) {
            setNight(p);
        }
        return false;
    }
    void setNight(Player p) {
        World world = p.getWorld();
        world.setTime(13000);
        p.sendMessage("Вы установили ночь на сервере!");
    }
}
