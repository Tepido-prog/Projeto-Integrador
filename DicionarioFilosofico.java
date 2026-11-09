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

        termos.put(
            "Maiêutica",
            "Método socrático baseado em perguntas."
        );

        termos.put(
            "Virtude",
            "Disposição para agir de maneira excelente."
        );

        termos.put(
            "Existencialismo",
            "Corrente que aborda existência, liberdade e responsabilidade."
        );

        termos.put(
            "Niilismo",
            "Questionamento ou negação de valores e sentidos considerados fundamentais."
        );

        termos.put(
            "Hedonismo",
            "Doutrina que atribui importância ao prazer."
        );

        termos.put(
            "Dúvida Metódica",
            "Método cartesiano de questionamento para alcançar certezas."
        );

        termos.put(
            "Imperativo Categórico",
            "Princípio moral central da filosofia de Kant."
        );

        termos.put(
            "Contrato Social",
            "Acordo que fundamenta a organização da sociedade e a autoridade política."
        );
    }

    public String buscar(String termo) {

    String significado = termos.get(termo.toLowerCase());

    if (significado == null) {
        return "Termo não encontrado.";
    }

    return significado;
}

public void buscarNoTexto(String texto) {

    String textoMinusculo = texto.toLowerCase();

    boolean encontrou = false;

    for (String termo : termos.keySet()) {

        if (textoMinusculo.contains(termo.toLowerCase())) {

            encontrou = true;

            System.out.println("\nTermo filosófico encontrado: " + termo);
            System.out.println("Definição: " + termos.get(termo));
        }
    }

    if (!encontrou) {
        System.out.println("Nenhum termo do dicionário foi encontrado.");
    }
}
}
