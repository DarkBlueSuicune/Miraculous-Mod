package com.darksui.miraculous.client;

import com.darksui.miraculous.Miraculous;
import com.darksui.miraculous.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MiraculousTab extends CreativeTabs {

    public MiraculousTab() {
        super(Miraculous.modId);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ingot_copper);
    }
}
