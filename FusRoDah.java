package com.mcalias.guildhubfactions.piratepanda;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class PlayerSwap implements Listener{
		
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerInteractEntity(PlayerInteractEntityEvent event){
		if(event.getRightClicked() instanceof Player) {	
			
			Player P2 = (Player) event.getRightClicked();
			Player P1 = (Player) event.getPlayer();
			
			if(P1.hasPermission("CheatPackage.Swap")){
			
			Location l1 = event.getPlayer().getLocation();
			Location l2 = P2.getLocation();
			event.getPlayer().teleport(l2);
			P2.teleport(l1);
			
			P1.sendMessage(ChatColor.DARK_RED + "Switched!");
			P2.sendMessage(ChatColor.DARK_RED + "You were switched!");
			
			P1.playEffect(P1.getLocation(), Effect.SMOKE, 4);
			P2.playEffect(P2.getLocation(), Effect.SMOKE, 4);
			
			P1.playSound(P1.getLocation(), Sound.EXPLODE, 4, 0);
			P1.playSound(P1.getLocation(),  Sound.EXPLODE,  4,  0);
			
			}//Permission
			else P1.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "You do not have permission to do that!");
		
		}//if(event.getRightClicked
	}//public void onPlayerInteractEntity
}
