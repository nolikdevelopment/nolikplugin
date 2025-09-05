package org.dev.nolikplugin.Menu;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class SkladMenu implements InventoryHolder {

    int menuid;

    public SkladMenu(int menuid) {
        this.menuid = menuid;
    }

    public int getMenuid() {
        return menuid;
    }

    @Override
    public @NotNull Inventory getInventory() {
        return null;
    }
}
