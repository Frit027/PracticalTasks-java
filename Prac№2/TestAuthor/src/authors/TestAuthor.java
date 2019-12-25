package authors;

public class TestAuthor {

    public static void main(String[] args) {
        Author authorMan = new Author("Fyodor Dostoevsky", "dostoevsky@gmail.com", 'M');
        Author authorWoman = new Author("Maria Tinkova","mail@mail.ru",'F');

        System.out.println(authorMan);
        System.out.println(authorWoman);
        System.out.println(authorMan.getGender());

        authorMan.setEmail("frit_027@mail.ru");
        authorWoman.setEmail("qwerty@gmail.com");

        System.out.println(authorMan);
        System.out.println(authorWoman);
    }
}
