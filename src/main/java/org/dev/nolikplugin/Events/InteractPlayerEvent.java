package org.dev.nolikplugin.Events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class InteractPlayerEvent implements Listener {
    @EventHandler
    private void onClick(PlayerInteractEvent event) {
        if (event.getAction().isLeftClick()) return;
        if (event.getItem() == null) return;
        if (!event.getItem().getType().equals(Material.STICK)) return;
        if (event.getClickedBlock() == null) return;
        if (!event.getClickedBlock().getType().equals(Material.STONE)) return;
        event.getClickedBlock().setType(Material.GOLD_BLOCK);
    }
}
