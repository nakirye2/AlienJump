package Scenes;

import Entities.Alien;
import AlienJump.Alienjump;
import Entities.Monster;
import Entities.Platform;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;

import java.util.Random;

public class GameScene extends DynamicScene {
    public Alienjump alienjump;
    public int score;

    public GameScene(Alienjump alienjump){
        this.alienjump = alienjump;
        score = 0;
    }
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/achtergrond.jpg");
    }

    @Override
    public void setupEntities() {
        addEntity(new Alien(this, getWidth(), getHeight()));
        addEntity(new Platform(new Coordinate2D(getWidth() / 2, getHeight() - 50)));
        for (var aantal = 1; aantal < 5; aantal++) {
            addEntity(new Monster(randomLocation(aantal, 100, 200,100)));
        }
        for (var aantal = 1; aantal < 15; aantal++) {
            addEntity(new Platform(randomLocation(aantal, 50, 50, 50)));
        }
    }

    private Coordinate2D randomLocation(int layer, int height, int width, int multiplier) {
        double x = new Random().nextInt((int) getWidth() / 2 - width, (int)getWidth() / 2 + width);
        double y = getHeight() - height - (layer * multiplier);
        return new Coordinate2D(x, y);
    }
}
