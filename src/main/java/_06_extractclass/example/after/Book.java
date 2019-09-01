package _06_extractclass.example.after;


public class Book {
    private String title;
    private String isbn;
    private String price;
    private Author author;


    public Book(String title, String isbn, String price, String authorName, String authorEmail) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.author = new Author(authorName, authorEmail);
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
        return author.getName();
    }

    public String getAuthorEmail() {
        return author.getMail();
    }

    public void setAuthorName(String name) {
        author.setName(name);
    }

    public void setAuthorEmail(String mail) {
        author.setMail(mail);
    }

    public String toXml() {
        String author =
            tag("author", tag("name", this.author.getName()) + tag("mail", this.author.getMail()));

        String book =
            tag("book", tag("title", title) + tag("isbn", isbn) + tag("price", price) + author);

        return book;
    }

    private String tag(String element, String content) {
        return "<" + element + ">" + content + "</" + element + ">";
    }

}
