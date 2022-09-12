package com.silverlink.piandpbpractice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Progress.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws IOException {
        launch(args);
//        Files.walkFileTree(Path.of("D:\\PDFs\\extract"), new Test());
//        Files.copy(Path.of("D:\\PDFs\\extract\\split_1.pdf"), Path.of("D:\\PDFs3\\copied\\1.pdf"));
    }


}


