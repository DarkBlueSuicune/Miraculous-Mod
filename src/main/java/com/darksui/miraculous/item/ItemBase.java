package com.darksui.miraculous.item;

import com.darksui.miraculous.Miraculous;
import com.darksui.miraculous.client.MiraculousTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Miraculous.creativeTab);
    }

    public void registerItemModel() {
        Miraculous.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
