import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        String nome;
        int idade;
        boolean casado;
        //Leitura de dados - parte 1
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();
        System.out.println("Digite seu idade: ");
        idade = leitor.nextInt();

        System.out.println("Bem vindo(a) " + nome);
        System.out.println(" Sua idade é " + idade);


    }
}
