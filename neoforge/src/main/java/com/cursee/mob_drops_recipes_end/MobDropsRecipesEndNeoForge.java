package com.cursee.mob_drops_recipes_end;

import com.cursee.mob_drops_recipes_end.core.registry.ModRegistryNeoForge;
import com.cursee.monolib.core.sailing.Sailing;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class MobDropsRecipesEndNeoForge {

    public MobDropsRecipesEndNeoForge(final IEventBus modEventBus) {

        MobDropsRecipesEnd.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        ModRegistryNeoForge.register(modEventBus);
    }
}
