/*
*Imprimir a tabuada de um numero
* Ler e imprimir
*/

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número que deseja gerar a tabuada: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            int nTabuada = n * i;
            System.out.println(nTabuada);
        }

        sc.close();

    }
}
