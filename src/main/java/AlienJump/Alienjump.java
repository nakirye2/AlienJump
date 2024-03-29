package AlienJump;

import Scenes.EndScene;
import Scenes.GameScene;
import Scenes.TitleScene;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class Alienjump extends YaegerGame {
    public static void main(String[] args){
        launch(args);
    }

    public GameScene gameScene;

    @Override
    public void setupGame() {
        // ook tutorial.
        setGameTitle("Alien Jump");
        setSize(new Size(800, 600));
    }

    @Override
    public void setupScenes() {
        addScene(0, new TitleScene(this));
        gameScene = new GameScene(this);
        addScene(1, gameScene);
        addScene(2, new EndScene(this));
    }
}

