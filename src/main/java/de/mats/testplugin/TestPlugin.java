package de.mats.testplugin;

import de.mats.testplugin.listener.PlayerChatListener;
import de.mats.testplugin.util.ChatUtil;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Erstellt von Boss
 */
@Getter
public class TestPlugin extends JavaPlugin {

    @Getter
    private static TestPlugin instance;

    private ChatUtil chatUtil;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        intialize();
    }

    private void intialize() {
        chatUtil = new ChatUtil();

        Bukkit.getPluginManager().registerEvents(new PlayerChatListener(), this);
    }
}
