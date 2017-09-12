package it.modularity.game.screens.dagger;

import com.badlogic.gdx.Game;
import dagger.Module;
import dagger.Provides;
import it.modularity.game.render.GameRenderer;
import it.modularity.game.screens.GameScreen;
import it.modularity.game.world.GameController;

import javax.inject.Singleton;

@Module
public class ScreenModule {

    @Singleton
    @Provides
    public GameScreen provideGameScreen(GameController controller, GameRenderer renderer){
        return new GameScreen(renderer, controller);
    }

}
