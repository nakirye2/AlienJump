package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

//werkt nog niet
public class StartButton extends TextEntity {
        Coordinate2D initialLocation;
     Alienjump alienjump;
    public  StartButton(Coordinate2D initialLocation, Alienjump alienjump) {
        super(initialLocation, "Play game");
        this.alienjump = alienjump;
        setFill(Color.PURPLE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 30));
    }


    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D){
        if (button == MouseButton.PRIMARY) alienjump.setActiveScene(2); // moet 1 zijn
    }



    public void onMouseEntered() {
        setFill(Color.VIOLET);
        setCursor(Cursor.HAND);
    }


    public void onMouseExited() {
        setFill(Color.PURPLE);
        setCursor(Cursor.DEFAULT);
    }

}


