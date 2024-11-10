/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosdivisiblespor3y5;

/**
 *
 * @author jcplo
 */
public class Numerosdivisiblespor3y5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Números divisibles por 3 y 5:");
    for (int i = 1; i <= 100; i++) {
    if (i % 3 == 0 && i % 5 == 0) {
    System.out.println(i);
    }
   }
  }
}
    
