package com.pokemonkofx.pokemonfx;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ControlButtons extends HBox {
    private Button fightButton;
    private Button pokeButton;
    private Button itemsButton;
    private Button runButton;

    public ControlButtons(PokemonController controller) {
        this.setSpacing(20); // Space between the left and right VBox columns

        // Create and style buttons
        fightButton = new Button("Fight");
        fightButton.getStyleClass().add("btn-primary");
        fightButton.setOnAction(e -> controller.generatePokemonToFight());

        itemsButton = new Button("Items");
        itemsButton.getStyleClass().add("btn-primary");
        itemsButton.setOnAction(e -> controller.searchItemInventory());

        pokeButton = new Button("Poke");
        pokeButton.getStyleClass().add("btn-warning");
        pokeButton.setOnAction(e -> controller.checkAvailablePokemon());

        runButton = new Button("Run");
        runButton.getStyleClass().add("btn-danger");
        runButton.setOnAction(e -> controller.runForLife());

        // Left column with Fight and Items buttons
        VBox leftColumn = new VBox(10, fightButton, itemsButton);
        leftColumn.setSpacing(10);

        // Right column with Poke and Run buttons
        VBox rightColumn = new VBox(10, pokeButton, runButton);
        rightColumn.setSpacing(10);

        // Add both columns to the main HBox layout
        this.getChildren().addAll(leftColumn, rightColumn);
    }

    // Method to return the HBox containing the buttons
    public HBox getButtons() {
        return this;
    }
}
