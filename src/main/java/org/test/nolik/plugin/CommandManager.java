package org.test.nolik.plugin;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.test.nolik.plugin.Commands.*;
import org.test.nolik.plugin.Events.DeathPlayerEvent;
import org.test.nolik.plugin.Events.EventBlockBreak;
import org.test.nolik.plugin.Events.GodPlayerEvent;
import org.test.nolik.plugin.Events.WelcomeMessageEvent;

/**
 @author: nolikdevelopment
 */

public final class CommandManager extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Commands
       getCommand("coords").setExecutor(new CoordsCommand());
       getCommand("kill").setExecutor(new KillCommand());
       getCommand("fly").setExecutor(new FlyCommand());
       getCommand("food").setExecutor(new FoodCommand());
       getCommand("heal").setExecutor(new HealCommand());
       getCommand("spawn").setExecutor(new SpawnCommand());
       getCommand("creative").setExecutor(new GamemodeCommand());
       getCommand("survival").setExecutor(new SurvivalCommand());
       getCommand("spectator").setExecutor(new SpectatorCommand());
       getCommand("back").setExecutor(new BackCommand());
       getCommand("v").setExecutor(new VanishCommand());
       getCommand("server").setExecutor(new ServerCommand());
       getCommand("kick").setExecutor(new KickCommand());
       getCommand("day").setExecutor(new DayCommand());
       getCommand("night").setExecutor(new NightCommand());





       // Events
        PluginManager pluginManager = Bukkit.getPluginManager();
            pluginManager.registerEvents(new WelcomeMessageEvent(), this);
            pluginManager.registerEvents(new EventBlockBreak(), this);
            pluginManager.registerEvents(new DeathPlayerEvent(), this);
            pluginManager.registerEvents(new GodPlayerEvent(), this);
            //
    }

    @Override
    public void onDisable() {
    }
}