/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Ohjelmistokehitys
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if(args.length == 0){
            System.out.println("Give your name as command line argument");
            System.exit(1);
        }
        else{
            if(args[0].equals("-help")){
                System.out.println("Name printer version 1.2");
                System.out.println("Application ask your name. Type name and press enter");
                System.out.println("Application will print your name with greetings");
            }
        }
            
            
        //This is how to print on the console.
        System.out.println("Terve! Anna nimesi!");
        // Create a scanner object for reading input
        Scanner name = new Scanner(System.in);
        //Wait until user hits enter key, then store input in nimi variable
        String nimi = name.nextLine();
        //Print out the name with greetings!
        System.out.println("Heippa, " + nimi + "! Nimesi pituus on " + nimi.length() + "merkkiä");
        //
        System.out.println("Anna myös osoitteesi.");
        Scanner address = new Scanner(System.in);
        String osoite = address.nextLine();
        System.out.println("Osoitteesi on " + osoite);
        
        Shape shape = new Shape(1);
        shape.setColor(2);
        System.out.println(shape.getColor());
        
        Shape shape2 = new Shape(shape); //  How to use copy constructor
    }
    
}
