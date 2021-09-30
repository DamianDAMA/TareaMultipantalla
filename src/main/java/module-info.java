module TareaMultipantalla {

    //needed for JavaFX - Tanto openwebinar y ni un curso de JavaFX en él :(
    requires javafx.controls;
    requires javafx.fxml;
    requires org.yaml.snakeyaml;
    requires lombok;
    requires java.logging;

    opens controllers to javafx.fxml;

    exports main;
    exports controllers;
    exports dao;
    exports modelos;
    exports service;
}