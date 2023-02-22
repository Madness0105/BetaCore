package com.howiepvp.betacore.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

public class BlockPlaceListener implements Listener {
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        if (player.getWorld().equals(Bukkit.getWorld("world"))) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onLiquid(PlayerBucketEmptyEvent event) {
        Player player = event.getPlayer();
        if (player.getWorld().equals(Bukkit.getWorld("world"))) {
            event.setCancelled(true);
        }
    }
}
