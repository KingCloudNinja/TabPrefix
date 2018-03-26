package plugin.kingcloudninja.tabprefix;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


@SuppressWarnings("deprecation")
public class Main extends JavaPlugin implements Listener {

	public void onEnable() {
    	Bukkit.getPluginManager().registerEvents ((Listener) this, this);
	}
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		Player player = event.getPlayer();
		player.getDisplayName();
		player.setPlayerListName(player.getDisplayName().toString());
		player.sendMessage(ChatColor.GOLD + "TabPrefix" + ChatColor.DARK_GRAY + "> " + ChatColor.GREEN + "Your current prefix is: " + player.getPlayerListName().toString());
	}
	@EventHandler
	public void onPlayerChat(PlayerChatEvent event) {
		Player player = event.getPlayer();
		player.setPlayerListName(player.getDisplayName().toString());
	}
}
	
