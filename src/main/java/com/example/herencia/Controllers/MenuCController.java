package com.example.herencia.Controllers;

import com.example.herencia.HelloApplication;
import com.example.herencia.Models.*;
import javafx.fxml.FXML;
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
    private TableColumn<Oni,String> danoni;

    @FXML
    private TableColumn<Vampiro,String> danov;

    @FXML
    private TableColumn<Zombie, String> danoz;

    @FXML
    private TableColumn<Arquera,String> defar;

    @FXML
    private TableColumn<Espadachin,String> defesp;

    @FXML
    private TableColumn<Mago,String> defmag;

    @FXML
    private TableColumn<Arquera,String> especialar;

    @FXML
    private TableColumn<Espadachin,String> especialesp;

    @FXML
    private TableColumn<Mago,String> especialmag;

    @FXML
    private TableColumn<Oni,String> especialoni;

    @FXML
    private TableColumn<Vampiro,String> especialv;

    @FXML
    private TableColumn<Zombie,String> especialz;

    @FXML
    private ImageView modmagic;

    @FXML
    private ImageView modoni;

    @FXML
    private ImageView modvamp;

    @FXML
    private ImageView modzom;

    @FXML
    private TableColumn<Arquera,String> vidaar;

    @FXML
    private TableColumn<Espadachin,String> vidaesp;

    @FXML
    private TableColumn<Mago,String> vidamag;

    @FXML
    private TableColumn<Oni,String> vidaoni;

    @FXML
    private TableColumn<Vampiro,String> vidav;

    @FXML
    private TableColumn<Zombie,String> vidaz;

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
        Mespada.refresh();
        Mespada.getItems().addAll(lista.getListaE());
        Mar.refresh();
        Mar.getItems().addAll(lista.getListaA());
        Mmagic.refresh();
        Mmagic.getItems().addAll(lista.getListaMag());
    }

    @FXML
    void Actu2(MouseEvent event) {
        Listas lista = HelloApplication.getListas();
        Mzombie.refresh();
        Mzombie.getItems().addAll(lista.getListaZom());
        Moni.refresh();
        Moni.getItems().addAll(lista.getListaOni());
        Mvamp.refresh();
        Mvamp.getItems().addAll(lista.getListavamp());
    }
    @FXML
    void Modar(MouseEvent event) {

    }

    @FXML
    void Modesp(MouseEvent event) {
        Espadachin esp = new Espadachin("120","64","34%");
        HelloApplication.getListas().setListaE(esp);
    }

    @FXML
    void modmagic(MouseEvent event) {

    }

    @FXML
    void modoni(MouseEvent event) {

    }

    @FXML
    void modvamp(MouseEvent event) {

    }

    @FXML
    void modzom(MouseEvent event) {

    }
}
