package Entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

import java.util.Random;


public class Platform extends DynamicSpriteEntity implements Collider {

    public Platform(Coordinate2D initialLocation) {
        super("sprites/platform.png", initialLocation, new Size(50, 50));
    }

}
