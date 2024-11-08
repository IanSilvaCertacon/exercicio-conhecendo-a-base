import java.util.Locale;
import java.util.Scanner;

public class ConversorDolarReal {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor que deseja ser convertido para Reais: ");

        System.out.print("Valor em dólar: ");
        double Dolar = sc.nextDouble();

        System.out.print("Valor da cotação: ");
        double cota = sc.nextDouble();

        double ConvertValue = Dolar * cota;

        System.out.printf("O valor em reais é de R$ %.2f", ConvertValue);

        sc.close();
    }
}
