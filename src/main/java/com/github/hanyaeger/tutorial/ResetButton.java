package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;

public class ResetButton extends TextEntity {

    Coordinate2D initialLocation;
    Alienjump alienjump;
    public  ResetButton(Coordinate2D initialLocation, String text) {
        super(initialLocation, text);
    }



    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D){
        if (button == MouseButton.PRIMARY) alienjump.setActiveScene(0);
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
