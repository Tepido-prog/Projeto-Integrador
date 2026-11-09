import java.util.ArrayList;
import java.util.Arrays;

public class RepositorioRegras {

    private ArrayList<Regra> regras = new ArrayList<>();

    public RepositorioRegras(RepositorioAutor repositorioAutores, RepositorioConceito repositorioConceitos) {

        //parâmetros para buscar os objetos.
        Autor aristoteles = repositorioAutores.buscarPorNome("Aristóteles");
        Autor plato = repositorioAutores.buscarPorNome("Platão");
        Autor socrates = repositorioAutores.buscarPorNome("Sócrates");
        Autor sartre = repositorioAutores.buscarPorNome("Jean-Paul Sartre");
        Autor rene = repositorioAutores.buscarPorNome("René Descartes");
        Autor epicuro = repositorioAutores.buscarPorNome("Epicuro");
        Autor kant = repositorioAutores.buscarPorNome("Immanuel Kant");
        Autor fried = repositorioAutores.buscarPorNome("Friedrich Nietzsche");
        Autor thomas = repositorioAutores.buscarPorNome("Thomas Hobbes");

        Conceito virtude = repositorioConceitos.buscarPorNome("Virtude");
        Conceito mundoIdeias = repositorioConceitos.buscarPorNome("Mundo das Ideias");
        Conceito maiêutica = repositorioConceitos.buscarPorNome("Maiêutica");
        Conceito existencialismo = repositorioConceitos.buscarPorNome("Existencialismo");
        Conceito duvidaMetodica = repositorioConceitos.buscarPorNome("Dúvida Metódica");
        Conceito hedonismo = repositorioConceitos.buscarPorNome("Hedonismo");
        Conceito imperativo = repositorioConceitos.buscarPorNome("Imperativo Categórico");
        Conceito niilismo = repositorioConceitos.buscarPorNome("Niilismo");
        Conceito contratoSocial = repositorioConceitos.buscarPorNome("Contrato Social");

        //  LISTA DE REGRAS
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

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "dúvida metódica",
        "dúvida",
        "certeza",
        "verdade indubitável"
    )),
    "Conhecimento",
    duvidaMetodica,
    rene
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "ataraxia",
        "prazer moderado",
        "ausência de sofrimento",
        "tranquilidade da alma",
        "moderação dos desejos"
    )),
    "Tranquilidade",
    hedonismo,
    epicuro
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "imperativo categórico",
        "dever moral",
        "lei universal",
        "agir por dever",
        "princípios universais"
    )),
    "Universalidade",
    imperativo,
    kant
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "niilismo",
        "transvaloração dos valores",
        "valores tradicionais",
        "crise dos valores"
    )),
    "Niilismo",
    niilismo,
    fried
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "estado da natureza",
        "contrato social",
        "soberania",
        "estado de natureza",
        "poder soberano"
    )),
    "Soberania",
    contratoSocial,
    thomas
));

    }
    public ArrayList<Regra> getRegras() {
        
        return regras;
    }
}
