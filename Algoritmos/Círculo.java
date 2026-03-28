import java.util.Scanner;

public class Círculo{
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
double a;
int escolha;
double pi = 3.141592;
double perimetro = 0, area = 0, volume = 0 ;

    System.out.print("\nDigite o valor do raio da circunferência: ");
    a = scanner.nextDouble();
    
    System.out.print("\nDigite os números a seguir para escolher uma operção para o Raio informado:");
    System.out.println("\n1: calcular e imprimir o perímetro do círculo. 2: calcular e imprimir a área do círculo. 3: calcular e imprimir o volume da esfera.");
    escolha = scanner.nextInt();

switch (escolha) {
    case 1:
    
perimetro = 2 * pi *a;
System.out.println("\nPerímetro: " + perimetro);
    
    break;

    case 2:
        
area = pi * Math.pow(a, 2);
System.out.println("\nÁrea: " + area);

    break;

    case 3:
       
volume = (4.0/3.0) * pi * Math.pow(a, 3);
System.out.println("\nVolume: " + volume);

    break;
    
    default:
    System.out.println("ERRO.");
    break;
}
        

scanner.close();

}}


