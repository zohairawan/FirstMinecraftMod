package com.first.firstmod.item;

import com.first.firstmod.TutorialMod;
import com.first.firstmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    // Adds class to list of registered entities
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    // Add Item tab to game

    public static final RegistryObject<CreativeModeTab> CUSTOM_ITEM = CREATIVE_MODE_TABS.register("custom_item",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHISEL.get()))
                    .title(Component.translatable("creativetab.tutorialmod.custom_item"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CHISEL.get());
                        output.accept(ModItems.ALEXANDRITE.get());
                        output.accept(ModItems.RAW_ALEXANDRITE.get());
                        output.accept(ModItems.KOHLRABI.get());
                    }).build());

    // Add Block tab to game

    public static final RegistryObject<CreativeModeTab> CUSTOM_BLOCK = CREATIVE_MODE_TABS.register("custom_block",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MAGIC_BLOCK.get()))
                    .withTabsBefore(CUSTOM_ITEM.getId())
                    .title(Component.translatable("creativetab.tutorialmod.custom_block"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.ALEXANDRITE_ORE.get());
                        output.accept(ModBlocks.MAGIC_BLOCK.get());
                    }).build());


    // Completes registry of class
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
