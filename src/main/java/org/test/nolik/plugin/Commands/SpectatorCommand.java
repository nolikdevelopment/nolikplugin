package org.test.nolik.plugin.Commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 @author: nolikdevelopment
 */

public class SpectatorCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (command.getName().toLowerCase().equals("spectator")) {
            setSpectator(p);
        }
        return false;
    }
    void setSpectator(Player p) {
        p.setGameMode(GameMode.SPECTATOR);
    }
}
