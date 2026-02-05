package org.dev.nolikplugin.Commands;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


public class HideCommand implements CommandExecutor {

    private final Set<UUID> hiddenPlayers = new HashSet<>();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player player)) {
            return true;
        }

        UUID playerId = player.getUniqueId();

        if (hiddenPlayers.contains(playerId)) {
            showPlayerToAll(player);
            hiddenPlayers.remove(playerId);
        } else {
            hidePlayerFromAll(player);
            hiddenPlayers.add(playerId);
        }
        return true;
    }

    private void hidePlayerFromAll(Player player) {
        for (Player online : Bukkit.getOnlinePlayers()) {
            online.hidePlayer(player);
        }
    }

    private void showPlayerToAll(Player player) {
        for (Player online : Bukkit.getOnlinePlayers()) {
            online.showPlayer(player);
        }
    }
}