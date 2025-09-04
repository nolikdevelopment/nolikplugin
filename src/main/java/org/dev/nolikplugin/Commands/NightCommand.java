package org.dev.nolikplugin.Commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class NightCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player p)) {
            return false;
        }

        if (command.getName().toLowerCase().equals("night")) {
             isNight(p);
        }
        return false;
    }
    private void isNight(Player p) {
        World world = p.getWorld();
        world.setTime(13000);
        p.sendMessage("[NolikPlugin] " + "Вы установили ночь!");
    }
}
