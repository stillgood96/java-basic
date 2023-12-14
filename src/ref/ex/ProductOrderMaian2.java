package ref.ex;

public class ProductOrderMaian2 {

  public static void main(String[] args) {

    ProductOrder order1 = createOrder("두부", 2000, 2);
    ProductOrder order2 = createOrder("김치", 5000, 1);
    ProductOrder order3 = createOrder("콜라", 1500, 2);

    printOrders(order1);
    printOrders(order2);
    printOrders(order3);

    ProductOrder[] orders = {order1, order2, order3};
    getTotalAmount(orders);

  }

  public static ProductOrder createOrder(String prdouctName, int price, int quantity) {
    ProductOrder productOrder = new ProductOrder();
    productOrder.prdouctName = prdouctName;
    productOrder.price = price;
    productOrder.quantity = quantity;

    return productOrder;
  }

  public static void printOrders(ProductOrder productOrder) {

    System.out.printf(
        "상품명: %s, 가격: %d, 수량: %d\n",
        productOrder.prdouctName, productOrder.price, productOrder.quantity
    );

  }

  public static void getTotalAmount(ProductOrder[] orders) {

    int totalAmount = 0;
    for(ProductOrder order : orders) {
      totalAmount += order.price * order.quantity;
    }

    System.out.printf("총 결제 금액: %d", totalAmount);
  }
}
