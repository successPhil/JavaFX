module com.pokemonkofx.pokemonkofx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.pokemonkofx.pokemonkofx to javafx.fxml;
    exports com.pokemonkofx.pokemonfx;
    opens com.pokemonkofx.pokemonfx to javafx.fxml;
}