import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        //Solicitar um número para o usuário e calcular o fatorial deste número
        //4! = 4 * 3 * 2 * 1 = 24
        //5! = 5 * 4 * 3 * 2 * 1 = 120

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número para o cálculo do fatorial: ");
        int numero = leitor.nextInt();
        int fat = 1;
        int i = numero; //inicialização
        //calcular o fatorial
        while(i >= 1){ //condição
            fat = fat * i;
            i--; //-- subtrai 1 da variável
        }
        System.out.println(numero + "! = " + fat);

    }
}
