package org.dev.nolikplugin.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.time.LocalDate;

public class PlayerLeaveServerEvent implements Listener {
    private final JavaPlugin javaPlugin;

    public PlayerLeaveServerEvent(JavaPlugin javaPlugin) {
        this.javaPlugin = javaPlugin;
    }

    @EventHandler
    private void onLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        String uild = player.getUniqueId().toString();
        String path = String.join(".", "Left:", uild, player.getName());
        LocalDate currentTime = LocalDate.now();
        javaPlugin.getConfig().set(path, currentTime.toString());
        javaPlugin.saveConfig();
        event.setQuitMessage("Игрок " + player.getName() + " отключился от сервера.");
    }
}
