package org.dev.nolikplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (command.getName().toLowerCase().equals("fly")) {
            isFlying(p);
        }
        return false;
    }
    private void isFlying(Player p) {
        p.setAllowFlight(true);
        p.setFlySpeed(0.17f);
        p.sendMessage("[NolikPlugin] " + "Вы включили режим полета для " + p.getName());
    }
}
