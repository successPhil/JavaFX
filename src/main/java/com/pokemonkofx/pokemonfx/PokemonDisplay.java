package com.pokemonkofx.pokemonfx;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class PokemonDisplay {

    private VBox display;

    public PokemonDisplay(String name, String imageUrl, double healthValue, double expValue) {
        display = new VBox(10);
        display.setAlignment(Pos.CENTER);

        Label nameLabel = new Label(name);

        // Pokémon image
        ImageView imageView = new ImageView(new Image(imageUrl));
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);

        // Health bar
        ProgressBar healthBar = new ProgressBar(healthValue);
        healthBar.setPrefWidth(150);
        Label healthLabel = new Label("Health");
        StackPane healthStack = new StackPane(healthBar, healthLabel);
        healthStack.setAlignment(Pos.CENTER);

        // Experience bar
        ProgressBar expBar = new ProgressBar(expValue);
        expBar.setPrefWidth(150);
        Label expLabel = new Label("EXP");
        StackPane expStack = new StackPane(expBar, expLabel);
        expStack.setAlignment(Pos.CENTER);

        // Assemble the display
        display.getChildren().addAll(nameLabel, imageView, healthStack, expStack);
    }

    public VBox getDisplay() {
        return display;
    }
}
