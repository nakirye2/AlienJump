package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class EndScene extends StaticScene {
    int score = 84;
    @Override
    public void setupScene() {
        // komt van tutorial
        //achtergrond voor start scherm.
        // resources/ folder nodig. bv "backgrounds/background1.jpg"
        //moet nog aanpassen naar eigen start scherm audio/achtergrond
        setBackgroundImage("backgrounds/AlienJump GameOver.png");
        setBackgroundAudio("audio/ocean.mp3");
    }



    @Override
    public void setupEntities() {
        // van de tutorial
        var alienText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 6),
                "Your score is: " + Integer.toString(score));

       var playAgain = new TextEntity(
        new Coordinate2D(getWidth() / 2, getHeight() / 1.1),
                 "Back to title?");

        alienText.setAnchorPoint(AnchorPoint.TOP_CENTER);
        alienText.setFill(Color.LIGHTPINK);
        alienText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
        addEntity(alienText);

        playAgain.setAnchorPoint(AnchorPoint.BOTTOM_CENTER);
        playAgain.setFill(Color.LIGHTPINK);
        playAgain.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
        addEntity(playAgain);
    }
}