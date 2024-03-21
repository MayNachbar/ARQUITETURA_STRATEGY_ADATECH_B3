package strategy;

public class ImpostoMG implements ImpostoPorEstado {
    @Override
    public double calcularImposto(double valor) {
        System.out.println("Imposto MG:");
        return valor * 0.07;
    }
}
