package Dia009.ModificadorStatic;

public class AnimeEstatico {
    private String nome;
    private static int[] episodios;
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[200];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    public AnimeEstatico(String nome) {
        this.nome = nome;
    }

    public AnimeEstatico() {

        for (int episodios: AnimeEstatico.episodios){
            System.out.println(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}