package com.silverlink.piandpbpractice;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Progress {

    private static DoubleProperty progress;

    public static double getProgress() {
        return progressProperty().get();
    }

    public static DoubleProperty progressProperty() {
        if(progress == null)
            progress = new SimpleDoubleProperty(0);
        return progress;
    }

    public static void setProgress(double progress) {
        progressProperty().set(progress);
    }
}
