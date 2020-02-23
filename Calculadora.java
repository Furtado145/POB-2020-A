import java.util.Scanner;
    
    public class Calculadora{

        public int som(int num1, int num2){
            return num1 + num2;
        }
        public int sub(int num1, int num2){
            return num1 - num2;
        }
        public int mult(int num1, int num2){
            return num1 * num2;
        }
        public float div(float num1, float num2){
            return num1 / num2;
        }
        public static void main(String [] args){
            Calculadora c = new Calculadora();

            int opcao = 0;
            int num1;
            int num2;

                Scanner input = new Scanner(System.in);

            System.out.println("Digite o numero 1:");
            num1 = input.nextInt();
            System.out.println("Digite o numero 2:");
            num2 = input.nextInt();

                Scanner inputOp = new Scanner(System.in);

            System.out.println("Faremos uma: ");
            System.out.println("1. Soma");
            System.out.println("2. Subtracao");
            System.out.println("3. Multiplicacao");
            System.out.println("4. Divisao");
            System.out.println("0. Sair");

            opcao = inputOp.nextInt();

            while (opcao != 0){

                if (opcao == 1){

                    int conta = c.som(num1, num2);

                    System.out.println("Igual a " + conta);
                    break;
                }
                if (opcao == 2){
                    
                    int conta = c.sub(num1, num2);

                    System.out.println("Igual a " + conta);
                    break;
                }
                if (opcao == 3){

                    int conta = c.mult(num1, num2);

                    System.out.println("Igual a " + conta);
                    break;
                }
                if (opcao == 4){

                    float conta = c.div(num1, num2);

                    System.out.println("Igual a " + conta);
                    break;    
                }
                else{

                    System.out.println("Opcao inexistente!");
                    break;
                }

            }
        }
    }