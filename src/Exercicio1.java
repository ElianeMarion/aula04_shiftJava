import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Fazer um programa que leia 2 números quaisquer e exiba o
        //somatório de todos os números do intervalo
        //2 - 6 : 2 + 3 + 4 + 5 + 6
        Scanner leitor = new Scanner(System.in);
        int numero1, numero2, soma = 0;
        System.out.println("Digite um número: ");
        numero1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = leitor.nextInt();

        while (numero1 <= numero2){
            soma = soma + numero1;
            numero1++;
        }
        System.out.println("Soma = " + soma);
    }
}
