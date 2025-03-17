package com.nickoblocks.ftfmod.item;

import com.nickoblocks.ftfmod.FTFMod;
import com.nickoblocks.ftfmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FTFMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NICK_STUFF_TAB = CREATIVE_MODE_TABS.register("nick_stuff_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NICKCOIN.get()))
                    .title(Component.translatable("creativetab.ftfmod.nick_stuff"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.NICKCOIN.get());
                        output.accept(ModItems.NICITE_CLUMP.get());
                        output.accept(ModBlocks.COBBLED_NICITE.get());
                        output.accept(ModBlocks.NICKCOIN_PILE.get());
                        output.accept(ModItems.HAZELNUT.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
