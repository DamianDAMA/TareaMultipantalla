package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerPrincipal implements Initializable {

    @FXML
    private ControllerCreate CreateController;

    @FXML
    private ControllerDelete DeleteController;

    @FXML
    private ControllerUpdate UpdateController;

    @FXML
    private ControllerRead ReadController;


    @FXML
    private BorderPane menuPrincipal;

    @FXML
    private MenuBar menubar;

    @FXML
    private AnchorPane addPersona;

    @FXML
    private AnchorPane deletePersona;

    @FXML
    private AnchorPane updatePersona;

    @FXML
    private AnchorPane readPersona;


    public void DeletePersona(ActionEvent actionEvent){
        DeleteController.volveraPoner();
        menuPrincipal.setCenter(deletePersona);
        menubar.setVisible(true);
    }


    public void CreatePersona(ActionEvent actionEvent) {
        menuPrincipal.setCenter(addPersona);
        menubar.setVisible(true);

    }

    public void UpdatePersona(ActionEvent actionEvent){
        UpdateController.volveraPoner();
        menuPrincipal.setCenter(updatePersona);
        menubar.setVisible(true);
    }

    public void ReadPersona(ActionEvent actionEvent){
        ReadController.volveraPoner();
        menuPrincipal.setCenter(readPersona);
        menubar.setVisible(true);
    }

    @FXML
    private void preloadCreate(){
        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/create.fxml"));
            addPersona = loaderMenu.load();
            CreateController = loaderMenu.getController();

        } catch (IOException ex) {
            Logger.getLogger(ControllerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void preloadDelete(){
        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/delete.fxml"));
            deletePersona = loaderMenu.load();
            DeleteController = loaderMenu.getController();

        } catch (IOException ex) {
            Logger.getLogger(ControllerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void preloadUpdate(){
        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/update.fxml"));
            updatePersona = loaderMenu.load();
            UpdateController = loaderMenu.getController();

        } catch (IOException ex) {
            Logger.getLogger(ControllerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void preloadRead(){
        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/read.fxml"));
            readPersona = loaderMenu.load();
            ReadController = loaderMenu.getController();

        } catch (IOException ex) {
            Logger.getLogger(ControllerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        preloadCreate();
        preloadDelete();
        preloadUpdate();
        preloadRead();

    }

}
