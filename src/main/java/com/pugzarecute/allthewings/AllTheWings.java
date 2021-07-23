package com.pugzarecute.allthewings;

import com.pugzarecute.allthewings.rendermanager.O2RRenderManager;
import com.pugzarecute.allthewings.rendermanager.YourBeingWatchedRenderManager;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("allthewings")
public class AllTheWings {
    public static final String MODID = "allthewings";
    public AllTheWings() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Init.ITEMS.register(bus);
        bus.addListener(this::client);
    }

    private void client(FMLClientSetupEvent event) { elytraLayer(); }

    @OnlyIn(Dist.CLIENT)
    private void elytraLayer()
    {
        Minecraft.getInstance().getEntityRenderDispatcher().getSkinMap().values().forEach(player -> player.addLayer(new O2RRenderManager(player)));
        Minecraft.getInstance().getEntityRenderDispatcher().getSkinMap().values().forEach(player -> player.addLayer(new YourBeingWatchedRenderManager(player)));
    }
}
