package de.niklaaas.bwshop;

import de.niklaaas.bwshop.commands.DebugCommand;
import de.niklaaas.bwshop.commands.SetShop;
import de.niklaaas.bwshop.handler.InventoryHandler;
import de.niklaaas.bwshop.handler.SellHandler;
import de.niklaaas.bwshop.listener.EntityDamage;
import de.niklaaas.bwshop.listener.InteractOnEntity;
import de.niklaaas.bwshop.listener.InventoryClick;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class BedwarsShop extends JavaPlugin {

    public static BedwarsShop plugin;

    public File config = new File("plugins/BedwarsShop/config.yml");
    public YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(config);

    @Override
    public void onEnable() {
        plugin = this;
        System.out.println("BedwarsShop wurde erfolgreich gestart!");

        InventoryHandler.InventoryFill();
        InventoryHandler.Ruestung();



        loadCommands();
        loadListener();


    }

    void loadCommands(){
        getPlugin().getCommand("debug").setExecutor(new DebugCommand());
        getPlugin().getCommand("setshop").setExecutor(new SetShop());

    }

    void loadListener(){
        PluginManager pluginManager = Bukkit.getPluginManager();

        pluginManager.registerEvents(new EntityDamage(), this);
        pluginManager.registerEvents(new InteractOnEntity(), this);
        pluginManager.registerEvents(new InventoryClick(), this);
        pluginManager.registerEvents(new SellHandler(), this);



    }



    public static BedwarsShop getPlugin(){
        return plugin;
    }
}
