package ch.makery.address.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import ch.makery.address.*;

public class Comprueba9 {

    @FXML
    private Button btnComenzar;
    @FXML
    private Button btnFinalizar;
    @FXML
    private Button btnInterrumpir1;
    @FXML
    private Button btnInterrumpir2;
    @FXML
    private Label nombre1;
    @FXML
    private Label nombre2;
    @FXML
    private Label contador1;
    @FXML
    private Label contador2;
    private Main mainApp;

    HiloInterrumpir hilo1 = new HiloInterrumpir ();
    HiloInterrumpir hilo2 = new HiloInterrumpir ();

    public void setMainApp (Main mainApp) {

        this.mainApp = mainApp;

        btnInterrumpir1.setDisable (true);
        btnInterrumpir2.setDisable (true);

        btnFinalizar.setDisable (true);

        contador1.setText ("0");
        contador2.setText ("0");

    }

    @FXML
    private void comenzar () {

        btnComenzar.setDisable (true);

        btnInterrumpir1.setDisable (false);
        btnInterrumpir2.setDisable (false);

        btnFinalizar.setDisable (false);

        nombre1.setText ("HILO 1 CORRIENDO");
        nombre2.setText ("HILO 2 CORRIENDO");

        hilo1.start ();
        hilo2.start ();

    }

    @FXML
    private void interrumpir () {

        if (btnInterrumpir1.isFocused ()) {

            hilo1.interrumpirHilo ();

            btnInterrumpir1.setDisable (true);

            nombre1.setText ("HILO 1 INTERRUMPIDO");

        } else if (btnInterrumpir2.isFocused ()) {

            hilo2.interrumpirHilo ();

            btnInterrumpir2.setDisable (true);

            nombre2.setText ("HILO 2 INTERRUMPIDO");

        }

    }

    @FXML
    private void finalizar () {

        btnComenzar.setDisable (true);

        btnInterrumpir1.setDisable (true);
        btnInterrumpir2.setDisable (true);

        btnFinalizar.setDisable (true);

        nombre1.setText ("HILO 1 FINALIZADO");
        nombre2.setText ("HILO 2 FINALIZADO");

        hilo1.interrumpirHilo ();
        hilo2.interrumpirHilo ();

    }

}
