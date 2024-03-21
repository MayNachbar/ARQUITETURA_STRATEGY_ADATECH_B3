import strategy.ImpostoMG;
import strategy.ImpostoPorEstado;
import strategy.ImpostoRJ;
import strategy.ImpostoSP;

public class CalculadoraImposto {
    public static void main (String[] args) {
        ImpostoPorEstado imposto = new ImpostoSP();
        // posso usar qualquer um dos imposto como nas linhas comentadas abaixo
        // ImpostoPorEstado imposto = new ImpostoRJ();
        // ImpostoPorEstado imposto = new ImpostoMG();
        
        double impostoCalculado = imposto.calcularImposto(1000);
        System.out.println(impostoCalculado);
    }
}
