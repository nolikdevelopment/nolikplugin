package org.dev.nolikplugin.Events;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;

public class EventPlayerKick implements Listener {
    @EventHandler public void onPlayerKick(PlayerKickEvent event) {
        Player player = event.getPlayer();
        World world = player.getWorld();
        world.strikeLightningEffect(player.getLocation());
    }
}
