package de.niklaaas.bwshop.handler;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class InventoryHandler {
    public static Inventory CategoryInv = Bukkit.createInventory(null, 54, "§2Kategorien");
    public static Inventory BlocksInv = Bukkit.createInventory(null, 54, "§7» §2Blöcke");
    public static Inventory ArmorInv = Bukkit.createInventory(null, 54, "§7» §2Rüstung");
    public static Inventory WerkzeugInv = Bukkit.createInventory(null, 54, "§7» §2Werkzeug");
    public static Inventory WaffenInv = Bukkit.createInventory(null, 54, "§7» §2Waffen");
    public static Inventory BoegenInv = Bukkit.createInventory(null, 54, "§7» §2Bögen");
    public static Inventory EssenInv = Bukkit.createInventory(null, 54, "§7» §2Essen");
    public static Inventory TreankeInv = Bukkit.createInventory(null, 54, "§7» §2Tränke");
    public static Inventory SpezialInv = Bukkit.createInventory(null, 54, "§7» §2Spezial");

    static Inventory inventorybef(Inventory inventory, int[] placeholder) {
        for (int i : placeholder)
            inventory.setItem(i, ItemHandler.Filler);
        inventory.setItem(36, ItemHandler.Blocks);
        inventory.setItem(37, ItemHandler.Ruestung);
        inventory.setItem(38, ItemHandler.Werkzeug);
        inventory.setItem(39, ItemHandler.Waffen);
        inventory.setItem(40, ItemHandler.Boegen);
        inventory.setItem(41, ItemHandler.Essen);
        inventory.setItem(42, ItemHandler.Traenke);
        inventory.setItem(43, ItemHandler.Special);
        inventory.setItem(44, ItemHandler.Emerald);
        return inventory;
    }

    public static void InventoryFill() {
        int[] CategoryFiller = {0, 8, 9, 17, 27, 28, 29, 30, 31, 32, 33, 34, 35, 45, 46, 47, 48, 49, 50, 51, 52, 53};
        for (int i : CategoryFiller)


            inventorybef(CategoryInv, CategoryFiller);
        inventorybef(BlocksInv, CategoryFiller);
        inventorybef(ArmorInv, CategoryFiller);
        inventorybef(WerkzeugInv, CategoryFiller);
        inventorybef(WaffenInv, CategoryFiller);
        inventorybef(BoegenInv, CategoryFiller);
        inventorybef(EssenInv, CategoryFiller);
        inventorybef(TreankeInv, CategoryFiller);
        inventorybef(SpezialInv, CategoryFiller);

        BlocksInv.setItem(1, ItemHandler.Sandstone);
        BlocksInv.setItem(10, ItemHandler.Bronze1);
        BlocksInv.setItem(2, ItemHandler.Stairs);
        BlocksInv.setItem(11, ItemHandler.Bronze2);
        BlocksInv.setItem(3, ItemHandler.Endstone);
        BlocksInv.setItem(12, ItemHandler.Bronze7);
        BlocksInv.setItem(4, ItemHandler.Glas);
        BlocksInv.setItem(13, ItemHandler.Bronze2);
        BlocksInv.setItem(5, ItemHandler.Glowstone);
        BlocksInv.setItem(14, ItemHandler.Bronze2);
        BlocksInv.setItem(6, ItemHandler.Ice);
        BlocksInv.setItem(15, ItemHandler.Bronze2);
        BlocksInv.setItem(7, ItemHandler.IronBlock);
        BlocksInv.setItem(16, ItemHandler.Ironore2);

        ArmorInv.setItem(10, ItemHandler.Bronze1);
        ArmorInv.setItem(11, ItemHandler.Bronze1);
        ArmorInv.setItem(12, ItemHandler.Bronze1);
        ArmorInv.setItem(13, ItemHandler.Ironore1);
        ArmorInv.setItem(14, ItemHandler.Ironore3);
        ArmorInv.setItem(15, ItemHandler.Ironore7);

        WerkzeugInv.setItem(5, ItemHandler.Rod);
        WerkzeugInv.setItem(6, ItemHandler.FnS);
        WerkzeugInv.setItem(10, ItemHandler.Bronze4);
        WerkzeugInv.setItem(11, ItemHandler.Ironore2);
        WerkzeugInv.setItem(12, ItemHandler.Goldore1);
        WerkzeugInv.setItem(14, ItemHandler.Ironore4);
        WerkzeugInv.setItem(15, ItemHandler.Ironore2);

        WaffenInv.setItem(11, ItemHandler.Bronze8);
        WaffenInv.setItem(13, ItemHandler.Ironore1);
        WaffenInv.setItem(14, ItemHandler.Ironore3);
        WaffenInv.setItem(15, ItemHandler.Goldore5);

        BoegenInv.setItem(6, ItemHandler.Pfeil);
        BoegenInv.setItem(11, ItemHandler.Goldore3);
        BoegenInv.setItem(12, ItemHandler.Goldore7);
        BoegenInv.setItem(13, ItemHandler.Goldore13);
        BoegenInv.setItem(15, ItemHandler.Goldore1);

        EssenInv.setItem(2, ItemHandler.Apfel);
        EssenInv.setItem(3, ItemHandler.PorkFleisch);
        EssenInv.setItem(5, ItemHandler.Kuchen);
        EssenInv.setItem(6, ItemHandler.GoldApfel);
        EssenInv.setItem(11, ItemHandler.Bronze1);
        EssenInv.setItem(12, ItemHandler.Bronze2);
        EssenInv.setItem(14, ItemHandler.Ironore1);
        EssenInv.setItem(15, ItemHandler.Goldore2);

        TreankeInv.setItem(2, ItemHandler.HealTrank);
        TreankeInv.setItem(3, ItemHandler.HealTrank2);
        TreankeInv.setItem(11, ItemHandler.Ironore5);
        TreankeInv.setItem(12, ItemHandler.Ironore10);
        TreankeInv.setItem(4, ItemHandler.SpeedTrank);
        TreankeInv.setItem(5, ItemHandler.SpeedTrank2);
        TreankeInv.setItem(13, ItemHandler.Ironore5);
        TreankeInv.setItem(14, ItemHandler.Ironore8);
        TreankeInv.setItem(6, ItemHandler.InvisTrank);
        TreankeInv.setItem(15, ItemHandler.Goldore7);
    }

    public static void Ruestung() {

        ItemStack lederhelm = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta lederhelmMeta = lederhelm.getItemMeta();
        lederhelmMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        lederhelmMeta.setDisplayName("Leder Helm");
        lederhelm.setItemMeta(lederhelmMeta);
        ArmorInv.setItem(1, lederhelm);

        ItemStack lederleggins = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta lederlegginsMeta = lederleggins.getItemMeta();
        lederlegginsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        lederlegginsMeta.setDisplayName("Leder Hose");
        lederleggins.setItemMeta(lederlegginsMeta);
        ArmorInv.setItem(2, lederleggins);


        ItemStack lederboots = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta lederbootsMeta = lederboots.getItemMeta();
        lederbootsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        lederbootsMeta.setDisplayName("Leder Schuhe");
        lederboots.setItemMeta(lederbootsMeta);
        ArmorInv.setItem(3, lederboots);

        ItemStack ChainCHestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        ItemMeta ChainMeta = ChainCHestplate.getItemMeta();
        ChainMeta.setDisplayName("§cKettenhemd I");
        ChainMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
        ChainMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        ChainCHestplate.setItemMeta(ChainMeta);
        ArmorInv.setItem(4, ChainCHestplate);

        ItemStack ChainCHestplate2 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        ItemMeta ChainMeta2 = ChainCHestplate.getItemMeta();
        ChainMeta2.setDisplayName("§cKettenhemd II");
        ChainMeta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, false);
        ChainMeta2.addEnchant(Enchantment.DURABILITY, 1, false);
        ChainCHestplate2.setItemMeta(ChainMeta2);
        ArmorInv.setItem(5, ChainCHestplate2);

        ItemStack ChainCHestplate3 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        ItemMeta ChainMeta3 = ChainCHestplate.getItemMeta();
        ChainMeta3.setDisplayName("§cKettenhemd III");
        ChainMeta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, false);
        ChainMeta3.addEnchant(Enchantment.DURABILITY, 1, false);
        ChainCHestplate3.setItemMeta(ChainMeta3);
        ArmorInv.setItem(6, ChainCHestplate3);

        ItemStack WoodPickaxe = new ItemStack(Material.WOOD_PICKAXE);
        ItemMeta WoodPickaxeMeta = WoodPickaxe.getItemMeta();
        WoodPickaxeMeta.setDisplayName("§cHolzspitzhacke");
        WoodPickaxeMeta.addEnchant(Enchantment.DIG_SPEED, 1, false);
        WoodPickaxeMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        WoodPickaxe.setItemMeta(WoodPickaxeMeta);
        WerkzeugInv.setItem(1, WoodPickaxe);

        ItemStack StonePickaxe = new ItemStack(Material.STONE_PICKAXE);
        ItemMeta StonePickaxeMeta = StonePickaxe.getItemMeta();
        StonePickaxeMeta.setDisplayName("§cSteinspitzhacke");
        StonePickaxeMeta.addEnchant(Enchantment.DIG_SPEED, 1, false);
        StonePickaxeMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        StonePickaxe.setItemMeta(StonePickaxeMeta);
        WerkzeugInv.setItem(2, StonePickaxe);

        ItemStack IronPickaxe = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta IronPickaxeMeta = IronPickaxe.getItemMeta();
        IronPickaxeMeta.setDisplayName("§7Eisenspitzhacke");
        IronPickaxeMeta.addEnchant(Enchantment.DIG_SPEED, 3, false);
        IronPickaxeMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        IronPickaxe.setItemMeta(IronPickaxeMeta);
        WerkzeugInv.setItem(3, IronPickaxe);

        ItemStack Knockbackstick = new ItemStack(Material.STICK);
        ItemMeta KnockbackstickMeta = Knockbackstick.getItemMeta();
        KnockbackstickMeta.setDisplayName("§cKnockbackstick");
        KnockbackstickMeta.addEnchant(Enchantment.KNOCKBACK, 1, false);
        Knockbackstick.setItemMeta(KnockbackstickMeta);
        WaffenInv.setItem(2, Knockbackstick);

        ItemStack GoldSchwert1 = new ItemStack(Material.GOLD_SWORD);
        ItemMeta GoldSchwert1Meta = GoldSchwert1.getItemMeta();
        GoldSchwert1Meta.setDisplayName("§fGoldschwert I");
        GoldSchwert1Meta.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
        GoldSchwert1Meta.addEnchant(Enchantment.DURABILITY, 1, false);
        GoldSchwert1.setItemMeta(GoldSchwert1Meta);
        WaffenInv.setItem(4, GoldSchwert1);

        ItemStack GoldSchwert2 = new ItemStack(Material.GOLD_SWORD);
        ItemMeta GoldSchwert2Meta = GoldSchwert2.getItemMeta();
        GoldSchwert2Meta.setDisplayName("§fGoldschwert II");
        GoldSchwert2Meta.addEnchant(Enchantment.DAMAGE_ALL, 2, false);
        GoldSchwert2Meta.addEnchant(Enchantment.DURABILITY, 1, false);
        GoldSchwert2.setItemMeta(GoldSchwert2Meta);
        WaffenInv.setItem(5, GoldSchwert2);

        ItemStack IronSchwert = new ItemStack(Material.IRON_SWORD);
        ItemMeta IronSchwertMeta = IronSchwert.getItemMeta();
        IronSchwertMeta.setDisplayName("§fEisenschwert");
        IronSchwertMeta.addEnchant(Enchantment.DAMAGE_ALL, 2, false);
        IronSchwertMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        IronSchwertMeta.addEnchant(Enchantment.KNOCKBACK, 1, false);
        IronSchwert.setItemMeta(IronSchwertMeta);
        WaffenInv.setItem(6, IronSchwert);

        ItemStack Bow1 = new ItemStack(Material.BOW);
        ItemMeta Bow1Meta = Bow1.getItemMeta();
        Bow1Meta.setDisplayName("§fBogen I");
        Bow1Meta.addEnchant(Enchantment.ARROW_INFINITE, 1, false);
        Bow1.setItemMeta(Bow1Meta);
        BoegenInv.setItem(2, Bow1);

        ItemStack Bow2 = new ItemStack(Material.BOW);
        ItemMeta Bow2Meta = Bow2.getItemMeta();
        Bow2Meta.setDisplayName("§fBogen II");
        Bow2Meta.addEnchant(Enchantment.ARROW_INFINITE, 1, false);
        Bow2Meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, false);
        Bow2.setItemMeta(Bow2Meta);
        BoegenInv.setItem(3, Bow2);

        ItemStack Bow3 = new ItemStack(Material.BOW);
        ItemMeta Bow3Meta = Bow3.getItemMeta();
        Bow3Meta.setDisplayName("§fBogen III");
        Bow3Meta.addEnchant(Enchantment.ARROW_INFINITE, 1, false);
        Bow3Meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, false);
        Bow3Meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, false);
        Bow3.setItemMeta(Bow3Meta);
        BoegenInv.setItem(4, Bow3);
    }
}
