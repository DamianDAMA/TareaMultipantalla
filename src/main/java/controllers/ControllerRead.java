package controllers;

import dao.DaoPersona;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import modelos.Persona;
import service.*;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;



public class ControllerRead implements Initializable {

    @FXML
    private AnchorPane readPersona;
    @FXML
    private ListView<Persona> personaBox;

    private service.ServiceReadPersona read;

    ServiceGetData getdata = new ServiceGetData();

    public void volveraPoner(){
        personaBox.getItems().setAll(getdata.getData());
    }

    public void read(){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        volveraPoner();

    }
}
