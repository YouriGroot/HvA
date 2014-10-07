/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobbelsteenadvanced;
import java.util.Scanner;


/**
 *
 * @author Pesho
 */
public class DobbelsteenAdvanced {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The aantal worpen");
        int aantalWorpen; 
        int worp;
        int vlak;
        aantalWorpen = input.nextInt();
        int[] arrayPercentage = new int[aantalWorpen];
        for (int i =0; i<aantalWorpen;i++)
        {
             worp = (int) (1 + (Math.random() * (6)));
             arrayPercentage[i]= worp;
             System.out.println(worp);
        }
        
        System.out.println("Enter the vlak");
        vlak = input.nextInt();
        double percentage=0;
        percentage = berekenPercentage(arrayPercentage,vlak);
      System.out.println(percentage) ;
    }
    
    public  static double berekenPercentage(int arrayPercentage[], int vlak){
       double temp =0;
        for(int i=0; i<arrayPercentage.length;i++)
        {
            if (arrayPercentage[i] == vlak)
            {
                temp +=1;
            }
        }
        return ((temp*100)/arrayPercentage.length);
      
        
        
    }
}
