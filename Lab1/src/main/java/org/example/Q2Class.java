package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q2Class {
    public static void main(String[] args) {
        text1 t1 = new text1("D:/UM Sem2/WIA 1002 Data Structure/Lab/text1.txt",",");
        text2 t2 = new text2("D:/UM Sem2/WIA 1002 Data Structure/Lab/text2.txt",", ");
        text3 t3 = new text3("D:/UM Sem2/WIA 1002 Data Structure/Lab/text3.txt","; ");
        text4 t4 = new text4("D:/UM Sem2/WIA 1002 Data Structure/Lab/text4.txt");

        t1.separate();
        System.out.println();
        t2.separate();
        System.out.println();
        t3.separate();
        System.out.println();
        t4.separate();

    }
}

class differentiate{
    protected String path;
    protected String regex;


    public differentiate(){}
    public differentiate(String x, String y){
        path = x;
        regex = y;
    }

    public void separate(){
        try{
            Scanner inputstream = new Scanner(new FileInputStream(path));
            while(inputstream.hasNextLine()){
                String read = inputstream.nextLine();
                String[] word = read.split(regex);
                for (int i = 0; i < word.length; i++) {
                    System.out.print(word[i]);
                }
                System.out.println();
            }
            inputstream.close();
        }catch (IOException e){
            e.getMessage();
        }

    }
}

class text1 extends differentiate{
protected int numCharacter;
    public text1(String x, String y){
        super(x,y);
    }
@Override
    public void separate(){
    try{
        Scanner inputstream = new Scanner(new FileInputStream(path));
        while(inputstream.hasNextLine()){
            String read = inputstream.nextLine();
            String[] word = read.split(regex);
            numCharacter += word.length;
            for (int i = 0; i < word.length; i++) {
                System.out.print(word[i]);
            }
            System.out.println();
        }
        System.out.println("Number of Character: "+numCharacter);
        inputstream.close();
    }catch (IOException e){
        e.getMessage();
    }


}
}

class text2 extends differentiate{

    public text2(String x, String y){
        super(x,y);
    }

    public void separate(){
        super.separate();
    }
}

class text3 extends differentiate{

    public text3(String x, String y){
        super(x,y);
    }

    public void separate(){
        super.separate();
    }
}

class text4 {
    private String path;
    public text4(String x){
        path = x;
    }


    public void separate(){
        try{
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

