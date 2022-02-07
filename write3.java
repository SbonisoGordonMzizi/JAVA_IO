package com.tech;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class write3 {
    public static void main(String... args) throws IOException{
        Path path = Paths.get("testing.txt");
        System.out.println(Files.isDirectory(path));
        Files.createDirectories(path);
        System.out.println(Files.isDirectory(path));
        System.out.println(path.toString());
    }
    
}
