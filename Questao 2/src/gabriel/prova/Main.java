package gabriel.prova;

import gabriel.prova.Objects.Assinatura;
import gabriel.prova.Objects.Brasil.FactoryBrasil;
import gabriel.prova.Objects.Mexico.FactoryMexico;

public class Main {

    public static void main(String[] args) {
        Assinatura a = new Assinatura(new FactoryBrasil());
        a.Ativar();

        Assinatura b = new Assinatura(new FactoryMexico());
        b.Ativar();
    }
}
