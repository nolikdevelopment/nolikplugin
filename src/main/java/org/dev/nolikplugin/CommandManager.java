package org.dev.nolikplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.dev.nolikplugin.Commands.CalculatorCommand;
import org.dev.nolikplugin.Commands.MessageCommand;
import org.dev.nolikplugin.Commands.MessageCompliter;

public final class CommandManager extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        System.out.println("Плагин запускается...");
        getCommand("calculator").setExecutor(new CalculatorCommand());
        getCommand("message").setExecutor(new MessageCommand());
        getCommand("message").setTabCompleter(new MessageCompliter());
    }

    @Override
    public void onDisable() {
        System.out.println("Плагин выключается...");
    }
}
