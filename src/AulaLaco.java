import java.util.Scanner;

public class AulaLaco {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        //Média de notas de uma turma com 10 alunos.
        double nota, soma, media;
        soma = 0;
        System.out.println("Professor, digite a quantidade de alunos da sua turma: ");
        int numeroAlunos = leitor.nextInt();

        int qtdAlunos = 1; //inicialização
        while (qtdAlunos <= numeroAlunos) { //condição
            System.out.println("Digite a nota do " + qtdAlunos + "º aluno: ");
            nota = leitor.nextDouble();
            soma = soma + nota;
            qtdAlunos++; //incremento
        }
        media = soma / numeroAlunos;
        System.out.println("Média = " + media);
    }
}
