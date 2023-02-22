package com.howiepvp.betacore.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class WeatherChangeListener implements Listener {
    @EventHandler
    public void onWeatherChange(WeatherChangeEvent event) {
        if (event.getWorld().equals(Bukkit.getWorld("world"))) {
            event.setCancelled(true);
        }
    }
}
