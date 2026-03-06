import java.util.Scanner;

public class par_ou_impar {
    public static void main(String[] args) {
        int n1, valor;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor inteiro para verificar se ele é impar ou par");
        n1 = leitor.nextInt();
        valor = n1%2;
        if (valor==1){
            System.out.println("Seu número é impar");
        }else {
            System.out.println("Seu número é par");
        }
    }
}
