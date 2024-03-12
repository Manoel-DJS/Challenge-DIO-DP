package Strategy;

public class Conteudo {
    private PlanoMat strategy;

    public Conteudo(PlanoMat strategy) {
        this.strategy = strategy;
    }
    public int calcular(int n1, int n2){
        return strategy.operacao(n1,n2);
    }
}
