import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double valor;
        int cod, qtde;
        
        cod = teclado.nextInt();
        qtde = teclado.nextInt();

        
        if (cod == 1 ){
            valor = 4.00 * qtde;
            System.out.printf("Total: R$ %.2f\n",valor);
        }
        else if (cod == 2){
            valor = 4.50 * qtde;
            System.out.printf("Total: R$ %.2f\n",valor);
        }
        else if (cod == 3){
            valor = 5.00 * qtde;
            System.out.printf("Total: R$ %.2f\n",valor);
        }
        else if (cod == 4){
            valor = 2.00 * qtde;
            System.out.printf("Total: R$ %.2f\n",valor);
        }
        else if (cod == 5){
            valor = 1.50 * qtde;
            System.out.printf("Total: R$ %.2f\n",valor);
        }
    }    
}