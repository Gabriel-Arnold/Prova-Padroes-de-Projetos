package gabriel.prova.object;

import java.util.HashMap;

public abstract class Frete {

    protected String cliente;
    protected String modalidade;
    protected double valorDaCarga;
    protected HashMap<String, String> documentos = new HashMap<>();

    public Frete() {}

    public double calcularFrete() { return this.valorDaCarga; }

    public void imprimirResumo() {
        System.out.println("Modalidade: " + modalidade);
        System.out.println("Cliente: " + cliente);
        String docs = "";
        for (String key : documentos.keySet()) {
            if(docs != "") docs = docs + ",";
            docs = docs + key;
        }
        System.out.println("Tipos de Documentos Nescessários: " + docs);
        for (String key : documentos.keySet()) {
            System.out.println(key + ": " + documentos.get(key));
        }
        System.out.println("Valor do Frte: " + calcularFrete());
    }
}
