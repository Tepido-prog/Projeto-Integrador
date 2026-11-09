public class AnalisadorTexto {

    private RepositorioAutor repositorioAutor;
    private RepositorioConceito repositorioConceito;
    private RepositorioRegras repositorioRegras;
    private DicionarioFilosofico dicionario = new DicionarioFilosofico();

    public AnalisadorTexto() {

        repositorioAutor = new RepositorioAutor();

        repositorioConceito = new RepositorioConceito();

        repositorioRegras = new RepositorioRegras(
            repositorioAutor,
            repositorioConceito
        );
    }

    public void analisar(Texto texto) {

        System.out.println("Texto recebido: " + texto.getConteudo());
        System.out.println("Quantidade de regras: " + repositorioRegras.getRegras().size());

        System.out.println("========================================");
        System.out.println("          ANÁLISE FILOSÓFICA");
        System.out.println("========================================");

        boolean encontrou = false;

        for (Regra regra : repositorioRegras.getRegras()) {

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

        System.out.println("\n========================================");
System.out.println("       DICIONÁRIO FILOSÓFICO");
System.out.println("========================================");

dicionario.buscarNoTexto(texto.getConteudo());
    }
}
