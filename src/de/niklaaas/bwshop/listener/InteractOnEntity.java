package de.niklaaas.bwshop.listener;

import de.niklaaas.bwshop.handler.InventoryHandler;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;

public class InteractOnEntity implements Listener {

    @EventHandler
    public void VillagerInteract(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        if (event.getRightClicked().getType() == EntityType.VILLAGER){
            player.openInventory(InventoryHandler.BlocksInv);
            event.setCancelled(true);
        }

    }
}
