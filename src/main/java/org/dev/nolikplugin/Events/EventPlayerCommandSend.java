package org.dev.nolikplugin.Events;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class EventPlayerCommandSend implements Listener {
    @EventHandler public void onCommandSend(PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();
        String string = event.getMessage().toLowerCase();
        if (string.contains("/op")) {
            event.setCancelled(true);
            player.playSound(player, Sound.ENTITY_WITHER_DEATH, 10, player.getPitch());
        }
    }
}
