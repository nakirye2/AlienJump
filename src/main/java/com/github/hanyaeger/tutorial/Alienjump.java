package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class Alienjump extends YaegerGame {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void setupGame() {
        // ook tutorial.
        setGameTitle("Alien Jump");
        setSize(new Size(800, 600));
    }

    @Override
    public void setupScenes() {
        TitleScene titleScene = new TitleScene(this);

        EndScene endScene = new EndScene(this);
        //komt van tutorial.
        addScene(0, titleScene);
        //addScene(2, new (gamescene))
        addScene(2, endScene);
    }
}

