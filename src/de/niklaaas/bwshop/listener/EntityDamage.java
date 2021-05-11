package de.niklaaas.bwshop.listener;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;


public class EntityDamage implements Listener {

    @EventHandler
    public static void VillagerDamage(EntityDamageEvent event){
        EntityType entityType = event.getEntityType();

        if(entityType == EntityType.VILLAGER){
            event.setCancelled(true);
        }else  {
            event.setCancelled(false);
        }

    }

}
