package org.dev.nolikplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.dev.nolikplugin.Commands.*;
import org.dev.nolikplugin.Events.*;

public final class CommandManager extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        // Commands
        getLogger().info("Плагин запустился!");
        getCommand("calculator").setExecutor(new CalculatorCommand());
        getCommand("message").setExecutor(new MessageCommand());
        getCommand("message").setTabCompleter(new MessageCompliter());
        getCommand("health").setExecutor(new HealthCommand());
        getCommand("inventory").setExecutor(new InventoryCommand());
        getCommand("food").setExecutor(new FoodCommand());
        getCommand("random").setExecutor(new RandomCommand());
        getCommand("hide").setExecutor(new HideCommand());
        // Events
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new EventPlayerJoin(), this);
        pluginManager.registerEvents(new EventPlayerCommandSend(), this);
        pluginManager.registerEvents(new EventPlayerKick(), this);
        pluginManager.registerEvents(new EventOpenChat(), this);
        pluginManager.registerEvents(new EventPlayerLeave(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Плагин выключился!");
    }
}
