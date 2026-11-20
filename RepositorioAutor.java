import java.util.ArrayList;

public class RepositorioAutor {

        private ArrayList<Autor> autores = new ArrayList<>();
    
        public RepositorioAutor() {

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

        Autor efeso = new Autor(
            "Heráclito de Éfeso",
            "Filosofia Antiga (Período Pré-Socrático)"
        );

        Autor demo = new Autor(
            "Demócrito",
            "Filosofia Antiga (Período Pré-Socrático)"
        );

        Autor seneca = new Autor(
            "Sêneca",
            "Filosofia Antiga"
        );

        Autor nicolau = new Autor(
            "Nicolau Maquiavel",
            "Filosofia Moderna"
        );

        Autor bacon = new Autor(
            "Francis Bacon",
            "Filosofia Moderna"
        );

        Autor baruch = new Autor(
            "Baruch Spinoza",
            "Filosofia Moderna"
        );

        Autor locke = new Autor(
            "John Locke",
            "Filosofia Moderna"
        );

        Autor david = new Autor(
            "David Hume",
            "Filosofia Moderna"
        );

        Autor jean = new Autor(
            "Jean-Jacques Rousseau",
            "Filosofia Moderna"
        );

        Autor karl = new Autor(
            "Karl Marx",
            "Filosofia Contemporânea"
        );

        Autor georg = new Autor(
            "Georg Wilhelm Friedrich Hegel",
            "Filosofia Contemporânea"
        );

        Autor hannah = new Autor(
            "Hannah Arendt",
            "Filosofia Contemporânea"
        );

        Autor michel = new Autor(
            "Michel Foucault",
            "Filosofia Contemporânea"
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
        autores.add(efeso);
        autores.add(demo);
        autores.add(seneca);
        autores.add(nicolau);
        autores.add(bacon);
        autores.add(baruch);
        autores.add(locke);
        autores.add(david);
        autores.add(jean);
        autores.add(karl);
        autores.add(georg);
        autores.add(hannah);
        autores.add(michel);
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
