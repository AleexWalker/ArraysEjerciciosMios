import java.util.Random;

public class ArrayValorMax {
    public static void main(String[] args) {
        int [] vector = new int [10];
        int maximo = 0;
        int posicion = 0;
        Random numeroAleatorio = new Random();

        System.out.print("Array :");
        for (int i = 0 ; i < vector.length ; i++){
            vector [i] = numeroAleatorio.nextInt(99)+1;
            System.out.print(" " + vector[i]);
            if (maximo < vector[i]){
                maximo = vector[i];
                posicion = i;
            }
        }
        System.out.println("\nEl número máximo es " + maximo + " y está en la posición " + posicion);
    }
}
