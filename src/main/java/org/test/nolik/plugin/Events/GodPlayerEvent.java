package org.test.nolik.plugin.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

/**
 @author: nolikdevelopment
 */

public class GodPlayerEvent implements Listener {
    @EventHandler
    public void onPlayerGod(EntityDamageEvent event) {
      if (event.getEntity() instanceof Player) {
          event.setCancelled(true);
      }
    }
}
