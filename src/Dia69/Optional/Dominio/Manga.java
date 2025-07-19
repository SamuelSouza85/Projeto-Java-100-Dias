package Dia69.Optional.Dominio;

public class Manga {
    private Integer ID;
    private String title;
    private int chapters;

    public Manga(Integer ID, String title, int chapters) {
        this.ID = ID;
        this.title = title;
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "ID=" + ID +
                ", title='" + title + '\'' +
                ", chapters=" + chapters +
                '}';
    }

    public Integer getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public int getChapters() {
        return chapters;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }
}
