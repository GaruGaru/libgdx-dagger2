package it.modularity.game.world;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import it.modularity.game.entities.Entity;
import it.modularity.game.entities.Player;
import it.modularity.game.resources.ResourceManager;

import java.util.LinkedList;
import java.util.List;

public class GameController implements BaseController {

    private ResourceManager resources;

    public List<Entity> entityList;

    public GameController(ResourceManager resources) {
        this.resources = resources;
        this.resources.init();
    }

    @Override
    public void init() {
        this.entityList = new LinkedList<Entity>();
    }

    @Override
    public void update(float delta) {

        for (Entity entity : this.entityList)
            entity.update(delta);

    }

    @Override
    public void dispose() {

    }
}
