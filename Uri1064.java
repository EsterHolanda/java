import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double numero, soma = 0.0;
        int qtdpositivos = 0;

        for (int cont=1 ; cont <=6 ; cont++){
            numero = teclado.nextDouble();
            if (numero > 0){
                qtdpositivos++;
                soma = soma + numero;
            }
        }
        System.out.println(qtdpositivos + " valores positivos");
        System.out.printf("%.1f\n", (soma / qtdpositivos));
    }
}