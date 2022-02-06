package com.tech;


/* File object contain obstract file and directory of which represent file and directory in an underlining OS 
*  FileReader is a lower level class object that reads file character by character
*  FileWriete is a lower level class object that write to file character by character
*/  


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Write1{
    public static void main(String... args){
        
        char[] in = new char[50];
        int size = 0;

        try{
            File file1 = new File("file1.txt");
            FileWriter fileWriter = new FileWriter(file1);
            String data = "I love programming\nI love Java and Scala";
            fileWriter.write(data);
            fileWriter.flush();
            fileWriter.close();

            FileReader fileReader = new FileReader(file1);
            size = fileReader.read(in);

            for(char ch: in){
               System.out.print(ch);
               
            }
            System.out.println(" \n"+size);
            fileReader.close();

        }catch(IOException e){
            System.out.println(e);
        }
    }
}