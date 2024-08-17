package com.cursee.mob_drops_recipes_end.core.tab;

import com.cursee.mob_drops_recipes_end.core.item.ModItemsNeoForge;
import com.cursee.mob_drops_recipes_end.core.registry.ModRegistryNeoForge;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModCreativeModeTabsNeoForge {

    public static void register() {}

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MOB_DROPS_RECIPES_END = ModRegistryNeoForge.registerCreativeModeTab("mob_drops_recipes_end", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.mobDropsRecipesEnd"))
            .icon(() -> new ItemStack(ModItemsNeoForge.END_ESSENCE_COMMON.get()))
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ModItemsNeoForge.END_ESSENCE_COMMON.get());
                output.accept(ModItemsNeoForge.END_ESSENCE_UNCOMMON.get());
                output.accept(ModItemsNeoForge.END_ESSENCE_RARE.get());
                output.accept(ModItemsNeoForge.END_ESSENCE_EPIC.get());
            }))
            .build());
}
