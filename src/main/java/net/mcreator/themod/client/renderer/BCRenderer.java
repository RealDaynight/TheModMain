
package net.mcreator.themod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.themod.entity.BCEntity;

public class BCRenderer extends MobRenderer<BCEntity, ChickenModel<BCEntity>> {
	public BCRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BCEntity entity) {
		return new ResourceLocation("themod:textures/chicken.png");
	}
}
