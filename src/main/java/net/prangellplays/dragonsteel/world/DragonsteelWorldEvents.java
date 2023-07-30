package net.prangellplays.dragonsteel.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.prangellplays.dragonsteel.Dragonsteel;
import net.prangellplays.dragonsteel.world.gen.DragonsteelFlowerGeneration;

@Mod.EventBusSubscriber(modid = Dragonsteel.MOD_ID)
public class DragonsteelWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        DragonsteelFlowerGeneration.generateFlowers(event);
    }
}
