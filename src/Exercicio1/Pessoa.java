package Exercicio1;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private double altura;

    public Pessoa(String nome, Date dataNascimento, double altura) {
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static int calculaIdade(){
        Calendar dataAtual = Calendar.getInstance();
        System.out.printf("%tD\n", dataAtual);

        Date calendario = new Date(1998,0,13);
//        System.out.printf(String.valueOf(calendario));

        return 0;
    }

    public static void exibePessoa(Pessoa pessoa){
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Altura: " + pessoa.getAltura() + " cm");
        System.out.println("Data de nascimento: " + pessoa.getDataNascimento());
        int idade = calculaIdade();
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Date teste = new Date(1998,0,13);
        Pessoa clienteUm = new Pessoa("Thiago",teste,1.92);
        exibePessoa(clienteUm);
    }
}
