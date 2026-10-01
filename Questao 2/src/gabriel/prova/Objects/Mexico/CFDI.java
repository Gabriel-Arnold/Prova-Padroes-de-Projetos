package gabriel.prova.Objects.Mexico;

import gabriel.prova.Interface.ComprovanteFiscal;

public class CFDI implements ComprovanteFiscal {

    @Override
    public String descricao() {
        return "comprovante fiscal CFDI, IVA de 16%";
    }
}
