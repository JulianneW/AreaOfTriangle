/*
 * Julianne Wojdak
 * 19/02/2020
 * AreaOfTriangle.java
 */

package areaoftriangle.java;

import javax.swing.*;
/**
 *
 * @author JuWoj8013
 */
public class AreaOfTriangleJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int sideA, sideB, sideC;
    String myInput;
    
    //Prompts user to enter three side lengths
    myInput = JOptionPane.showInputDialog("Please enter the length of side A:");
    sideA = Integer.parseInt(myInput);
    
    myInput = JOptionPane.showInputDialog("Please enter the length of side B:");
    sideB = Integer.parseInt(myInput);
        
    myInput = JOptionPane.showInputDialog("Please enter the length of side C:");
    sideC = Integer.parseInt(myInput);
    
    //Calculates area
    double semiP;
    semiP = (sideA + sideB + sideC)/2;
   
    double area;
    area = Math.sqrt(semiP*(semiP-sideA)*(semiP-sideB)*(semiP-sideC));
    
    //Outputs area
    System.out.println("The area of the triangle is "+ area + "cm squared");

    }
    
}
