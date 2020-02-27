package Calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, resultado;
        double n2 = 0;
        String operacao;

        System.out.println("Digite a operação desejada (+, -, *, /, ^, raiz): ");
        operacao = entrada.nextLine();

        if ("+".equals(operacao)) {
            System.out.println("Digite o primeiro valor: ");
            n1 = entrada.nextDouble();
            System.out.println("Digite o segundo valor: ");
            n2 = entrada.nextDouble();
            resultado = n1 + n2;
            System.out.println("Resultado: " + resultado);
        } else if ("-".equals(operacao)) {
            System.out.println("Digite o primeiro valor: ");
            n1 = entrada.nextDouble();
            System.out.println("Digite o segundo valor: ");
            n2 = entrada.nextDouble();
            resultado = n1 - n2;
            System.out.println("Resultado: " + resultado);
        } else if ("*".equals(operacao)) {
            System.out.println("Digite o primeiro valor: ");
            n1 = entrada.nextDouble();
            System.out.println("Digite o segundo valor: ");
            n2 = entrada.nextDouble();
            resultado = n1 * n2;
            System.out.println("Resultado: " + resultado);
        } else if ("^".equals(operacao)) {
            System.out.println("Digite o primeiro valor: ");
            n1 = entrada.nextDouble();
            System.out.println("Digite o segundo valor: ");
            n2 = entrada.nextDouble();
            resultado = Math.pow(n1, n2);
            System.out.println("Resultado: " + resultado);
        } else if ("raiz".equals(operacao)) {
            while (true) {
                System.out.println("Digite o valor: ");
                n1 = entrada.nextDouble();
                if (n1 >= 0) {
                    resultado = Math.sqrt(n1);
                    System.out.println("A raiz quadrada de " + n1 + " é: " + resultado);
                    break;
                } else {
                    System.out.println("Raiz não permite número negativo");
                }
            }
        }
        while ("/".equals(operacao) && n2 == 0) {
            System.out.println("Digite o primeiro valor: ");
            n1 = entrada.nextDouble();
            System.out.println("Digite o segundo valor: ");
            n2 = entrada.nextDouble();
            System.out.println("Não é possível dividir por zero, favor digitar outro número");
            n2 = entrada.nextDouble();
            resultado = n1 / n2;
            if (n2 != 0) {
                System.out.println("Resultado: " + resultado);
            }
        }
    }
}
