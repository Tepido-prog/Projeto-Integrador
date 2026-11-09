import java.util.ArrayList;

public class RepositorioAutor {

        private ArrayList<Autor> autores = new ArrayList<>();
    
        public RepositorioAutor(){

            Autor aristoteles = new Autor(
            "Aristóteles",
            "Filosofia Antiga (Período Clássico)"
        );

        Autor plato = new Autor(
            "Platão",
            "Filosofia Antiga (Período Clássico)"
        );

        Autor socrates = new Autor(
            "Sócrates",
            "Filosofia Antiga (Período Clássico)"
        );

        Autor sartre = new Autor(
            "Jean-Paul Sartre",
            "Filosofia Contemporânea"
        );

        Autor tales = new Autor(
            "Tales de Mileto",
            "Filosofia Antiga (Período Pré-Socrático)"
        );

        Autor pitagoras = new Autor(
            "Pitágoras de Samos",
            "Filosofia Antiga (Período Pré-Socrático)"
        );

        Autor parm = new Autor(
            "Parmênides",
            "Filosofia Antiga (Período Pré-Socrático)"
        );
        
        Autor rene = new Autor(
            "René Descartes",
            "Filosofia Moderna"
        );

        Autor epicuro = new Autor(
            "Epicuro",
            "Filosofia Antiga"
        );

        Autor kant = new Autor(
            "Immanuel Kant",
            "Filosofia Moderna"
        );

        Autor fried = new Autor(
            "Friedrich Nietzsche",
            "Filosofia Contemporânea"
        );

        Autor thomas = new Autor(
        "Thomas Hobbes",
        "Filosofia Moderna"
        );

        autores.add(aristoteles);
        autores.add(plato);
        autores.add(socrates);
        autores.add(sartre);
        autores.add(tales);
        autores.add(pitagoras);
        autores.add(parm);
        autores.add(rene);
        autores.add(epicuro);
        autores.add(kant);
        autores.add(fried);
        autores.add(thomas);
    }

    public ArrayList<Autor> getAutores() {
        
        return autores;
    }

    public Autor buscarPorNome(String nome) {

    for (Autor autor : autores) {

        if (autor.getNome().equalsIgnoreCase(nome)) {
            return autor;
        }
    }

    return null;
}
}
