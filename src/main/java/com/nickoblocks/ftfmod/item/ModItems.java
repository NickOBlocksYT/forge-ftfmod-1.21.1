package com.nickoblocks.ftfmod.item;

import com.nickoblocks.ftfmod.FTFMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FTFMod.MOD_ID);

    public static final RegistryObject<Item> NICKCOIN = ITEMS.register("nickcoin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICITE_CLUMP = ITEMS.register("nicite_clump",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HAZELNUT = ITEMS.register("hazelnut",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
