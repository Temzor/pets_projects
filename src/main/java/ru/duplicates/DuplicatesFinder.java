package ru.duplicates;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DuplicatesFinder {
    public static void main(String[] args) throws IOException {
        String path = "C:/test";
        DuplicatesVisitor duplicatesVisitor = new DuplicatesVisitor();
        Files.walkFileTree(Path.of(path), duplicatesVisitor);
        duplicatesVisitor.getFiles().forEach(System.out::println);
    }
}