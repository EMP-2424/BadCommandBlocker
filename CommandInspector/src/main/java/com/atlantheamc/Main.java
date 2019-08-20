package com.atlantheamc;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        System.out.println("CommandInspector Loaded");
        System.out.println("by Atlantheamc.com");

    }
    public void onDisable() {
        System.out.println("Command inspector Disabled");
        System.out.println("By Atlantheamc.com");

    }

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent commandblock){
        if (commandblock.getMessage().split(" ")[0].contains(":")) {
            commandblock.setCancelled(true);
            commandblock.getPlayer().sendMessage("§bMbot §f§l>> §cThis Command is not available");
        }
    }
}
