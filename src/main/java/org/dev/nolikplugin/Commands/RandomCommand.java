package org.dev.nolikplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class RandomCommand implements CommandExecutor {

    Random random = new Random();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if ((!(sender instanceof Player))) {
            return false;
        }
        Player player = (Player) sender;
        if (args.length < 1) {
            return false;
        }
        try {
            int num = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            if (num <= 0) {
                player.sendMessage("Число не может быть отрицательным!");
                return true;
            }
            if (num2 > num || num2 <= 0) {
                return true;
            }
            int nums = random.nextInt(num) + random.nextInt(num2);
            player.sendMessage("Число: " + nums);
            return true;
        } catch (NumberFormatException e) {
            player.sendMessage("Возникла ошибка!");
            return true;
        }
    }
}