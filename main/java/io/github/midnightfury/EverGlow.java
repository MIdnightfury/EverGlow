package io.github.midnightfury.everglow;

import org.bukkit.plugin.java.JavaPlugin;

public final class EverGlow extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Listeners(), this);
        this.getCommand("glow").setExecutor(new GlowCommand());
        this.getCommand("glow").setTabCompleter(new GlowCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
