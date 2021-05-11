package de.niklaaas.bwshop.listener;

import de.niklaaas.bwshop.handler.InventoryHandler;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClick implements Listener {

    @EventHandler
    public static void InventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();

        if (event.getCurrentItem() != null) {
            if (event.getCurrentItem().hasItemMeta()) {

                String displayname = event.getCurrentItem().getItemMeta().getDisplayName();

                if (event.getClickedInventory().getName().equalsIgnoreCase("§2Kategorien") || event.getClickedInventory().getName().equalsIgnoreCase("§7» §2Blöcke") || event.getClickedInventory().getName().equalsIgnoreCase("§7» §2Rüstung") || event.getClickedInventory().getName().equalsIgnoreCase("§7» §2Werkzeug") || event.getClickedInventory().getName().equalsIgnoreCase("§7» §2Waffen") || event.getClickedInventory().getName().equalsIgnoreCase("§7» §2Bögen") || event.getClickedInventory().getName().equalsIgnoreCase("§7» §2Essen") || event.getClickedInventory().getName().equalsIgnoreCase("§7» §2Tränke") || event.getClickedInventory().getName().equalsIgnoreCase("§7» §2Spezial")) {


                    switch (displayname) {
                        case "§7» §2Blöcke":
                            player.openInventory(InventoryHandler.BlocksInv);


                            break;
                        case "§7» §2Rüstung":
                            player.openInventory(InventoryHandler.ArmorInv);


                            break;
                        case "§7» §2Werkzeug":
                            player.openInventory(InventoryHandler.WerkzeugInv);


                            break;
                        case "§7» §2Waffen":
                            player.openInventory(InventoryHandler.WaffenInv);


                            break;
                        case "§7» §2Bögen":
                            player.openInventory(InventoryHandler.BoegenInv);


                            break;
                        case "§7» §2Tränke":
                            player.openInventory(InventoryHandler.TreankeInv);


                            break;
                        case "§7» §2Essen":
                            player.openInventory(InventoryHandler.EssenInv);


                            break;
                        case "§7» §2Coming Soon":
                            player.sendMessage("Soon");

                            break;
                    }
                    event.setCancelled(true);
                }
            }

        } else {
            event.setCancelled(true);

        }

    }

}
