package org.wally.valantiscore.handlers;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.wally.valantiscore.ValantisCORE;

public class EnchantHandler implements Listener {

    public EnchantHandler(ValantisCORE plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
}
