package com.pugzarecute.allthewings;

import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class O2RRenderManager extends net.minecraft.client.renderer.entity.layers.ElytraLayer<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>>
{
    private  final ResourceLocation TEXTURE = new ResourceLocation(AllTheWings.MODID, "textures/entity/orangetoredelytra.png");

    public O2RRenderManager(IEntityRenderer<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>> rendererIn)
    {
        super(rendererIn);
    }

    @Override
    public boolean shouldRender(ItemStack stack, AbstractClientPlayerEntity entity)
    {
        return stack.getItem() == Init.ORANGE_TO_RED_ELYTRA.get();
    }

    @Override
    public ResourceLocation getElytraTexture(ItemStack stack, AbstractClientPlayerEntity entity)
    {
        return TEXTURE;
    }
}