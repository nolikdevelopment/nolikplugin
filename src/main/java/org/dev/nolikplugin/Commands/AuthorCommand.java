package org.dev.nolikplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

/**
 * AUTHORS: nolikdevelopment, itsdeasser. Date: 05.09.2025
 */
public class AuthorCommand implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if ((!(sender instanceof Player player))) {
            return false;
        }
        if (command.getName().toLowerCase().equals("author")) {
            isAuthor(player);
        }
        return false;
    }
    private void isAuthor(Player player) {
        player.sendMessage("Авторы плагина - Discord: itsdeasser || nolikdevelopment");
        player.sendMessage("Гитхаб: https://github.com/nolikdevelopment/nolikplugin");
        player.sendMessage("Телеграмм: https://t.me/impossilbleclient");
    }
}
