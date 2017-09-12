package it.modularity.game.resources.dagger;

import dagger.Module;
import dagger.Provides;
import it.modularity.game.resources.ResourceManager;

import javax.inject.Singleton;

@Module
public class ResourcesModule {

    @Singleton
    @Provides
    public ResourceManager provideResourcesManager(){
        return new ResourceManager();
    }

}
