package main.joinleave;

import main.joinleave.events.PlayerJoin;
import main.joinleave.events.PlayerLeave;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinLeave extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
