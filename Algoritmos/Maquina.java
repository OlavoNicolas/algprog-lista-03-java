import java.util.Scanner;

public class Maquina {
public static void main(String[] args) {

Scanner leitor = new Scanner(System.in);        

int escolha, quantidade, pagamento;
int salgadinho = 10, sucos = 5, refrigerantes = 5, doces = 10;
int nota50 = 50, nota20 = 20, nota10 = 10, nota5 = 5, nota2 = 2, moeda1 = 1; 
int precoFinal = 0;
int diferenca;
int valorpago = 0;
int troco = 0;
int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
do{
    System.out.println("MAQUINA DE LANCHES");
System.out.println("\nO que você deseja: ");
System.out.println("\n 1- Salgadinho 2- Doce 3- Sucos 4- Refrigerantes 5- Finalizar compra 6- Desistir da Compra");
escolha = leitor.nextInt();
switch (escolha) {
    case 1:

    System.out.println("O salgadinho custa R$ 10.00 você deseja quantos?");
    quantidade = leitor.nextInt();
    if (quantidade == 0 || quantidade < 0) {
        System.out.println("\nERRO, tente novamente!");    
    }else{

    precoFinal += salgadinho * quantidade;

        System.out.println("\nPreço final R$ " + precoFinal + " Deseja mais algo? (Senão pressione 5)");
        quantidade = 0;
    }

        break;

    case 2:

    System.out.println("O doce custa R$ 10.00 você deseja quantos?");
    quantidade = leitor.nextInt();
    if (quantidade == 0 || quantidade < 0) {
        System.out.println("\nERRO, tente novamente!");    
    }else{

    precoFinal += doces * quantidade;

        System.out.println("\nPreço final R$ " + precoFinal + " Deseja mais algo? (Senão pressione 5)");
        quantidade = 0;
    }



    break;

    case 3:

    
    System.out.println("Os sucos custa. R$ 5.00 você deseja quantos?");
    quantidade = leitor.nextInt();
    if (quantidade == 0 || quantidade < 0) {
        System.out.println("\nERRO, tente novamente!");    
    }else{

    precoFinal += sucos * quantidade;

        System.out.println("\nPreço final R$ " + precoFinal + " Deseja mais algo? (Senão pressione 5)");
        quantidade = 0;
    }


    break;


    case 4:

    System.out.println("Os refrigerantes custam R$ 5.00 você deseja quantos?");
    quantidade = leitor.nextInt();
    if (quantidade == 0 || quantidade < 0) {
        System.out.println("\nERRO, tente novamente!");    
    }else{

    precoFinal += refrigerantes * quantidade;

        System.out.println("\nPreço final R$ " + precoFinal + " Deseja mais algo? (Senão pressione 5)");
        quantidade = 0;
    }

    break;

    case 5:
    break;

    case 6:
    System.out.println("\nCompra cancelada!");
    System.exit(0);

    break;

    default:
    System.out.println("ERROR!");
    break;
}
}while (escolha != 5);



do{
System.out.println("\nPAGAMENTO:");
System.out.println("\nO preço final da sua compra foi de R$ " + precoFinal);
System.out.println("\nAceitamos somente essas notas: ");
System.out.println("\nSelecione as notas que você deseja usar para o pagamento. (Temos troco)");
System.out.println("\n 1- 50R$ 2- 20R$ 3- 10R$ 4- 5R$ 5- 2R$ 6- 1R$ 7- Desistir da Compra");
pagamento = leitor.nextInt();
switch (pagamento) {
    case 1:

    System.out.println("Você selecionou 50R$. Deseja usar quantas notas?");
    quantidade = leitor.nextInt();
    if (quantidade == 0 || quantidade < 0) {
        System.out.println("\nERRO, tente novamente!");    
    }else{
    
    valorpago += nota50 * quantidade;
    
    if (valorpago >= precoFinal) {
    pagamento = 8;

    
    }else{
    diferenca = precoFinal - valorpago;
    System.out.println("\nPreço final R$ " + precoFinal + " você pagou R$ " + valorpago);
    System.out.println("Ainda faltam R$ " + diferenca);
    quantidade = 0; 
}
    }

        break;

    case 2:

    
    System.out.println("Você selecionou 20R$. Deseja usar quantas notas?");
    quantidade = leitor.nextInt();
    if (quantidade == 0 || quantidade < 0) {
        System.out.println("\nERRO, tente novamente!");    
    }else{
    
    valorpago += nota20 * quantidade;
    
    if (valorpago >= precoFinal) {
    pagamento = 8;

    
    }else{
    diferenca = precoFinal - valorpago;
    System.out.println("\nPreço final R$ " + precoFinal + " você pagou R$ " + valorpago);
    System.out.println("Ainda faltam R$ " + diferenca);
    quantidade = 0; 
}
    }

    break;

    case 3:

    
    System.out.println("Você selecionou 10R$. Deseja usar quantas notas?");
    quantidade = leitor.nextInt();
    if (quantidade == 0 || quantidade < 0) {
        System.out.println("\nERRO, tente novamente!");    
    }else{
    
    valorpago += nota10 * quantidade;
    
    if (valorpago >= precoFinal) {
    pagamento = 8;

    
    }else{
    diferenca = precoFinal - valorpago;
    System.out.println("\nPreço final R$ " + precoFinal + " você pagou R$ " + valorpago);
    System.out.println("Ainda faltam R$ " + diferenca);
    quantidade = 0; 
}
    }
    break;


    case 4:

    System.out.println("Você selecionou 5R$. Deseja usar quantas notas?");
    quantidade = leitor.nextInt();
    if (quantidade == 0 || quantidade < 0) {
        System.out.println("\nERRO, tente novamente!");    
    }else{
    
    valorpago += nota5 * quantidade;
    
    if (valorpago >= precoFinal) {
    pagamento = 8;

    
    }else{
    diferenca = precoFinal - valorpago;
    System.out.println("\nPreço final R$ " + precoFinal + " você pagou R$ " + valorpago);
    System.out.println("Ainda faltam R$ " + diferenca);
    quantidade = 0; 
}
    }

    break;

    case 5:
    
    
    System.out.println("Você selecionou 2R$. Deseja usar quantas notas?");
    quantidade = leitor.nextInt();
    if (quantidade == 0 || quantidade < 0) {
        System.out.println("\nERRO, tente novamente!");    
    }else{
    
    valorpago += nota2 * quantidade;
    
    if (valorpago >= precoFinal) {
    pagamento = 8;

    
    }else{
    diferenca = precoFinal - valorpago;
    System.out.println("\nPreço final R$ " + precoFinal + " você pagou R$ " + valorpago);
    System.out.println("Ainda faltam R$ " + diferenca);
    quantidade = 0; 
}
    }
    
    
    break;



    case 6:
    
    System.out.println("Você selecionou 1R$. Deseja usar quantas moedas?");
    quantidade = leitor.nextInt();
    if (quantidade == 0 || quantidade < 0) {
        System.out.println("\nERRO, tente novamente!");    
    }else{
    
    valorpago += moeda1 * quantidade;
    
    if (valorpago >= precoFinal) {
    pagamento = 8;

    
    }else{
    diferenca = precoFinal - valorpago;
    System.out.println("\nPreço final R$ " + precoFinal + " você pagou R$ " + valorpago);
    System.out.println("Ainda faltam R$ " + diferenca);
    quantidade = 0; 
}
    }

    break;
    
    case 7:
    System.out.println("\nCompra cancelada!");
    System.exit(0);
    break;

    case 8:
    break;
    
    default:
    System.out.println("ERROR!");
    break;
}
}while (pagamento != 8);


if (valorpago == precoFinal) {

    System.out.println("\nCompra realizada com sucesso!");
    System.out.println("\nSua compra foi no valor de R$ "+ precoFinal+ " e você pagou "+ valorpago);
}
else{

diferenca = valorpago - precoFinal;
troco = diferenca;
while (diferenca != 0) {

    if (diferenca >=50 ) {
a++;
diferenca = diferenca - nota50;
        
    }else if (diferenca >= 20 && diferenca < 50) {
b++;
diferenca = diferenca - nota20;

    }else if (diferenca >=10 && diferenca < 20) {
c++;
diferenca = diferenca - nota10;        

    }else if (diferenca >=5 && diferenca < 10) {
d++;
diferenca = diferenca - nota5;

    }else if (diferenca >=2 && diferenca < 5 ) {
e++;
diferenca = diferenca - nota2;

    }else if (diferenca >= 1 && diferenca < 2) {
f++;
diferenca = diferenca - moeda1;
        
    }else{}
    
}

System.out.println("\n Seu troco foi de R$ " + troco);
System.out.println("\nFoi dado em: ");
System.out.println("Notas de R$ 50,00:" + a);
System.out.println("Notas de R$ 20,00:" + b);
System.out.println("Notas de R$ 10,00:" + c);
System.out.println("Notas de R$ 5,00:" + d);
System.out.println("Notas de R$ 2,00:" + e);
System.out.println("Moedas de R$ 1,00:" + f);
}
leitor.close();
}

}
