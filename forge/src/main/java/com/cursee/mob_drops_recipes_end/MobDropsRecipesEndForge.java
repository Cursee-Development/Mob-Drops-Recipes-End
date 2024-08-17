package com.cursee.mob_drops_recipes_end;

import com.cursee.mob_drops_recipes_end.core.registry.ModRegistryForge;
import com.cursee.monolib.core.sailing.Sailing;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class MobDropsRecipesEndForge {
    
    public MobDropsRecipesEndForge() {
    
        MobDropsRecipesEnd.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModRegistryForge.register(modEventBus);
    }
}
