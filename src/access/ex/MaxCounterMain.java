package access.ex;

public class MaxCounterMain {

  public static void main(String[] args) {

    MaxCounter maxCounter = new MaxCounter(3);

    maxCounter.increment();
    maxCounter.increment();
    maxCounter.increment();
    maxCounter.increment();
    maxCounter.getCount();
  }
}
