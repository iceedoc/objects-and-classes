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
    }
}