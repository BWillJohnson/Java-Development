package Models;

public class Film {
    private int filmID;
    private  String title;
    private String description;
    private int releaseYear;
    private int length;

    public Film(int filmID, String title, String description, int releaseYear, int length) {
        this.filmID = filmID;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.length = length;
    }

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmID=" + filmID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", releaseYear=" + releaseYear +
                ", length=" + length +
                '}';
    }
}
