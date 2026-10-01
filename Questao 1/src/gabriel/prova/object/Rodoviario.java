package gabriel.prova.object;

import java.security.PublicKey;

public class Rodoviario extends Frete {

    @Override
    public double calcularFrete() {
        return super.valorDaCarga * 0.02;
    }

    public Rodoviario(String Cliente, double Valor, String CTe, String MTFe) {
        super.cliente = Cliente;
        super.modalidade = "Rodoviario";
        super.valorDaCarga = Valor;
        super.documentos.put("CT-e", CTe);
        super.documentos.put("MTF-e", MTFe);
    }
}
