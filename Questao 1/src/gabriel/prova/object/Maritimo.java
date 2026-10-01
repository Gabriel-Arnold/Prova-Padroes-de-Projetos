package gabriel.prova.object;

public class Maritimo extends Frete {

    @Override
    public double calcularFrete() {
        return super.valorDaCarga * 0.01;
    }

    public Maritimo(String Cliente, double Valor, String BL) {
        super.cliente = Cliente;
        super.modalidade = "Marítimo";
        super.valorDaCarga = Valor;
        super.documentos.put("BL", BL);
    }
}
