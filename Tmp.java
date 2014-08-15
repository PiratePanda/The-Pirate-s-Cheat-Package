package com.mcalias.guildhubfactions.piratepanda;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Tmp implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		Player player = (Player) sender;
		if(commandLabel.equalsIgnoreCase("tmp"))//Named our command.
		{
			if(player.hasPermission("CheatPackage.tmp"))
		   {	if(args.length == 0)//If the player only types the command without a point to teleport to,
			{
				player.sendMessage(ChatColor.DARK_RED + "/tmp [Username] [targetUsername]");
			} //The player will receive this message.
			
			else if(args.length == 1)
			{
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				
				Location targetPlayerLocation = targetPlayer.getLocation();
				
				targetPlayer.teleport(targetPlayerLocation);
				targetPlayer.playEffect(targetPlayer.getLocation(), Effect.ENDER_SIGNAL, 3);
				targetPlayer.playSound(targetPlayer.getLocation(), Sound.EXPLODE, 4, 0);
				
				player.sendMessage(ChatColor.LIGHT_PURPLE + "Whoosh!!!");
				targetPlayer.sendMessage(ChatColor.LIGHT_PURPLE + "Whoosh!!!");
				
			}
			else if (args.length >= 2)
			{
				player.sendMessage(ChatColor.DARK_RED + "Too many arguments!");
			}
		   }
		}
		return false;
	}
}
