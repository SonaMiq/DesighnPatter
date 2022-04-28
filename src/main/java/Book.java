public final class Book {

    private final String title;
    private final String genre;
    private final String author;
    private final String publishYear;
    private final String desc;


    public Book(String title, String genre, String author, String publishYear, String desc) {

        this.title = title;
        this.genre = genre;
        this.author = author;
        this.publishYear = publishYear;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public String getDesc() {
        return desc;
    }
}
