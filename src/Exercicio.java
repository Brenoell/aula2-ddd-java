public class Exercicio {
    String nomeExercicio;
    String parteCorpo;
    String descricao;
    int numeroSeries;
    int numeroRepeticoes;
    double pesoCarga;
    double nivelDificuldade;


    //metodo => açoes
    //escrevi um trecho do codigo, podendo usar varias vezes
    //nome de metodo: começa com letra minuscula, usa casmelcase, nao pode ter caracter especial.
    // public = metodo publico
    // void = é um tipo, significa sem retorno, de retorno | é um metodo SEM RETORNO.

    public void exibir(){//ASSINATURA DE UM METODO
        System.out.println("Descrição exericio");
        System.out.println(nomeExercicio);
        System.out.println(parteCorpo);
        System.out.println(descricao);
        System.out.println(numeroRepeticoes);
        System.out.println(numeroSeries);
        System.out.println(pesoCarga);
        System.out.println(nivelDificuldade);
    }
}
