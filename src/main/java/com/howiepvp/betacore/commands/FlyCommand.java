package com.howiepvp.betacore.commands;

import com.howiepvp.betacore.BetaCore;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.getAllowFlight()) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        "&8[" + BetaCore.DEUS_COLOR + "Deus&cMC&8] &cFly mode has been disabled!"));
                player.setAllowFlight(false);
            } else {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        "&8[" + BetaCore.DEUS_COLOR + "Deus&cMC&8] &eFly mode has been enabled!"));
                player.setAllowFlight(true);
            }
        } else {
            sender.sendMessage("Player only.");
        }
        return true;
    }
}
