package org.dev.nolikplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.dev.nolikplugin.Commands.CalculatorCommand;
import org.dev.nolikplugin.Commands.HealthCommand;
import org.dev.nolikplugin.Commands.MessageCommand;
import org.dev.nolikplugin.Commands.MessageCompliter;
import org.dev.nolikplugin.Events.EventPlayerJoin;

public final class CommandManager extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        // Commands
        System.out.println("Плагин запускается...");
        getCommand("calculator").setExecutor(new CalculatorCommand());
        getCommand("message").setExecutor(new MessageCommand());
        getCommand("message").setTabCompleter(new MessageCompliter());
        getCommand("health").setExecutor(new HealthCommand());
        // Events
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new EventPlayerJoin(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("Плагин выключается...");
    }
}
