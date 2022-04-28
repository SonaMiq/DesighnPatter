public class BookBuilder {

    private  String title;
    private  String genre;
    private  String author;
    private  String publishYear;
    private  String desc;

  public BookBuilder setTitle(String title){
      this.title=title;
      return this;
  }
    public BookBuilder setGenre(String genre){
        this.genre=genre;
        return this;
    }
    public BookBuilder setAuthor(String author){
        this.author=author;
        return this;
    }
    public BookBuilder setPublishYear(String publishYear){
        this.publishYear=publishYear;
        return this;
    }
    public BookBuilder desc(String desc){
        this.desc=desc;
        return this;
    }
    public Book build(){
      return new Book(title,genre,author,publishYear,desc);
    }
}
