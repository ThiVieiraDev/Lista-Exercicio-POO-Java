package Exercicio1;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private double altura;

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

    public static void calculaIdade(){
        Calendar dataAtual = Calendar.getInstance();
        System.out.printf("%tD\n", dataAtual);

        Date calendario = new Date(1998,0,13);
        System.out.printf(String.valueOf(calendario));
    }

    public static void exibePessoa(Pessoa pessoa){
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Altura: " + pessoa.getAltura());
    }

    public static void main(String[] args) {
        Pessoa clienteUm = new Pessoa();

        clienteUm.setNome("Thiago");
        clienteUm.setAltura(1.92);
//        clienteUm.setDataNascimento("13/01/1998");
        exibePessoa(clienteUm);
        calculaIdade();
    }
}
