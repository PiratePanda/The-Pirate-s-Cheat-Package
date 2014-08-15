package com.mcalias.guildhubfactions.piratepanda;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Buttsex implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		Player player = (Player) sender;
		
		if(commandLabel.equalsIgnoreCase("buttsex"))
		{
		    if(player.hasPermission("CheatPackage.buttsex")) 
		    {		if(args.length == 0)
		     {
		    	 player.setHealth(20);
		    	 player.sendMessage(ChatColor.AQUA + "Surprise buttsex has healed you! ^.^");
		     }
		     
		     else if(args.length == 1)
		     {
		    	 if(player.getServer().getPlayer(args[0]) != null)
		    	 {
		    		 Player targetPlayer = player.getServer().getPlayer(args[0]);
		    		 
		    		 targetPlayer.setHealth(20);
		    		 player.sendMessage(ChatColor.GREEN + targetPlayer.getName() + " has said what what in the butt! ^.^");
		    		 targetPlayer.sendMessage(ChatColor.AQUA + "Surprise buttsex has healed you! ^.^");
		    		 
		    	 }
		     
		    	 else
		    	 {
		    		 Player targetPlayer = player.getServer().getPlayer(args[0]);
		    		 player.sendMessage(ChatColor.DARK_RED + targetPlayer.getName() + "is not online!");
		    	 }
		     }
		    }
		}
		return false;
	}
}
