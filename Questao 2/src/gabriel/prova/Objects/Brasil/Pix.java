package gabriel.prova.Objects.Brasil;

import gabriel.prova.Interface.Pagamento;

public class Pix implements Pagamento {

    @Override
    public String descricao() {
        return "Pagamento: Pix";
    }
}
