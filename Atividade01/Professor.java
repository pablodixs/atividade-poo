package Atividade01;

public class Professor {
    private String nome;
    private String cpf;
    private char titulacao;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(char titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularContribuicao() {
        if(titulacao == 'E') {
            return (salario * 1.2) / 100;
        } else if(titulacao == 'M') {
            return (salario * 1.4) / 100;
        } else if(titulacao == 'D') {
            return (salario * 1.6) / 100;
        } else {
            return 0;
        }
    }
}
