import java.util.Scanner;

public class TrêsNumeros{
public static void main(String[] args) {

int a, b, c;
int media;
Scanner leitor = new Scanner(System.in);

System.out.println("Digite o número 1: ");
a = leitor.nextInt();

System.out.println("Digite o número 2: ");
b = leitor.nextInt();

System.out.println("Digite o número 3: ");
c = leitor.nextInt();



if (a > b && a > c) {

System.out.println("\nO maior número digitado foi: " + a);

if (b > c) {
    
    System.out.println("\nO menor número digitado foi: " + c);

}else{

System.out.println("\nO menor número foi: " + b);

}

    
}else if (b > a) {

    System.out.println("\nO maior número digitado foi: " + b);

if (a > c) {
    
    System.out.println("\nO menor número digitado foi: " + c);

}else{

System.out.println("\nO menor número foi: " + a);

}


}else{

System.out.println("\nO maior número digitado foi: " + c);

if (a > b) {
    
    System.out.println("\nO menor número digitado foi: " + b);

}else{

System.out.println("\nO menor número foi: " + a);

}



}

media = (a + b + c) / 3;

System.out.println("\nA média dos três é: " + media);

leitor.close();


}

}