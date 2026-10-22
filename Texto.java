public class Texto {
    private String conteudo;
    private String autor;
    private String epoca;


    public Texto(String conteudo) {
        this.conteudo = conteudo;
        this.autor = "Desconhecido";
        this.epoca = "Não identificada";
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }
}