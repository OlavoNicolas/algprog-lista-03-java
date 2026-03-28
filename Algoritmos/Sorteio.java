import java.util.Random;
import java.util.Scanner;

public class Sorteio {
public static void main(String[] args) {

int a, b;
int numero;
Scanner leitor = new Scanner(System.in);
Random random = new Random();

System.out.println("Digite o número 1: ");
a = leitor.nextInt();

System.out.println("Digite o número 2: ");
b = leitor.nextInt();    

if (a > b ) {

System.out.println("\nO maior número digitado foi: " + a);
System.out.println("\nO menor foi: " + b);

numero = random.nextInt((a-b)+1) + b;
System.out.println("\nO sorteio de um número entre o maior e o menor digitado foi igual a: " + numero);

if (numero % 2 == 0){ 
    System.out.println("\nO número é par");}
else{
    System.out.println("\nO número é ímpar");}

}else if(b>a){

System.out.println("\nO maior número digitado foi: " + b);
System.out.println("\nO menor foi: " + a);

numero = random.nextInt((b-a)+1) + a;
System.out.println("\nO sorteio de um número entre o maior e o menor digitado foi igual a: " + numero);

if (numero % 2 == 0){ 
    System.out.println("\nO número é par");}
else{
    System.out.println("\nO número é ímpar");}


}else{

System.out.println("\nSão iguais.");

}

leitor.close();
    }
    
}