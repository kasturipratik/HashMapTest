package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int num ;
    // hashmap declaration with key as integer and value as string
       // System.out.println((System.getProperties("user.dir")+ File.separatorChar+"hashMap.txt"));
File file = new File("hashMap.txt");
Scanner scannerInput = new Scanner(file);
while(scannerInput.hasNextLine()){
    String line =scannerInput.nextLine();
    System.out.println(line);
}

    // user integer input
        System.out.println("Enter a number");
        num = scan.nextInt();

        while(num != 0){
            System.out.println( hashMap(num));
            System.out.println("Enter a number");
            num = scan.nextInt();
        }



    }
    public static String hashMap(int num)
    {   String value;
        HashMap<Integer, String> myMap = new HashMap<Integer, String>();
        myMap.put(1, "One");
        myMap.put(2,"Two");
        myMap.put(3,"Three");
        myMap.put(4,"Four");
        myMap.put(5,"Five");
        myMap.put(6,"six");
        myMap.put(7,"Seven");
        myMap.put(8,"Eight");
        myMap.put(9,"Nine");
        myMap.put(10,"Ten");
        myMap.put(11,"Eleven");
        myMap.put(12,"Twelve");
        if(myMap.containsKey(num)){
           value = myMap.get(num);
        }
        else{
            value ="The String does Not exist";
        }
return value;
    }
}
