package com.howiepvp.betacore.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        World world = Bukkit.getWorld("world");
        Location spawn = new Location(world, 196.5, 127, 12.5, -90, 0);
        player.teleport(spawn);
        event.setJoinMessage(ChatColor.translateAlternateColorCodes('&', "&8[&2+&8] &7" + player.getName()));
        player.setAllowFlight(true);
    }
}
