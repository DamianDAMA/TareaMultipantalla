package controllers;

import dao.DaoPersona;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import modelos.Persona;
import service.ServiceAddPersona;
import service.ServiceDeletePersona;
import service.ServiceReadPersona;
import service.ServiceUpdatePersona;
import service.ServiceGetData;

import java.net.URL;
import java.security.Provider;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;



public class ControllerDelete implements Initializable {

    @FXML
    private AnchorPane deleteItems;
    @FXML
    private ListView<Persona> personaBox;

    ServiceGetData getdata = new ServiceGetData();

    ServiceDeletePersona delete = new ServiceDeletePersona();

    @FXML
    private void deletePersona() {
        Persona p = personaBox.getSelectionModel().getSelectedItem();
        if (personaBox.getSelectionModel().getSelectedItem() != null) {
            delete.deletePersona(p);
            personaBox.getItems().remove(p);
        }
    }

    public void volveraPoner(){
        personaBox.getItems().setAll(getdata.getData());

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        volveraPoner();
        deletePersona();
    }
}
