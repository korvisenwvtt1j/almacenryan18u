/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qwertyyu;
import java.util.Scanner;
/**
 *
 * @author cc2_1h-11
 */
public class Qwertyyu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        display();
    }
    public static void display(){
        Scanner main = new Scanner(System.in);
        
        System.out.println("Input larray length:  ");
        int x = main.nextInt();
        int[] arr = new int [x];
        for(int i=0; i<arr.length;i++){
            System.out.print("Input index element " + i + ":");
            int element = main.nextInt();
            arr [i]=element;
        }
         System.out.print("Operation to be used:fib(1) or fact(2) : ");
         String choice = main.next();
         while(!"1".equals(choice) && !"2".equals(choice)){
             System.out.print("What operation? fib(1) or fact(2) : ");
             choice = main.next();    
         }
         
         for(int i=0; i<arr.length; i++){
            System.out.print("f(" + arr[i] + ") \t");
        }
        System.out.println("");
        if("1".equals(choice)){
            for(int i = 0; i < arr.length; i++){
                System.out.print(fibo(arr[i])+ "\t");
            }
        }else if("2".equals(choice)){
            for(int i = 0; i < arr.length; i++){
                System.out.print(factorial(arr[i]) + "\t");
            }
        }
    }
    public static int fibo(int bb){
        if(bb<=1){
            return bb;
        }else{
            return fibo(bb-1)+fibo(bb-2);
        }
    }
    public static int factorial(int bb){
        int i=1;
        int fact = 1;
        while(i <=bb)
        {
            fact *= i;
            i++;
        }
        return fact;
    }
}
    
    

