package com.cursee.mob_drops_recipes_end.core.tab;

import com.cursee.mob_drops_recipes_end.core.item.ModItemsForge;
import com.cursee.mob_drops_recipes_end.core.registry.ModRegistryForge;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabsForge {

    public static void register() {}

    public static final RegistryObject<CreativeModeTab> MOB_DROPS_RECIPES_END = ModRegistryForge.registerCreativeModeTab("mob_drops_recipes_end", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.mobDropsRecipesEnd"))
            .icon(() -> new ItemStack(ModItemsForge.END_ESSENCE_COMMON.get()))
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ModItemsForge.END_ESSENCE_COMMON.get());
                output.accept(ModItemsForge.END_ESSENCE_UNCOMMON.get());
                output.accept(ModItemsForge.END_ESSENCE_RARE.get());
                output.accept(ModItemsForge.END_ESSENCE_EPIC.get());
            }))
            .build());
}
