package Entities;

import Entities.Monster;
import Entities.Platform;
import Scenes.GameScene;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;

import java.util.List;
import java.util.Set;

public class Alien extends DynamicSpriteEntity implements SceneBorderTouchingWatcher, KeyListener, Newtonian, Collider, Collided {

    public GameScene gamescene;
    private double height;

    public Alien(GameScene gamescene, double width, double height) {
        super("sprites/Alien.png", new Coordinate2D(width / 2, height - 100), new Size(20, 20));
        this.gamescene = gamescene;
        this.height = height;
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys){
        if(pressedKeys.contains(KeyCode.A)){
            addToMotion(0.1, 270d);
        } else if (pressedKeys.contains(KeyCode.D)){
            addToMotion(0.1, 90d);
        }
    }


    @Override
    public void onCollision(List<Collider> list) {
        if (list.getFirst().getClass() == Platform.class) {
            var location = getAnchorLocation();
            gamescene.score = (int) (0 + height - location.getY());
            var platformLocation = ((Platform) list.getFirst()).getAnchorLocation();
            if (location.getY() <= platformLocation.getY() - 15) {
                setMotion(5,180d);
            }
        }
        if (list.getFirst().getClass() == Monster.class) {
            gamescene.alienjump.setActiveScene(2);
        }
    }

    @Override
    public void notifyBoundaryTouching(final SceneBorder border) {
        setSpeed(0);

        switch (border) {
            case BOTTOM:
                gamescene.alienjump.setActiveScene(2);
                break;
            case TOP:
                gamescene.score = 1000;
                gamescene.alienjump.setActiveScene(2);
                break;
            default:
                break;
        }
    }
}
