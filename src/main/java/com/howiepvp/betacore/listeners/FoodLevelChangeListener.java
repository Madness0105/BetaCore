package com.howiepvp.betacore.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class FoodLevelChangeListener implements Listener {
    @EventHandler
    public void onFoodLevelChange(FoodLevelChangeEvent event) {
        if (event.getEntity().getWorld().equals(Bukkit.getWorld("world"))) {
            Player player = (Player) event.getEntity();
            player.setFoodLevel(20);
            event.setCancelled(true);
        }
    }
}
