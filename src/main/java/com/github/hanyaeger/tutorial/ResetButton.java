package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

//werkt nog niet
public class ResetButton extends TextEntity implements MouseButtonPressedListener {

    private final Alienjump alienjump;
    public  ResetButton(Coordinate2D initialLocation, Alienjump alienjump) {
        super(initialLocation, "Go to start?");
        this.alienjump = alienjump;
        setFill(Color.PURPLE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 30));
    }


    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D){
        alienjump.setActiveScene(0); // moet 1 zijn
    }


}


