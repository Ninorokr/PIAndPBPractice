package com.silverlink.piandpbpractice;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Progress {

    private DoubleProperty progress;

    public double getProgress() {
        return progressProperty().get();
    }

    public DoubleProperty progressProperty() {
        if(progress == null)
            progress = new SimpleDoubleProperty(0);
        return progress;
    }

    public void setProgress(double progress) {
        this.progressProperty().set(progress);
    }
}
