package Atividade01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de professores que você quer registrar: ");
        int quantidadeProfessores = sc.nextInt();

        int i = 0;
        Professor[] professores = new Professor[quantidadeProfessores];

        while(i < quantidadeProfessores) {
            professores[i] = new Professor();

            System.out.print("Insira o nome do professor: ");
            professores[i].setNome(sc.next());

            System.out.print("Insira o CPF do professor: ");
            professores[i].setCpf(sc.next());

            System.out.print("Selecione a titulação do professor. [1] Especialista [2] Mestre [3] Doutor ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1: professores[i].setTitulacao('E'); break;
                case 2: professores[i].setTitulacao('M'); break;
                case 3: professores[i].setTitulacao('D'); break;
                default:
                    System.out.println("Houve um erro ao registrar o professor.");
                    return;
            }

            System.out.print("Insira o salário do professor: ");
            professores[i].setSalario(sc.nextDouble());

            System.out.println("---------------------------------------------------------------------------------");

            i++;
        }

        double contribuicaoTotal = 0;
        int quantidadeDeMestres = 0;

        for(Professor professor : professores) {
            double contribuicao = professor.calcularContribuicao();

            contribuicaoTotal += contribuicao;

            if(professor.getTitulacao() == 'M') {
                quantidadeDeMestres++;
            }
        }

        System.out.println("Contribuição total: R$ " + contribuicaoTotal);
        System.out.println("Quantidades de professores Mestres: " + quantidadeDeMestres);
    }
}
