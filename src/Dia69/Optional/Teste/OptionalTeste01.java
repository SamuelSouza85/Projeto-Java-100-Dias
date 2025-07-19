package Dia69.Optional.Teste;

import Dia69.Optional.Dominio.Manga;
import Dia69.Optional.Repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTeste01 {
    public static void main(String[] args) throws IllegalAccessException {
        Optional<Manga> mangaByTitle = MangaRepository.filterByTitle("One piece");
        mangaByTitle.ifPresent(m -> m.setTitle("One piece 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.filterById(2)
                .orElseThrow(IllegalAccessException::new);

        System.out.println(mangaById);

        Manga newManga = MangaRepository.filterByTitle("Naruto")
                .orElseGet(() -> new Manga(3, "Naruto", 550));
        System.out.println(newManga);
    }
}
