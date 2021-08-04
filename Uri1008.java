import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
      Scanner teclado;
      teclado = new Scanner(System.in);

      int funcionario, horas;
      double valorHora, salario;

      funcionario = teclado.nextInt();    
      horas = teclado.nextInt();
      valorHora = teclado.nextDouble();

      salario = horas * valorHora;

      System.out.println("NUMBER = " + funcionario);
      System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}