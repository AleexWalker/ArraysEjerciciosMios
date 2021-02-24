import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        int [] vector = new int [10];
        int [] copiaVector = new int [10];
        Random numeroAleatorio = new Random();

        System.out.print("Array 1:");
        for (int i = 0 ; i < vector.length ; i++){
            vector [i] = numeroAleatorio.nextInt(99)+1;
            copiaVector [i] = vector[i];
            if (i == vector.length-1){
                vector [i] = -7;
            }
            System.out.print(" " + vector[i]);
        }
        System.out.print("\nArray 2:");
        for (int i = 0 ; i < vector.length ; i++) {
            System.out.print(" " + copiaVector[i]);
        }
    }
}

