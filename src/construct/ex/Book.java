package construct.ex;

public class Book {

  String name;
  String author;
  int page;

  public Book() {
  }

  public Book(String name, String author) {
    this(name,author, 0);
  }

  public Book(String name, String author, int page) {
    this.name = name;
    this.author = author;
    this.page = page;
  }

  void diplayInfo() {
    System.out.printf("제목: %s, 저자: %s, 페이지: %d\n", name, author, page);
  }


}
