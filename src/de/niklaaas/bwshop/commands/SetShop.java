package de.niklaaas.bwshop.commands;

import de.niklaaas.bwshop.handler.VillagerHandler;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;

public class SetShop implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        final Player player = (Player)commandSender;


        if(commandSender != null) {
            if (command.getName().equalsIgnoreCase("setshop")) {

                if (args.length == 0) {
                    VillagerHandler.createVillager(player, null);
                    player.sendMessage("§cKonfiguration §7| §2Villager erstellt!");

                } else if (args.length == 1) {
                    String name = args[0];

                    name = name.replace('&', '§');

                    VillagerHandler.createVillager(player, name);

                    player.sendMessage("§cKonfiguration §7| §2Shop erstellt!");

                } else {
                    player.sendMessage("Bitte benutze /setshop [Name]");
                }


            }
        }

        return false;
    }
}

