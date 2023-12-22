package access.ex;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

  private List<Item> items = new ArrayList<>();


  public void addItem(Item item) {

    if(items.size() < 10) {
      items.add(item);
    }else {
      System.out.println("장바구니가 가득 찼습니다.");
    }

  }

  public void displayItems() {

    System.out.println("장바구니 상품 출력");
    int sum = items.stream().mapToInt(Item::showItem).sum();
    System.out.println("전체 가격 합 : " + sum);

  }
}
