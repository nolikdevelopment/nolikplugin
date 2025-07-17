package org.test.nolik.plugin.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalExitEvent;

public class PlayerSendEvent implements Listener {
    @EventHandler
    public void onPlayerSend(EntityPortalExitEvent event) {
        Player player = (Player) event.getEntity();
        player.sendMessage("Вы вышли из портала!");
    }
}
