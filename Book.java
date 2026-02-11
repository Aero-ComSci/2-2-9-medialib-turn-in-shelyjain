/*
 * Activity 2.2.7
 *
 * A Book class for the MediaLibrary program
 */
public class Book
{
  private String title;
  private String author;
  private int rating;
  
  /*** Constructor ****/
  public Book(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
    System.out.println("Adding book " + t);
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", written by " + author;
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  public boolean equals(Book b){
      //You Book equals method should use conditional expressions and the String equals method to compare the instance variable title to the parameter b's title. Do the same for the author.
      return this.title.equals(b.title) && this.author.equals(b.author);
  }
  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setAuthor(String a) {
    author = a;
  }

  public int adjustRating(int r) {
      int newRating = rating + r;
      if (newRating >= 0 && newRating <= 10) {
          rating = newRating;
      }
      System.out.println("Adjusting rating by " + r);
      return rating;
  }
}
