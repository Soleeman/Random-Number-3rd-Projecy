/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package random.dive.project;

import java.util.Scanner;

/**
 *
 * @author sohak9660
 */
public class RandomDiveProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Setting Variabels
           int MinNum, MaxNum, DieV;
         
        //Asking For Min and Max Number
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter A minimum Value");
        MinNum = input.nextInt();
        System.out.println("Please Enter A maximum Value");
        MaxNum = input.nextInt();
        //The Output Screen
        DieV = (int)Math.ceil(Math.random()*MaxNum + (MaxNum - MinNum));
        
           
            System.out.println("Your number is " + DieV);
        
   
        
        }
    }
    

