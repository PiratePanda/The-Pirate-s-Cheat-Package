package com.mcalias.guildhubfactions.piratepanda;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
		
		final Logger logger = Logger.getLogger("Minecraft");
		public static Main plugin;
		
		@Override
		public void onEnable()
		{
			plugin = this;
			getLogger().info("Pirate's Cheat Package has been enabled. Successful Enable.");
			registerEvents(this, new PlayerSwap());
			getCommand("buttsex").setExecutor(new Buttsex());
			getCommand("tmp").setExecutor(new Tmp());
			getCommand("fusrodah").setExecutor(new FusRoDah());
		}

		@Override
		public void onDisable()
		{
			getLogger().info("Pirate's Cheat Package has been disabled. Successful Disable.");
			plugin = null;
		}
		
		public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners)
			{
			for (Listener listener : listeners) 
				{
					Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
				}
			}
		
		public static Plugin getPlugin()
		{
			return plugin;
		}
}
