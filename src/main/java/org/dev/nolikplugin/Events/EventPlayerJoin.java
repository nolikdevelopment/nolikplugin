package org.dev.nolikplugin.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.List;
import java.util.Random;

public class EventPlayerJoin implements Listener {

    Random random = new Random();

    @EventHandler public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        List<String> list = List.of(
                "Игрок " + player.getName() + " присоединился на сервер!",
                "Игрок " + player.getName() + " присоединился к пати",
                "Игрок " + player.getName() + " приземлился на землю"
        );

        int i = random.nextInt(list.size());
        String message = list.get(i);
        event.setJoinMessage(message);
    }
}
