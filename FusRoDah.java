package com.mcalias.guildhubfactions.piratepanda;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FusRoDah implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		Player player = (Player) sender;
		
		if(commandLabel.equalsIgnoreCase("fusrodah"))
		{
			if(player.hasPermission("CheatPackage.fusrodah"))
			{
				if(args.length !=1)
				{
					player.sendMessage(ChatColor.AQUA + "/fusrodah (playername)");
				}
				else if (args.length == 1)
				{
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					
					targetPlayer.setHealth(0);
					
					player.sendMessage(ChatColor.GOLD + "" + ChatColor.ITALIC + ChatColor.BOLD + "Fus Ro Dah!");
					targetPlayer.sendMessage(ChatColor.RED + "" + ChatColor.ITALIC + ChatColor.BOLD + "Fus Ro Dah!");
					
					targetPlayer.playSound(targetPlayer.getLocation(), Sound.EXPLODE, 4, 0);
					targetPlayer.playEffect(targetPlayer.getLocation(), Effect.POTION_BREAK, 4);
					targetPlayer.playEffect(targetPlayer.getLocation(), Effect.SMOKE, 4);
				}
			}
			else
			{
				player.sendMessage(ChatColor.DARK_RED + "You do not have permission to Fus Ro Dah!");
			}
		}
		return false;
	}
}
