package com.silverlink.piandpbpractice;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Johnnie extends SimpleFileVisitor<Path> {

    private int fileCount;
    private final Path destino;
    private int index = 0;
    private double walkerProgress = -0.1;

    public Johnnie(Path destino){
        this.destino = destino;
    }
    public int getFileCount() { return fileCount; }
    public int getIndex() { return index; }
    public double getWalkerProgress() { return walkerProgress; }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        fileCount = dir.toFile().list().length;
        System.out.println("File count: " + getFileCount());
        return super.preVisitDirectory(dir, attrs);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        index++;
        walkerProgress = ((double)fileCount / index) / ((double)(fileCount)*100);
        Files.copy(file, Path.of(destino.toString() + "\\" + file.getName(file.getNameCount()-1)));
        return super.visitFile(file, attrs);
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return super.postVisitDirectory(dir, exc);
    }
}
