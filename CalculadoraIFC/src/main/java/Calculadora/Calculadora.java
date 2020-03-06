package Calculadora;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2, resultado;
        String operacao;

        System.out.println("Digite a operação desejada (+, -, *, /, ^, raiz): ");
        operacao = entrada.nextLine();

        if (null != operacao) {
            switch (operacao) {
                case "+":
                    System.out.println("primeiro valor");
                    n1 = entrada.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    n2 = entrada.nextDouble();
                    resultado = n1 + n2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;
                case "-":
                    System.out.println("Digite o primeiro valor: ");
                    n1 = entrada.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    n2 = entrada.nextDouble();
                    resultado = n1 - n2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;
                case "*":
                    System.out.println("Digite o primeiro valor: ");
                    n1 = entrada.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    n2 = entrada.nextDouble();
                    resultado = n1 * n2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;
                case "/":
                    System.out.println("Digite o primeiro valor: ");
                    n1 = entrada.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    n2 = entrada.nextDouble();
                    while (n2 == 0) {
                        if (n2 != 0) {
                            resultado = n1 / n2;
                            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                            break;
                        } else if (n2 == 0) {
                            System.out.println("Não é possível dividir por zero, favor digitar outro número");
                            n2 = entrada.nextDouble();
                        }
                    }
                    break;
                case "^":
                    System.out.println("Digite o primeiro valor: ");
                    n1 = entrada.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    n2 = entrada.nextDouble();
                    resultado = Math.pow(n1, n2);
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;
                case "raiz":
                    while (true) {
                        System.out.println("Digite o valor: ");
                        n1 = entrada.nextDouble();
                        if (n1 >= 0) {
                            resultado = Math.sqrt(n1);
                            System.out.println("A raiz quadrada de " + n1 + " é: " + resultado);
                            JOptionPane.showMessageDialog(null, "A raiz quadrada de " + n1 + " é: " + resultado);
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Raiz não permite número negativo");
                        }
                    }
                    break;
                default:
                    break;
            }
        }

    }
}
