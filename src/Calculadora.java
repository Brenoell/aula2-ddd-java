public class Calculadora {
    //atributos
    double numero1;
    double numero2;
    double resultado;

    public void exibirResultado(){
        System.out.println("Resulado = " + resultado);

    }
    public void somar(){
        resultado = numero1 + numero2;

    }
    //Método com retorno
    public double subtrair(){
        return numero1 - numero2;
    }

    // método com parâmetro
    public String exibir(double valor, String operacao){
        return operacao + " = " + valor;
    }

    public void multiplicacao(String operacao1){
        System.out.println(operacao1 + " = " + numero1*numero2);
    }

    public double divisao() {
        return numero1/numero2;
    }

}
