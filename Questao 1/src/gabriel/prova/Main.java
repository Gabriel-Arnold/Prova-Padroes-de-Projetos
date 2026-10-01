package gabriel.prova;

import gabriel.prova.object.Aereo;
import gabriel.prova.object.Frete;
import gabriel.prova.object.Maritimo;
import gabriel.prova.object.Rodoviario;

public class Main {

    public static void main(String[] args) {
        Frete a = new Maritimo("Gabriel", 7500, "AGC-0223");
        System.out.println(a.calcularFrete());
        a.imprimirResumo();

        Frete b = new Rodoviario("Adriana", 7500, "AFF-AS23", "MTF-023333");
        System.out.println("\n" +b.calcularFrete());
        b.imprimirResumo();

        Frete c = new Aereo("Carlos", 7500, "OS-GURI-085", "FAT-32");
        System.out.println("\n" + c.calcularFrete());
        c.imprimirResumo();
    }
}
