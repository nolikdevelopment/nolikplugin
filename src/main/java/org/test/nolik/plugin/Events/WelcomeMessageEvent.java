package org.test.nolik.plugin.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;

/**
 @author: nolikdevelopment
 */

public class WelcomeMessageEvent implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage("Игрок " + player.getName() + " залетел на сервер!");
        ItemStack stack = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);
        player.getInventory().addItem(stack);
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage("Игрок " + player.getName() + " вылетел с сервера!");
    }
}
