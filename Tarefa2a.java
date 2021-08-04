import java.util.Scanner;

public class Tarefa2a{
    public static void main(String args[]){
      Scanner teclado;
      teclado = new Scanner(System.in);

      double lado, area;

      System.out.println("Por favor, digite o valor");
      lado = teclado.nextDouble();

      area = lado * lado;

      System.out.printf("Valor da area = %.3f\n", area);
        
    }
}