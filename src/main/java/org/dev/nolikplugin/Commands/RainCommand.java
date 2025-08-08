package org.dev.nolikplugin.Commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class RainCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (command.getName().toLowerCase().equals("rain")) {
            isRaining(p);
        }
        return false;
    }
    private void isRaining(Player p) {
        World world = p.getWorld();
        world.setStorm(true);
        p.sendMessage("[NolikPlugin] " + "Вы установили дождь!");
    }
}
