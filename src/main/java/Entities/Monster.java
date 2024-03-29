package Entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;

import java.util.Random;

public class Monster extends DynamicSpriteEntity implements SceneBorderTouchingWatcher, Collider {
    public Monster(Coordinate2D initialLocation) {
        super("sprites/monster.png", initialLocation, new Size(30, 30));
        setAutoCycle(25);
        int x = new Random().nextInt(0, 2);
        if (x == 0) {
            setMotion(4, Direction.RIGHT);
        } else {
            setMotion(4, Direction.LEFT);
        }
    }

    @Override
    public void notifyBoundaryTouching(final SceneBorder border) {
        setSpeed(0);

        switch (border) {
            case LEFT:
                setMotion(4, Direction.RIGHT);
                break;
            case RIGHT:
                setMotion(4, Direction.LEFT);
                break;
            default:
                break;
        }
    }
}
