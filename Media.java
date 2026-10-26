// 6. Faça um programa que leia 10 inteiros e imprima sua média.

import java.util.Scanner;

public class Media{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        double media;
        int soma = 0;

        while (numero < 10){
            System.out.print("Digite um numero: ");
            numero = scanner.nextInt();
            soma += numero;
        }
        media = soma / 10.0;

        System.out.print("Média: " + media);

        scanner.close();
    }
}