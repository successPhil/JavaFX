package com.pokemonkofx.pokemonfx;

import javafx.scene.layout.AnchorPane;

public class PokemonLayout {
    private AnchorPane mainLayout;

    public PokemonLayout(PokemonController controller) {
        mainLayout = new AnchorPane();

        // Create opponent and player displays
        PokemonDisplay opponentDisplay = new PokemonDisplay("Opponent Pokémon", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/150.png", 0.75, 0.5);
        PokemonDisplay playerDisplay = new PokemonDisplay("Your Pokémon", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png", 0.9, 0.6);

        // Set anchor positions for opponent and player displays
        AnchorPane.setTopAnchor(opponentDisplay.getDisplay(), 20.0);
        AnchorPane.setRightAnchor(opponentDisplay.getDisplay(), 20.0);
        AnchorPane.setBottomAnchor(playerDisplay.getDisplay(), 20.0);
        AnchorPane.setLeftAnchor(playerDisplay.getDisplay(), 20.0);

        // Create control buttons and set position at bottom right
        ControlButtons controlButtons = new ControlButtons(controller);
        AnchorPane.setBottomAnchor(controlButtons.getButtons(), 20.0);
        AnchorPane.setRightAnchor(controlButtons.getButtons(), 20.0);

        // Add components to main layout
        mainLayout.getChildren().addAll(opponentDisplay.getDisplay(), playerDisplay.getDisplay(), controlButtons.getButtons());
    }

    public AnchorPane getLayout() {
        return mainLayout;
    }
}
