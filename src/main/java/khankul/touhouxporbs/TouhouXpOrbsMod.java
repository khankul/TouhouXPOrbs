package khankul.touhouxporbs;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TouhouXpOrbsMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("touhouxporbs");

	@Override
	public void onInitialize() {
		LOGGER.info("Welcome to Gensokyo! /s");
	}
}
