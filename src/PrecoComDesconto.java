import java.util.Scanner;

public class PrecoComDesconto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o preço:");
        double price = sc.nextDouble();

        System.out.println("Digite a porcentagem de desconto: ");
        double percentage = sc.nextDouble();

        double totalValue = price * (percentage/100);
        double valorEconomizado = price - totalValue;

        System.out.println("O valor com desconto ficará: R$ " + valorEconomizado);
        System.out.println("O valor economizado: " + totalValue );

        sc.close();
    }
}
