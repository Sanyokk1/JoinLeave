package main.joinleave.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeave implements Listener {

    @EventHandler
    void onPlayerLeave(PlayerQuitEvent e){
        Player p = e.getPlayer();
        e.setQuitMessage(ChatColor.YELLOW + "[" + ChatColor.RED + "FlameCraft" + ChatColor.YELLOW + "]" + ChatColor.GOLD + "До свидания, " + p.getDisplayName() + "! Заглядывай к нам ещё!");
    }


}
