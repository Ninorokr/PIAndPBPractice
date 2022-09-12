package com.silverlink.piandpbpractice;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ResourceBundle;

public class ProgressController implements Initializable {

    @FXML
    public Button btnAbrirOrigen;

    @FXML
    public Button btnAbrirDestino;

    @FXML
    public Button btnCopiar;

    @FXML
    public Label lblRutaOrigen;

    @FXML
    public Label lblRutaDestino;

    @FXML
    public ProgressBar pbProgreso;

    @FXML
    public ProgressIndicator piProgreso;

    public DirectoryChooser chooser;

    public File fileOrigen;
    public File fileDestino;

    public Johnnie walker;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void abrirOrigen(){
        chooser = new DirectoryChooser();
        chooser.setTitle("Elige la carpeta de origen");
        chooser.setInitialDirectory(new File("D:\\PDFs\\extract"));
        fileOrigen = chooser.showDialog(new Stage());
        lblRutaOrigen.setText(fileOrigen.toString());

    }

    public void abrirDestino(){
        chooser = new DirectoryChooser();
        chooser.setTitle("Elige la carpeta de destino");
        chooser.setInitialDirectory(new File("D:\\PDFs3\\copied"));
        fileDestino = chooser.showDialog(new Stage());
        lblRutaDestino.setText(fileDestino.toString());
    }

    public void copiar() throws IOException {
        walker = new Johnnie(Path.of(fileOrigen.toURI()));
        Files.walkFileTree(Path.of(fileOrigen.toURI()), walker);
        //TODO: Dividir 100 entre la cuenta de archivos y anexarlo a los progressbar
//        Files.walkFileTree(Path.of("D:\\PDFs\\extract"), new Johnnie());

    }
}
