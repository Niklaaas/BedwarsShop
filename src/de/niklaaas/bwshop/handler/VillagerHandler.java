package de.niklaaas.bwshop.handler;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class VillagerHandler {


    public static void createVillager(Player player, String villagername){

        Location location = player.getLocation();

        Villager shop = (Villager)location.getWorld().spawnEntity(location, EntityType.VILLAGER);
        shop.setCustomName(villagername);
        shop.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 500));
    }



}

