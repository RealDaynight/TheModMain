
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

import net.mcreator.themod.block.RedRoseBlock;
import net.mcreator.themod.block.PinkDaisyBlock;
import net.mcreator.themod.block.PaeoniaBlock;
import net.mcreator.themod.block.OpeningPaeoniaBlock;
import net.mcreator.themod.block.ButtercupBlock;
import net.mcreator.themod.block.BlueRoseBlock;
import net.mcreator.themod.ThemodMod;

public class ThemodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ThemodMod.MODID);
	public static final RegistryObject<Block> PAEONIA = REGISTRY.register("paeonia", () -> new PaeoniaBlock());
	public static final RegistryObject<Block> RED_ROSE = REGISTRY.register("red_rose", () -> new RedRoseBlock());
	public static final RegistryObject<Block> BLUE_ROSE = REGISTRY.register("blue_rose", () -> new BlueRoseBlock());
	public static final RegistryObject<Block> BUTTERCUP = REGISTRY.register("buttercup", () -> new ButtercupBlock());
	public static final RegistryObject<Block> OPENING_PAEONIA = REGISTRY.register("opening_paeonia", () -> new OpeningPaeoniaBlock());
	public static final RegistryObject<Block> PINK_DAISY = REGISTRY.register("pink_daisy", () -> new PinkDaisyBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PaeoniaBlock.registerRenderLayer();
			RedRoseBlock.registerRenderLayer();
			BlueRoseBlock.registerRenderLayer();
			ButtercupBlock.registerRenderLayer();
			OpeningPaeoniaBlock.registerRenderLayer();
			PinkDaisyBlock.registerRenderLayer();
		}
	}
}
