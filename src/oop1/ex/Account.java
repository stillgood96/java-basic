package oop1.ex;

public class Account {
  int balance;


  void deposit(int amount) {

    if(amount > 0) {
      balance += amount;
      System.out.println("잔고: " + balance);
    }else {
      System.out.println("1원 이상부터 입금이 가능합니다.");
    }

  }

  void withdraw(int amount) {

    if(amount <= balance) {
      balance -= amount;
      System.out.println("잔고: " + balance);
    }else {
      System.out.println("잔고부족");
    }
  }

  void showBalance() {
    System.out.println("잔고: " + balance);
  }

}
