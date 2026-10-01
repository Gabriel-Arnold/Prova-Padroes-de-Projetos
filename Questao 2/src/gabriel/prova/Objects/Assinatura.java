package gabriel.prova.Objects;

import gabriel.prova.Interface.ComprovanteFiscal;
import gabriel.prova.Interface.Factory;
import gabriel.prova.Interface.Pagamento;
import gabriel.prova.Interface.TermoPrivacidade;

public class Assinatura {

    private ComprovanteFiscal COMPROVANTE_FISCAL;
    private Pagamento PAGAMENTO;
    private TermoPrivacidade TERMO_PRIVACIDADE;

    public Assinatura(Factory factory) {
        COMPROVANTE_FISCAL = factory.criarComprovanteFiscal();
        PAGAMENTO = factory.criarPagamento();
        TERMO_PRIVACIDADE = factory.criarTermoPrivacidade();
    }

    public void Ativar() {
        System.out.println(COMPROVANTE_FISCAL.descricao());
        System.out.println(PAGAMENTO.descricao());
        System.out.println(TERMO_PRIVACIDADE.descricao());
    }
}
