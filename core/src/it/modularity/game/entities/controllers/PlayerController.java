package it.modularity.game.entities.controllers;

import com.badlogic.gdx.Gdx;
import it.modularity.game.entities.Actor;

public class PlayerController implements ActorController {
    @Override
    public void update(Actor actor) {
        float x, y;
        x = Gdx.input.getX();
        y = Gdx.graphics.getHeight() - Gdx.input.getY();
        actor.setPosition(x, y);
    }
}
