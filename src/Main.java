//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operacao;

        System.out.println("Calculadora em linguagem Java");
        System.out.println("Digite o primeiro numero");
        num1 = scanner.nextDouble();

        System.out.println("Digite a operação");
        operacao = scanner.next().charAt(0);

        System.out.println("Digite o segundo numero");
        num2 = scanner.nextDouble();

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return;

                }
                break ;
            default:
                System.out.println ("ERRO: divisao por zero");
                return;


        }

        System.out.println("Resultado" + resultado);
        scanner.close();




    }
}