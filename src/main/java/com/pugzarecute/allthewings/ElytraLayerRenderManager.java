package com.pugzarecute.allthewings;

import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import org.lwjgl.system.CallbackI;

import javax.annotation.Nonnull;

public class ElytraLayerRenderManager extends net.minecraft.client.renderer.entity.layers.ElytraLayer<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>>
{
    private static RegistryObject<Item> ELYTRA_IN = null;
    private  final ResourceLocation TEXTURE = new ResourceLocation("textures/entity/"+ELYTRA_IN.get().getRegistryName()+".png");

    public ElytraLayerRenderManager(IEntityRenderer<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>> rendererIn, @Nonnull RegistryObject<Item> ELYTRA_IN)
    {
        super(rendererIn);
        ElytraLayerRenderManager.ELYTRA_IN = ELYTRA_IN;
    }

    @Override
    public boolean shouldRender(ItemStack stack, AbstractClientPlayerEntity entity)
    {
        return stack.getItem() == ELYTRA_IN.get();
    }

    @Override
    public ResourceLocation getElytraTexture(ItemStack stack, AbstractClientPlayerEntity entity)
    {
        return TEXTURE;
    }
}