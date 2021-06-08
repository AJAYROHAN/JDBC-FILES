/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajcontroller;

/**
 *
 * @author AJ ROHAN M
 */
import java.util.Scanner;
import java.util.scanner;
public class AJcontroller {

   
    public static void main(String[] args) {
       
        int year, age,Birthyear = 0,waityear;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your BirthYear");
        year=sc.nextInt();
        age=2021-year;
        year=Birthyear+18;
        waityear=18 - age;
      
        if(age>=18)
        
            {
                System.out.println("YOUR VOTER ID IS : 64785");
                
            }
             else
            {
                System.out.println("Sorry! you Are Not To Vote Because Your Age "+age+" your age is possible for "+year+" you will wait for "+waityear+" years... THANK U");
               
               
                
            }
        }
        
        
    }


        
         

    

