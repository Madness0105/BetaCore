package com.howiepvp.betacore.commands;

import com.howiepvp.betacore.BetaCore;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            World world = Bukkit.getWorld("world");
            Location spawn = new Location(world, 196.5, 127, 12.5, -90, 0);
            player.teleport(spawn);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',
                    "&8[" + BetaCore.DEUS_COLOR + "Deus&cMC&8] &eYou have been teleported to the spawn!"));
        } else {
            sender.sendMessage("Player only.");
        }
        return true;
    }
}
