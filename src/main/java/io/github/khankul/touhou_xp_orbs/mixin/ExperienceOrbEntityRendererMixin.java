package io.github.khankul.touhou_xp_orbs.mixin;

import net.minecraft.client.render.entity.ExperienceOrbEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(ExperienceOrbEntityRenderer.class)
public class ExperienceOrbEntityRendererMixin {

	@ModifyArgs(method = "vertex", at = @At(value = "INVOKE",
		target = "Lcom/mojang/blaze3d/vertex/VertexConsumer;color(IIII)Lcom/mojang/blaze3d/vertex/VertexConsumer;"))
	private static void touhouXpOrbsMod$fixColour(Args args) {
		args.setAll(255, 255, 255, 128);
	}
}
