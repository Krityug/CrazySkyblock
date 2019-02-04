package me.starboy.util.gui;

import net.minecraft.server.v1_8_R3.Item;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;
import java.util.List;
import static com.sun.javafx.scene.DirtyBits.MATERIAL;

public class Panel implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            Inventory inventory = Bukkit.createInventory(null,54, ChatColor.GREEN + "" + ChatColor.BOLD + "Island Panel");
            List<String> commands = new ArrayList<String>();
            commands.add("say Hello World");

            //For emerald
            ItemStack emerald = new ItemStack(Material.EMERALD);
            //For the Display name
            ItemMeta meta = emerald.getItemMeta();
            meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Buildings");
            emerald.setItemMeta(meta);

            //For the lore of the emerald
            List<String> list = new ArrayList<>();
            list.add(ChatColor.GRAY + "You can see and manage all the buildings you bought for your island so far!");
            meta.setLore(list);
            emerald.setItemMeta(meta);

            //For the Diamond
            ItemStack diamond = new ItemStack(Material.DIAMOND);
            //For the Title of the diamond
            ItemMeta meta2 = diamond.getItemMeta();
            meta2.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD +"Island Shop");
            diamond.setItemMeta(meta2);
            //For the lore
            list.add(ChatColor.GRAY + "You can purchase new \nbuildings from this shop menu..");
            list.add(ChatColor.GRAY + "We also offers festive buildings and shop \nto purchase when it the sessions :)");
            meta2.setLore(list);
            diamond.setItemMeta(meta2);


            inventory.setItem(19, emerald);
            inventory.setItem(22,diamond);

            player.openInventory(inventory);


        }
        return true;
    }
}
