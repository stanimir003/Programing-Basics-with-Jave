/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drawing_Figures_with_Loops;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Java03_Square_of_Stars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int row = 0; row < n; row++) {
            System.out.print("*");
            for (int col = 0; col < n - 1; col++){ 
                System.out.print(" *");
            }
        
            System.out.println();
        }
    }
    
    
}
