import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero;
        int impar = 1;

        numero = teclado.nextInt();
        
        while (impar <= numero){
            System.out.println(impar);
            impar = impar + 2;
        }

    }
}