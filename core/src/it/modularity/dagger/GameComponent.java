package it.modularity.dagger;

import dagger.Component;
import it.modularity.GameMain;
import it.modularity.game.render.dagger.RenderModule;
import it.modularity.game.resources.dagger.ResourcesModule;
import it.modularity.game.screens.dagger.ScreenModule;
import it.modularity.game.world.dagger.ControllersModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = {
        ScreenModule.class,
        RenderModule.class,
        ControllersModule.class,
        ResourcesModule.class
})
public interface GameComponent {
    void inject(GameMain main);
}
