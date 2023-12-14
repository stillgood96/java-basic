package ref.ex;

import java.util.Scanner;

public class ProductOrderMaian3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("입력할 주문의 개수를 입력하세요");
    int n = sc.nextInt();
    sc.nextLine();

    ProductOrder[] orders = new ProductOrder[n];


    for(int i = 0; i < n; i++) {

      System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

      System.out.print("상품명: ");
      String productName = sc.nextLine();

      System.out.print("가격: ");
      int price = sc.nextInt();
      sc.nextLine();

      System.out.print("수량: ");
      int quantity = sc.nextInt();
      sc.nextLine();

      orders[i] = createOrder(productName, price, quantity);

    }

    printOrders(orders);
    getTotalAmount(orders);

  }

  public static ProductOrder createOrder(String prdouctName, int price, int quantity) {
    ProductOrder productOrder = new ProductOrder();
    productOrder.prdouctName = prdouctName;
    productOrder.price = price;
    productOrder.quantity = quantity;

    return productOrder;
  }

  public static void printOrders(ProductOrder[] orders) {

    for(ProductOrder order : orders) {
      System.out.printf(
          "상품명: %s, 가격: %d, 수량: %d\n",
          order.prdouctName, order.price, order.quantity
      );
    }
  }

  public static void getTotalAmount(ProductOrder[] orders) {

    int totalAmount = 0;
    for(ProductOrder order : orders) {
      totalAmount += order.price * order.quantity;
    }

    System.out.printf("총 결제 금액: %d", totalAmount);
  }
}
