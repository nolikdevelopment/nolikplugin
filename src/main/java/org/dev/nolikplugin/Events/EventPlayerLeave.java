package org.dev.nolikplugin.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.List;
import java.util.Random;

public class EventPlayerLeave implements Listener {

    Random random = new Random();

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        List<String> list = List.of(
                "Игрок " + player.getName() + " улетел с сервера!",
                "Игрок " + player.getName() + " покинул пати",
                "Игрок " + player.getName() + " оторвался от земли"
        );

        int i = random.nextInt(list.size());
        String message = list.get(i);
        event.setQuitMessage(message);
    }
}
