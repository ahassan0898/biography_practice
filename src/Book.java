public class Book {

    /**
     * COMPLETE THIS CLASS FIRST, THEN CONTINUE WITH AUTHOR AND BIOGRAPHY
     * Create a custom constructor that will take 3 args and defines the Book object
     * Define Book class fields as name, genre, totalPage
     */

    //Create 3 args custom constructor here

    public Book(String name, String genre, int totalPage) { //name of class
        this.name = name;
        this.genre = genre;
        this.totalPage = totalPage;
    }

    //Define instance variables here // features that define an oject

    public String name, genre;
    public int totalPage;


    /*
        Override toString() method that returns Book object information
     */
    //generate-toString(), click on all

    @Override
    public String toString() { // if you delete override method, you will get location because toString is not there anymore
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPage=" + totalPage +
                '}';
    }
}

