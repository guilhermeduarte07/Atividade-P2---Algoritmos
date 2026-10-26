//8. Escreva um programa que leia 10 números e escreva o menor valor lido e o maior valor lido.

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1, menor = 0, maior = 0, numero;

        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º número: ");
            numero = scanner.nextInt();
            if (contador == 1) {
                menor = numero;
                maior = numero;
            } else {
                if (numero < menor){
                    menor = numero;
                }
                if (numero > maior){
                    maior = numero;
                }
            }
            contador++;
        }
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);

        scanner.close();
    }
}
