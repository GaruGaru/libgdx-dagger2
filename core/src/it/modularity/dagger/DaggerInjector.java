package it.modularity.dagger;

public class DaggerInjector {

    public static GameComponent get() {
        return DaggerGameComponent.builder()
                .build();
    }

}
