//20. Leia uma sequência de números inteiros e determine se eles são pares ou não. Deverá ser informado o 
//número de dados lidos e o número de valores pares. O processo termina quando for digitado o número 
//1000.

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero, (1000) para parar: ");
        int numero = scanner.nextInt();
        
        int cont = 0;
        int pares = 0;

        while(numero != 1000){
            cont++;

            if (numero % 2 == 0) {
                System.out.println(numero + " e par");
                pares++;
            } else {
                System.out.println(numero + " e impar");
            }

            System.out.print("Digite outro numero, (1000) para parar: ");
            numero = scanner.nextInt();
            
        }
        System.out.println("Quantidade de numeros: " + cont);
        System.out.println("Quantidade de numeros pares: " + pares);
        scanner.close();
    }
}
