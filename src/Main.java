import Strategy.Conteudo;
import Strategy.Somar;
import Strategy.Subtrair;

/*
        @author Manoel Vinicius
     Desafio do BootCamp DIO
     Crie uma solução que explore o conceito de Padrões de Projeto na pŕatica.
     Para isso, você pode reproduzir um dos projetos que criamos durante as aulas ou, caso se sinta preparado, desenvolver uma nova ideia do zero
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("!Estratégia Matemática!");
        Conteudo math = new Conteudo(new Somar());

        System.out.println("Resultado 1: " + math.calcular(3,6));

        math = new Conteudo(new Subtrair());

        System.out.println("Resultado 2: " + math.calcular(15,5));

    }

}