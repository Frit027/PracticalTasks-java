import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String title, author;
        int pages;

        title = in.nextLine();
        author = in.nextLine();
        pages = in.nextInt();

        Book bookFirst = new Book(title, author, pages);
        Book bookSecond = new Book("The Cherry Orchard","Chekhov");
        Book bookThird = new Book("The Grey Wolf");
        Book bookFourth = new Book();

        bookFourth.setTitle("So said Zarathustra");
        bookFourth.setAuthor("Nietzsche");
        bookFourth.setNumberOfPages(410);

        System.out.println(bookFirst);
        System.out.println(bookSecond);
        System.out.println(bookThird);
        System.out.println(bookFourth);
    }
}


