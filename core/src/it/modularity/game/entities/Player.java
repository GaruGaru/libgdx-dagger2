package it.modularity.game.entities;

import com.badlogic.gdx.graphics.Texture;
import it.modularity.game.entities.controllers.ActorController;
import it.modularity.game.entities.controllers.PlayerController;

public class Player extends Actor {

    public Player(Texture texture) {
        super(texture, new PlayerController());
    }

}
