package de.mats.testplugin.util;

import org.bukkit.entity.Player;

import java.util.HashMap;

/**
 * Erstellt von Boss
 */
public class ChatUtil {

    private HashMap<Player, Integer> playerIntegerHashMap = new HashMap<>();
    private HashMap<Player, Boolean> playerBooleanHashMap = new HashMap<>();

    public void setPlayerBoolean(Player player, boolean type) {
        if (!playerBooleanHashMap.containsKey(player)) {
            playerBooleanHashMap.put(player, type);
        }

        playerBooleanHashMap.replace(player, type);
    }

    public boolean getBoolen(Player player) {
        if (!playerBooleanHashMap.containsKey(player))
            return false;

        return playerBooleanHashMap.get(player);
    }

    public void addPlayerInt(Player player) {
        if (!playerIntegerHashMap.containsKey(player)) {
            playerIntegerHashMap.put(player, 1);
            return;
        }

        playerIntegerHashMap.replace(player, playerIntegerHashMap.get(player) + 1);
    }

    public void clearPlayer(Player player) {
        if (!playerIntegerHashMap.containsKey(player))
            return;

        playerIntegerHashMap.remove(player);
    }

    public Integer getInteger(Player player) {
        if (!playerIntegerHashMap.containsKey(player))
            return 0;

        return playerIntegerHashMap.get(player);
    }
}
