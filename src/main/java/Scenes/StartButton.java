package Scenes;

import AlienJump.Alienjump;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;

import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class StartButton extends TextEntity implements MouseButtonPressedListener {
    private final Alienjump alienjump;
    public  StartButton(Coordinate2D initialLocation, Alienjump alienjump) {
        super(initialLocation, "Play game");
        this.alienjump = alienjump;
        setFill(Color.PURPLE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 30));
    }


    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D){
        alienjump.setActiveScene(1);
    }
}