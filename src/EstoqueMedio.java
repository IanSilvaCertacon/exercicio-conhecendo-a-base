import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as quantias  máximas e minímas: ");

        System.out.print("Máx: ");
        int max = sc.nextInt();

        System.out.print("Min: ");
        int min = sc.nextInt();

        int AvarageStock = (min + max)/2;

        System.out.printf("O valor de estoque médio é de %f unidades.", AvarageStock);

        sc.close();
    }
}
