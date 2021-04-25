/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;
import java.util.Scanner;
/**
 *
 * @author CC2_1h-11
 */
public class whatIsYourCourse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner g = new Scanner(System.in);
        
        System.out.println("What is your course?");
        String course = g.nextLine();
          
        if (course.equalsIgnoreCase("BSIT")){
        System.out.println("What is your track? ");
        String track = g.next();
            if (track.equalsIgnoreCase("webtech")){
                System.out.println("WEB AND TECHNOLOGY");
            }   else if (track.equalsIgnoreCase("Netsec")){
                System.out.println("NETWORK AND SECURITY");
            }    else if (track.equalsIgnoreCase("ERP")){
                System.out.println("Enterprise and resource planning");
            }
    } 
        else if (course.equalsIgnoreCase("comsci")){
        System.out.println("What track? ");
        String track = g.next();
            if (track.equalsIgnoreCase("mobdev")){
            System.out.println("MOBILE DEVELOPMENT");
            } else if (track.equalsIgnoreCase("digitalanimation")){
            System.out.println("DIGITAL ARTS AND ANIMATION");
        }
    } 
        else if (course.equalsIgnoreCase("bsda")){
        System.out.println("BSDA");
    } else{
            System.out.println("Invalid");
        }
} 
}
