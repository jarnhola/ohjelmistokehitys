/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Ohjelmistokehitys
 */
//Esimerkki tiedon kapseloinnista
public class Shape {
    
    /**
     * The copy constructor of shape class
     * @param s 
     */
    public Shape(Shape s)
    {
        setColor(s.getColor());
    }
    
    /**
     * 
     * @param color 
     */
    
    //constructor funktio
    public Shape(int color)
    {
        setColor(color);
        System.out.println("All ready!");
    }
    //vaihtoehtoinen constructor funktio
    public Shape()
    {
        setColor(color);
        System.out.println("All ready!");
    }
    
    //Tietojäsenet:
    //Must be positive value
    private int color = 0;  // ei näy luokan ulkopuolelle
    protected int some; //muuten kuin public, mutta ei näy toiseen packageen
    
    public void setColor(int color){  // Näkyy luokan ulkopuolelle / periytyy
        if(color >= 0){
            this.color = color;  //voidaan käyttää funktion sisällä
        }
    }
    
    public int getColor(){  // Näkyy luokan ulkopuolelle / periytyy
        
        return color;
    }
}
