package it.modularity.game.resources;

import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;
import java.util.Map;

public class ResourceManager {

    private Map<String, Texture> textureMap;

    public ResourceManager() {
        this.textureMap = new HashMap<String, Texture>();
    }

    public void init(){
        this.textureMap.put("test", new Texture("badlogic.jpg"));
    }

    public Texture getTexture(String id){
        return textureMap.get(id);
    }

}
