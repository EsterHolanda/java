import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;
        X = teclado.nextInt();

        // esse é o pomto de partida

        if (X % 2 ==0){
            X++;
        }

        for (int cont=1; cont<=6; cont++){
            System.out.println(X);
            X+=2;

        }

    }
}