package FactionFinder;

import org.bukkit.plugin.java.JavaPlugin;

public class FactionFinder extends JavaPlugin {
	public void onEnable(){
		getCommand("factionfind").setExecutor(new FactionSearchListener());
	}
	
	public void onDisable(){
		
	}

}
