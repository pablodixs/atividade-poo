package Atividade03;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria Fernanda Lopes", LocalDate.of(2004, 11, 9), 1.70);
        pessoa.imprimirDados();
    }
}
    
