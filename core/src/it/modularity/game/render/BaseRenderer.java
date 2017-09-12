package it.modularity.game.render;

public interface BaseRenderer<T> {
    void init();

    void render(T source);

}
