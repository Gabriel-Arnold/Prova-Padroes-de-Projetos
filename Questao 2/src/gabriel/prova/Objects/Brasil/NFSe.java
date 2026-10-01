package gabriel.prova.Objects.Brasil;

import gabriel.prova.Interface.ComprovanteFiscal;

public class NFSe implements ComprovanteFiscal {

    @Override
    public String descricao() {
        return "comprovante fiscal NFS-e, ISS de 5%";
    }

}
