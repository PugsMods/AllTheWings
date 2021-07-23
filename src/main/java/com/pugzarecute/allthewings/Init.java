package com.pugzarecute.allthewings;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Init {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AllTheWings.MODID);
    public static final RegistryObject<Item> ORANGE_TO_RED_ELYTRA = ITEMS.register("orange_to_red_elytra",() -> new ElytraBase(new Item.Properties().durability(425).tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> YOUR_BEING_WATCHED_ELYTRA = ITEMS.register("your_being_watched_elytra",() -> new ElytraBase(new Item.Properties().durability(425).tab(ItemGroup.TAB_MISC)));

}
