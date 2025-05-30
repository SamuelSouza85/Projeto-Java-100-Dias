package Dia009.BlocoDeInicialização;

public class Manga {
    private String nome;
    private int[] capitulos;
    {
        System.out.println("Dentro do bloco de inicialização");
        capitulos = new int[200];
        for (int i = 0; i < capitulos.length; i++) {
            capitulos[i] = i+1;
        }
    }
    public Manga(String nome) {
        this.nome = nome;
    }

    public Manga() {

        for (int capitulos: this.capitulos){
            System.out.println(capitulos + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int[] capitulos) {
        this.capitulos = capitulos;
    }
}
