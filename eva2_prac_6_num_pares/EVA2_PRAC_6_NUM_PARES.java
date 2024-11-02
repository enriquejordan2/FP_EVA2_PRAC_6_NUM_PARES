/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_prac_6_num_pares;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA2_PRAC_6_NUM_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Inicio");
        num1 = captu.nextInt();
        captu.nextLine();
        System.out.println("FIn");
        num2 = captu.nextInt();
        for (int i = num1; i <= num2; i++){
            
            int modulo =i % 2;
            if (modulo ==1)
               continue;
            System.out.println(i +"-");
        }
        
    }
    
}
