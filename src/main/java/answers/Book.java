package answers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Book {

    /* 1 */

    // Add three properties to this Book class:
    // - A title
    // - An author
    // - A year of publishing
    // What data types do these properties have?

    private String title;
    private String author;
    private int yearOfPublishing;

    /* 2 */

    // Add a constructor that enables you to pass
    // a value for each property as an argument

    // Add a no-argument constructor
    // Specify a default value for each property

    public Book(String title, String author, int yearOfPublishing) {

        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    /* 3 */

    // Write a method that sets the year of publishing to the current year
    // You can easily get this using
    //     Calendar.getInstance().get(Calendar.YEAR);
    // Do you need parameters?
    // What is the return type of the method?

    public void setYearOfPublishingToCurrentYear() {

        this.yearOfPublishing = Calendar.getInstance().get(Calendar.YEAR);
    }

    // Write a method that allows you to overwrite the author with a specified author name
    // Do you need parameters?
    // What is the return type of the method?

    public void setAuthor(String author) {

        this.author = author;
    }

    /* 4 */

    // Write a method that creates and fills an array of books
    // Three elements is enough!
    // You can use any title, author and year of publishing you want

    public void anArrayOfBooks() {

        Book[] bookArray = new Book[3];

        bookArray[0] = new Book("The Fellowship of the Ring", "J.R.R. Tolkien", 1954);
        bookArray[1] = new Book("The Two Towers", "J.R.R. Tolkien", 1954);
        bookArray[2] = new Book("The Return of the King", "J.R.R. Tolkien", 1955);
    }

    // Write a method that creates and fills a list of books
    // Three elements is enough!
    // You can use any title, author and year of publishing you want

    public void aListOfBooks() {

        List<Book> bookList = new ArrayList<Book>();

        bookList.add(new Book("The Girl with the Dragon Tattoo", "Stieg Larsson", 2005));
        bookList.add(new Book("The Girl Who Played with Fire", "Stieg Larsson", 2006));
        bookList.add(new Book("The Girl Who Kicked the Hornet's Nest", "Stieg Larsson", 2007));
    }
}
