import java.util.ArrayList;
import java.util.regex.Pattern;

public class Regra {

    private ArrayList<String> palavrasChave;
    private String tema;
    private Conceito conceito;
    private Autor autor;

    public Regra(
        ArrayList<String> palavrasChave,
        String tema,
        Conceito conceito,
        Autor autor
    ) {
        this.palavrasChave = palavrasChave;
        this.tema = tema;
        this.conceito = conceito;
        this.autor = autor;
    }

    public int calcularPontuacao(String texto) {

    texto = texto.toLowerCase();

    int pontuacao = 0;

    for (String palavra : palavrasChave) {

        String regex = "(?<![\\p{L}\\p{N}])"
                     + Pattern.quote(palavra.toLowerCase())
                     + "(?![\\p{L}\\p{N}])";

        if (Pattern.compile(regex).matcher(texto).find()) {
            pontuacao++;
        }
    }

    return pontuacao;
}

    public String getTema() {
        return tema;
    }

    public ArrayList<String> getPalavrasChave() {
        return palavrasChave;
    }

    public Conceito getConceito() {
        return conceito;
    }

    public Autor getAutor() {
        return autor;
    }
}
