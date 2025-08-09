package org.dev.nolikplugin.Commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CreeperCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (command.getName().toLowerCase().equals("creeper")) {
              isSpawnCreep(p);
        }
        return false;
    }
    private void isSpawnCreep(Player p) {
        World world = p.getWorld();
        Location location = p.getEyeLocation().add(p.getLocation().getDirection().multiply(5));
        world.spawnEntity(location, EntityType.CREEPER);
        
    }
}
