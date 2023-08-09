import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int number1 = 0;
        int number2 = 0;
        int result = 0;
        int option;


        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("1 - Somar");
            System.out.println("2 - Multiplicar");
            System.out.println("3 - Dividir");
            System.out.println("4 - Subtrair");
            System.out.println("5 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Digite o primeiro número: ");
                    number1 = scanner.nextInt();
                    System.out.println("Digite o segundo número: ");
                    number2 = scanner.nextInt();

                    result = number1 + number2;
                    System.out.println("Resultado: " + result);

                    break;
                case 2:

                    System.out.println("Digite o primeiro número: ");
                    number1 = scanner.nextInt();
                    System.out.println("Digite o segundo número: ");
                    number2 = scanner.nextInt();

                    result = number1 * number2;
                    System.out.println("Resultado: " + result);

                    break;
                case 3:

                    System.out.println("Digite o primeiro número: ");
                    number1 = scanner.nextInt();
                    System.out.println("Digite o segundo número: ");
                    number2 = scanner.nextInt();

                    result = number1 / number2;
                    System.out.println("Resultado: " + result);

                    break;
                case 4:

                    System.out.println("Digite o primeiro número: ");
                    number1 = scanner.nextInt();
                    System.out.println("Digite o segundo número: ");
                    number2 = scanner.nextInt();

                    result = number1 - number2;
                    System.out.println("Resultado: " + result);

                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opção não reconhecida.");
                    break;
            }

        } while (option >=6 || option <=0);

    }

}
