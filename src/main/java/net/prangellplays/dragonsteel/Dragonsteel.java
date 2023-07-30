package net.prangellplays.dragonsteel;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.prangellplays.dragonsteel.registry.DragonsteelBlocks;
import net.prangellplays.dragonsteel.registry.DragonsteelItems;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Dragonsteel.MOD_ID)
public class Dragonsteel
{

    public static final String MOD_ID = "dragonsteel";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Dragonsteel() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        DragonsteelItems.register(eventBus);
        DragonsteelBlocks.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }


    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(DragonsteelBlocks.DRAGON_LILY.get(), RenderType.cutout());
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

        });
    }
}
