import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hInicio, hFim, mInicio, mFim; // variaveis para armazemar o inicio e fim
        int totalH, totalM; // converter para unidade
        int totalInicio, totalFim, total; // calcular tudo em minutos
        
        hInicio = teclado.nextInt();
        mInicio = teclado.nextInt();
        hFim    = teclado.nextInt();
        mFim    = teclado.nextInt();

        // passo 1: converter tudo em munutos
        totalInicio = hInicio * 60 + mInicio;
        totalFim    = hFim * 60 + mFim;

        total = totalFim - totalInicio; // aqui é igual ao 1046

        // passo 2: ver o qto durou efetivamente        
        if (total <= 0){
            total = total + 24*60; // ou 1440
        }

        // passo 3: converter de volta 
        totalH = total / 60;
        totalM = total % 60;

            System.out.println("O JOGO DUROU " + totalH + " HORA(S) E " + totalM + " MINUTO(S)");
    }    
}