package org.dev.nolikplugin.Interface;


public interface PluginMessage {
    static void enable() {
        System.out.println("NolikPlugin 0.0.1 has been initialized!");
    }
    static void disable() {
        System.out.println("NolikPlugin 0.0.1 has been uninitialized!");
    }
}
