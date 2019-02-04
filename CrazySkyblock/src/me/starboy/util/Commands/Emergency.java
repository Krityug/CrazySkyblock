package me.starboy.util.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Emergency implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "We are currently processing your request This may take a while for us to get you a apple to eat :)");

            //This is creating a new item called apple. The lowercase apple can be means called anything like for ex diamond or etc.
            ItemStack apple = new ItemStack(Material.APPLE);

            //This is the amount to items player will get If you want to give two stacks simply add 64+64 which is 128 for three do this 64+64+6
            apple.setAmount(128);

            //This is finally give player the items when he execute the command. If you have more items use ( example, example2); like this
            player.getInventory().addItem(apple);

        }
        return false;
    }
}
