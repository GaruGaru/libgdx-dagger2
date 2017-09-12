package it.modularity.game.entities;

import com.badlogic.gdx.graphics.Texture;
import it.modularity.game.entities.controllers.ActorController;
import it.modularity.game.entities.controllers.NoOpController;

public class Actor extends Entity {

    private ActorController controller;

    public Actor(Texture texture, ActorController controller) {
        super(texture);
        if (controller != null)
            this.controller = controller;
        else
            this.controller = new NoOpController();
    }

    public Actor(Texture texture) {
        super(texture);
        this.controller = new NoOpController();
    }

    @Override
    public void update(float delta) {
        super.update(delta);
        controller.update(this);
    }

}
