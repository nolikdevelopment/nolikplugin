package org.dev.nolikplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class RandomCommand implements CommandExecutor {
    // TODO: /random 1 - 100;

    Random random = new Random();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if ((!(sender instanceof Player))) {
            return false;
        }
            if (command.getName().toLowerCase().equals("random")) {
            int a = Integer.parseInt(String.valueOf(random.nextInt(100)));
            sender.sendMessage("Число: " + a);
        }
        return true;
    }
}
