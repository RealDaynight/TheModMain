
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.themod.ThemodMod;

public class ThemodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThemodMod.MODID);
	public static final RegistryObject<Item> COMMON_ADVENTURE_CHEST_CLOSED = block(ThemodModBlocks.COMMON_ADVENTURE_CHEST_CLOSED,
			ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> COMMON_ADVENTURE_CHEST = block(ThemodModBlocks.COMMON_ADVENTURE_CHEST, ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> PAEONIA = block(ThemodModBlocks.PAEONIA, ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> UNCOMMON_ADVENTURE_CHEST_CLOSED = block(ThemodModBlocks.UNCOMMON_ADVENTURE_CHEST_CLOSED,
			ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> RED_ROSE = block(ThemodModBlocks.RED_ROSE, ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> UNCOMMON_ADVENTURE_CHEST = block(ThemodModBlocks.UNCOMMON_ADVENTURE_CHEST,
			ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> BLUE_ROSE = block(ThemodModBlocks.BLUE_ROSE, ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> RARE_ADVENTURE_CHEST_CLOSED = block(ThemodModBlocks.RARE_ADVENTURE_CHEST_CLOSED,
			ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> BUTTERCUP = block(ThemodModBlocks.BUTTERCUP, ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> RARE_ADVENTURE_CHEST = block(ThemodModBlocks.RARE_ADVENTURE_CHEST, ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> OPENING_PAEONIA = block(ThemodModBlocks.OPENING_PAEONIA, ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> LEGENDARY_ADVENTURE_CHEST_CLOSED = block(ThemodModBlocks.LEGENDARY_ADVENTURE_CHEST_CLOSED,
			ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> PINK_DAISY = block(ThemodModBlocks.PINK_DAISY, ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> LEGENDARY_ADVENTURE_CHEST = block(ThemodModBlocks.LEGENDARY_ADVENTURE_CHEST,
			ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> BLOCK_OF_NETHERITE_STAIRS = block(ThemodModBlocks.BLOCK_OF_NETHERITE_STAIRS,
			ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> BLOCK_OF_NETHERITE_SLAB = block(ThemodModBlocks.BLOCK_OF_NETHERITE_SLAB, ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> BLOCK_OF_NETHERITE_WALL = block(ThemodModBlocks.BLOCK_OF_NETHERITE_WALL, ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> BLOCK_OF_NETHERITE_FENCE = block(ThemodModBlocks.BLOCK_OF_NETHERITE_FENCE,
			ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> BLOCK_OF_NETHERITE_FENCE_GATE = block(ThemodModBlocks.BLOCK_OF_NETHERITE_FENCE_GATE,
			ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> BLOCK_OF_NETHERITE_PRESURE_PLATE = block(ThemodModBlocks.BLOCK_OF_NETHERITE_PRESURE_PLATE,
			ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> BLOCK_OF_NETHERITE_BUTTON = block(ThemodModBlocks.BLOCK_OF_NETHERITE_BUTTON,
			ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> DRYED_DIRT = block(ThemodModBlocks.DRYED_DIRT, ThemodModTabs.TAB_ENHANCEMENTS);
	public static final RegistryObject<Item> DAYNIGHT_HEAD = block(ThemodModBlocks.DAYNIGHT_HEAD, ThemodModTabs.TAB_ENHANCEMENTS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
