package org.test.nolik.plugin;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.test.nolik.plugin.Commands.CoordsCommand;
import org.test.nolik.plugin.Commands.FlyCommand;
import org.test.nolik.plugin.Commands.KillCommand;
import org.test.nolik.plugin.Events.DeathPlayerEvent;
import org.test.nolik.plugin.Events.EventBlockBreak;
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



       // Events
        PluginManager pluginManager = Bukkit.getPluginManager();
            pluginManager.registerEvents(new WelcomeMessageEvent(), this);
            pluginManager.registerEvents(new EventBlockBreak(), this);
            pluginManager.registerEvents(new DeathPlayerEvent(), this);
            //
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}