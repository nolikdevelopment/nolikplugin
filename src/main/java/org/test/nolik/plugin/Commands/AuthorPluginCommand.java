package org.test.nolik.plugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AuthorPluginCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (cmd.getName().toLowerCase().equals("author")) {
            sendAuthor(p);
        }
        return false;
    }
    void sendAuthor(Player p) {
        p.sendMessage("Разработчик плагина: X_0_X || mioclientuser");
        p.sendMessage("Дискорд: nolikcpvp");
        p.sendMessage("Гитхаб: https://github.com/nolikdevelopment");
    }
}
