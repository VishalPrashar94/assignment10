/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 1794421
 */
public class JavaApplication1 {

    
    public static void main(String[] args) {

        System.out.println("Enter no. of rows u want : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        int k = 2*n-2;
        for (int i = n; i>=0; i--) {
            
            for (int j = n-i; j >=0; j--) {
                System.out.print(" ");
            }
            
            for (int k = 2*i - 1; k >=1; k--) {
                
                    System.out.print("*");
                }
                  System.out.println("");
            }
          
        }
    
    }
    

