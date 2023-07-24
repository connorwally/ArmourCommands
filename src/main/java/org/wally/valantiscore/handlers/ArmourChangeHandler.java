package org.wally.valantiscore.handlers;

import com.destroystokyo.paper.event.player.PlayerArmorChangeEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.wally.valantiscore.ValantisCORE;

public class ArmourChangeHandler implements Listener {

    public ArmourChangeHandler(ValantisCORE plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void OnArmourChange(PlayerArmorChangeEvent event){
        ItemStack[] armour = event.getPlayer().getInventory().getArmorContents();
        AssignClass(armour);
    }

    void AssignClass(ItemStack[] armour){

        if(armour[0].getType() == Material.DIAMOND_BOOTS && armour[1].getType() == Material.DIAMOND_LEGGINGS
                && armour[2].getType() == Material.DIAMOND_CHESTPLATE && armour[3].getType() == Material.DIAMOND_HELMET){
            Bukkit.getLogger().info("DIAMOND EQUIPPED");
        }
        else if(armour[0].getType() == Material.IRON_BOOTS && armour[1].getType() == Material.IRON_LEGGINGS
                && armour[2].getType() == Material.IRON_CHESTPLATE && armour[3].getType() == Material.IRON_HELMET){
            Bukkit.getLogger().info("IRON EQUIPPED");
        }
        else if(armour[0].getType() == Material.CHAINMAIL_BOOTS && armour[1].getType() == Material.CHAINMAIL_LEGGINGS
                && armour[2].getType() == Material.CHAINMAIL_CHESTPLATE && armour[3].getType() == Material.CHAINMAIL_HELMET){
            Bukkit.getLogger().info("CHAINMAIL EQUIPPED");
        }
        else if(armour[0].getType() == Material.GOLDEN_BOOTS && armour[1].getType() == Material.GOLDEN_LEGGINGS
                && armour[2].getType() == Material.GOLDEN_CHESTPLATE && armour[3].getType() == Material.GOLDEN_HELMET){
            Bukkit.getLogger().info("GOLD EQUIPPED");
        }
        else if(armour[0].getType() == Material.LEATHER_BOOTS && armour[1].getType() == Material.LEATHER_LEGGINGS
                && armour[2].getType() == Material.LEATHER_CHESTPLATE && armour[3].getType() == Material.LEATHER_HELMET){
            Bukkit.getLogger().info("LEATHER EQUIPPED");
        }
        else if(armour[0].getType() == Material.NETHERITE_BOOTS && armour[1].getType() == Material.NETHERITE_LEGGINGS
                && armour[2].getType() == Material.NETHERITE_CHESTPLATE && armour[3].getType() == Material.NETHERITE_HELMET){
            Bukkit.getLogger().info("NETHERITE EQUIPPED");
        }
        else{
            Bukkit.getLogger().info("NO SET EQUIPPED");
        }

    }
}
