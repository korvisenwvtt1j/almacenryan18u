/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.util.Scanner;
/**
 *
 * @author CC2_1H-11
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  // FIBONACCI!
        display();
        
    }
   static int fact(int n){
       
        if(n == 0){
            return n;
        } if (n ==1){
            return n;
        }else
            return fact (n-1) + fact (n-2);
    } 

    static void display(){ 
        Scanner y = new Scanner(System.in);
        System.out.println("Input number");
        int kl = y.nextInt();
       
        for(int i = 0; i <= kl; i++){
            System.out.print("f(" + i+ ") "); 
        } System.out.println("");

            for (int i = 0; i <= kl; i++ ){
                for (int j = 0; j <= i; j++)
                {
                    System.out.print(fact(j) + "    ");
                } System.out.println(" ");
            
            
                 
            }
        
    }
    
}
/*
f(n)
if n = 0; n = n
if n = 1; n = n
if n > 1; f(n-1)+f(n-2)

*/