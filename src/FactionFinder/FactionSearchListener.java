package FactionFinder;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class FactionSearchListener implements CommandExecutor{

	public boolean onCommand(CommandSender player, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("factionfind")){
			String name = player.getName();
			Bukkit.broadcastMessage(ChatColor.RED + name + ChatColor.WHITE + " is looking for a " + ChatColor.GREEN + "faction" + ChatColor.WHITE + "! Faction mods type /f invite " + ChatColor.RED + name + ChatColor.WHITE + "to invite them!");
			return true;
		}
		return false;
	}
}
