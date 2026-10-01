package gabriel.prova.object;

public class Aereo extends Frete {

    @Override
    public double calcularFrete() {
        return super.valorDaCarga * 0.06;
    }

    public Aereo(String Cliente, double Valor, String AWB, String Fatura) {
        super.cliente = Cliente;
        super.modalidade = "Aereo";
        super.valorDaCarga = Valor;
        super.documentos.put("AWB", AWB);
        super.documentos.put("Fatura", Fatura);
    }

}
