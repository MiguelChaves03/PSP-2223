package ch.makery.address.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import ch.makery.address.*;

public class Comprueba8 extends Thread {

    @FXML
    private Button btnComenzar;
    @FXML
    private Button btnFinalizar;
    @FXML
    private Button btnReanudar1;
    @FXML
    private Button btnReanudar2;
    @FXML
    private Button btnSuspender1;
    @FXML
    private Button btnSuspender2;
    @FXML
    private Label nombre1;
    @FXML
    private Label nombre2;
    @FXML
    private Label contador1;
    @FXML
    private Label contador2;
    private int numeros1 = 0;
    private int numeros2 = 0;
    private Main mainApp;

    MyHilo hilo1 = new MyHilo ();
    MyHilo hilo2 = new MyHilo ();

    public void setMainApp (Main mainApp) {

        this.mainApp = mainApp;

        btnReanudar1.setDisable (true);
        btnReanudar2.setDisable (true);

        btnSuspender1.setDisable (true);
        btnSuspender2.setDisable (true);

        btnFinalizar.setDisable (true);

        contador1.setText ("0");
        contador2.setText ("0");

    }

    @FXML
    private void comenzar () {

        btnComenzar.setDisable (true);

        btnReanudar1.setDisable (true);
        btnReanudar2.setDisable (true);

        btnSuspender1.setDisable (false);
        btnSuspender2.setDisable (false);

        btnFinalizar.setDisable (false);

        nombre1.setText ("HILO 1 CORRIENDO");
        nombre2.setText ("HILO 2 CORRIENDO");

        hilo1.start ();
        hilo2.start ();

    }

    @FXML
    private void reanudar () {

        if (btnReanudar1.isFocused ()) {

            hilo1.Reanuda ();

            btnSuspender1.setDisable (false);

            btnReanudar1.setDisable (true);

            nombre1.setText ("HILO 1 CORRIENDO");

        } else if (btnReanudar2.isFocused ()) {

            hilo2.Reanuda ();

            btnSuspender2.setDisable (false);

            btnReanudar2.setDisable (true);

            nombre2.setText ("HILO 2 CORRIENDO");

        }

    }

    @FXML
    private void suspender () {

        if (btnSuspender1.isFocused ()) {

            hilo1.Suspende ();

            btnSuspender1.setDisable (true);

            btnReanudar1.setDisable (false);

            nombre1.setText ("HILO 1 SUSPENDIDO");

        } else if (btnSuspender2.isFocused ()) {

            hilo2.Suspende ();

            btnSuspender2.setDisable (true);

            btnReanudar2.setDisable (false);

            nombre2.setText ("HILO 2 SUSPENDIDO");

        }

    }

    @FXML
    private void finalizar () {

        btnComenzar.setDisable (true);

        btnReanudar1.setDisable (true);
        btnReanudar2.setDisable (true);

        btnSuspender1.setDisable (true);
        btnSuspender2.setDisable (true);

        btnFinalizar.setDisable (true);

        nombre1.setText ("HILO 1 FINALIZADO");
        nombre2.setText ("HILO 2 FINALIZADO");

        hilo1.pararHilo ();
        hilo2.pararHilo ();

    }

}
