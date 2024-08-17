package com.cursee.mob_drops_recipes_end.core.tab;

import com.cursee.mob_drops_recipes_end.core.item.ModItemsFabric;
import com.cursee.mob_drops_recipes_end.core.registry.ModRegistryFabric;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabsFabric {

    public static void register() {}

    public static final CreativeModeTab MOB_DROPS_RECIPES_END = ModRegistryFabric.registerCreativeModeTab("mob_drops_recipes_end", FabricItemGroup.builder()
            .title(Component.translatable("itemGroup.mobDropsRecipesEnd"))
            .icon(() -> new ItemStack(ModItemsFabric.END_ESSENCE_COMMON))
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ModItemsFabric.END_ESSENCE_COMMON);
                output.accept(ModItemsFabric.END_ESSENCE_UNCOMMON);
                output.accept(ModItemsFabric.END_ESSENCE_RARE);
                output.accept(ModItemsFabric.END_ESSENCE_EPIC);
            }))
            .build());
}
