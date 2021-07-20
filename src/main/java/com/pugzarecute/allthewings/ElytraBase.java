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
        DispenserBlock.registerDispenseBehavior (this, ArmorItem.DISPENSER_BEHAVIOR);
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
        //Adding 1 to ticksElytraFlying prevents damage on the very first tick.
        if (!entity.world.isRemote && (flightTicks + 1) % 20 == 0)
        {
            stack.damageItem(1, entity, e -> e.sendBreakAnimation(EquipmentSlotType.CHEST));
        }
        return true;
    }
}
