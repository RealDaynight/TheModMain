
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.themod.world.features.plants.RedRoseFeature;
import net.mcreator.themod.world.features.plants.PinkDaisyFeature;
import net.mcreator.themod.world.features.plants.PaeoniaFeature;
import net.mcreator.themod.world.features.plants.OpeningPaeoniaFeature;
import net.mcreator.themod.world.features.plants.ButtercupFeature;
import net.mcreator.themod.world.features.plants.BlueRoseFeature;
import net.mcreator.themod.ThemodMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class ThemodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ThemodMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> PAEONIA = register("paeonia", PaeoniaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PaeoniaFeature.GENERATE_BIOMES, PaeoniaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_ROSE = register("red_rose", RedRoseFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RedRoseFeature.GENERATE_BIOMES, RedRoseFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLUE_ROSE = register("blue_rose", BlueRoseFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BlueRoseFeature.GENERATE_BIOMES, BlueRoseFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BUTTERCUP = register("buttercup", ButtercupFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, ButtercupFeature.GENERATE_BIOMES, ButtercupFeature::placedFeature));
	public static final RegistryObject<Feature<?>> OPENING_PAEONIA = register("opening_paeonia", OpeningPaeoniaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, OpeningPaeoniaFeature.GENERATE_BIOMES,
					OpeningPaeoniaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PINK_DAISY = register("pink_daisy", PinkDaisyFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PinkDaisyFeature.GENERATE_BIOMES, PinkDaisyFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
