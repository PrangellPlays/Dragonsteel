package net.prangellplays.dragonsteel.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.prangellplays.dragonsteel.Dragonsteel;
import net.prangellplays.dragonsteel.item.DragonsteelItemTier;
import net.prangellplays.dragonsteel.item.ScytheFireDragonsteel;

import static net.minecraftforge.registries.ForgeRegistries.ITEMS;

public class DragonsteelItems {

    public static final DeferredRegister<Item> Items = DeferredRegister.create(ITEMS, Dragonsteel.MOD_ID);

    public static final RegistryObject<Item> DRAGONSTEEL = Items.register("dragonsteel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> FLAME_DRAGONSTEEL = Items.register("flame_dragonsteel", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> CHORUS_PETAL = Items.register("chorus_petal", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> SCYTHE_FIRE_DRAGONSTEEL = Items.register("scythe_fire_dragonsteel", () -> new ScytheFireDragonsteel(DragonsteelItemTier.FLAME_DRAGONSTEEL, 1, -2.4f, new  Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }
}
