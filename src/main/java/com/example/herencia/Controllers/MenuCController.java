package com.example.herencia.Controllers;

import com.example.herencia.HelloApplication;
import com.example.herencia.Models.*;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MenuCController {
    @FXML
    private ImageView Actu;

    @FXML
    private ImageView Actu2;

    @FXML
    private Button Bttnexit;

    @FXML
    private TableView<Arquera> Mar;

    @FXML
    private TableView<Espadachin> Mespada;

    @FXML
    private TableView<Mago> Mmagic;

    @FXML
    private ImageView Modar;

    @FXML
    private ImageView Modesp;

    @FXML
    private TableView<Oni> Moni;

    @FXML
    private TableView<Vampiro> Mvamp;

    @FXML
    private TableView<Zombie> Mzombie;

    @FXML
    private TableColumn<Oni, String> danoni;

    @FXML
    private TableColumn<Vampiro, String> danov;

    @FXML
    private TableColumn<Zombie, String> danoz;

    @FXML
    private TableColumn<Arquera, String> defar;

    @FXML
    private TableColumn<Espadachin, String> defesp;

    @FXML
    private TableColumn<Mago, String> defmag;

    @FXML
    private TableColumn<Arquera, String> especialar;

    @FXML
    private TableColumn<Espadachin, String> especialesp;

    @FXML
    private TableColumn<Mago, String> especialmag;

    @FXML
    private TableColumn<Oni, String> especialoni;

    @FXML
    private TableColumn<Vampiro, String> especialv;

    @FXML
    private TableColumn<Zombie, String> especialz;

    @FXML
    private ImageView modmagic;

    @FXML
    private ImageView modoni;

    @FXML
    private ImageView modvamp;

    @FXML
    private ImageView modzom;

    @FXML
    private TableColumn<Arquera, String> vidaar;

    @FXML
    private TableColumn<Espadachin, String> vidaesp;

    @FXML
    private TableColumn<Mago, String> vidamag;

    @FXML
    private TableColumn<Oni, String> vidaoni;

    @FXML
    private TableColumn<Vampiro, String> vidav;

    @FXML
    private TableColumn<Zombie, String> vidaz;

    @FXML
    void Bttnexit(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void initialize() {
        vidaesp.setCellValueFactory(new PropertyValueFactory<>("vida"));
        defesp.setCellValueFactory(new PropertyValueFactory<>("def"));
        especialesp.setCellValueFactory(new PropertyValueFactory<>("danocrit"));
        vidaar.setCellValueFactory(new PropertyValueFactory<>("vida"));
        defar.setCellValueFactory(new PropertyValueFactory<>("def"));
        especialar.setCellValueFactory(new PropertyValueFactory<>("distancedamage"));
        vidamag.setCellValueFactory(new PropertyValueFactory<>("vida"));
        defmag.setCellValueFactory(new PropertyValueFactory<>("def"));
        especialmag.setCellValueFactory(new PropertyValueFactory<>("magia"));
        danoz.setCellValueFactory(new PropertyValueFactory<>("dano"));
        vidaz.setCellValueFactory(new PropertyValueFactory<>("vida"));
        especialz.setCellValueFactory(new PropertyValueFactory<>("envenenamiento"));
        danoni.setCellValueFactory(new PropertyValueFactory<>("dano"));
        vidaoni.setCellValueFactory(new PropertyValueFactory<>("vida"));
        especialoni.setCellValueFactory(new PropertyValueFactory<>("alucinacion"));
        danov.setCellValueFactory(new PropertyValueFactory<>("dano"));
        vidav.setCellValueFactory(new PropertyValueFactory<>("vida"));
        especialv.setCellValueFactory(new PropertyValueFactory<>("sangrado"));
    }

    @FXML
    void Actu(MouseEvent event) {
        Listas lista = HelloApplication.getListas();
        Mespada.getItems().clear();
        Mespada.getItems().addAll(lista.getListaE());
        Mar.getItems().clear();
        Mar.getItems().addAll(lista.getListaA());
        Mmagic.getItems().clear();
        Mmagic.getItems().addAll(lista.getListaMag());
    }

    @FXML
    void Actu2(MouseEvent event) {
        Listas lista = HelloApplication.getListas();
        Mzombie.getItems().clear();
        Mzombie.getItems().addAll(lista.getListaZom());
        Moni.getItems().clear();
        Moni.getItems().addAll(lista.getListaOni());
        Mvamp.getItems().clear();
        Mvamp.getItems().addAll(lista.getListavamp());
    }

    @FXML
    void Modar(MouseEvent event) {
        Listas listas = HelloApplication.getListas();
        if (listas.getListaA().isEmpty()) {
            Arquera arquera = new Arquera("120", "64", "40");
            HelloApplication.getListas().setListaA(arquera);
        } else {
            Alert alerterrorp = new Alert(Alert.AlertType.ERROR);
            alerterrorp.setHeaderText("Ya se ha generado uno");
            alerterrorp.setContentText("no vuelva a generar otro...");
            alerterrorp.showAndWait();
        }
    }

    @FXML
    void Modesp(MouseEvent event) {
        Listas listas = HelloApplication.getListas();
        if (listas.getListaE().isEmpty()) {
            Espadachin esp = new Espadachin("120", "64", "34%pvx");
            HelloApplication.getListas().setListaE(esp);
        } else {
            Alert alerterrorp = new Alert(Alert.AlertType.ERROR);
            alerterrorp.setHeaderText("Ya se ha generado uno");
            alerterrorp.setContentText("no vuelva a generar otro...");
            alerterrorp.showAndWait();
        }
    }

    @FXML
    void modmagic(MouseEvent event) {
        Listas listas = HelloApplication.getListas();
        if (listas.getListaMag().isEmpty()) {
            Mago magic = new Mago("120", "64", "42%pvx");
            HelloApplication.getListas().setListaMag(magic);
        } else {
            Alert alerterrorp = new Alert(Alert.AlertType.ERROR);
            alerterrorp.setHeaderText("Ya se ha generado uno");
            alerterrorp.setContentText("no vuelva a generar otro...");
            alerterrorp.showAndWait();
        }
    }

    @FXML
    void modoni(MouseEvent event) {
        Listas listas = HelloApplication.getListas();
        if (listas.getListaOni().isEmpty()) {
            Oni oni = new Oni("35", "280", "20");
            HelloApplication.getListas().setListaOni(oni);
        } else {
            Alert alerterrorp = new Alert(Alert.AlertType.ERROR);
            alerterrorp.setHeaderText("Ya se ha generado uno");
            alerterrorp.setContentText("no vuelva a generar otro...");
            alerterrorp.showAndWait();
        }
    }

    @FXML
    void modvamp(MouseEvent event) {
        Listas listas = HelloApplication.getListas();
        if (listas.getListavamp().isEmpty()) {
            Vampiro vampiro = new Vampiro("32", "250", "12%pvx");
            HelloApplication.getListas().setListavamp(vampiro);
        } else {
            Alert alerterrorp = new Alert(Alert.AlertType.ERROR);
            alerterrorp.setHeaderText("Ya se ha generado uno");
            alerterrorp.setContentText("no vuelva a generar otro...");
            alerterrorp.showAndWait();
        }
    }

    @FXML
    void modzom(MouseEvent event) {
        Listas listas = HelloApplication.getListas();
        if (listas.getListaZom().isEmpty()) {
            Zombie zombie = new Zombie("25", "110", "20%pvx");
            HelloApplication.getListas().setListaZom(zombie);
        } else {
            Alert alerterrorp = new Alert(Alert.AlertType.ERROR);
            alerterrorp.setHeaderText("Ya se ha generado uno");
            alerterrorp.setContentText("no vuelva a generar otro...");
            alerterrorp.showAndWait();
        }
    }
}
