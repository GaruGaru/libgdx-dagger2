package it.modularity.game.render;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import it.modularity.game.world.GameController;

public class GameRenderer implements BaseRenderer<GameController> {

    private SpriteBatch batch;
    private Texture img;

    @Override
    public void init() {
        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");
    }

    @Override
    public void render(GameController source) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, Gdx.input.getX(), Gdx.input.getDeltaY());
        batch.end();
    }
}
