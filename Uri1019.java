import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
      Scanner teclado;
      teclado = new Scanner(System.in);

      int tempo, hora, minuto, segundo, resto;
      
      tempo = teclado.nextInt(); 
      
      hora = tempo / 3600;
      resto = tempo % 3600;
      minuto = resto / 60;
      segundo = resto % 60;

      System.out.println(hora + ":" + minuto + ":" + segundo);
    }
}