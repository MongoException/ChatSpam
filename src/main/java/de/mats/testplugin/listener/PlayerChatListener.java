package de.mats.testplugin.listener;

import de.mats.testplugin.TestPlugin;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

/**
 * Erstellt von Boss
 */
public class PlayerChatListener implements Listener {

    @EventHandler
    public void onChat(PlayerChatEvent event) {
        Player player = event.getPlayer();

        if (TestPlugin.getInstance().getChatUtil().getBoolen(player)) {
            event.setCancelled(true);
            player.sendMessage("§cDu darfst nicht spammen.");
            return;
        }

        switch (TestPlugin.getInstance().getChatUtil().getInteger(player)) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                event.setCancelled(true);
                player.sendMessage("§cDu darfst nicht spammen.");
                TestPlugin.getInstance().getChatUtil().clearPlayer(player);
                TestPlugin.getInstance().getChatUtil().setPlayerBoolean(player, true);
                Bukkit.getScheduler().runTaskLater(TestPlugin.getInstance(), () -> {
                    TestPlugin.getInstance().getChatUtil().setPlayerBoolean(player, false);
                }, 10*10);
                break;

        }

        TestPlugin.getInstance().getChatUtil().addPlayerInt(player);
    }
}
