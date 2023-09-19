/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursivopractica1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author maris
 */
public class RecursivoPractica1 {
    public static BufferedReader bufer=new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese el valor de y: ");
        int y;
        entrada = bufer.readLine(); // Se lee la entrada y se almacena la variable entrada
        y = Integer.parseInt(entrada);

        System.out.println("Ingrese el valor de z: ");
        int z;
        entrada = bufer.readLine();
        z = Integer.parseInt(entrada);

        int resultado = sumaCuadrados(y, z);
        System.out.println("La suma de los números elevados al cuadrado es: " + resultado);
    }
 // public static int sumaCuadrados(int y, int z. Es la función recursiva que calcula la suma de los números elevados al cuadrado
    public static int sumaCuadrados(int y, int z) {
        // Evitar un ciclo infinito 
        if (y > z) {
            return 0;
        } else {
            int cuadradoActual = y * y;
            return cuadradoActual + sumaCuadrados(y + 1, z);
        }
    }
}