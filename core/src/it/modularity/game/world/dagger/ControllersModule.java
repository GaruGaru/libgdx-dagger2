package it.modularity.game.world.dagger;

import dagger.Module;
import dagger.Provides;
import it.modularity.game.world.GameController;

import javax.inject.Singleton;

@Module
public class ControllersModule {

    @Singleton
    @Provides
    public GameController provideGameController(){
        return new GameController();
    }
}
