package Dia010.Associacao;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.professores = professores;
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println("------------------");
        if (professores == null) return; {

            for (Professor professor : professores) {
                System.out.println(professor.getNome());
            }

        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
