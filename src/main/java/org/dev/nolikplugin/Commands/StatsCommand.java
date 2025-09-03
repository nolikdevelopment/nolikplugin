package org.dev.nolikplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StatsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (cmd.getName().toLowerCase().equals("stats")) {
             sendMessage(p);
        }
        return false;
    }
    private void sendMessage(Player p) {
        p.sendMessage("Онлайн: " + p.getServer().getOnlinePlayers().size());
        p.sendMessage("Версия сервера: " + p.getServer().getVersion());
        p.sendMessage("Ваш никнейм: " + p.getName());
    }
}
