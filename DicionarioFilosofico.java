import java.util.HashMap;

public class DicionarioFilosofico {

    private HashMap<String, String> termos;

    public DicionarioFilosofico() {
        termos = new HashMap<>();

        termos.put(
            "parir ideias",
            "Expressão associada à maiêutica socrática, método baseado em perguntas para auxiliar o indivíduo a desenvolver suas próprias ideias."
        );

        termos.put(
            "eudaimonia",
            "Conceito grego associado à felicidade, ao florescimento humano e à realização de uma vida virtuosa."
        );
    }

    public String buscar(String termo) {

    String significado = termos.get(termo.toLowerCase());

    if (significado == null) {
        return "Termo não encontrado.";
    }

    return significado;
}
}