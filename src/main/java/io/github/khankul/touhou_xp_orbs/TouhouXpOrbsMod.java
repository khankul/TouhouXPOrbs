package io.github.khankul.touhou_xp_orbs;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TouhouXpOrbsMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Touhou XP Orbs");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("khankul and his {} welcome you!", mod.metadata().name());
	}
}
