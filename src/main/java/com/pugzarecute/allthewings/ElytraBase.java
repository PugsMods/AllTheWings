package com.pugzarecute.allthewings;

import net.minecraft.block.DispenserBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class ElytraBase extends Item
{

    public ElytraBase(Properties properties)
    {
        super(properties);
        DispenserBlock.registerBehavior (this, ArmorItem.DISPENSE_ITEM_BEHAVIOR);
    }

    @Nullable
    @Override
    public EquipmentSlotType getEquipmentSlot(ItemStack stack)
    {
        return EquipmentSlotType.CHEST;
    }

    @Override
    public boolean canElytraFly(ItemStack stack, LivingEntity entity)
    {
        return true;
    }

    @Override
    public boolean elytraFlightTick(ItemStack stack, LivingEntity entity, int flightTicks)
    {
        if (!entity.level.isClientSide && (flightTicks + 1) % 20 == 0)
        {
            stack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(EquipmentSlotType.CHEST));
        }
        return true;
    }
}
