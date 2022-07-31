
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.themod.block.entity.UncommonAdventureChestBlockEntity;
import net.mcreator.themod.block.entity.RareAdventureChestBlockEntity;
import net.mcreator.themod.block.entity.LegendaryAdventureChestBlockEntity;
import net.mcreator.themod.block.entity.EpicAdventureChestBlockEntity;
import net.mcreator.themod.block.entity.CommonAdventureChestBlockEntity;
import net.mcreator.themod.ThemodMod;

public class ThemodModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ThemodMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> COMMON_ADVENTURE_CHEST = register("common_adventure_chest",
			ThemodModBlocks.COMMON_ADVENTURE_CHEST, CommonAdventureChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> UNCOMMON_ADVENTURE_CHEST = register("uncommon_adventure_chest",
			ThemodModBlocks.UNCOMMON_ADVENTURE_CHEST, UncommonAdventureChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RARE_ADVENTURE_CHEST = register("rare_adventure_chest",
			ThemodModBlocks.RARE_ADVENTURE_CHEST, RareAdventureChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LEGENDARY_ADVENTURE_CHEST = register("legendary_adventure_chest",
			ThemodModBlocks.LEGENDARY_ADVENTURE_CHEST, LegendaryAdventureChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EPIC_ADVENTURE_CHEST = register("epic_adventure_chest",
			ThemodModBlocks.EPIC_ADVENTURE_CHEST, EpicAdventureChestBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
