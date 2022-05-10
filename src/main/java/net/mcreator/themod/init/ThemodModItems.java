
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
	public static final RegistryObject<Item> PAEONIA = block(ThemodModBlocks.PAEONIA, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> RED_ROSE = block(ThemodModBlocks.RED_ROSE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BLUE_ROSE = block(ThemodModBlocks.BLUE_ROSE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BUTTERCUP = block(ThemodModBlocks.BUTTERCUP, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> OPENING_PAEONIA = block(ThemodModBlocks.OPENING_PAEONIA, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> PINK_DAISY = block(ThemodModBlocks.PINK_DAISY, CreativeModeTab.TAB_DECORATIONS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
