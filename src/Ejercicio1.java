import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int [] vector = new int [10];
        int entrada;
        int contador = 0;
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
            if (i == entrada)
                contador++;
        }
        System.out.println("El número " + entrada + " está " + contador + " vez/veces en el array.");
    }
}

