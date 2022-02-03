package com.tech;

import java.io.File;
import java.io.IOException;
import java.text.FieldPosition;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class FileClass{
    public static void  main(String... args) {

        File file = new File("file.txt");
        if(file.exists() == false){
            try{
                file.createNewFile();
                System.out.println(file.getName()+" :Created");
            }catch(IOException ioE){
                System.out.println(ioE.getMessage());
            }
        }

        //System.out.println(file.getName());
        //Write streams of bytes to file

        String dataString = "I love programming in Java and Scala";
        byte[] data = dataString.getBytes();

        try{
           FileOutputStream fileOutputStream = new FileOutputStream(file.getName());
           System.out.println(file.length());
           fileOutputStream.write(data);
           System.out.println(file.length());
           fileOutputStream.close();
        }catch(IOException ioE){
            System.out.println(ioE.getMessage());
        }


        //Read streams of bytes from file
        try{
            FileInputStream fileInputStream = new FileInputStream(file.getName());
            int b = 0;

            while((b = fileInputStream.read()) != -1){
                System.out.print((char)b);
            }
            System.out.println();
            fileInputStream.close();
        }catch(IOException ioE){
             System.out.println(ioE.getMessage());
        }
    }
}