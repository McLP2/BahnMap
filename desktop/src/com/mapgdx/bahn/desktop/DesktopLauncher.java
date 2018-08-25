package com.mapgdx.bahn.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mapgdx.bahn.BahnMap;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Bahn Map";
		config.width = 1000;
		config.height = 600;
		config.resizable = false;
		// config.fullscreen = true;
		new LwjglApplication(new BahnMap(), config);
	}
}
