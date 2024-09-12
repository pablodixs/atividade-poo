package Atividade02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a matricula do aluno: ");
        int matricula = scanner.nextInt();

        System.out.print("Digite o codigo alfanumerico: ");
        String alfanumerico = scanner.next();

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        Escola aluno = new Escola(matricula, alfanumerico, nota);

        aluno.setNota(nota);

        aluno.exibirMatricula();
        aluno.exibirAlfa();
        aluno.exibirNota();
        aluno.exibirConceito();
    }
}
