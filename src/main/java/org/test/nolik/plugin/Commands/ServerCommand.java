package org.test.nolik.plugin.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 @author: nolikdevelopment
 */

public class ServerCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (command.getName().toLowerCase().equals("server")) {
            sendMessage(p);
        }
        return false;
    }
    void sendMessage(Player p) {
        p.sendMessage(ChatColor.GOLD + "[Информация]"  + ChatColor.WHITE + " Никнейм: " + p.getName());
        p.sendMessage((ChatColor.GOLD + "[Информация]" + ChatColor.WHITE + " Ядро: " + p.getServer().getName()));
        p.sendMessage((ChatColor.GOLD + "[Информация]" + ChatColor.WHITE + " Онлайн: " + p.getServer().getOnlinePlayers().size()));
    }
}
