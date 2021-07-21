package com.pugzarecute.allthewings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.CallbackI;

import java.util.stream.Collectors;

@Mod("allthewings")
public class AllTheWings {
    public static final String MODID = "allthewings";
    public AllTheWings() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Init.ITEMS.register(bus);
        bus.addListener(this::client);
    }
    private void client(FMLClientSetupEvent event)
    {
        elytraLayer();
    }
    @OnlyIn(Dist.CLIENT)
    private void elytraLayer()
    {
        Minecraft.getInstance().getEntityRenderDispatcher().getSkinMap().values().forEach(player -> player.addLayer(new ElytraLayerRenderManager(player)));
    }
}
