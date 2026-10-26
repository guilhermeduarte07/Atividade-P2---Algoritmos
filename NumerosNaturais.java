//12. Faça um programa que leia um número inteiro positivo N e imprima todos os 
// números naturais de 0 até N em ordem decrescente.

import java.util.Scanner;

public class NumerosNaturais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Digite um numero inteiro positivo: ");
        numero = scanner.nextInt();

        int contador = numero;

        while(contador >= 0){
            System.out.print(contador + " ");
            contador--;
        }

        scanner.close();
    }
}
