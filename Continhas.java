public class Continhas{
    public static void main(String args[]){
        
        int a, b, c;

        a = 23;
        b = 4;
        
        c = a + b;
        System.out.println("valor da soma = " + c);

        c = a - b;
        System.out.println("valor da subt = " + c);

        c = a * b;
        System.out.println("valor da mult = " + c);

        c = a / b;
        System.out.println("valor da divi = " + c);

        c = a % b;
        System.out.println("valor do resto = " + c);

        System.out.println("Agora continhas quebradas");

        float x, y, z;

        x = 23;
        y = 4;
        z = x / y;
        System.out.println("valor da divisão quebrada = " + z);
        System.out.printf("valor agora com 2 casas decimais % 5.2f\n" , z);
        System.out.printf("valor com 3 casas decimais %.3f\n" , z);

    }
}