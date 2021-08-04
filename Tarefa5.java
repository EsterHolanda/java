import java.util.Scanner;

public class Tarefa5{
    public static void main(String args[]){
      Scanner teclado;
      teclado = new Scanner(System.in);

      double distancia, velocidade, tempo, litros;

      System.out.println("Por favor, digite o valor do tempo gasto na viagem");
      tempo = teclado.nextDouble();

      System.out.println("Por favor, digite o valor da velocidade média");
      velocidade = teclado.nextDouble();

      distancia =  velocidade * tempo;
      litros = distancia/12;

      System.out.printf("Quantidade de litro gasto = %.3f\n", litros);
    }
}