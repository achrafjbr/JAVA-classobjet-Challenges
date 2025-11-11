
enum Rating {
    EXCELLENT,
    GOOD,
    POOR,

}

public class Movie {
    String title;
    int rate;

    public Movie(String title, int rate) {
        this.title = title;
        this.rate = rate;
    }

    public void displayRating() {
        System.out.println("Movie title : " + title + ",  Movie rate : " + rate + " ");

        if(rate> 8){
            System.out.println("Movie title : " + title + ",  Movie rate : " + Rating.EXCELLENT + " ");
        }else if (rate <8 && rate >5){
            System.out.println("Movie title : " + title + ",  Movie rate : " + Rating.GOOD + " ");
        }else{
            System.out.println("Movie title : " + title + ",  Movie rate : " + Rating.POOR + " ");
        }

    }
}
