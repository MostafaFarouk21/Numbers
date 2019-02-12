/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num_1 , num_2 , num_3 ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        num_1 = s.nextInt();
        System.out.println("Enter Second number");
        num_2= s.nextInt();
        System.out.println("Enter Third number");
        num_3= s.nextInt();
        if (num_1 > num_2 && num_1 > num_3){
            System.out.println("Max num is : " +num_1);
        }
      else if (num_2 > num_1 && num_2 > num_3){
            System.out.println("Max num is : " +num_2);
        }
      else if (num_3 > num_2 && num_3 > num_1){
            System.out.println("Max num is : " +num_3);
        }
        else if (num_1 < num_2 && num_1 < num_3){
            System.out.println("Min num is : " +num_1);
        }
        else if (num_2 < num_3 && num_2 < num_1){
            System.out.println("Min num is : " +num_2);
        }
        else  {
            System.out.println("Min num is : " +num_3);
        }
        
         
    }
    
}
