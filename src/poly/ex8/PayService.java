package poly.ex8;

public class PayService {

  public void processPay(String option, int amount) {



    Pay pay = PayStore.findPay(option);

    Boolean result = pay.pay(amount);

    if(result) {
      System.out.println("결제가 성공했습니다.");
    }else {
      System.out.println("결제가 실패했습니다.");
    }

  }
}
