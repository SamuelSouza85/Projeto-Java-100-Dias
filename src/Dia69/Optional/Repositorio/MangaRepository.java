package Dia69.Optional.Repositorio;

import Dia69.Optional.Dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "One piece", 1100), new Manga(2, "Black Clover", 250));

    public static Optional<Manga> filterById(Integer id) {
        return filterBy(m -> m.getID().equals(id));
    }

    public static Optional<Manga> filterByTitle(String title) {
        return filterBy(m -> m.getTitle().equals(title));
    }

    private static Optional<Manga> filterBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }

}
