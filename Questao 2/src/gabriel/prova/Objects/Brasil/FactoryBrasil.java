package gabriel.prova.Objects.Brasil;

import gabriel.prova.Interface.ComprovanteFiscal;
import gabriel.prova.Interface.Factory;
import gabriel.prova.Interface.Pagamento;
import gabriel.prova.Interface.TermoPrivacidade;

public class FactoryBrasil implements Factory {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new NFSe();
    }

    @Override
    public Pagamento criarPagamento() {
        return new Pix();
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new LGPD();
    }

}
