package strategy;

public class ImpostoSP implements ImpostoPorEstado {
    @Override
    public double calcularImposto(double valor) {
        System.out.println("Imposto SP:");
        return valor * 0.08;
    }
}
