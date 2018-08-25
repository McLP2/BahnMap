package com.mapgdx.bahn;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BahnMap extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture todoImage;
	private Sprite sprite;
	private BitmapFont font;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		font = new BitmapFont();
		font.setColor(new Color(0,1,0,(float) 0.5));
        todoImage = new Texture("mylogic.jpg");
        sprite = new Sprite(todoImage);

        // hide cursor
        Cursor customCursor = Gdx.graphics.newCursor(new Pixmap(16,16, Pixmap.Format.RGBA8888), 0, 0);
        Gdx.graphics.setCursor(customCursor);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		sprite.setPosition(
		        Gdx.input.getX() - sprite.getWidth()/2,
                Gdx.graphics.getHeight() - Gdx.input.getY() - sprite.getHeight()/2
        );

		batch.begin();
		sprite.draw(batch);
		font.draw(batch, "Hello World", 200, 300);
		batch.end();

		// exit condition
        if (Gdx.input.isKeyPressed(Input.Keys.ESCAPE)) {
            Gdx.app.exit();
        }
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		todoImage.dispose();
		font.dispose();
	}
}
