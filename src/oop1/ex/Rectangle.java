package oop1.ex;

public class Rectangle {

  int width;
  int height;


  void calculateArea() {
    System.out.println("넓이:" + width * height);
  }

  void calculatePerimeter() {
    System.out.println("둘레:" + 2 * (width + height));
  }

  void isSquare() {

    if(width == height) {
      System.out.println("정사각형 여부: true");
    }else {
      System.out.println("정사각형 여부: false");
    }
  }

}
