public class Book{
    private String title;
    private String author;
    private int numberOfPages;

    public Book(String title, String author, int numberOfPages){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public Book(String title, String author){
        this(title, author, 486);
    }

    public Book(String title){
        this(title, "Unknown", 700);
    }

    public Book(){
        this("", "", 0);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String toString() {
        return "Title: " + title + ". Author: " + author + ". NumberOfPages: " + numberOfPages;
    }
}
