package com.howiepvp.betacore;

import com.howiepvp.betacore.commands.*;
import com.howiepvp.betacore.listeners.*;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.*;

public final class BetaCore extends JavaPlugin {
    public static final ChatColor DEUS_COLOR = ChatColor.of(new Color(25, 86, 142));

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
        getServer().getPluginManager().registerEvents(new BlockPlaceListener(), this);
        getServer().getPluginManager().registerEvents(new EntityDamageListener(), this);
        getServer().getPluginManager().registerEvents(new FoodLevelChangeListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerQuitListener(), this);
        getServer().getPluginManager().registerEvents(new WeatherChangeListener(), this);
        getCommand("spawn").setExecutor(new SpawnCommand());
        getCommand("fly").setExecutor(new FlyCommand());
    }

    @Override
    public void onDisable() {

    }

}
