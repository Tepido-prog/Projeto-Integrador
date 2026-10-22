import java.util.ArrayList;
import java.util.Arrays;

public class AnalisadorTexto {

    private ArrayList<Regra> regras = new ArrayList<>();

    public AnalisadorTexto() {

        // ===== AUTORES =====

        Autor aristoteles = new Autor(
            "Aristóteles",
            "Filosofia Antiga"
        );

        Autor plato = new Autor(
            "Platão",
            "Filosofia Antiga"
        );

        Autor socrates = new Autor(
            "Sócrates",
            "Filosofia Antiga"
        );

        Autor sartre = new Autor(
            "Jean-Paul Sartre",
            "Filosofia Contemporânea"
        );


        // ===== CONCEITOS =====

        Conceito virtude = new Conceito(
            "Virtude",
            "Disposição para agir de maneira excelente, relacionada à formação do caráter."
        );

        Conceito mundoIdeias = new Conceito(
            "Mundo das Ideias",
            "Na filosofia platônica, refere-se à realidade inteligível das Formas ou Ideias."
        );

        Conceito maiêutica = new Conceito(
            "Maiêutica",
            "Método socrático que utiliza perguntas para ajudar uma pessoa a examinar e desenvolver suas ideias."
        );

        Conceito existencialismo = new Conceito(
            "Existencialismo",
            "Corrente filosófica que aborda a existência humana, a liberdade e a responsabilidade."
        );

        // ===== REGRAS =====

        regras.add(new Regra(
        new ArrayList<>(Arrays.asList(
            "virtude",
            "felicidade",
            "hábitos",
            "justiça"
        )),
    "Ética",
    virtude,
    aristoteles
));

        regras.add(new Regra(
        new ArrayList<>(Arrays.asList(
            "mundo das ideias",
            "formas perfeitas",
            "realidade inteligível"
    )),
    "Conhecimento",
    mundoIdeias,
    plato
));

        regras.add(new Regra(
        new ArrayList<>(Arrays.asList(
            "maiêutica",
            "fazer perguntas",
            "examinar ideias"
    )),
    "Conhecimento",
    maiêutica,
    socrates
));

        regras.add(new Regra(
        new ArrayList<>(Arrays.asList(
            "liberdade",
            "escolhas",
            "responsabilidade",
            "existência"
    )),
    "Liberdade e existência",
    existencialismo,
    sartre
));

    }

    public void analisar(Texto texto) {

        System.out.println("Texto recebido: " + texto.getConteudo());
System.out.println("Quantidade de regras: " + regras.size());

        System.out.println("========================================");
        System.out.println("          ANÁLISE FILOSÓFICA");
        System.out.println("========================================");

        boolean encontrou = false;

        for (Regra regra : regras) {

            if (regra.verificar(texto.getConteudo())) {

                encontrou = true;

                System.out.println("\nPossível autor associado: "
                    + regra.getAutor().getNome());

                System.out.println("Época: "
                    + regra.getAutor().getEpoca());

                System.out.println("Tema: "
                    + regra.getTema());

                System.out.println("Conceito: "
                    + regra.getConceito().getNome());

                System.out.println("Explicação: "
                    + regra.getConceito().getExplicacao());

                System.out.println("Palavras-chave da regra: "
                    + regra.getPalavrasChave());

                System.out.println("----------------------------------------");
            }
        }

        if (!encontrou) {

            System.out.println("\nNenhuma regra correspondente foi encontrada.");

            System.out.println(
                "Tente inserir um texto com conceitos reconhecidos pelo programa."
            );
        }

        System.out.println("========================================");
    }
}