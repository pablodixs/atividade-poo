package Atividade03;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    // Atributos privados
    private String nome;
    private LocalDate dataNascimento;
    private double altura;

    // Construtor
    public Pessoa(String nome, LocalDate dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    // Métodos getters e setters para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos getters e setters para dataNascimento
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Métodos getters e setters para altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
        // Método para calcular a idade
    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        if (dataNascimento != null) {
            Period periodo = Period.between(dataNascimento, hoje);
            return periodo.getYears();
        }
        return 0; // Retorna 0 se a data de nascimento não estiver definida
    }

    // Método para imprimir os dados da pessoa
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Idade: " + calcularIdade() + " anos");
    }
}
