package com.cursee.mob_drops_recipes_end;

import com.cursee.mob_drops_recipes_end.core.registry.ModRegistryFabric;
import com.cursee.monolib.core.sailing.Sailing;
import net.fabricmc.api.ModInitializer;

public class MobDropsRecipesEndFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        
        MobDropsRecipesEnd.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        ModRegistryFabric.register();
    }
}
