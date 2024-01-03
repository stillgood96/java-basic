package extends1.super2;

public class ClassC extends  ClassB {

  public ClassC() {

    //ClassB에서 기본생성자가 없고 Java에서 안만들어준다. = 인자를 받는 생성자를 생성했기때문
    //생성자가 아무것도 없었더라면 기본생성자를 Java에서 만들어줌
    super(10,20);
    System.out.println("ClassC 생성자");
  }
}
