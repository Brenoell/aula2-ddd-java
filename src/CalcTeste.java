import java.util.Scanner;

public class CalcTeste {
    public static void main(String[] args) {
        //leitores
        Scanner leitor = new Scanner(System.in);
        System.out.println("Calculadora");
        Calculadora calculadora = new Calculadora();
        System.out.println("Digite o primeiro número: ");
        calculadora.numero1 = leitor.nextDouble();
        System.out.println("Digite o segundo número: ");
        calculadora.numero2 = leitor.nextDouble();


        calculadora.somar();
        calculadora.exibirResultado();
        System.out.println("Subtração = " + calculadora.subtrair());
        double sub = calculadora.subtrair();
        System.out.println(sub);

        System.out.println(calculadora.exibir(sub, "Subtração"));
        calculadora.multiplicacao("Multiplicacao");

        System.out.println(calculadora.divisao());


    }
}
