package org.dev.nolikplugin.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerJoinServerEvent implements Listener {
    @EventHandler
    private void onMessage(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage("Игрок " + player.getName() + " подключился к серверу.");
        ItemStack itemStack = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);
        player.getInventory().addItem(itemStack);
    }
}
