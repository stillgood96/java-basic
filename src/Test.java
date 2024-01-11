import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int humanSize = sc.nextInt();
    int n = sc.nextInt();

    List<Integer> humanList = new ArrayList<>();

    for(int i = 0; i < humanSize; i++) {
      humanList.add(i + 1);
    }

    while(humanList.size() >= 3) {

      for(int j = 0; j < humanList.size(); j++) {

        if( (j+1) % n == 0 ) {
          humanList.remove(j);
        }

      }
    }

    System.out.println("최종남은인원 :");
    humanList.stream().forEach( human -> {
      System.out.println(human);
    });

  }
}
