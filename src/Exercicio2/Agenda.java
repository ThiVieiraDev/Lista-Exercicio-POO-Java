package Exercicio2;

public class Agenda {
    static int[] qntdPessoas = new int[10];
    static int count = 0;

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            qntdPessoas[i] = count;
            count++;
            System.out.println(qntdPessoas[i]);
        }
        System.out.println(qntdPessoas[0]);
    }


}
