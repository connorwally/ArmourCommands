package org.wally.valantiscore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.wally.valantiscore.handlers.ArmourChangeHandler;
import org.wally.valantiscore.handlers.EnchantHandler;

public final class ValantisCORE extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Hello World");
        Bukkit.getLogger().info("Hello World 2");

        new ArmourChangeHandler(this);
        new EnchantHandler(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
