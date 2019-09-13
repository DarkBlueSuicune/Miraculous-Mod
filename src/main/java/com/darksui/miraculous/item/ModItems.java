package com.darksui.miraculous.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemBase ingot_copper = new ItemBase("ingot_copper");
    public static ItemBase ingotPlatinum = new ItemBase("platinum_ingot");

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingot_copper,
                ingotPlatinum
        );
    }

    public static void registerItemModels() {
        ingot_copper.registerItemModel();
        ingotPlatinum.registerItemModel();
    }
}
