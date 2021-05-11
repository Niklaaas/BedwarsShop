package de.niklaaas.bwshop.commands;

import de.niklaaas.bwshop.handler.ItemHandler;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DebugCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        if(command.getName().equalsIgnoreCase("debug")){
            player.getInventory().addItem(ItemHandler.Bronze64);
            player.getInventory().addItem(ItemHandler.Ironore64);
            player.getInventory().addItem(ItemHandler.Goldore64);
            player.setFoodLevel(20);
            player.setHealth(20);
        }

        return false;
    }
}

