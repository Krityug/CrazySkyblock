package me.starboy.util;

import me.starboy.util.Commands.Emergency;
import me.starboy.util.Commands.IslandPanel;
import me.starboy.util.gui.Panel;
import me.starboy.util.gui.SetupPanel;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Skyblock plugin has been enabled");
        this.getCommand("panel").setExecutor(new IslandPanel());
        this.getCommand("emergency").setExecutor(new Emergency());
        this.getCommand("island").setExecutor(new Panel());
        this.getCommand("setupskyblock").setExecutor(new SetupPanel());

    }

    @Override
    public void onDisable() {
        getLogger().info("Skyblock plugin has been disabled");
    }
}
