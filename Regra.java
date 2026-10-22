import java.util.ArrayList;
import java.util.Arrays;

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

    // Verifica se pelo menos uma palavra-chave aparece no texto
    public boolean verificar(String texto) {

        String textoMinusculo = texto.toLowerCase();

        for (String palavra : palavrasChave) {

            if (textoMinusculo.contains(palavra.toLowerCase())) {
                return true;
            }
        }

        return false;
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