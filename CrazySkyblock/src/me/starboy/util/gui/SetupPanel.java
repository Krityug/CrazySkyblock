package me.starboy.util.gui;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetupPanel implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label,String[] args) {
        if (sender instanceof Player) {
            Player player = (Player)  sender;
            player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "The setup Panel is only for staff so you can't access it");




        }
        return true;
    }


}
