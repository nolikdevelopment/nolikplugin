package org.dev.nolikplugin.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class NoStopServerEvent implements Listener {

    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();
        String string = event.getMessage().toLowerCase();
        if (string.equals("/stop")) {
            if (player.isOp()) {
                event.setCancelled(true);
                player.kickPlayer("[NolikPlugin] Не удалось выключить сервер, попробуйте еще.");
            }
        }
    }
}