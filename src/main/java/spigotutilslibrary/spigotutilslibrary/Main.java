package spigotutilslibrary.spigotutilslibrary;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import spigotutilslibrary.spigotutilslibrary.Utils.Timer;

public final class Main extends JavaPlugin {

    private static JavaPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;

    }

    @Override
    public void onDisable() {

    }

    public static JavaPlugin getPlugin(){
        return plugin;
    }
}
