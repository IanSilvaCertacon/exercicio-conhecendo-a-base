/*
 * Escreva um programa que leia uma idade em anos e imprima
 * essa idade em dias.
 * 
 * Ex: 1 ano => 365 dias de idades.
 */

import java.util.Scanner;

public class DIaDeIdade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma idade em anos: ");
        int idadeAnos = sc.nextInt();

        int idadeDias = idadeAnos * 365;

        System.out.println("Sua idade digitada em dias é de " + idadeDias);

        sc.close();
    }
    
}
