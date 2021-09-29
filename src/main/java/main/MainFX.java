package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainFX extends Application {

        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage primaryStage) throws Exception {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource("/fxml/inicial.fxml"));
            BorderPane root = loaderMenu.load();
            Scene scene = new Scene(root);
            primaryStage.setTitle("Tarea Multipantalla");
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.setResizable(false);
        }

    }
