package com.example.herencia.Controllers;

import com.example.herencia.HelloApplication;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MenuController {

    @FXML
    private Button Bttnexit;

    @FXML
    private Button Bttnper;

    @FXML
    private Button Bttnplay;

    @FXML
    private ImageView Bttnsecret;

    @FXML
    void Bttnexit(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    void Bttnper(MouseEvent event) {
        HelloApplication.newStage("MenuC.fxml","Menu de personajes");
    }

    @FXML
    void Bttnplay(MouseEvent event) {

    }

    @FXML
    void Bttnsecret(MouseEvent event) {

    }

}
