package it.modularity.dagger;

import dagger.Component;
import it.modularity.GameMain;
import it.modularity.game.screens.dagger.ScreenModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = {ScreenModule.class})
public interface GameComponent {
    void inject(GameMain main);
}
