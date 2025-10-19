package org.dev.nolikplugin.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.time.LocalDate;

public class PlayerJoinServerEvent implements Listener {
    private final JavaPlugin plugin;

    public PlayerJoinServerEvent(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    // TODO: СДЕЛАТЬ ЧТО - ТО ПОХОЖЕЕ НА НАБОР НОВИЧКА, ДА МНЕ СЕЙЧАС ЛЕНЬ
    @EventHandler
    private void onMessage(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String uild = player.getUniqueId().toString();
        String path = String.join(".", "", uild, player.getName());
        LocalDate currentTime = LocalDate.now();
        plugin.getConfig().set(path, currentTime.toString());
        plugin.saveConfig();
        if (!player.hasPlayedBefore()) {
            event.setJoinMessage("Игрок " + player.getName() + " впервые попал на сервер!");
            ItemStack itemStack = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);
            player.getInventory().addItem(itemStack);
        } else {
            event.setJoinMessage("Игрок " + player.getName() + " подключился к серверу.");
            ItemStack itemStack = new ItemStack(Material.AIR);
            player.getInventory().addItem(itemStack);
        }
    }
}
