package gabriel.prova.Objects.Mexico;

import gabriel.prova.Interface.ComprovanteFiscal;
import gabriel.prova.Interface.Factory;
import gabriel.prova.Interface.Pagamento;
import gabriel.prova.Interface.TermoPrivacidade;

public class FactoryMexico implements Factory {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new CFDI();
    }

    @Override
    public Pagamento criarPagamento() {
        return new SPEI();
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new LFPDPPP();
    }
}
