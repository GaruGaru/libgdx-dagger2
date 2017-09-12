package it.modularity.game.entities.controllers;

import it.modularity.game.entities.Actor;

public class NoOpController implements ActorController {
    @Override
    public void update(Actor actor) {
    }
}
