import java.util.Scanner;

public class Tarefa3{
    public static void main(String args[]){
      Scanner teclado;
      teclado = new Scanner(System.in);

      double kw, salarioMinimo, valorKw, valorTotal, valorDesconto;

      System.out.println("Por favor, digite a quantidade do kw gasto");
      kw = teclado.nextDouble();

      System.out.println("Por favor, digite o valor do salário minimo");
      salarioMinimo = teclado.nextDouble();

      valorKw =  salarioMinimo / 700;
      valorTotal = kw * valorKw;
      valorDesconto = valorTotal * 0.9;


      System.out.printf("Valor do KW = %.3f\n", valorKw);
      System.out.printf("Valor a ser pago = %.3f\n", valorTotal);
      System.out.printf("Valor a ser pago com desconto de 10%% = %.3f\n", valorDesconto);
    }
}