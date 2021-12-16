package moe.gensoukyo.authmeloginevent;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

public final class AuthMeLoginEvent extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new Listener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
