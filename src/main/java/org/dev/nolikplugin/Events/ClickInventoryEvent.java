package org.dev.nolikplugin.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class ClickInventoryEvent implements Listener {
    // TODO: Склад = Склад предмед дюпается
    @EventHandler
    private void onClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (!(event.getView().getTitle().equals("Склад"))) return;
        if (event.getCurrentItem() == null) return;
        ItemStack clicked = event.getCurrentItem();
        ItemStack item = new ItemStack(Material.DIAMOND);
        if (clicked.isSimilar(item)) {
            player.getInventory().addItem(item);
        }
    }
}
