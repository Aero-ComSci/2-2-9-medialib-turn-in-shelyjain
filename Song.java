public class Song {

    private String title;
    private double rating;
    
    public Song(String title){
        this.title = title;
        this.rating = 0;
    } 
    public String getTitle() {
        return title;
    }
    public double getRating() {
        return rating;
    }

    //add all the Book methods to the Song class, but change the instance variables to match the Song class. For example, instead of a setAuthor method, you would have a setRating method.
    public String toString() {
        String info = "\"" + title + "\"";
        if (rating != 0) {
            info += ", rating is " + rating;
        }
        return info;
        }
    public boolean equals(Song s){
        return this.title.equals(s.title);
    }
    /*** Mutator methods ***/
    public void setTitle(String title) {
        this.title = title;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public double adjustRating(double r) {
        double newRating = rating + r;
        if (newRating < 0) {
            rating = 0;
        } else if (newRating > 10) {
            rating = 10;
        } else {
            rating = newRating;
        }
        return rating;
    }
}