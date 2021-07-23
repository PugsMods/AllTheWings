package com.pugzarecute.allthewings.rendermanager;

import com.pugzarecute.allthewings.AllTheWings;
import com.pugzarecute.allthewings.Init;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.ElytraLayer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class YourBeingWatchedRenderManager  extends ElytraLayer<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>>
{
    private  final ResourceLocation TEXTURE = new ResourceLocation(AllTheWings.MODID, "textures/entity/yourbeingwatched.png");

    public YourBeingWatchedRenderManager(IEntityRenderer<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>> rendererIn)
    {
        super(rendererIn);
    }

    @Override
    public boolean shouldRender(ItemStack stack, AbstractClientPlayerEntity entity)
    {
        return stack.getItem() == Init.YOUR_BEING_WATCHED_ELYTRA.get();
    }

    @Override
    public ResourceLocation getElytraTexture(ItemStack stack, AbstractClientPlayerEntity entity)
    {
        return TEXTURE;
    }
}