package khankul.touhouxporbs;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PreLaunch implements PreLaunchEntrypoint {
	public final Logger LOGGER = LogManager.getLogger("Touhou XP Orbs");
	@Override
	public void onPreLaunch() {
		LOGGER.info("Welcome to Gensokyo");
	}
}
