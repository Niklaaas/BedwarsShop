package de.niklaaas.bwshop.handler;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class SellHandler implements Listener {

    @EventHandler
    public static void InventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();

        if (event.getCurrentItem() != null) {

            String displayname = event.getInventory().getTitle();


                if (event.getInventory() != player.getInventory() && displayname.equalsIgnoreCase("§7» §2Blöcke") || displayname.equalsIgnoreCase("§7» §2Rüstung") || displayname.equalsIgnoreCase("§7» §2Werkzeug") || displayname.equalsIgnoreCase("§7» §2Bögen") || displayname.equalsIgnoreCase("§7» §2Waffen") || displayname.equalsIgnoreCase("§7» §2Essen") || displayname.equalsIgnoreCase("§7» §2Tränke") || displayname.equalsIgnoreCase("§7» §2Spezial")) {
                    if (event.getView().getBottomInventory() != event.getClickedInventory()) {
                        if(event.getCurrentItem().getType() != Material.AIR) {
                        if (event.getCurrentItem().getType() != Material.CLAY_BRICK && event.getCurrentItem().getType() != Material.IRON_INGOT && event.getCurrentItem().getType() != Material.GOLD_INGOT) {
                            int slot = event.getSlot();
                            if (slot <= 17) {

                                if (slot != 0 && slot != 8 && slot != 9 && slot != 17) {
                                    Inventory inventory = event.getInventory();
                                    ItemStack itemStackWare = inventory.getItem(slot);

                                    slot += 9;
                                    ItemStack itemStackBronze = inventory.getItem(slot);
                                    int prize = itemStackBronze.getAmount();


                                    if (player.getInventory().containsAtLeast(itemStackBronze, prize)) {
                                        player.getInventory().addItem(itemStackWare);
                                        player.getInventory().removeItem(itemStackBronze);
                                        player.playSound(player.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
                                    } else {
                                        player.sendMessage("§cNicht genügend Material dabei!");
                                        player.playSound(player.getLocation(), Sound.BAT_DEATH, 1.0F, 1.0F);


                                    }
                                }
                            }

                        } else if (event.getCurrentItem().getType() == Material.CLAY_BRICK) {

                            int slot = event.getSlot();

                            Inventory inventory = event.getInventory();
                            ItemStack itemStackBronze = inventory.getItem(slot);


                            int prize = itemStackBronze.getAmount();
                            slot = slot - 9;

                            ItemStack itemStackArtickel = inventory.getItem(slot);


                            if (player.getInventory().containsAtLeast(itemStackBronze, prize)) {
                                player.getInventory().addItem(itemStackArtickel);
                                player.getInventory().removeItem(itemStackBronze);
                                player.playSound(player.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
                            } else {
                                player.sendMessage("§cNicht genügend Material dabei!");
                                player.playSound(player.getLocation(), Sound.BAT_DEATH, 1.0F, 1.0F);
                            }
                        } else if (event.getCurrentItem().getType() == Material.IRON_INGOT) {

                            int slot = event.getSlot();

                            Inventory inventory = event.getInventory();
                            ItemStack itemStackIron = inventory.getItem(slot);

                            int prize = itemStackIron.getAmount();
                            slot -= 9;
                            ItemStack itemStackArtickel = inventory.getItem(slot);


                            if (player.getInventory().containsAtLeast(itemStackIron, prize)) {
                                player.getInventory().addItem(itemStackArtickel);
                                player.getInventory().removeItem(itemStackIron);
                                player.playSound(player.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
                            } else {
                                player.sendMessage("§cNicht genügend Material dabei!");
                                player.playSound(player.getLocation(), Sound.BAT_DEATH, 1.0F, 1.0F);
                            }
                        } else if (event.getCurrentItem().getType() == Material.GOLD_INGOT) {
                            int slot = event.getSlot();

                            Inventory inventory = event.getInventory();
                            ItemStack itemStackGold = inventory.getItem(slot);

                            int prize = itemStackGold.getAmount();
                            slot -= 9;
                            ItemStack itemStackArtickel = inventory.getItem(slot);

                            if (player.getInventory().containsAtLeast(itemStackGold, prize)) {
                                player.getInventory().addItem(itemStackArtickel);
                                player.getInventory().removeItem(itemStackGold);
                                player.playSound(player.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
                            } else {
                                player.sendMessage("§cNicht genügend Material dabei!");
                                player.playSound(player.getLocation(), Sound.BAT_DEATH, 1.0F, 1.0F);
                            }

                        }

                        event.setCancelled(true);
                    } else {
                        event.setCancelled(true);

                }
            }
            }

        }

    }

}