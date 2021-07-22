package com.pugzarecute.allthewings;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Init {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AllTheWings.MODID);
    public static final RegistryObject<Item> DIRT_ELYTRA = ITEMS.register("dirt_elytra",() -> new ElytraBase(new Item.Properties().durability(100).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> GRASS_ELYTRA = ITEMS.register("grass_elytra",() -> new ElytraBase(new Item.Properties().durability(100).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> PODZOL_ELYTRA = ITEMS.register("podzol_elytra",() -> new ElytraBase(new Item.Properties().durability(100).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> PATH_ELYTRA = ITEMS.register("path_elytra",() -> new ElytraBase(new Item.Properties().durability(100).tab(ItemGroup.TAB_MISC)));
}
