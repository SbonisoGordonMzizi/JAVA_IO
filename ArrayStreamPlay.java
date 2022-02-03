package com.tech;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ArrayStreamPlay {
    public static void main(String... args) throws IOException{
        String message = "I love programming in Java and Scala tooo much";

        byte[] messageBytes = message.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(messageBytes);
        byte[] messageBytes2 = byteArrayOutputStream.toString().getBytes();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(messageBytes2);
        byte c = 0;
        while((c = (byte)byteArrayInputStream.read()) != -1){
           System.out.print((char)c);
        }
        System.out.println();
    }
}
