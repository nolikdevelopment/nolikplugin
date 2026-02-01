package org.dev.nolikplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class CalculatorCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (args.length == 3) {
            int a, b;
            try {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[2]);
            } catch (NumberFormatException e) {
                return false;
            }
            if (args[1].equals("+")) {
                sender.sendMessage("Ответ: " + (a + b));
                return true;
            } else if (args[1].equals("-")) {
                sender.sendMessage("Ответ: " + (a - b));
                return true;
            } else if (args[1].equals("*")) {
                sender.sendMessage("Ответ: " + (a * b));
                return true;
            } else if (args[1].equals("/")) {
                sender.sendMessage("Ответ: " + (a / b));
                return true;
            }
            return false;
        }
        return false;
    }
}
