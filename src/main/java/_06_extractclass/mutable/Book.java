package _06_extractclass.mutable;


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

    /**
     * 저자 정보를 변경하면 곤란한 상황일 경우에는 Author 가 아닌 ImmutableAuthor 객체로 author 필드값을 넘긴다.
     *  - ImmutableAuthor 인터페이스는 setName 이나 setMail 같은 세터 메서드가 없다.
     *  - 그러므로 getAuthor 메서드의 반환값으로 저자 정보를 변경하는 코드를 작성하면 컴파일할 때 에러가 발생
     */
    public ImmutableAuthor getAuthor() {
        return author;
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
