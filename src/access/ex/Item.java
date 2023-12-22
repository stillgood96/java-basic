package access.ex;

public class Item {

  private String name;
  private int price;
  private int ea;

  public Item(String name, int price, int ea) {
    this.name = name;
    this.price = price;
    this.ea = ea;
  }

  public int showItem() {

    System.out.printf("상품명: %s, 합계: %d\n", name, price * ea);

    return price * ea;
  }
}
