package it.modularity.game.screens.dagger;

import dagger.Module;
import dagger.Provides;
import it.modularity.game.screens.GameScreen;

import javax.inject.Singleton;

@Module
public class ScreenModule {

    @Singleton
    @Provides
    public GameScreen provideGameScreen(){
        return new GameScreen();
    }

}
