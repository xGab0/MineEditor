package me.gabo.mineedit.minestom.extension;

import net.minestom.server.extensions.Extension;

public class Main extends Extension {

    @Override
    public void initialize() {
        getLogger().info("Initializing MineEditor...");
    }

    @Override
    public void terminate() {
        getLogger().info("Terminating MineEditor...");
    }

}