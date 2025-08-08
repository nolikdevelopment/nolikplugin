package org.dev.nolikplugin.Commands;

import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (command.getName().toLowerCase().equals("heal")) {
          isHealing(p);
        }
        return false;
    }
    private void isHealing(Player p) {
        double hp =  p.getAttribute(Attribute.MAX_HEALTH).getDefaultValue();
        p.setHealth(hp);
        p.sendMessage("[NolikPlugin] " + "Вы исцелили себя!");
    }
}
