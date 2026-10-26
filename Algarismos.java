//19. Escreva um programa que leia um número inteiro entre 100 e 999 e imprima na saída cada um dos 
//algarismos que compõem o número.

import java.util.Scanner;

public class Algarismos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero entre 100 e 999: ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 999) {

            while (numero > 0) {
                int algarismo = numero % 10;
                System.out.println(algarismo);
                numero = numero / 10;
            }
            
        } else {
            System.out.println("Número fora do intervalo permitido!");
        }

        scanner.close();
    }
}