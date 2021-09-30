package controllers;

import dao.DaoPersona;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import modelos.Persona;
import service.ServiceAddPersona;
import service.ServiceDeletePersona;
import service.ServiceReadPersona;
import service.ServiceUpdatePersona;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;


public class ControllerCreate implements Initializable {


    @FXML
    private RadioButton mujerRadial;
    @FXML
    private ServiceAddPersona add;
    @FXML
    private AnchorPane addPersona;
    @FXML
    private Button addButton;
    @FXML
    private TextField nombreButton;
    @FXML
    private TextField edadButton;
    @FXML
    private DatePicker datePick;
    @FXML
    private RadioButton hombreRadial;
    @FXML
    private ListView<Persona> personaBox;


    //Método vacío porque es un proyecto que dejé a medias por otro, como mi vida misma.
    public static void loadItemsList() {
    }

    @FXML
    private void addPersona() {
        Persona p = new Persona();
        p.setNombre(nombreButton.getText());
        try {
            p.setEdad(Integer.parseInt(edadButton.getText()));
            p.setFecha(datePick.getValue());
            p.setHombre(hombreRadial.isSelected());
            if (add.addPersona(p)) {
                Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
                alerta.setContentText("Añadido");
                alerta.showAndWait();
            }

        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setContentText("Mal hecho, inténtalo de nuevo, campeón");
            alerta.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        add = new ServiceAddPersona();

    }

}
