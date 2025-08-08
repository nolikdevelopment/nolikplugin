package org.dev.nolikplugin.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class BookCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        ItemStack item = new ItemStack(Material.BOOK);
        ItemMeta itemMeta = item.getItemMeta();

        itemMeta.setDisplayName("Алмаз");

        // Описание
        List<String> name = new ArrayList<>();
        name.add("Книга подписана: nolikdevelopment.");
        name.add("08.08.2025г.");
        name.add("Последнее обновление: 08.08.2025г.");
        itemMeta.setLore(name);

        // Зачарования
         itemMeta.addEnchant(Enchantment.KNOCKBACK, 1, false);
         item.setItemMeta(itemMeta);

        p.getInventory().addItem(item);
        if (command.getName().toLowerCase().equals("book")) {
            giveBook(p);
        }
        return false;
    }
    private void giveBook(Player p) {

    }
}
