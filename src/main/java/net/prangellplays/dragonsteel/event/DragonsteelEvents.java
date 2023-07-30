package net.prangellplays.dragonsteel.event;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.prangellplays.dragonsteel.Dragonsteel;
import net.prangellplays.dragonsteel.event.loot.ChorusPetalFromChorusPlantAdditionModifier;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Dragonsteel.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DragonsteelEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new ChorusPetalFromChorusPlantAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(Dragonsteel.MOD_ID,"chorus_petal_from_chorus_plant"))
        );
    }
}
