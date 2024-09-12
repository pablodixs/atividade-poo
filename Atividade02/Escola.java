package Atividade02;

public class Escola {
    private int matricula;
    private String alfanumerico;
    private double nota;
    char conceito;

    // Construtor
    public Escola(int matricula, String alfanumerico, double nota) {
        this.matricula = matricula;
        this.alfanumerico = alfanumerico;
        this.nota = nota;
    }

    // Métodos para exibir informações
    public void exibirMatricula() {
        System.out.println("Matricula: " + matricula);
    }

    public void exibirAlfa() {
        System.out.println("Alfanumerico: " + alfanumerico);
    }

    // Getters e Setters
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setAlfanumerico(String alfanumerico) {
        this.alfanumerico = alfanumerico;
    }

    public void setNota(double nota) {
        // Lógica para definir o conceito
        if (nota >= 90.0 && nota <= 100.0) {
            conceito = 'A';
        } else if (nota >= 70.0 && nota <= 89.9) {
            conceito = 'B';
        } else if (nota >= 50.0 && nota <= 69.9) {
            conceito = 'C';
        } else if (nota >= 0.0 && nota <= 49.9) {
            conceito = 'D';
        }
        this.nota = nota;  // Armazena a nota
    }

    public int getMatricula() {
        return matricula;
    }

    public String getAlfanumerico() {
        return alfanumerico;
    }

    public double getNota() {
        return nota;
    }

    public void exibirNota() {
        System.out.println("Nota: " + nota);
    }

    public void exibirConceito() {
        System.out.println("Conceito: " + conceito);
    }
}