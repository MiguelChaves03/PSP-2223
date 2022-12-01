package ch.makery.address;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.fxml.*;
import javafx.scene.*;
import ch.makery.address.controller.*;
import java.io.*;

public class Main extends Application {

    private static Stage primaryStage;
    private AnchorPane rootLayout;

    @Override
    public void start (Stage primaryStage) {

        this.primaryStage = primaryStage;

        this.primaryStage.setTitle ("EJECUTAR, SUSPENDER Y REANUDAR HILOS");

        initRootLayout ();

    }

    public void initRootLayout () {

        try {

            FXMLLoader loader = new FXMLLoader ();

            loader.setLocation (Main.class.getResource ("view/Comprueba8.fxml"));

            rootLayout = (AnchorPane) loader.load ();

            Scene scene = new Scene (rootLayout);

            primaryStage.setScene (scene);

            Comprueba8 controller = loader.getController ();

            controller.setMainApp (this);

            primaryStage.show ();

        } catch (IOException e) {

            e.printStackTrace ();

        }

    }

}
