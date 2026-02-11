/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
import java.util.Calendar;
public class MediaLib
{
  private Book book;
  public static String owner = "Shely";
  private static int numEntries = 0;
  private Song song;
  private int numSongs = 0;
  private int numBooks = 0;
  private int numMovies = 0;
  private String lastModified;

  public MediaLib() {
    lastModified = lastModifiedDate();
  }

  //In addition to tracking the total items, individually track the number of books, the number of movies, and the number of songs that you have added to all of your libraries.
  public void addSong(Song s)
  {
    song = s;
    numSongs++;
    lastModified = MediaLib.lastModifiedDate();
  }

  public String toString() 
  {
    //override the toString method in your MediaLib to show the state of the library
    String info = "Book: " + book + "\nSong: " + song;
    return info;
  }

  public void addBook(Book b)
  {
    book = b;
    numEntries++;
    lastModified = MediaLib.lastModifiedDate();
  }

  // CODE TO ADD
  public Book getBook()
  {
    return book;
  }
  public boolean equals(MediaLib ml){
      //You MediaLib equals method should use conditional expressions and the Book equals method to compare the instance variable book to the parameter ml's book.
      return this.book.equals(ml.book);
  }

  // public void testBook(Book tester){
  //   // change the title of the tester parameter and use a println to show the book’s title was changed, either printing the entire state of the object or using an accessor method
  //   tester.setTitle("Changed Title");
  //   System.out.println("Tester book title changed to: " + tester.getTitle()); 
  // }

  //modify mediaLib to store and display a movie
  //Create a new private instance variable Movie movie, Add a new method addMovie, Modify the toString method to also show any movie that has been defined
  private Movie movie;
  public void addMovie(Movie m)
  {

    movie = m;
    numEntries++;
    lastModified = MediaLib.lastModifiedDate();
  }

  public String toStringMovie() 
  {
    //override the toString method in your MediaLib to show the state of the library
    String info = "Book: " + book + "\nMovie: " + movie;

    //show the number of books, movies, and songs in the library
    info += "\nNumber of Books: " + numBooks;
    info += "\nNumber of Movies: " + numMovies;
    info += "\nNumber of Songs: " + numSongs;
    info += "\nLast Modified: " + lastModified;
    return info;
  }

  public static String getOwner(){

    //return the owner class variable, not a String literal
    return owner;
  }

  public static void changeOwner(String newOwner){
    //change the owner class variable to the parameter newOwner
    owner = newOwner;
  }
  public static int getNumEntries(){
    //return the numEntries class variable, not a String literal
    return numEntries;
  }
  
  public static String lastModifiedDate(){
    Calendar cal = Calendar.getInstance();
    String dateTimeStr = cal.getTime().toString();
    return dateTimeStr;
    }
    //In MediaLib, use your new class and method. Add a variable for the last modified date/time. This should be an instance variable so that each library gets its own date/time. Add a constructor to set the instance variable using your new class and method. Call your new class method to set the date/time whenever a media item is added to it. Modify toString to include the last modified date of the library.

}