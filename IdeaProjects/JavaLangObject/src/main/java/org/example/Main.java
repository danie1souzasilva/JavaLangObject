package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("olá mundo");

        int [] idades = new int[5];
        for(int i = 0; i < idades.length; i++){
            idades[i] = i;
            System.out.println(i);

        }

        System.out.println("essas aulas ensinaram sobre pacote, comentarios, visibilidade...");
    }

}