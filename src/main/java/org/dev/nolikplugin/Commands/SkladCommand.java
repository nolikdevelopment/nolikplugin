package org.dev.nolikplugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class SkladCommand implements CommandExecutor {
    // TODO: Сделать альтернативу /ec
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (command.getName().toLowerCase().equals("sklad")) {
            isSklading(p);
        }
        return false;
    }
    private void isSklading(Player p) {
        Inventory inventory = Bukkit.createInventory(null, 27, "Склад");
        p.openInventory(inventory);

    }
}
