package io.github.khankul.touhouxporbs.mixin;

import net.minecraft.client.render.entity.ExperienceOrbEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(ExperienceOrbEntityRenderer.class)
public class ExperienceOrbEntityRendererMixin {

	@ModifyArgs(method = "vertex", at = @At(value = "INVOKE",
			target = "Lnet/minecraft/client/render/VertexConsumer;color(IIII)Lnet/minecraft/client/render/VertexConsumer;"))
	private static void touhouXpOrbsMod$fixColor(Args args) {
		args.setAll(255, 255, 255, 128);
	}
}
