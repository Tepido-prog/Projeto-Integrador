import java.util.Scanner;

//ANTES DE RODAR O PROGRAMA, CRIE UM NOVO TERMINAL E DIGITE ESSAS LINHAS DE CÓDIGO:
//chcp 65001
//javac -encoding UTF-8 *.java
//java Main

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
