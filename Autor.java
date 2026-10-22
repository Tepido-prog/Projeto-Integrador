public class Autor {
    private String nome;
    private String epoca;

    public Autor(String nome, String epoca) {
        this.nome = nome;
        this.epoca = epoca;
    }

    public String getNome() {
        return nome;
    }

    public String getEpoca() {
        return epoca;
    }
}