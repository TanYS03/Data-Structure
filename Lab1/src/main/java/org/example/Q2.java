package org.example;

import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        try{
            String path ="D:/UM Sem2/WIA 1002 Data Structure/Lab/text1.txt";
            Scanner inputstream = new Scanner(new FileInputStream(path));
            int numCharacter=0;
            while(inputstream.hasNextLine()){
                String read = inputstream.nextLine();
                String[] word = read.split(",");
                numCharacter += word.length;
                for (int i = 0; i < word.length; i++) {
                    System.out.print(word[i]);
                }
                System.out.println();
            }
            System.out.println("Number of character: "+numCharacter);
            inputstream.close();
        }catch (IOException e){
            e.getMessage();
        }

        System.out.println();

        try{
            String path ="D:/UM Sem2/WIA 1002 Data Structure/Lab/text2.txt";
            Scanner inputstream = new Scanner(new FileInputStream(path));
            while(inputstream.hasNextLine()){
                String read = inputstream.nextLine();
                String[] word = read.split(", ");
                for (int i = 0; i < word.length; i++) {
                    System.out.print(word[i]);
                }
                System.out.println();
            }

        }catch (IOException e){
            e.getMessage();
        }

        System.out.println();

        try{
            String path ="D:/UM Sem2/WIA 1002 Data Structure/Lab/text3.txt";
            Scanner inputstream = new Scanner(new FileInputStream(path));
            while(inputstream.hasNextLine()){
                String read = inputstream.nextLine();
                String[] word = read.split("; ");
                for (int i = 0; i < word.length; i++) {
                    System.out.print(word[i]);
                }
                System.out.println();
            }

        }catch (IOException e){
            e.getMessage();
        }

        System.out.println();

        try{
            String path ="D:/UM Sem2/WIA 1002 Data Structure/Lab/text4.txt";
            Scanner inputstream = new Scanner(new FileInputStream(path));
            while(inputstream.hasNextLine()){
                String read = inputstream.nextLine();
                for (int i = 0; i < read.length(); i++) {
                    if(Character.isAlphabetic(read.charAt(i))) System.out.print(read.charAt(i));
                }
                System.out.println();
            }

        }catch (IOException e){
            e.getMessage();
        }

    }

}
