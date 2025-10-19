package org.dev.nolikplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Random;


public class RandomCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player player)) {
            return false;
        }
        if (command.getName().toLowerCase().equals("random")) {
            int randomInt = isRandom(player);
            player.sendMessage("Число: " + randomInt);
            isRandom(player);
        }
        return false;
    }
    private int isRandom(Player player) {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}
