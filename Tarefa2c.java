import java.util.Scanner;

public class Tarefa2c{
    public static void main(String args[]){
      Scanner teclado;
      teclado = new Scanner(System.in);

      double base, altura, area;

      System.out.println("Por favor, digite o valor da base");
      base = teclado.nextDouble();

      System.out.println("Por favor, digite o valor da altura");
      altura = teclado.nextDouble();

      area = (base*altura)/2;

      System.out.printf("Valor da area = %.3f\n", area);
    }
}