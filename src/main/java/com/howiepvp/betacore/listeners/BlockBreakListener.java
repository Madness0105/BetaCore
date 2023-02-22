package com.howiepvp.betacore.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;

public class BlockBreakListener implements Listener {
    @EventHandler
    public void onBlockPlace(BlockBreakEvent event) {
        Player player = event.getPlayer();
        if (player.getWorld().equals(Bukkit.getWorld("world"))) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onLiquid(PlayerBucketFillEvent event) {
        Player player = event.getPlayer();
        if (player.getWorld().equals(Bukkit.getWorld("world"))) {
            event.setCancelled(true);
        }
    }
}
