package it.modularity;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import it.modularity.dagger.DaggerInjector;
import it.modularity.game.screens.GameScreen;

import javax.inject.Inject;

public class GameMain extends ApplicationAdapter {

    @Inject
    GameScreen gameScreen;

    @Override
    public void create() {
        DaggerInjector.get().inject(this);
        this.gameScreen.init();
    }

    @Override
    public void render() {
        gameScreen.render(Gdx.graphics.getDeltaTime());
    }

    @Override
    public void dispose() {
        gameScreen.dispose();
    }
}
