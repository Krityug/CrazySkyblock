package me.starboy.util.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class IslandPanel implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] atgs) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Account manager is not released ");
            player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Visit the forums for more information");



        }
        return  true;
    }
}
