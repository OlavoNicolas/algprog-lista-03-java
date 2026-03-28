import java.util.Scanner;

public class Equação {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
double a, b, c;

        System.out.print("Digite o valor de a: ");
        a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        c = scanner.nextDouble();

        // a) Verificação: a = 0, b = 0 e c != 0
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        }
        // b) Equação de primeiro grau
        else if (a == 0 && b != 0) {
            double raiz = -c / b;
            System.out.println("Essa é uma equação de primeiro grau.");
            System.out.println("Raiz: " + raiz);
        }
        // Equação de segundo grau
        else if (a != 0) {
            double delta = Math.pow(b, 2) - 4 * a * c;

            // c) Delta negativo
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            }
            // d) Delta zero
            else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.println("Raiz: " + raiz);
            }
            // e) Delta positivo
            else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.println("Raiz 1: " + raiz1);
                System.out.println("Raiz 2: " + raiz2);
            }
        }
        // Caso todos sejam zero (opcional)
        else {
            System.out.println("Todos os coeficientes são zero.");
        }

        scanner.close();
    }
}
