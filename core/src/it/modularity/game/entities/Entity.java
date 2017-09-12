package it.modularity.game.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Entity extends Sprite {

    public Entity(Texture texture){
        super(texture);
    }

    public Entity(){
        super();
    }

    public void update(float delta){}

}
