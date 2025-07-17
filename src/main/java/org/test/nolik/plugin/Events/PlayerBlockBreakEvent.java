package org.test.nolik.plugin.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class PlayerBlockBreakEvent implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
      Player player = event.getPlayer();
      player.sendMessage("Вы сломали блок: " + event.getBlock().getType().name());
    }
}
