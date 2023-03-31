package org.example;

import java.io.*;
import java.util.Scanner;

public class ReadMyLetter_22004867 {
    public static void main(String[] args) {
        String path ="D:/UM Sem2/WIA 1002 Data Structure/Lab/TanYiShan_22004867.txt";
        String read="";
        try{
            Scanner inputstream = new Scanner(new FileInputStream(path));
            read = inputstream.nextLine();
            check:
            {
                if (read.equals("")) {
                    System.out.println("The file is empty file");
                    break check;
                }

                while (inputstream.hasNextLine()) {
                    System.out.println(read);
                    read = inputstream.nextLine();
                }
            }
            inputstream.close();
//        }catch(IOException e){
//            e.getMessage();
        }catch(FileNotFoundException e){
            e.getMessage();
        }


        try{
            Scanner input = new Scanner(System.in);
            PrintWriter outputstream = new PrintWriter(new FileOutputStream(path,true));
            do{
                read = input.nextLine();
                outputstream.println(read);
            }while (!read.equals("end"));
            outputstream.close();
        }catch(IOException e){
            e.getMessage();
        }
    }
}