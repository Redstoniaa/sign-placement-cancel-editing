package nsigui;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.minecraft.util.ActionResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoSignInitialGuiMod {
	public static final String MOD_ID = "no-sign-initial-gui";
	public static ModMetadata METADATA;
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	
	public static ActionResult lastActionResult;
	
	public static void init() {
		getModMetadata();
	}
	
	private static void getModMetadata() {
		METADATA = FabricLoader.getInstance()
				.getModContainer(MOD_ID).orElseThrow()
				.getMetadata();
	}
	
	public static boolean isDevEnvironment() {
		return FabricLoader.getInstance().isDevelopmentEnvironment();
	}
}
