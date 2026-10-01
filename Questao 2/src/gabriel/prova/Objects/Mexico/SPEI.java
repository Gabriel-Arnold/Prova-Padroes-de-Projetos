package gabriel.prova.Objects.Mexico;

import gabriel.prova.Interface.Pagamento;

public class SPEI implements Pagamento {
    @Override
    public String descricao() {
        return "Pagamento: SPEI";
    }
}
