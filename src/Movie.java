
enum Rating {
    EXCELLENT,
    GOOD,
    POOR,

}

public class Movie {
    String title;
    Rating rate;

    public Movie(String title, String rate) {
        this.title = title;
        this.rate = Rating.valueOf(rate);
    }

    public void displayRating() {
        System.out.println("Movie title : " + title + ",  Movie rate : " + rate + " ");

    }
}
