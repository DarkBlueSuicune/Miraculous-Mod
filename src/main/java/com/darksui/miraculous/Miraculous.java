package com.darksui.miraculous;

import com.darksui.miraculous.client.MiraculousTab;
import com.darksui.miraculous.item.ModItems;
import com.darksui.miraculous.proxy.CommonProxy;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Miraculous.modId, name = Miraculous.name, version = Miraculous.version, acceptedMinecraftVersions = "[1.12.2]")

public class Miraculous {

    public static final String modId = "miraculous";
    public static final String name = "Miraculous Mod";
    public static final String version = "0.0.2";

    public static final MiraculousTab creativeTab = new MiraculousTab();

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());
        }
        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            ModItems.registerItemModels();
        }
    }

    @Mod.Instance(modId)
    public static Miraculous instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("Tikki, spots on!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @SidedProxy(serverSide = "com.darksui.miraculous.proxy.CommonProxy", clientSide = "com.darksui.miraculous.proxy.ClientProxy")
    public static CommonProxy proxy;

}
