
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.themod.ThemodMod;

public class ThemodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThemodMod.MODID);
	public static final RegistryObject<Item> BC = REGISTRY.register("bc_spawn_egg",
			() -> new ForgeSpawnEggItem(ThemodModEntities.BC, -3407872, -6684775, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
