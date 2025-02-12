public class Main {
    public static void main(String[] args) {
        Author Tolstoy = new Author("Лев", "Толстой");
        Author Pushkin = new Author("Александр", "Пушкин");
        Book Karenina = new Book("Анна Каренина", Tolstoy, 1877);
        Book Onegin = new Book("Евгений Онегин", Pushkin, 1830);

        System.out.println("Книга 1: " + Karenina.getTitle() + " (" + Karenina.getAuthor().getFirstName() + " " + Karenina.getAuthor().getLastName() + ", " + Karenina.getPublicationYear() + ")");
        System.out.println("Книга 2: " + Onegin.getTitle() + " (" + Onegin.getAuthor().getFirstName() + " " + Onegin.getAuthor().getLastName() + ", " + Onegin.getPublicationYear() + ")");

        Onegin.setPublicationYear(1831);
        System.out.println("Книга 2 (после изменения года публикации): " + Onegin.getTitle() + " (" + Onegin.getAuthor().getFirstName() + " " + Onegin.getAuthor().getLastName() + ", " + Onegin.getPublicationYear() + ")");

        System.out.println("Книга 1: " + Karenina);
        System.out.println("Автор 1: " + Tolstoy);

        System.out.println("Автор 1 равен автору 2: " + Tolstoy.equals(Pushkin));
        System.out.println("hashCode автора 1: " + Tolstoy.hashCode());
        System.out.println("hashCode автора 2: " + Pushkin.hashCode());

        System.out.println("Книга 1 равна книге 2: " + Karenina.equals(Onegin));
        System.out.println("hashCode книги 1: " + Karenina.hashCode());
        System.out.println("hashCode книги 2: " + Onegin.hashCode());

    }
}