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
    private  final ResourceLocation TEXTURE = new ResourceLocation("textures/entity/io.png");

    public ElytraLayerRenderManager(IEntityRenderer<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>> rendererIn)
    {
        super(rendererIn);
    }

    @Override
    public boolean shouldRender(ItemStack stack, AbstractClientPlayerEntity entity)
    {
        return stack.getItem() == Init.DIRT_ELYTRA.get();
    }

    @Override
    public ResourceLocation getElytraTexture(ItemStack stack, AbstractClientPlayerEntity entity)
    {
        return TEXTURE;
    }
}