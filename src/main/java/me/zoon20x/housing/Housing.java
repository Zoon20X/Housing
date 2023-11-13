package me.zoon20x.housing;

import org.bukkit.plugin.java.JavaPlugin;

public final class Housing extends JavaPlugin {

    private static Housing instance;


    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    public static Housing getInstance(){
        return instance;
    }
}
