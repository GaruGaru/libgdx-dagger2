package it.modularity.game.screens;

import it.modularity.game.render.GameRenderer;
import it.modularity.game.world.GameController;

public class GameScreen extends BaseScreen {

    private GameRenderer renderer;

    private GameController controller;

    public GameScreen(GameRenderer renderer, GameController controller) {
        this.renderer = renderer;
        this.controller = controller;
    }


    @Override
    public void init() {
        this.renderer.init();
        this.controller.init();
    }

    @Override
    public void render(float delta) {
        this.controller.update(delta);
        this.renderer.render(this.controller);
    }
}
