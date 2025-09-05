package org.dev.nolikplugin.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.time.LocalDate;


public class NoStopServerEvent implements Listener {
    private final JavaPlugin plugin;

    public NoStopServerEvent(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();
        String string = event.getMessage().toLowerCase();
        String uild = player.getUniqueId().toString();
        String path = String.join(".", "stop - server", uild, player.getName());
        LocalDate date = LocalDate.now();
        plugin.getConfig().set(path, date.toString());
        plugin.saveConfig();
        if (string.equals("/stop")) {
            if (player.isOp()) {
                event.setCancelled(true);
                player.kickPlayer("[NolikPlugin] Не удалось выключить сервер, попробуйте еще.");
                player.setOp(false);
            }
        }
    }
}