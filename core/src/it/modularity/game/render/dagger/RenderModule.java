package it.modularity.game.render.dagger;

import dagger.Module;
import dagger.Provides;
import it.modularity.game.render.GameRenderer;

import javax.inject.Singleton;

@Module
public class RenderModule {
    @Singleton
    @Provides
    public GameRenderer provideRenderer() {
        return new GameRenderer();
    }
}
