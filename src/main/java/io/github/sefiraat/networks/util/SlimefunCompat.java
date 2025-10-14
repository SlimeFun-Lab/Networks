package io.github.sefiraat.networks.util;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public final class SlimefunCompat {
    private SlimefunCompat() {}

    public static org.bukkit.inventory.ItemStack asBukkit(io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack sfi) {
        ItemStack is = new ItemStack(sfi.getType());
        ItemMeta meta = sfi.getItemMeta();

        if (meta != null) {
            is.setItemMeta(meta.clone());
        }

        is.setAmount(sfi.getAmount());
        return is;
    }
}
