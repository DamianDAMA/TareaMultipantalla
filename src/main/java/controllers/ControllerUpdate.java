package controllers;

import dao.DaoPersona;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import modelos.Persona;
import service.*;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class ControllerUpdate implements Initializable {

    @FXML
    private Button updateButton;
    @FXML
    private TextField nombreButton;
    @FXML
    private TextField edadButton;
    @FXML
    private RadioButton hombreRadial;
    @FXML
    private RadioButton mujerRadial;
    @FXML
    private DatePicker datePick;
    @FXML
    private ListView<Persona> personaBox;

    private ServiceUpdatePersona edit = new ServiceUpdatePersona();

    ServiceGetData getdata = new ServiceGetData();

    public void volveraPoner(){
        personaBox.getItems().setAll(getdata.getData());

    }

    @FXML
    private void updatePersona() {
        Persona p = new Persona();
        Persona pObjetivo = personaBox.getSelectionModel().getSelectedItem();
        p.setNombre(nombreButton.getText());
        try {
            p.setEdad(Integer.parseInt(edadButton.getText()));
            p.setFecha(datePick.getValue());
            p.setHombre(hombreRadial.isSelected());
            if (edit.updatePersona(p, pObjetivo) && (personaBox.getSelectionModel().getSelectedItem() != null)) {
                personaBox.getItems().remove(pObjetivo);
                personaBox.getItems().add(p);
                Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
                alerta.setContentText("Añadido");
                alerta.showAndWait();
            }

        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setContentText("Wrong update, pon todos los datos; try again");
            alerta.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        volveraPoner();

    }

}
