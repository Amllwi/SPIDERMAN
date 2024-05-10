/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spiderman2;
import java.util.Scanner; 
/**
 *
 * @author MARIAM Y AMAL.
 */
public class SPIDERMAN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int spiderman = 0;
        int bomba1 = 0;
        int bomba2 = 0;
        int casos = 0;
        casos = sc.nextInt();

        for (int i = 1; i <= casos; i++) {
            spiderman = sc.nextInt();
            bomba1 = sc.nextInt();
            bomba2 = sc.nextInt();
            if (Math.abs(spiderman - bomba1) + Math.abs(bomba1 - bomba2) < Math.abs(spiderman - bomba2) + Math.abs(bomba2 - bomba1)) {
                System.out.println(Math.abs(spiderman - bomba1) + Math.abs(bomba1 - bomba2));

            } else {
                System.out.println(Math.abs(spiderman - bomba2) + Math.abs(bomba2 - bomba1));
            }

        }

    }
}
    
    

