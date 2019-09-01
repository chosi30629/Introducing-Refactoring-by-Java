package _06_extractclass.example.before;


public class Book {
    private String title;
    private String isbn;
    private String price;
    private String authorName;
    private String authorEmail;


    public Book(String title, String isbn, String price, String authorName, String authorEmail) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.authorName = authorName;
        this.authorEmail = authorEmail;
    }


    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPrice() {
        return price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String toXml() {
        String author =
            tag("author", tag("name", authorName) + tag("mail", authorEmail));

        String book =
            tag("book", tag("title", title) + tag("isbn", isbn) + tag("price", price) + author);

        return book;
    }

    private String tag(String element, String content) {
        return "<" + element + ">" + content + "</" + element + ">";
    }

}
