package access.ex;

public class MaxCounter {

  private int count;
  private int max;

  public MaxCounter(int max) {
    this.max = max;
  }

  public void increment() {
    if(count < max) {
      count++;
    }else {
      System.out.println("최대값을 초과할 수 없습니다.");
    }
  }

  public void getCount() {
    System.out.println("현재 count 값은 = " + count);
  }
}
