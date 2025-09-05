package org.dev.nolikplugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.dev.nolikplugin.Menu.SkladMenu;
import org.jetbrains.annotations.NotNull;

public class SkladCommand implements CommandExecutor {
    // TODO: Сделать альтернативу /ec
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player p)) {
            return false;
        }

        if (command.getName().toLowerCase().equals("sklad")) {
            isSklading(p);
        }
        return false;
    }
    private void isSklading(Player p) {
        ItemStack item = new ItemStack(Material.DIAMOND);
        Inventory inventory = Bukkit.createInventory(new SkladMenu(0), 27, "Склад");
        p.openInventory(inventory);
        inventory.setItem(4, item);
    }
}
