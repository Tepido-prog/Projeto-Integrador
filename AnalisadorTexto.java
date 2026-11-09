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

        int maiorPontuacao = 0;
        Regra melhorRegra = null;

    for (Regra regra : repositorioRegras.getRegras()) {

    int pontuacao = regra.calcularPontuacao(texto.getConteudo());

    if (pontuacao > maiorPontuacao) {

        maiorPontuacao = pontuacao;
        melhorRegra = regra;

    }
}

    if (melhorRegra != null) {

        Autor autor = melhorRegra.getAutor();
        Conceito conceito = melhorRegra.getConceito();

        //teste
        System.out.println("Pontuação: " + maiorPontuacao);
        
        System.out.println("Possível autor associado: " + autor.getNome());
        System.out.println("Época: " + autor.getEpoca());
        System.out.println("Tema: " + melhorRegra.getTema());
        System.out.println("Conceito: " + conceito.getNome());
        System.out.println("Explicação: " + conceito.getExplicacao());

} else {

    System.out.println("Nenhuma regra correspondente foi encontrada.");

}

    System.out.println("----------------------------------------");

    System.out.println("\n========================================");
    System.out.println("       DICIONÁRIO FILOSÓFICO");
    System.out.println("========================================");

    dicionario.buscarNoTexto(texto.getConteudo());
    }
}
