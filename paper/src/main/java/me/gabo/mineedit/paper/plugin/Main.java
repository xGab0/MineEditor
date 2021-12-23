package me.gabo.mineedit.paper.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Enabling MineEditor...");
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabling MineEditor...");
    }

}