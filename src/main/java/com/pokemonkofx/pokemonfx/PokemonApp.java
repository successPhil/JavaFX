package com.pokemonkofx.pokemonfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

public class PokemonApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Pokemon Battle");

        // Create the controller
        PokemonController controller = new PokemonController();

        // Create main layout with ControlButtons that use the controller
        PokemonLayout mainLayout = new PokemonLayout(controller);
        Scene scene = new Scene(mainLayout.getLayout(), 800, 600);

        // Add BootstrapFX stylesheet
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
