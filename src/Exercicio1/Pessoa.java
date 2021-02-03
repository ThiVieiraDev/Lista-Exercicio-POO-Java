package Exercicio1;

import java.text.SimpleDateFormat;
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

    public static void calculaIdade(Date dataRecebida){
//        Calendar dataAtual = Calendar.getInstance();
//        System.out.printf("%tD\n", dataAtual);

        Date dataAtual = new Date();
        System.out.println(dataAtual.);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        int idade = 0;
        System.out.println("Idade: " + idade);
    }

    public static void exibePessoa(Pessoa pessoa){
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Altura: " + pessoa.getAltura() + " cm");
        System.out.println("Data de nascimento: " + pessoa.getDataNascimento());
        calculaIdade(pessoa.getDataNascimento());
//        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Date idade = new Date(1998 - 1900,0,13);
        Pessoa clienteUm = new Pessoa("Thiago", idade,1.92);
        exibePessoa(clienteUm);
    }
}
