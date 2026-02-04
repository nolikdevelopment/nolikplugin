package org.dev.nolikplugin.Events;

import io.papermc.paper.event.player.AsyncChatEvent;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;


public class EventOpenChat implements Listener {
    @EventHandler public void onChatOpen(AsyncChatEvent event) {
        Player player = event.getPlayer();
        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_BOTTLE_THROW, 1, player.getPitch());
    }
}
