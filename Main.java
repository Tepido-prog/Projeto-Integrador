import java.util.Scanner;

//chcp 65001
//javac -encoding UTF-8 *.java
//java Main

//A virtude e os habitos sao importantes para alcancar a felicidade.
//A realidade inteligivel e diferente do mundo material, pois o mundo das ideias representa uma realidade superior.
//O ser humano possui liberdade para fazer escolhas e deve assumir a responsabilidade por suas decisoes.
//As nuvens se movimentam lentamente enquanto o vento sopra sobre o campo.

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "UTF-8");

        System.out.println("Digite um texto filosófico:");
        String conteudo = entrada.nextLine();

        Texto texto = new Texto(conteudo);

        AnalisadorTexto analisador = new AnalisadorTexto();
        analisador.analisar(texto);

        entrada.close();
    }
}