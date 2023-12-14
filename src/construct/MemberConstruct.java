package construct;

public class MemberConstruct {
  String name;
  int age;
  int grade;


  //추가
  public MemberConstruct(String name, int age) {
    this(name,age,50);
  }

  public MemberConstruct(String name, int age, int grade) {
    this.name = name;
    this.age = age;
    this.grade = grade;
  }


}
