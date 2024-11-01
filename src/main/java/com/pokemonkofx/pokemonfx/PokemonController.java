package com.pokemonkofx.pokemonfx;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PokemonController {

    private void showPopupMessage(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Status Update");
        alert.setHeaderText(null); // Remove header for simplicity
        alert.setContentText(message);
        alert.showAndWait(); // Display the alert and wait for it to be closed
    }

    public void generatePokemonToFight() {
        showPopupMessage("Generating a Pokemon to fight!");
    }

    public void checkAvailablePokemon() {
        showPopupMessage("Checking what Pokemon are available to fight...");
    }

    public void searchItemInventory() {
        showPopupMessage("Searching through item inventory...");
    }

    public void runForLife() {
        showPopupMessage("Running for our life!");
    }
}
