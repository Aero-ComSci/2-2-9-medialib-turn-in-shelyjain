public class Movie {
    private String title;
    private double duration;
    private int rating;

    //impelement the same methods as Book class
    public Movie(String t, double d) {
        title = t;
        duration = d;
        rating = 0;
    }
    public String getTitle() {
        return title;
    }
    public double getDuration() {
        return duration;
    }
    public int getRating() {
        return rating;
    }
    public String toString() {
        String info = "\"" + title + "\", duration: " + duration + " hours";
        if (rating != 0) {
            info += ", rating is " + rating;
        }
        return info;
    }
    public boolean equals(Movie m){
        return this.title.equals(m.title);
    }
    /*** Mutator methods ***/
    public void setTitle(String t) {
        title = t;
    }
    public void setDuration(double d) {
        duration = d;
    }
    public int adjustRating(int r) {
        rating += r;
        if (rating < 0) {
            rating = 0;
        }
        if (rating > 10) {
            rating = 10;
        }
        return rating;
    }


}