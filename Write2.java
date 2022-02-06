package com.tech;

import java.io.Console;

public class Write2{
    public static void main(String[] args){
        Console c  = System.console();
        String name = c.readLine("Enter Name :  ");
        char[] passwd = c.readPassword("Enter Password:  ");
        String stringPasswd = new String(passwd);

        if(stringPasswd.equals("vice12345") && name.equals("vice")){
            System.out.println(name+" Welcome Back");
        }else{
            System.out.println("Who are you!!!!!");
        }
    }
}