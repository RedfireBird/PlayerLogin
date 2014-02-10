package com.jimdo.pvptech;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public void OnEnable(){
		System.out.println("==========Plugin has been started==========");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new JoinListener(), this);
			
	}

	public void OnDisable(){
		System.out.println("==========Plugin has been stopped==========");
	}
	
	 @Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		
		return false;
		
	}
	
}
