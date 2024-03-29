package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class EndScene extends StaticScene {
    Alienjump alienjump;
    int score;

    public EndScene(Alienjump alienjump) {
        this.alienjump = alienjump;
    }

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

        // Add title text
        TextEntity scoreShow = new TextEntity(new Coordinate2D(getWidth() / 2, getHeight() / 6), "Your score is: " + score);
        scoreShow.setAnchorPoint(AnchorPoint.TOP_CENTER);
        scoreShow.setFill(Color.LIGHTPINK);
        scoreShow.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
        addEntity(scoreShow);

        // Add start button
        ResetButton resetButton = new ResetButton(new Coordinate2D(getWidth() / 2, getHeight() / 2), alienjump);
        resetButton.setFill(Color.LAVENDER);
        resetButton.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
        addEntity(resetButton);


    }
}