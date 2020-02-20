import java.util.Scanner;
    
    public class Calculadora{
        public static void main(String [] args){
            int num1;
            int num2;

            Scanner input = new Scanner(System.in);

            System.out.println("Digite o numero 1:");
            num1 = input.nextInt();
            System.out.println("Digite o numero 2:");
            num2 = input.nextInt();
            System.out.println("Resultado: " + (num1 + num2));
        }
    }