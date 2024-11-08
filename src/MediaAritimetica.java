/*
 * Exercicio 1:
 * 
 * Dadas 3 notas, imprimir a media aritmetica do aluno
 * 
 * formula MA = (n1 + n2 + n3)/ 3
 */

import java.util.Scanner;

public class MediaAritimetica{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira abaixo as 3 notas do aluno: ");
                
        System.out.print("Nota 1 = ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota 2 = ");
        double nota2 = sc.nextDouble();

        System.out.print("Nota 3 = ");
        double nota3 = sc.nextDouble();

        double ma = (nota1 + nota2 + nota3)/3;

        System.out.println("A média final é de " + ma);
        
        sc.close();

    }
 }