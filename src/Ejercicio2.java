import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int [] vector = new int [10];
        int entrada;
        boolean validez = false;
        Random numeroAleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.print("Array 1:");
        for (int i = 0 ; i < vector.length ; i++){
            vector [i] = numeroAleatorio.nextInt(49)+1;
            System.out.print(" " + vector[i]);
        }
        System.out.print("\nValor que quieres buscar: ");
        entrada = teclado.nextInt();
        for (int i : vector) {
            if ((i == entrada) && !validez ){
                System.out.println("El número " + entrada + " está el array.");
                validez = true;
            }
        }
        if (!validez)
            System.out.println("El número " + entrada + " no está el array.");
    }
}
