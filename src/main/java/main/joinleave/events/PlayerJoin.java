package main.joinleave.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    @EventHandler
    void onPlayerJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.setJoinMessage(ChatColor.YELLOW + "[" + ChatColor.RED + "FlameCraft" + ChatColor.YELLOW + "]" + ChatColor.AQUA + " Рады видеть тебя на сервере, " + ChatColor.GOLD + p.getDisplayName() + ChatColor.AQUA +"!");
    }
}
