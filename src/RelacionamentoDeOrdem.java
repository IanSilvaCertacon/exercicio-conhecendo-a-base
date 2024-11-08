import java.util.Scanner;

public class RelacionamentoDeOrdem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros para fazer o relacionamento de ordem:");
        System.out.println("1° numero: ");
        int n1 = sc.nextInt();

        System.out.println("2° numero: ");
        int n2 = sc.nextInt();

        boolean igual = n1 == n2;
        boolean nIgual = n1 != n2;
        boolean maior = n1 > n2;
        boolean menor = n1 < n2;
        boolean maiorIgual = n1 >= n2;
        boolean menorIgual = n1 <= n2;

        System.out.println("Igual (2 = 3): " + igual);
        System.out.println("Não igual (2 != 3): " + nIgual);
        System.out.println("Maior (2 > 3): " + maior);
        System.out.println("Menor (2 < 3): " + menor);
        System.out.println("maior ou igual (2 >= 3): " + maiorIgual);
        System.out.println("menor ou igual (2 <= 3): " + menorIgual);

        sc.close();
        
    }
}
