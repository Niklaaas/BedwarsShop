package de.niklaaas.bwshop.methods;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;

public class ItemBuilder {

    public static ItemStack ItemWithMaterial(Material material, int amount, String displayname, Boolean unbreable, String lore) {
        ArrayList<String> arrayList = new ArrayList<>();
        ItemStack itemStack = new ItemStack(material, amount);
        ItemMeta itemMeta = itemStack.getItemMeta();
        arrayList.add(lore);
        itemMeta.setDisplayName(displayname);
        if (unbreable.booleanValue() == true)
            itemMeta.spigot().setUnbreakable(true);
        itemMeta.setLore(arrayList);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public static ItemStack ItemWithShortID(int id, int subid, int amount, String displayname, Boolean unbreakable, String lore) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ItemStack itemStack = new ItemStack(id, amount, (short)subid);
        ItemMeta itemMeta = itemStack.getItemMeta();
        arrayList2.add(lore);
        itemMeta.setDisplayName(displayname);
        if (unbreakable.booleanValue() == true)
            itemMeta.spigot().setUnbreakable(true);
        itemMeta.setLore(arrayList2);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public static ItemStack ItemWithEntchantment(int id, int subid, int amount, String displayname, Boolean unbreakable, Enchantment enchantment, int enchantmentlevel, Enchantment enchantment2, int enchantmentlevel2, String lore) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ItemStack itemStack = new ItemStack(id, amount, (short)subid);
        ItemMeta itemMeta = itemStack.getItemMeta();
        arrayList2.add(lore);
        itemMeta.setDisplayName(displayname);
        itemMeta.addEnchant(enchantment, enchantmentlevel, false);
        itemMeta.addEnchant(enchantment2, enchantmentlevel2, false);
        if (unbreakable.booleanValue() == true)
            itemMeta.spigot().setUnbreakable(true);
        itemMeta.setLore(arrayList2);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}
