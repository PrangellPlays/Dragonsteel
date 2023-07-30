package net.prangellplays.dragonsteel.registry;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.prangellplays.dragonsteel.Dragonsteel;
import net.prangellplays.dragonsteel.item.DragonsteelItemTier;
import net.prangellplays.dragonsteel.item.ScytheFireDragonsteel;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.FLOWER_POT;
import static net.minecraftforge.registries.ForgeRegistries.BLOCKS;
import static net.minecraftforge.registries.ForgeRegistries.ITEMS;

public class DragonsteelBlocks {

    public static final DeferredRegister<Block> Blocks = DeferredRegister.create(BLOCKS, Dragonsteel.MOD_ID);

    public static final RegistryObject<Block> DRAGON_LILY = registerBlock("dragon_lily",
            () -> new FlowerBlock(MobEffects.REGENERATION, 1,
                    BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.DANDELION).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> DRAGONSTEEL_BLOCK = registerBlock("dragonsteel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(50.0f, 1200.0f).sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FLAME_DRAGONSTEEL_BLOCK = registerBlock("flame_dragonsteel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(50.0f, 1200.0f).sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = Blocks.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return DragonsteelItems.Items.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = Blocks.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return DragonsteelItems.Items.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        Blocks.register(eventBus);
    }
}