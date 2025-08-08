package org.dev.nolikplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.dev.nolikplugin.Commands.*;
import org.dev.nolikplugin.Events.ClickInventoryEvent;
import org.dev.nolikplugin.Events.InteractPlayerEvent;
import org.dev.nolikplugin.Events.PlayerJoinServerEvent;
import org.dev.nolikplugin.Events.PlayerLeaveServerEvent;

public final class CommandManager extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        // Команды
       getCommand("stats").setExecutor(new StatsCommand());
       getCommand("day").setExecutor(new DayCommand());
       getCommand("back").setExecutor(new BackCommand());
       getCommand("fly").setExecutor(new FlyCommand());
       getCommand("heal").setExecutor(new HealCommand());
       getCommand("food").setExecutor(new FoodCommand());
       getCommand("kill").setExecutor(new KillCommand());
       getCommand("night").setExecutor(new NightCommand());
       getCommand("spawn").setExecutor(new SpawnCommand());
       getCommand("rain").setExecutor(new RainCommand());
       getCommand("sun").setExecutor(new SunCommand());
       getCommand("book").setExecutor(new BookCommand());
       getCommand("sklad").setExecutor(new SkladCommand());
       // Евенты
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PlayerJoinServerEvent(), this);
        pluginManager.registerEvents(new PlayerLeaveServerEvent(), this);
        pluginManager.registerEvents(new InteractPlayerEvent(), this);
        pluginManager.registerEvents(new ClickInventoryEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
