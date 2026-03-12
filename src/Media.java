import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double n1, n2;
        double result;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = leitor.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = leitor.nextDouble();

        result = (n1 + n2)/2;
        System.out.println("A média dos valores é " + result);

    }
}
