import java.util.Objects;

public class Movie {
    private String Title;
    private int releasedYear;
    private String genre;
    private double ratings;

    public Movie() {
    }

    public Movie(String title, int releasedYear, String genre, double ratings) {
        Title = title;
        this.releasedYear = releasedYear;
        this.genre=genre;
        this.ratings = ratings;
    }

    public String getTitle() {
        return Title;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public String getGenre() {
        return genre;

    }

    public double getRatings() {
        return ratings;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setReleasedYear(int releasedYear) {
        this.releasedYear = releasedYear;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Movie(" +
                "Title='" + Title + '\'' +
                ", releasedYear=" + releasedYear +
                ", genre='" + genre + '\'' +
                ", ratings=" + ratings +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return releasedYear == movie.releasedYear && Double.compare(ratings, movie.ratings) == 0 && Objects.equals(Title, movie.Title) && Objects.equals(genre, movie.genre);
    }

    }

