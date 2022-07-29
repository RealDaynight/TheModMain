
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.themod.block.UncommonAdventureChestClosedBlock;
import net.mcreator.themod.block.UncommonAdventureChestBlock;
import net.mcreator.themod.block.RedRoseBlock;
import net.mcreator.themod.block.RareAdventureChestClosedBlock;
import net.mcreator.themod.block.RareAdventureChestBlock;
import net.mcreator.themod.block.PinkDaisyBlock;
import net.mcreator.themod.block.PaeoniaBlock;
import net.mcreator.themod.block.OpeningPaeoniaBlock;
import net.mcreator.themod.block.LegendaryAdventureChestClosedBlock;
import net.mcreator.themod.block.LegendaryAdventureChestBlock;
import net.mcreator.themod.block.DryedDirtBlock;
import net.mcreator.themod.block.DaynightHeadBlock;
import net.mcreator.themod.block.CommonAdventureChestClosedBlock;
import net.mcreator.themod.block.CommonAdventureChestBlock;
import net.mcreator.themod.block.ButtercupBlock;
import net.mcreator.themod.block.BlueRoseBlock;
import net.mcreator.themod.block.BlockOfNetheriteWallBlock;
import net.mcreator.themod.block.BlockOfNetheriteStairsBlock;
import net.mcreator.themod.block.BlockOfNetheriteSlabBlock;
import net.mcreator.themod.block.BlockOfNetheritePresurePlateBlock;
import net.mcreator.themod.block.BlockOfNetheriteFenceGateBlock;
import net.mcreator.themod.block.BlockOfNetheriteFenceBlock;
import net.mcreator.themod.block.BlockOfNetheriteButtonBlock;
import net.mcreator.themod.ThemodMod;

public class ThemodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ThemodMod.MODID);
	public static final RegistryObject<Block> COMMON_ADVENTURE_CHEST_CLOSED = REGISTRY.register("common_adventure_chest_closed",
			() -> new CommonAdventureChestClosedBlock());
	public static final RegistryObject<Block> COMMON_ADVENTURE_CHEST = REGISTRY.register("common_adventure_chest",
			() -> new CommonAdventureChestBlock());
	public static final RegistryObject<Block> PAEONIA = REGISTRY.register("paeonia", () -> new PaeoniaBlock());
	public static final RegistryObject<Block> UNCOMMON_ADVENTURE_CHEST_CLOSED = REGISTRY.register("uncommon_adventure_chest_closed",
			() -> new UncommonAdventureChestClosedBlock());
	public static final RegistryObject<Block> RED_ROSE = REGISTRY.register("red_rose", () -> new RedRoseBlock());
	public static final RegistryObject<Block> UNCOMMON_ADVENTURE_CHEST = REGISTRY.register("uncommon_adventure_chest",
			() -> new UncommonAdventureChestBlock());
	public static final RegistryObject<Block> BLUE_ROSE = REGISTRY.register("blue_rose", () -> new BlueRoseBlock());
	public static final RegistryObject<Block> RARE_ADVENTURE_CHEST_CLOSED = REGISTRY.register("rare_adventure_chest_closed",
			() -> new RareAdventureChestClosedBlock());
	public static final RegistryObject<Block> BUTTERCUP = REGISTRY.register("buttercup", () -> new ButtercupBlock());
	public static final RegistryObject<Block> RARE_ADVENTURE_CHEST = REGISTRY.register("rare_adventure_chest", () -> new RareAdventureChestBlock());
	public static final RegistryObject<Block> OPENING_PAEONIA = REGISTRY.register("opening_paeonia", () -> new OpeningPaeoniaBlock());
	public static final RegistryObject<Block> LEGENDARY_ADVENTURE_CHEST_CLOSED = REGISTRY.register("legendary_adventure_chest_closed",
			() -> new LegendaryAdventureChestClosedBlock());
	public static final RegistryObject<Block> PINK_DAISY = REGISTRY.register("pink_daisy", () -> new PinkDaisyBlock());
	public static final RegistryObject<Block> LEGENDARY_ADVENTURE_CHEST = REGISTRY.register("legendary_adventure_chest",
			() -> new LegendaryAdventureChestBlock());
	public static final RegistryObject<Block> BLOCK_OF_NETHERITE_STAIRS = REGISTRY.register("block_of_netherite_stairs",
			() -> new BlockOfNetheriteStairsBlock());
	public static final RegistryObject<Block> BLOCK_OF_NETHERITE_SLAB = REGISTRY.register("block_of_netherite_slab",
			() -> new BlockOfNetheriteSlabBlock());
	public static final RegistryObject<Block> BLOCK_OF_NETHERITE_WALL = REGISTRY.register("block_of_netherite_wall",
			() -> new BlockOfNetheriteWallBlock());
	public static final RegistryObject<Block> BLOCK_OF_NETHERITE_FENCE = REGISTRY.register("block_of_netherite_fence",
			() -> new BlockOfNetheriteFenceBlock());
	public static final RegistryObject<Block> BLOCK_OF_NETHERITE_FENCE_GATE = REGISTRY.register("block_of_netherite_fence_gate",
			() -> new BlockOfNetheriteFenceGateBlock());
	public static final RegistryObject<Block> BLOCK_OF_NETHERITE_PRESURE_PLATE = REGISTRY.register("block_of_netherite_presure_plate",
			() -> new BlockOfNetheritePresurePlateBlock());
	public static final RegistryObject<Block> BLOCK_OF_NETHERITE_BUTTON = REGISTRY.register("block_of_netherite_button",
			() -> new BlockOfNetheriteButtonBlock());
	public static final RegistryObject<Block> DRYED_DIRT = REGISTRY.register("dryed_dirt", () -> new DryedDirtBlock());
	public static final RegistryObject<Block> DAYNIGHT_HEAD = REGISTRY.register("daynight_head", () -> new DaynightHeadBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CommonAdventureChestClosedBlock.registerRenderLayer();
			CommonAdventureChestBlock.registerRenderLayer();
			PaeoniaBlock.registerRenderLayer();
			UncommonAdventureChestClosedBlock.registerRenderLayer();
			RedRoseBlock.registerRenderLayer();
			UncommonAdventureChestBlock.registerRenderLayer();
			BlueRoseBlock.registerRenderLayer();
			RareAdventureChestClosedBlock.registerRenderLayer();
			ButtercupBlock.registerRenderLayer();
			RareAdventureChestBlock.registerRenderLayer();
			OpeningPaeoniaBlock.registerRenderLayer();
			LegendaryAdventureChestClosedBlock.registerRenderLayer();
			PinkDaisyBlock.registerRenderLayer();
			LegendaryAdventureChestBlock.registerRenderLayer();
			BlockOfNetheriteWallBlock.registerRenderLayer();
			BlockOfNetheriteFenceBlock.registerRenderLayer();
			BlockOfNetheriteFenceGateBlock.registerRenderLayer();
			BlockOfNetheritePresurePlateBlock.registerRenderLayer();
			BlockOfNetheriteButtonBlock.registerRenderLayer();
			DaynightHeadBlock.registerRenderLayer();
		}
	}
}
