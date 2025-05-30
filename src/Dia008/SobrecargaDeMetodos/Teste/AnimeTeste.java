package Dia008.SobrecargaDeMetodos.Teste;

import Dia008.SobrecargaDeMetodos.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //anime.init("Akuma Drive", "TV", 12);
        anime.init("Akuma Drive", "TV", 12, "Açao");
        anime.imprime();

    }
}
