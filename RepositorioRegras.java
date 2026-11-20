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
        Autor tales = repositorioAutores.buscarPorNome("Tales de Mileto");
        Autor pita = repositorioAutores.buscarPorNome("Pitágoras de Samos");
        Autor parm = repositorioAutores.buscarPorNome("Parmênides");
        Autor efeso = repositorioAutores.buscarPorNome("Heráclito de Éfeso");
        Autor demo = repositorioAutores.buscarPorNome("Demócrito");
        Autor seneca = repositorioAutores.buscarPorNome("Sêneca");
        Autor nicolau = repositorioAutores.buscarPorNome("Nicolau Maquiavel");
        Autor bacon = repositorioAutores.buscarPorNome("Francis Bacon");
        Autor baruch = repositorioAutores.buscarPorNome("Baruch Spinoza");
        Autor john = repositorioAutores.buscarPorNome("John Locke");
        Autor david = repositorioAutores.buscarPorNome("David Hume");
        Autor jean = repositorioAutores.buscarPorNome("Jean-Jacques Rousseau");
        Autor karl = repositorioAutores.buscarPorNome("Karl Marx");
        Autor georg = repositorioAutores.buscarPorNome("Georg Wilhelm Friedrich Hegel");
        Autor hannah = repositorioAutores.buscarPorNome("Hannah Arendt");
        Autor michel = repositorioAutores.buscarPorNome("Michel Foucault");


        Conceito virtude = repositorioConceitos.buscarPorNome("Virtude");
        Conceito mundoIdeias = repositorioConceitos.buscarPorNome("Mundo das Ideias");
        Conceito maiêutica = repositorioConceitos.buscarPorNome("Maiêutica");
        Conceito estoicismo = repositorioConceitos.buscarPorNome("Estoicismo");
        Conceito existencialismo = repositorioConceitos.buscarPorNome("Existencialismo");
        Conceito duvidaMetodica = repositorioConceitos.buscarPorNome("Dúvida Metódica");
        Conceito hedonismo = repositorioConceitos.buscarPorNome("Hedonismo");
        Conceito imperativo = repositorioConceitos.buscarPorNome("Imperativo Categórico");
        Conceito niilismo = repositorioConceitos.buscarPorNome("Niilismo");
        Conceito contratoSocial = repositorioConceitos.buscarPorNome("Contrato Social");
        Conceito arche = repositorioConceitos.buscarPorNome("Arché");
        Conceito harmoniaMatematica = repositorioConceitos.buscarPorNome("Harmonia Matemática");
        Conceito imobilismo = repositorioConceitos.buscarPorNome("Imobilismo");
        Conceito devir = repositorioConceitos.buscarPorNome("Devir");
        Conceito atomismo = repositorioConceitos.buscarPorNome("Atomismo");
        Conceito realismoPolitico = repositorioConceitos.buscarPorNome("Realismo Político");
        Conceito substancia = repositorioConceitos.buscarPorNome("Substância");
        Conceito materialismoHistorico = repositorioConceitos.buscarPorNome("Materialismo Histórico");
        Conceito totalitarismo = repositorioConceitos.buscarPorNome("Totalitarismo");
        Conceito empirismo = repositorioConceitos.buscarPorNome("Empirismo");
        Conceito ceticismo = repositorioConceitos.buscarPorNome("Ceticismo");
        Conceito dialetica = repositorioConceitos.buscarPorNome("Dialética");
        Conceito poderEsaber = repositorioConceitos.buscarPorNome("Poder e Saber");



        //  LISTA DE REGRAS
        regras.add(new Regra(
        new ArrayList<>(Arrays.asList(
            "virtude",
            "felicidade",
            "hábitos",
            "hábito",
            "justiça",
            "razão",
            "animal político",
            "justo meio",
            "causa final",
            "potência e ato"
        )),
    "Ética",
    virtude,
    aristoteles
));

        regras.add(new Regra(
        new ArrayList<>(Arrays.asList(
            "mundo das ideias",
            "formas perfeitas",
            "realidade inteligível",
            "sentidos",
            "alegoria",
            "caverna",
            "sombras",
            "mundo sensível",
            "alegoria da caverna",
            "mundo inteligível",
            "alma imortal",
            "ideia do Bem",
            "filósofo-rei"

    )),
    "Conhecimento",
    mundoIdeias,
    plato
));

        regras.add(new Regra(
        new ArrayList<>(Arrays.asList(
            "maiêutica",
            "fazer perguntas",
            "questionamento",
            "examinar ideias",
            "reflexão",
            "refletir",
            "opinião verdadeira",
            "opiniões",
            "só sei que nada sei",
            "ignorância",
            "vida não examinada",
            "conhece-te a ti mesmo",
            "examinar a própria vida",
            "reconhecer a própria ignorância"
    )),
    "Conhecimento",
    maiêutica,
    socrates
));

        regras.add(new Regra(
        new ArrayList<>(Arrays.asList(
            "liberdade",
            "escolhas",
            "escolha",
            "facticidade",
            "responsabilidade",
            "existência",
            "consequências",
            "existência precede a essência",
            "ser-para-si",
            "ser-em-si",
            "má-fé",
            "condenado a ser livre",
            "a existência precede a essência"
    )),
    "Liberdade e existência",
    existencialismo,
    sartre
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "dúvida metódica",
        "verdade indubitável",
        "certeza indubitável",
        "cogito",
        "res cogitans",
        "res extensa",
        "dúvida sistemática",
        "dúvida hiperbólica",
        "fundamento seguro do conhecimento",
        "eu penso, logo existo",
        "penso, logo existo",
        "gênio maligno",
        "gênio enganador",
        "coisa pensante",
        "ideias claras e distintas",
        "ideias inatas",
        "substância pensante",
        "substância extensa"
    )),
    "Conhecimento",
    duvidaMetodica,
    rene
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "ataraxia",
        "aponia",
        "prazer",
        "prazer moderado",
        "ausência de sofrimento",
        "ausência de dor",
        "tranquilidade",
        "tranquilidade da alma",
        "desejo",
        "desejos",
        "moderação dos desejos",
        "medo da morte",
        "temer a morte",
        "felicidade",
        "desejos naturais e necessários",
        "desejos naturais e não necessários",
        "desejos vãos"
    )),
    "Ética e Felicidade",
    hedonismo,
    epicuro
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "imperativo categórico",
        "imperativo hipotético",
        "obrigação",
        "dever moral",
        "lei universal",
        "agir por dever",
        "heteronomia",
        "moral",
        "incondicional e universal",
        "númeno",
        "princípios universais",
        "coisa em si",
        "maioridade intelectual",
        "juízos sintéticos a priori",
        "autonomia da vontade",
        "uso público da razão",
        "ousar saber",
        "aprenda a filosofar, não a filosofia"
    )),
    "Ética e Moral",
    imperativo,
    kant
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "niilismo",
        "valores",
        "decadência",
        "super-homem",
        "ressentimento",
        "poder",
        "amor fati",
        "Deus está morto",
        "valores tradicionais",
        "crise dos valores",
        "eterno retorno",
        "vontade de potência",
        "moral dos senhores",
        "moral dos escravos",
        "transvaloração dos valores",
        "aquilo que não me mata, me fortalece"
    )),
    "Crítica dos Valores",
    niilismo,
    fried
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "natureza",
        "contrato social",
        "guerra",
        "pacto",
        "conflito",
        "segurança",
        "soberano",
        "soberania",
        "poder soberano",
        "poder absoluto",
        "guerra de todos contra todos",
        "poder comum",
        "medo da morte violenta",
        "homem é o lobo do homem"
    )),
    "Política e Sociedade",
    contratoSocial,
    thomas
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "água",
        "rio",
        "correnteza",
        "origem",
        "princípio",
        "cosmos",
        "natureza",
        "arché",
        "água como princípio",
        "substância primordial",
        "elemento primordial",
        "tudo se origina da água",
        "princípio de todas as coisas",
        "essência"
    )),
    "Origem do Universo",
    arche,
    tales
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "números",
        "harmonia das esferas",
        "número como princípio",
        "transmigração da alma",
        "metempsicose",
        "tetraktys",
        "matemática",
        "harmonia",
        "proporção"
    )),
    "Matemática e Realidade",
    harmoniaMatematica,
    pita
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "ser",
        "não-ser",
        "imutável",
        "imutabilidade",
        "permanência",
        "o ser é",
        "o não-ser não é",
        "pensamento e ser",
        "caminho da verdade",
        "caminho da opinião"
    )),
    "Natureza do Ser",
    imobilismo,
    parm
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "logos",
        "mudança",
        "rio",
        "transformação",
        "fluir",
        "fluindo",
        "movimento",
        "devir",
        "oposição",
        "tudo flui",
        "unidade dos contrários",
        "harmonia dos opostos",
        "fogo sempre vivo",
        "nada é permanente, exceto a mudança"
    )),
    "Transformação da Realidade",
    devir,
    efeso
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "átomos",
        "átomos e vazio",
        "realidade dos átomos",
        "por convenção",
        "vazio",
        "vácuo",
        "partículas",
        "matéria",
        "partículas indivisíveis",
        "movimento dos átomos",
        "composição da matéria"
    )),
    "Natureza da Matéria",
    atomismo,
    demo
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "estoicismo",
        "razão",
        "autocontrole",
        "virtude",
        "morte",
        "emoções",
        "tempo que nos resta",
        "brevidade da vida",
        "domínio das paixões",
        "viver conforme a natureza"
    )),
    "Ética e Autocontrole",
    estoicismo,
    seneca
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "poder",
        "governante",
        "governo",
        "Estado",
        "milícia",
        "política",
        "príncipe",
        "estabilidade política",
        "fortuna e virtù",
        "conservar o Estado",
        "aparência de virtude",
        "manutenção do poder"
    )),
    "Filosofia Política",
    realismoPolitico,
    nicolau
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "experiência",
        "observação",
        "experimento",
        "experimentação",
        "indução",
        "domínio da natureza",
        "interpretação da natureza",
        "ídolos da mente",
        "ídolos da tribo",
        "ídolos da caverna",
        "ídolos do foro",
        "ídolos do teatro"
    )),
    "Conhecimento Científico",
    empirismo,
    bacon
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "substância",
        "substância única",
        "Deus",
        "natureza",
        "liberdade",
        "razão",
        "afetos",
        "conatus",
        "Deus ou Natureza",
        "causa de si",
        "natureza naturante",
        "natureza naturada",
        "esforço de perseverar"
    )),
    "Natureza e Existência",
    substancia,
    baruch
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "tábula rasa",
        "ideias inatas",
        "experiências",
        "origem",
        "sensações",
        "reflexão",
        "qualidade primária",
        "qualidade secundária",
        "origem das ideias",
        "mente",
        "conhecimento",
        "folha em branco",
        "ideias simples",
        "ideias complexas",
        "estado de natureza",
        "consentimento dos governados"
    )),
    "Origem do Conhecimento",
    empirismo,
    john
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "causalidade",
        "relação de causa e efeito",
        "impressão",
        "impressões",
        "percepção",
        "hábito",
        "costume",
        "ceticismo",
        "experiência",
        "relações de ideias",
        "questões de fato",
        "conexão necessária",
        "hábito e costume",
        "associação de ideias"
    )),
    "Conhecimento e Experiência",
    ceticismo,
    david
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "contrato social",
        "soberania",
        "igualdade",
        "liberdade",
        "pacto social",
        "cidadania",
        "corpo político",
        "vontade geral",
        "vontade particular",
        "bem comum",
        "soberania do povo",
        "liberdade civil",
        "o homem nasce livre",
        "construção da vontade geral",
        "desigualdade entre os homens"
    )),
    "Política e Sociedade",
    contratoSocial,
    jean
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "capitalismo",
        "classes sociais",
        "burguesia",
        "alienação",
        "mercadoria",
        "capital",
        "proletariado",
        "exploração",
        "mais-valia",
        "fetichismo da mercadoria",
        "força de trabalho",
        "meios de produção",
        "luta de classes"
    )),
    "Sociedade e Economia",
    materialismoHistorico,
    karl
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "idealismo absoluto",
        "filosofia do espírito",
        "espírito",
        "espírito objetivo",
        "espírito subjetivo",
        "espírito absoluto",
        "suprassunção",
        "histórico",
        "histórica",
        "autoconsciência",
        "movimento dialético",
        "superação das contradições",
        "processo dialético",
        "senhor e escravo",
        "consciência de si",
        "reconhecimento mútuo",
        "desenvolvimento da consciência"
    )),
    "Desenvolvimento Histórico",
    dialetica,
    georg
));

regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "totalitarismo",
        "política",
        "liberdade",
        "vita activa",
        "vita contemplativa",
        "poder",
        "labor",
        "ação",
        "responsabilidade individual",
        "banalidade do mal",
        "espaço público",
        "pluralidade humana",
        "condição humana",
        "vida ativa"
    )),
    "Política e Responsabilidade",
    totalitarismo,
    hannah
));

// FOUCAULT - PODER DISCIPLINAR
regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "poder disciplinar",
        "disciplina",
        "vigilância",
        "panóptico",
        "panoptismo",
        "corpos dóceis",
        "normalização",
        "punição",
        "instituições disciplinares",
        "controle dos corpos",
        "observação hierárquica",
        "exame",
        "microfísica do poder"
    )),
    "Poder e Sociedade",
    poderEsaber,
    michel
));

// FOUCAULT - ARQUEOLOGIA DO SABER
regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "arqueologia do saber",
        "formação discursiva",
        "prática discursiva",
        "enunciado",
        "discurso",
        "episteme",
        "condições de existência",
        "regras de formação",
        "campo discursivo",
        "arquivo"
    )),
    "Conhecimento e Discurso",
    poderEsaber,
    michel
));

// FOUCAULT - BIOPODER
regras.add(new Regra(
    new ArrayList<>(Arrays.asList(
        "biopoder",
        "biopolítica",
        "população",
        "gestão da vida",
        "controle da população",
        "poder sobre a vida",
        "regulamentação da população",
        "sexualidade",
        "medicina social",
        "mecanismos de segurança"
    )),
    "Poder e Vida",
    poderEsaber,
    michel
));

    }
    public ArrayList<Regra> getRegras() {
        
        return regras;
    }
}
