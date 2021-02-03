package Exercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private double altura;

    public Pessoa(String nome, LocalDate dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

//    public static void calculaIdade(Date dataRecebida) {
////        Calendar dataAtual = Calendar.getInstance();
////        System.out.printf("%tD\n", dataAtual);
//        LocalDate dataNascimento = LocalDate.of(1998,1,13);
//        int idade = Pessoa.calculateAge(dataNascimento, LocalDate.of(2021,2,21));
//    }

    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    public static void exibePessoa(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Altura: " + pessoa.getAltura() + " cm");
        System.out.println("Data de nascimento: " + pessoa.getDataNascimento());
        int idade = Pessoa.calculateAge(pessoa.getDataNascimento(), LocalDate.now());
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
//        LocalDate dataNascimento = LocalDate.of(1998,1,13);
        Pessoa clienteUm = new Pessoa("Thiago", LocalDate.of(1998,1,13), 1.92);
        exibePessoa(clienteUm);
    }
}
