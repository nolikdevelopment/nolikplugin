package org.dev.nolikplugin.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.dev.nolikplugin.SkladMenu;

public class ClickInventoryEvent implements Listener {
    // TODO: Склад = Склад предмед дюпается
    @EventHandler
    private void onClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (!(event.getInventory().getHolder() instanceof SkladMenu)) return;
        SkladMenu skladMenu = (SkladMenu) event.getClickedInventory().getHolder();
        if (skladMenu.getMenuid() != 0) return;
        if (event.getCurrentItem() == null) return;
        ItemStack clicked = event.getCurrentItem();
        ItemStack item = new ItemStack(Material.DIAMOND);
        if (clicked.isSimilar(item)) {
            player.getInventory().addItem(item);
        }
    }
}
