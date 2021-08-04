import java.util.Scanner;

public class Tarefa2e{
    public static void main(String args[]){
      Scanner teclado;
      teclado = new Scanner(System.in);

      double baseMaior, baseMenor, altura, area;

      System.out.println("Por favor, digite o valor da base maior");
      baseMaior = teclado.nextDouble();

      System.out.println("Por favor, digite o valor da base menor");
      baseMenor = teclado.nextDouble();

      System.out.println("Por favor, digite o valor da altura");
      altura = teclado.nextDouble();

      area =  (baseMaior + baseMenor) * altura /2;

      System.out.printf("Valor da area = %.3f\n", area);
    }
}