import java.util.ArrayList;

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

    // Print que mostra TODOS os autores que pontuaram e não pontuaram.
    // System.out.println(
        // regra.getAutor().getNome() + ": " + pontuacao + " pontos"
    // );

    if (pontuacao > maiorPontuacao) {

        maiorPontuacao = pontuacao;
        melhorRegra = regra;
    }
}

    if (melhorRegra != null) {

        Autor autor = melhorRegra.getAutor();
        Conceito conceito = melhorRegra.getConceito();

        // Teste para saber quantos pontos o autor identificado fez. 
        // System.out.println("Pontuação: " + maiorPontuacao);
        
        System.out.println("Possível autor associado: " + autor.getNome());
        System.out.println("Época: " + autor.getEpoca());
        System.out.println("Tema: " + melhorRegra.getTema());
        System.out.println("Conceito: " + conceito.getNome());
        System.out.println("Explicação: " + conceito.getExplicacao());

} else {

    System.out.println("Nenhuma regra correspondente foi encontrada.");

}
    mostrarTop3(texto);

    System.out.println("----------------------------------------");

    System.out.println("\n========================================");
    System.out.println("       DICIONÁRIO FILOSÓFICO");
    System.out.println("========================================");

    dicionario.buscarNoTexto(texto.getConteudo());
    }

    private void mostrarTop3(Texto texto) {

    ArrayList<Autor> autores = new ArrayList<>();
    ArrayList<Integer> pontuacoes = new ArrayList<>();

    // Agrupa as pontuações por autor
    for (Regra regra : repositorioRegras.getRegras()) {

        int pontuacao = regra.calcularPontuacao(
            texto.getConteudo()
        );

        Autor autor = regra.getAutor();

        int indice = -1;

        for (int i = 0; i < autores.size(); i++) {
            if (autores.get(i).getNome().equals(autor.getNome())) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            autores.add(autor);
            pontuacoes.add(pontuacao);
        } else {
            pontuacoes.set(
                indice,
                pontuacoes.get(indice) + pontuacao
            );
        }
    }

    // Ordena do maior para o menor
    for (int i = 0; i < pontuacoes.size(); i++) {
        for (int j = i + 1; j < pontuacoes.size(); j++) {

            if (pontuacoes.get(j) > pontuacoes.get(i)) {

                int tempPontuacao = pontuacoes.get(i);
                pontuacoes.set(i, pontuacoes.get(j));
                pontuacoes.set(j, tempPontuacao);

                Autor tempAutor = autores.get(i);
                autores.set(i, autores.get(j));
                autores.set(j, tempAutor);
            }
        }
    }

    System.out.println("\n========== TOP 3 FILÓSOFOS ==========");

    int limite = Math.min(3, autores.size());

    for (int i = 0; i < limite; i++) {

        if (pontuacoes.get(i) > 0) {
            System.out.println(
                (i + 1) + "º - " + autores.get(i).getNome()
                + " | " + pontuacoes.get(i) + " pontos"
            );
        }
    }
}
}
