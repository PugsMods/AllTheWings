package com.pugzarecute.allthewings;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Init {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AllTheWings.MODID);
    private static final RegistryObject<Item> DIRT_ELYTRA = ITEMS.register("dirt_elytra",() -> new ElytraBase(new Item.Properties().maxDamage(10).group(ItemGroup.MISC)));
}
