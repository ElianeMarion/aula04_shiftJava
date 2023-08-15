import java.util.Scanner;

public class SomaSemRepeticao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Média de notas de uma turma com 10 alunos.
        double n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, soma, media;
        System.out.println("Digite a nota do primeiro aluno: ");
        n1 = leitor.nextDouble();
        System.out.println("Digite a nota do 2 aluno: ");
        n2 = leitor.nextDouble();
        System.out.println("Digite a nota do 3 aluno: ");
        n3 = leitor.nextDouble();
        System.out.println("Digite a nota do 4 aluno: ");
        n4 = leitor.nextDouble();
        System.out.println("Digite a nota do 5 aluno: ");
        n5 = leitor.nextDouble();
        System.out.println("Digite a nota do 6 aluno: ");
        n6 = leitor.nextDouble();
        System.out.println("Digite a nota do 7 aluno: ");
        n7 = leitor.nextDouble();
        System.out.println("Digite a nota do 8 aluno: ");
        n8 = leitor.nextDouble();
        System.out.println("Digite a nota do 9 aluno: ");
        n9 = leitor.nextDouble();
        System.out.println("Digite a nota do 10 aluno: ");
        n10 = leitor.nextDouble();
        soma = n1 + n2+n3+n4+n5+n6+n7+n8+n9+n10;
        media = soma / 10;

    }
}
