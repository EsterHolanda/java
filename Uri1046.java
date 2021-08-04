import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int inicio, fim, total;
        
        inicio = teclado.nextInt();
        fim = teclado.nextInt();

        total = fim - inicio;

        
        if (total <= 0){
            total = total + 24;
        }
            System.out.println("O JOGO DUROU " + total + " HORA(S)");
    }    
}